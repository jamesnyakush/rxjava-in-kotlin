package com.nyumbapoa.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //showJustJob()

        /*createFromArray().subscribe { arr ->
          toast("Received array is" + Arrays.toString(arr))
        }*/

        /*createFromIteratable().subscribe { a ->
            toast("Received data is: $a")
        }*/

        /*createRange().subscribe { a ->
            println("Received data is: $a")
        }*/

        /*createInterval().subscribe {a->
            println("Received data is: $a")
        }*/

        /*createTimer().subscribe {a->
            println("Food is ready after: $a")
        }*/

        /*createFilter().subscribe { a ->
            println("Received data is: $a")
        }*/

        /*createTakelast().subscribe { a ->
            println("Received data is: $a")
        }*/

        /*createTake().subscribe { a ->
            println("Received data is: $a")
        }*/

        CreateTimeOut("jjj").subscribe(
            { name ->
                println("Welcome $name")
            }, { t ->
                println("You have an Error" + t.javaClass.simpleName)
            }
        )

    }


}
