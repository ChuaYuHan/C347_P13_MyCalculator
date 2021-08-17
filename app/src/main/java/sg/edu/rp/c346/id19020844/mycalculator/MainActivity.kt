package sg.edu.rp.c346.id19020844.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var amt = ""
    var num = 0.0
    var plus = false
    var minus = false
    var multiply = false
    var divide = false
    var percent = false
    var negative = false
    var enabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClear.setOnClickListener() {
            textViewAmount.text = ""
            amt = ""
        }

        btnDivide.setOnClickListener() {
            divide = true
            num = textViewAmount.text.toString().toDouble()
            textViewAmount.text = ""
            amt = ""
            multiply = false
            minus = false
            plus = false
            percent = false
        }

        btnMultiply.setOnClickListener() {
            multiply = true
            num = textViewAmount.text.toString().toDouble()
            textViewAmount.text = ""
            amt = ""
            plus = false
            minus = false
            divide = false
            percent = false
        }

        btnMinus.setOnClickListener() {
            minus = true
            num = textViewAmount.text.toString().toDouble()
            textViewAmount.text = ""
            amt = ""
            multiply = false
            plus = false
            divide = false
        }

        btnPlus.setOnClickListener() {
            plus = true
            num = textViewAmount.text.toString().toDouble()
            textViewAmount.text = ""
            amt = ""
            multiply = false
            minus = false
            divide = false
            percent = false
        }

        btnPercent.setOnClickListener() {
            percent = true
            num = textViewAmount.text.toString().toDouble()
            textViewAmount.text = (num / 100).toString()
            amt = ""
            multiply = false
            minus = false
            divide = false
            plus = false
        }

        btnNegative.setOnClickListener() {
            negative = true
            num = 0 - textViewAmount.text.toString().toDouble()
            textViewAmount.text = "$num"
            amt = ""
            multiply = false
            minus = false
            divide = false
            plus = false
            percent = false
        }

        btnEqual.setOnClickListener() {
            if (plus == true) {
                textViewAmount.text = (num + textViewAmount.text.toString().toDouble()).toString()
            } else if (minus == true) {
                textViewAmount.text = (num - textViewAmount.text.toString().toDouble()).toString()
            } else if (multiply == true) {
                textViewAmount.text = (num * textViewAmount.text.toString().toDouble()).toString()
            } else if (divide == true) {
                textViewAmount.text = (num / textViewAmount.text.toString().toDouble()).toString()
            } else if (percent == true) {
                textViewAmount.text = (num * textViewAmount.text.toString().toDouble()).toString()
            } else if (negative == true) {
                textViewAmount.text = (num + textViewAmount.text.toString().toDouble()).toString()
            }
        }
    }

    fun btnOnClick(view: View) {
        val btnSelected = view as Button
        when (btnSelected.id) {
            btnZero.id -> amt += "0"
            btnOne.id -> amt += "1"
            btnTwo.id -> amt += "2"
            btnThree.id -> amt += "3"
            btnFour.id -> amt += "4"
            btnFive.id -> amt += "5"
            btnSix.id -> amt += "6"
            btnSeven.id -> amt += "7"
            btnEight.id -> amt += "8"
            btnNine.id -> amt += "9"
            btnDot.id -> amt += "."
        }

        textViewAmount.text = amt

    }

}