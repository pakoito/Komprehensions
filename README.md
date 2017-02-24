# Komprehensions

RxComprehensions is a library to reduce boilerplate and simplify your call chains.

## Rationale

As your code starts getting more and more functional, you find that you want to chain multiple statements by helpers like `let`. This causes indentation levels to go quite high, and would often require that you split the code in several methods just to keep it readable.

```java
fun calculateDoubles(calcParams: Params) =
    calcParams
            .let { params ->
                defrombulate(params.first, param.second)
                        .let { result ->
                            gaussianRoots(result)
                                    .let { grtts ->
                                        storeResult(params.first, params.second, result, grtts)
                                    }
                        }
            }
```

**Comprehensions** are a language feature that allow you to define such a chain in a way where every observable is a function at topmost indentation, yet still contains all the parameters received in the previous functions.

## Usage

### Let

Komprehensions contains functions `doLet()` for `let()`. Each takes from 2 to 9 function each with an increasing number of parameters, and returns an object of the type of the return of the last function.

```java
fun calculateDoubles(calcParams: Params) =
    // chained with let()
    doLet(
        { calcParams },
        { params -> defrombulate(params.first, param.second) },
        { params, result -> gaussianRoots(result) },
        { params, result, grtts -> storeResult(params.first, params.second, result, grtts) }
    )
```

### Chainable

Komprehensions contains functions `doChainable()` for interface `Chainable`. Each takes from 2 to 9 function each with an increasing number of parameters, and returns a Chainable.

It's functionally similar to [let](https://github.com/pakoito/Komprehensions#let) but it's limited to types that are marked as Chainable. The recommended usage is to annotate sealed classes with it to indicate that they can be transformed between them.
An example is available in [this link](https://gist.github.com/pakoito/8043a42c2381112753cfdaab128cdc49) with a longer description given by ["A Domain Driven approach to Kotlin's new types"](http://www.pacoworks.com/2016/10/03/new-talk-a-domain-driven-approach-to-kotlins-new-types-at-mobilization-2016/).

A special thanks to [@Takhion](https://github.com/Takhion) for simplifying my initial implementation.

### map

Komprehensions contains functions `doMapIterable()` for `flatMap()` chaining of `Iterable`. Each takes from 1 to 9 function each with an increasing number of parameters, and returns an `Iterable` of the type of the return of the last function.

### flatMap

Komprehensions contains functions `doFlatMapIterable()` for `flatMap()` chaining of `Iterable`. Each takes from 1 to 9 function each with an increasing number of parameters and returns an `Iterable`, then flattens the return into an `Iterable` of the type of the return of the last function.

## Komprehensions-rx

Komprehensions-rx is an extension module that allows chaining of [RxJava](https://github.com/ReactiveX/RxJava) `Observables`. It is available for both RxJava 1 and 2.

### Map comprehensions

Komprehensions-rx contains functions `doFlatMap()` for `flatMap()`, `doConcatMap()` for `concatMap()`, `doSwitchMap()` for `switchMap()`. Each takes from 1 to 9 function each with an increasing number of parameters, and returns an `Observable` of the type of the return of the last function.

```java
Observable<String> getUserFriends =
    // chained with flatMap()
    RxComprehensions.doFlatMap(
        { profileClicks() },
        { position -> getUserFromProfile(position) },
        { position, user -> requestFriendListForUser(position, user.id) },
        { position, user, friends -> storeUserAndFriends(user, friends) },
        { position, user, friends, result -> toUserDisplayString(position, user, friends, result) }
    );
```

### Compose comprehensions

Komprehensions-rx contains functions `doCompose()` for `compose()`. Each takes from 1 to 9 `Transformer<T, U>` (RxJava 1.X) or `ObservableTransformer<T, U>` (RxJava 2.X), and returns an `Observable` of the type of the return of the last one.

```java
Observable<List<Siblings>> getRelatives =
    // chained with compose()
    RxComprehensions.doCompose(
        { requestRelative("12345") },
        validate(),
        assureThreads(Schedulers.io(), AndroidSchedulers.main()),
        respectLifecycle(activity),
        toUILayerModel(),
        groupSiblings()
    );

Observable<RelativeDto> requestRelative(String id) { /* ... */ }

ObservableTransformer<RelativeDto, RelativeDto> validate() { /* ... */ }

ObservableTransformer<RelativeDto, RelativeDto> assureThreads(Scheduler in, Scheduler out) { /* ... */ }

ObservableTransformer<RelativeDto, RelativeDto> respectLifecycle(Activity activity) { /* ... */ }

ObservableTransformer<RelativeDto, Relative> toUILayerModel() { /* ... */ }

ObservableTransformer<Relative, List<Siblings>> groupSiblings() { /* ... */ }
```
##Distribution

Add as a dependency to your `build.gradle`
```groovy
repositories {
    ...
    maven { url "https://jitpack.io" }
    ...
}
    
dependencies {
    ...
    compile 'com.github.pakoito.Komprehensions:komprehensions:1.3.0'

    // Extensions for RxJava 1.X
    compile 'com.github.pakoito.Komprehensions:komprehensions-rx:1.3.0'

    // Extensions for RxJava 2.X
    compile 'com.github.pakoito.Komprehensions:komprehensions-rx2:1.3.0'
    ...
}
```
or to your `pom.xml`

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.pakoito.Komprehensions</groupId>
    <artifactId>komprehensions</artifactId>
    <version>1.3.0</version>
</dependency>

<dependency>
    <groupId>com.github.pakoito.Komprehensions</groupId>
    <artifactId>komprehensions-rx</artifactId>
    <version>1.3.0</version>
</dependency>

<dependency>
    <groupId>com.github.pakoito.Komprehensions</groupId>
    <artifactId>komprehensions-rx2</artifactId>
    <version>1.3.0</version>
</dependency>
```

## Contributions

PRs and suggestions for new features welcome.

If you have any core function that is chainable, please PR against the main module. If the function is contained in any 3rd party dependency, create a separate module and PR it instead.

For any error report please send an issue with a full stack trace and reproduction steps.

##License

Copyright (c) pakoito 2016

The Apache Software License, Version 2.0

See LICENSE.md
