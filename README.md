# Komprehensions

RxComprehensions is a library to reduce boilerplate and simplify your call chains.

## Rationale

As your code starts getting more and more functional, you find that you want to chain multiple statements by means of `let`. This causes indentation levels to go quite high, and would often require that you split the code in several methods just to keep it readable.

```java
fun calculateDoubles(calcParams: Params) =
    calcParams
            .let { params ->
                params.first + param.second
                        .let { result ->
                            squareRoot(result)
                                    .let { sqrt ->
                                        storeResult(params.first, params.second, result)
                                    }
                        }
            }
```

**Comprehensions** are a language feature that allow you to define such a chain in a way where every observable is a function at topmost indentation, yet still contains all the parameters received in the previous functions.

## Usage

### Let

Komprehensions contains functions `doL()` for `let()`. Each takes from 2 to 9 `FuncN` each with an increasing number of parameters, and returns an object of the type of the return of the last function.

```java
fun calculateDoubles(calcParams: Params) =
    // chained with let()
    doL(
        () -> params,
        params -> params.first + param.second,
        params, result -> squareRoot(result),
        params, result, sqrt -> storeResult(params.first, params.second, result)
    )
```

### Komprehensions-rx

Komprehensions-rx is an extension module that allows chaining of [RxJava](https://github.com/ReactiveX/RxJava) `Observables` with operations `flatMap()`, `concatMap()`, and `switchMap()`. It contains functions `doFM()`, `doCM()`, and `doSM()`. Each takes from 2 to 9 `FuncN` each with an increasing number of parameters, and returns an `Observable` of the type of the return of the last function.

```java
Observable<String> getUserFriends =
    // chained with concatMap()
    doCM(
        () -> profileClicks(),
        position -> getUserFromProfile(position),
        position, user -> requestFriendListForUser(position, user.id),
        position, user, friends -> storeUserAndFriends(user, friends),
        position, user, friends, result -> toUserDisplayString(position, user, friends, result)
    )
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
    compile 'com.github.pakoito:Komprehensions:1.0.0'
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
    <groupId>com.github.pakoito</groupId>
    <artifactId>Komprehensions</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Contributions

PRs and suggestions for new features welcome.

If you have any core function that's chainable, please PR against the main module. If the function contains any 3rd party dependency, create a separate module instead and PR it.

For any error report please send an issue with a full stack trace and reproduction steps.

##License

Copyright (c) pakoito 2016

The Apache Software License, Version 2.0

See LICENSE.md
