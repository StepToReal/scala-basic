package com.steptoreal

object listMethod {
    def execute {
        val testList = List("Cool", "tools", "rule")
        println(testList)

        val thrill = "Will" :: "fill" :: "until" :: Nil

        val connectList = List("a", "b") ::: List("c", "d")
        println(connectList)

        println(thrill(2))

        val thrillCount = thrill.count(s => s.length == 4)
        println(thrillCount)

        println("drop(2) : " + thrill.drop(2))         //return new list
        println(thrill.dropRight(2))
        println(thrill.exists(s => s == "until"))
        println(thrill.filter(s => s.length == 4))
        println(thrill.forall(s => s.endsWith("l")))
        println(thrill.foreach(s => print(s)))
        println(thrill.foreach(print))
        println(thrill.head)
        println(thrill.init)
        println(thrill.isEmpty)
        println(thrill.length)
        println(thrill.map(s => s + "y"))
        println(thrill.mkString(", "))
        println(thrill.filterNot(s => s.length == 4))
        println(thrill.reverse)
        println(thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))
        println(thrill.tail)
    }
}