package com.steptoreal

object Forargs {
    def execute (args : Array[String]) {
        for (arg <- args){ 
            println(arg)
            //arg = arg + "123"
            println(arg)
        }
    }
}