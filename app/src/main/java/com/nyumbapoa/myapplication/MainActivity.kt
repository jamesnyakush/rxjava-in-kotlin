package com.nyumbapoa.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //showJustJob()

        //createFromArray().subscribe { arr ->
        //  toast("Received array is" + Arrays.toString(arr))
        //}

        // createFromIteratable().subscribe { a ->
        //   toast("Received data is: $a")
        //}

        //createRange().subscribe { a ->
        //    println("Received data is: $a")
        //}

        createInterval().subscribe {a->
            println("Received data is: $a")
        }
    }


}
