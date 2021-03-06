package com.nyumbapoa.myapplication

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.util.concurrent.TimeUnit

fun showJustJob() {
    val dataStream = Observable.just(30, 40, 50, 60)

    val dataObserver = object : Observer<Int> {
        override fun onComplete() {
            println("All Data is received ....")
        }

        override fun onSubscribe(d: Disposable?) {
        }

        override fun onNext(t: Int?) {
            println("New Data is received:$t")
        }

        override fun onError(e: Throwable?) {
            println("Error in code" + e?.message)
        }

    }
    dataStream.subscribe(dataObserver)
}

fun createFromArray(): Observable<Array<Int>> {
    return Observable.fromArray(arrayOf(1, 5, 7, 9))
}

fun createFromIteratable(): Observable<Int> {
    return Observable.fromIterable(mutableListOf(2, 5, 7))
}

fun createRange(): Observable<Int> {
    return Observable.range(1, 3).repeat(3)
}

fun createInterval(): Observable<Long> {
    return Observable.interval(1, TimeUnit.SECONDS).takeWhile { value -> value < 20 }
}

fun createTimer(): Observable<Long> {
    return Observable.timer(5, TimeUnit.SECONDS)
}