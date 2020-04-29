package com.nyumbapoa.myapplication

import io.reactivex.rxjava3.core.Observable

fun createFilter(): Observable<Int> {
    return Observable.just(2, 40, 30, 5)
        .filter { x ->
            x > 10
        }
}
