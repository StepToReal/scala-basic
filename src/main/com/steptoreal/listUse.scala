package com.steptoreal

object ListUse {
    def execute {
        val oneTwo = List(1,2)
        val threeFour = List(3,4)
        val oneTwoThreeFour = oneTwo ::: threeFour

        println(oneTwo + " and " + threeFour + " were not mutated..")
        println("thus, " + oneTwoThreeFour + " is a new list.")


        val twoThree = List(2, 3)
        val oneTwoThree = 1 :: twoThree
        println(oneTwoThree)

        //error
        //val twoThreeFour = twoThree :: 4 
        //println(twoThreeFour)

        val oneTwoThreeNil = 1 :: 2 :: 3 :: Nil
        println(oneTwoThreeNil)
    }
}