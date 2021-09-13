package sheridan.tetervak.mydieroller1a.model

import android.util.Log

class Die() {

    companion object{
        const val TAG = "Die"
    }

    // zero means not rolled yet
    var value: Int = 0
    set(n){
        if(n in 0..6){
            field = n
        }else{
            Log.e(TAG, "Illegal die value $n", )
        }
    }

    constructor(n: Int): this(){
        value = n
    }

    fun roll(){
        value = (1..6).random()
    }

}