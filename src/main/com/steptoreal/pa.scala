package com.steptoreal

object pa {
    def execute (args : Array[String]) {        
        args.foreach((arg: String) => println(arg))
        println()
        args.foreach(println)
    }
}