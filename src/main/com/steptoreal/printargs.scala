package com.steptoreal

object Printargs {
    def execute (args : Array[String]) {
        var i = 0
        while (i < args.length) {
            println(args(i))
            i += 1
        }
    }
}