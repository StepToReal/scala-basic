package com.steptoreal

object ListInstance {
    def execute {
        val greetStrings = new Array[String](3)

        greetStrings(0) = "Hello"
        greetStrings(1) = ", "
        greetStrings(2) = "world!\n"
        
        for (i <- 0 to 2)
            print(greetStrings(i))

        val numNames = Array("zero", "one", "two")
        val numNames2 = Array.apply("zero", "one", "two")
    }
}