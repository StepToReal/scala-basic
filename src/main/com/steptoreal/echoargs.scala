package com.steptoreal

class echoargs {
    def execute (args : Array[String]) {
        var i  = 0
        while (i < args.length) { 
            if (i != 0)
                print(" ")
            args(i) = args(i) + "123"
            print(args(i))
            i += 1
        }
        println()
    }
}