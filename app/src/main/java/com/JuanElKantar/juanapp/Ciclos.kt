package com.JuanElKantar.juanapp

import android.print.PrinterInfo

class Ciclos {
}

fun main() {

    for (i in 1..5) print(i)
    println()

    for (i in 5 downTo 1) print(i)
    println()

    for (i in 1..5 step 2) print(i)
    println()


    var w: Int = 0
    var e: Int = 0
    var sumPar: Int = 0
    var sumImpar: Int = 0
    /*
    for (i in 1..6) {


        println("Ingresa un número: ")
        val num1 = readln().toInt()

        if (num1 % 2 == 0) {
            println("El numero $num1 es par")
            sumPar=sumPar+num1
            w +=1
        } else {
            println("El número $num1 es impar")
            sumImpar=sumImpar+num1
            e +=1


        }

    }
    println("Hay $w numeros pares y hay $e numeros impares ")
    print("La suma de los pares es $sumPar y la suma de los impares es $sumImpar")*/


    var p:Int=0
    var imp:Int=0
    var sumPara: Int = 0
    var sumImpara: Int = 0


    var c="si"
    while (c=="si"){
        var numero:Int= readLine()!!.toInt()
        if (numero % 2 == 0) {
            println("El numero $numero es par")
            sumPara = sumPara + numero
            p += 1
        }else{
            println("El número $numero es impar")
            sumImpara = sumImpara + numero
            imp += 1
        }
        println("Desea ingresar otro número?")
        c= readLine()!!.toString()
    }

    println("Hay $p numeros pares y hay $imp numeros impares ")
    print("La suma de los pares es $sumPara y la suma de los impares es $sumImpara")
        }
