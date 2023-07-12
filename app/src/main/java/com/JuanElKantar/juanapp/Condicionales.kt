package com.JuanElKantar.juanapp

class Condicionales {
}

fun main() {

    /* println("Ingrese el primer numero")
    var num1: Int= readLine()!!.toInt()


    println("Ingrese el segundo numero")
    var num2: Int= readLine()!!.toInt()

    if (num1>num2){
        print("El numero ${num1} es mayor")

    }else if(num1==num2){
        print("Los numeros son iguales")
    }

    else{
        print("El numero ${num1} es menor")



    println("Ingrese un numero")
    var number: Int= readLine()!!.toInt()

    if(number in 1..20){
        println("El número esta en el rango")
    }else{
        println("El número esta fuera de rango")
    }}*/
    var results:Int= (1..20).random()
    println("El número es $results")
    when (results) {
        0 -> println("No hay resultados")
       1,2,3,4,5-> println("Hay menos de 5 resultados")
        in 6..50 -> print("El numero esta en rango")
        else -> println("That´s a lot of results")
    }

    }


