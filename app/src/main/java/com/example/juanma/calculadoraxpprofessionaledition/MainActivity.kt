package com.example.juanma.calculadoraxpprofessionaledition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private var actualMemory: Double = 0.0
    private var opperation: Int = 1
    private var sign: Boolean = false
    private var memoryMemory: Double = 0.0

    fun buttonCero(v: View?) {
        if(editText.text.toString().length == 0 || ((editText.text.toString().length != 0) && (!editText.text.toString().equals("0"))))
            editText.setText(editText.text.toString() + "0")
    }

    fun buttonUno(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "1")
    }

    fun buttonDos(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "2")
    }

    fun buttonTres(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "3")
    }

    fun buttonCuatro(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "4")
    }

    fun buttonCinco(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "5")
    }

    fun buttonSeis(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "6")
    }

    fun buttonSiete(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "7")
    }

    fun buttonOcho(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "8")
    }

    fun buttonNueve(v: View?) {
        if(!editText.text.toString().equals("0"))
            editText.setText(editText.text.toString() + "9")
    }

    fun bottonPunto(v: View?) {
        if(!editText.text.toString().contains(".")) {
            if (editText.text.toString().length == 0)
                editText.setText("0.")
            else
                editText.setText(editText.text.toString() + ".")
        }
    }

    fun buttonBackspace(v: View?) {
        if(editText.text.toString().length != 0)
        {
            editText.setText(editText.text.substring(0, editText.text.length - 1))
        }
    }

    fun buttonClearEmpty(v: View?) {
        editText.setText("")
    }

    fun buttonClearAll(v: View?) {
        editText.setText("")
        actualMemory = 0.0
        opperation = 1
    }

    fun buttonMas(v: View) {
        if(editText.text.length != 0) {
            when(opperation) {
                1 -> actualMemory += editText.text.toString().toDouble()
                2 -> actualMemory -= editText.text.toString().toDouble()
                3 -> actualMemory *= editText.text.toString().toDouble()
                4 -> actualMemory /= editText.text.toString().toDouble()
            }
            opperation = 1
            editText.setText("")
        }
    }

    fun buttonMenos(v: View) {
        if(editText.text.length != 0) {
            when(opperation) {
                1 -> actualMemory += editText.text.toString().toDouble()
                2 -> actualMemory -= editText.text.toString().toDouble()
                3 -> actualMemory *= editText.text.toString().toDouble()
                4 -> actualMemory /= editText.text.toString().toDouble()
            }
            opperation = 2
            editText.setText("")
        }
    }

    fun buttonMulti(v: View) {
        if(editText.text.length != 0) {
            when(opperation) {
                1 -> actualMemory += editText.text.toString().toDouble()
                2 -> actualMemory -= editText.text.toString().toDouble()
                3 -> actualMemory *= editText.text.toString().toDouble()
                4 -> actualMemory /= editText.text.toString().toDouble()
            }
            opperation = 3
            editText.setText("")
        }
    }

    fun buttonDivi(v: View) {
        if(editText.text.length != 0) {
            when(opperation) {
                1 -> actualMemory += editText.text.toString().toDouble()
                2 -> actualMemory -= editText.text.toString().toDouble()
                3 -> actualMemory *= editText.text.toString().toDouble()
                4 -> actualMemory /= editText.text.toString().toDouble()
            }
            opperation = 4
            editText.setText("")
        }
    }

    fun buttonEqual(v: View) {
        if(editText.text.length != 0) {
            when(opperation) {
                1 -> {
                    actualMemory += editText.text.toString().toDouble()
                    editText.setText(actualMemory.toString())
                }
                2 -> {
                    actualMemory -= editText.text.toString().toDouble()
                    editText.setText(actualMemory.toString())
                }
                3 -> {
                    actualMemory *= editText.text.toString().toDouble()
                    editText.setText(actualMemory.toString())
                }
                4 -> {
                    actualMemory /= editText.text.toString().toDouble()
                    editText.setText(actualMemory.toString())
                }
            }
        }
        else {
            when(opperation) {
                1 -> editText.setText(actualMemory.toString())
                2 -> editText.setText(actualMemory.toString())
                3 -> editText.setText(actualMemory.toString())
                4 -> editText.setText(actualMemory.toString())
            }
        }
        actualMemory = 0.0
        opperation = 1
    }

    fun buttonPlusMinus(v: View) {
        if(!sign)
            editText2.setText("-")
        else
            editText2.setText("+")
        sign = !sign
    }

    fun buttonMemRec(v: View) {
        editText.setText(memoryMemory.toString())
    }

}
