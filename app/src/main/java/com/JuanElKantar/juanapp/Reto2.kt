package com.JuanElKantar.juanapp

class Reto2 {
}

fun main() {

    println("Bienvenidos a supermercados Noé")

    do{
    print("Digita el producto: ")
    var producto= readLine().toString()

    print("Digita el precio del producto: ")
    var precio:Int= readLine()!!.toInt()

    print("Digita la cantidad que deseas llevar: ")
    var cantidad:Int= readLine()!!.toInt()

        print("Digita 1 si deseas llevar mas productos: ")
        var continuar: Int= readLine()!!.toInt()

    }while (continuar==1)



}