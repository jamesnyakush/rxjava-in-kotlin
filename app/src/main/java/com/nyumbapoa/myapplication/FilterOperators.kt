package com.nyumbapoa.myapplication

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun createFilter(): Observable<Int> {
    return Observable.just(2, 40, 30, 5)
        .filter { x ->
            x > 10
        }
}

fun createTakelast(): Observable<Int> {
    return Observable.just(2, 40, 30, 5)
        .takeLast(2)
}

fun createTake(): Observable<Int> {
    return Observable.just(2, 40, 30, 5)
        .take(2)
}

fun CreateTimeOut(name: String): Observable<String> {
    return Observable.fromCallable {
        if (name.equals("James"))
            Thread.sleep(150)
        name
    }.timeout(100, TimeUnit.MILLISECONDS)
}


