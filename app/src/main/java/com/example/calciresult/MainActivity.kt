package com.example.calciresult


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var Newnumber=true
    var Oldnumber=""
    var opt="+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun NumberFunction(view: View) {
        //  val editText = null
        if(Newnumber)
            EditText.setText("")
        Newnumber=false
        var buclick: String = EditText.text.toString()
        var buselect = view as Button
        when (buselect.id) {

            bu0.id -> { buclick += "0" }
            bu1.id -> { buclick += "1" }
            bu2.id -> { buclick += "2" }
            bu3.id -> { buclick += "3" }
                  bu4.id -> { buclick += "4" }
                     bu5.id -> { buclick += "5" }
            bu6.id -> { buclick += "6" }
                 bu7.id -> { buclick += "7" }
            bu8.id -> { buclick += "8" }
            bu9.id -> { buclick += "9" }
            bupoint.id -> { buclick += "." }
            buplusminus.id -> { buclick = "-$buclick" }

        }
        EditText.setText(buclick)
    }

    fun OperatorFunction(view: View) {
        Newnumber=true
        Oldnumber=EditText.text.toString()
        var buselect = view as Button
        when(buselect.id){

            budivide.id->{opt="/"}
            bumulti.id->{opt="*"}
            buminus.id->{opt="-"}
            buadd.id->{opt="+"}
            bupercent.id->{opt="%"}
            buback.id->{opt="<"}
            buclear.id->{opt=" "}
        }
        EditText.setText(opt)


    }

    fun EqualFunction(view: View) {
        var    equal: String =EditText.text.toString()
        var result=0.0
        when(opt)
        {
            "+"->{result=Oldnumber.toDouble()+equal.toDouble()}
            "-"->{result=Oldnumber.toDouble()-equal.toDouble()}
            "*"->{result=Oldnumber.toDouble()*equal.toDouble()}
            "/"->{result=Oldnumber.toDouble()/equal.toDouble()}
            "%"->{result=Oldnumber.toDouble()/100}
        }

        EditText.setText(result.toString())

    }

    fun clearFunction(view: View) {

        EditText.setText("")
    }

}

