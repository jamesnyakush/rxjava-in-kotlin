package com.nyumbapoa.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //showJustJob()


    }

    private fun showJustJob() {
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


}
