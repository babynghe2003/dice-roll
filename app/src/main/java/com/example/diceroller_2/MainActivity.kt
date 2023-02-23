package com.example.diceroller_2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var number = "0"
    lateinit var textfield: TextView
    private var tempNumber: Double = 0.0
    private var mathe: Char = '#'
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textfield = findViewById(R.id.textfield)
        textfield.text = number
        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonAC: Button = findViewById(R.id.buttonac)
        val buttonDE: Button = findViewById(R.id.buttondel)
        button0.setOnClickListener{ handleEnterNumber('0') }
        button1.setOnClickListener{ handleEnterNumber('1') }
        button2.setOnClickListener{ handleEnterNumber('2') }
        button3.setOnClickListener{ handleEnterNumber('3') }
        button4.setOnClickListener{ handleEnterNumber('4') }
        button5.setOnClickListener{ handleEnterNumber('5') }
        button6.setOnClickListener{ handleEnterNumber('6') }
        button7.setOnClickListener{ handleEnterNumber('7') }
        button8.setOnClickListener{ handleEnterNumber('8') }
        button9.setOnClickListener{ handleEnterNumber('9') }
        buttonAC.setOnClickListener{
            number = "0"
            onChangeNumber()
        }
        buttonDE.setOnClickListener{
            number = number.substring(0, number.length - 1)
            onChangeNumber()
        }

        val buttonadd: Button = findViewById(R.id.buttonadd)
        val buttonmul: Button = findViewById(R.id.buttonmul)
        val buttonmin: Button = findViewById(R.id.buttonminus)
        val buttondiv: Button = findViewById(R.id.buttondiv)
        buttonadd.setOnClickListener{
            mathe = '+'
            if (textfield.text != ""){
               tempNumber = (textfield.text).toString().toDouble()
            }
        }

        buttonmul.setOnClickListener{
            mathe = '*'

            if (textfield.text != ""){
                tempNumber = (textfield.text).toString().toDouble()
            }
        }

        buttonmin.setOnClickListener{
            mathe = '-'

            if (textfield.text != ""){
                tempNumber = (textfield.text).toString().toDouble()
            }
        }

        buttondiv.setOnClickListener{
            mathe = '/'

            if (textfield.text != ""){
                tempNumber = (textfield.text).toString().toDouble()
            }
        }



    }

    fun onChangeNumber(){
        if (number == ""){
            number = "0"
        }
        textfield.text = number

    }
    fun handleEnterNumber(chara: Char){
        print("entered")
        if (number.equals("0")){
            number = ""
        }
        number += chara
        print(number)
        onChangeNumber()
    }
    fun handleEqual(){

    }

}