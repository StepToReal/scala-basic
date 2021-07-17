package com.steptoreal

object printargs {
    def execute (args : Array[String]) {
        var i = 0
        while (i < args.length) {
            println(args(i))
            i += 1
        }
    }
}