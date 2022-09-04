class App {
    fun printHeader(){
        println("""
            ===================
            Gunting Batu Kertas
            ===================
        """.trimIndent())
    }

    fun run(){
        printHeader()
    }
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()

        }
    }
}