package com.tom

fun main(args: Array<String>) {
//    println("Hello kotlin")
    val h = Human( 66.5f,1.7f)
    println(h.bmi())
    /*var age = 19;
    age = 20;
    var weight = 66.5f;
    var name: String;
    name = "Hank"*/
}

class Human(var weight: Float, var height:Float) {

    fun bmi() :Float{
        val bmi = weight / (height*height)
        return  bmi
    }
    fun hello() {
        println("Hello kotlin")
    }
}