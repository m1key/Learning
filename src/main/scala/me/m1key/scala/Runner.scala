package me.m1key.scala

import java.util.{Date, Locale}
import java.text.DateFormat._

object Runner {

    def main(args: Array[String]) = {
        println("Running...")

        val now = new Date
        val df = getDateInstance(LONG, Locale.FRANCE)
        println(df format now)

        val polishLocale = new Locale.Builder().setLanguage("pl").setRegion("PL").build()
        val polishDf = getDateInstance(LONG, polishLocale)
        println(polishDf format now)

        val lambdaRunner = new LambdaRunner(() => println("Lambda"))
        lambdaRunner.run()
        lambdaRunner.runOther(x => println("Being called by " + x))

        println(math.pow(math.sqrt(3), 2))
        println("String"(0))
        println("String" drop 1)
        println("String" * 3)
        println("String" takeRight 1)
    }

}
