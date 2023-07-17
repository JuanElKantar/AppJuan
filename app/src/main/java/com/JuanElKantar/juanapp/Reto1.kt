package com.JuanElKantar.juanapp

class Reto1 {
}

fun main() {

    println("Bienvenido a Craps")
    println("Debes cumplir estos requisitos para ganar:")
    println("Sacar un par de uno en los lados")
    println("Sacar un total de tres en los lados")
    println("Sacar un total de once en los dados")
    println("Sacar dos o doce en los dados")
    println("Sacar un total de siete en los dados")
    println("---------------------------------")




            var results: Int = (1..6).random()
            println("Tu primer dado cayó en  $results")
            var results1: Int = (1..6).random()
            println("Tu segundo dado cayó en $results1")

            if (results == 1 && results1 == 1) {
                print("Ganó")
            } else if (results == 2 && results1 == 1) {
                print("Ganó")
            } else if (results == 1 && results1 == 2) {
                print("Ganó")
            } else if (results == 5 && results1 == 6) {
                print("Ganó")
            } else if (results == 6 && results1 == 5) {
                print("Ganó")
            } else if (results == 6 && results1 == 6) {
                print("Ganó")
            } else if (results == 6 && results1 == 6) {
                print("Ganó")
            } else if (results == 5 && results1 == 2) {
                print("Ganó")
            } else if (results == 2 && results1 == 5) {
                print("Ganó")
            } else if (results == 6 && results1 == 1) {
                print("Ganó")
            } else if (results == 1 && results1 == 6) {
                print("Ganó")
            } else if (results == 4 && results1 == 3) {
                print("Ganó")
            } else if (results == 3 && results1 == 4) {
                print("Ganó")
            } else {
                print("Perdió")
            }
        }
