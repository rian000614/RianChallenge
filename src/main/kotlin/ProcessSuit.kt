class ProcessSuit {

    fun choice() {
        var status: Boolean = false


        println("Masukan Pilihan Player 1 : ")
        val input1 = IOUtils.readString()
        println("Masukan Pilihan Player 2: ")
        val input2 = IOUtils.readString()
        println("Pilihan 1 adalah : $input1")
        println("Pilihan 2 adalah : $input2")

        if (input1 == (input2)) {
            println("Seri antar kedua pemain")
        } else if (input1 == ("batu")) {
            if (input2 == ("gunting")) {
                status = false
                result(status, input1, input2)
            } else {
                status = true
                result(status, input1, input2)
            }
        } else if (input1 == ("gunting")) {
            if (input2 == ("kertas")) {
                status = true
                result(status, input1, input2)
            } else {
                status = false
                result(status, input1, input2)
            }
        } else if (input1 == ("kertas")) {
            if (input2 == ("batu")) {
                status = true
                result(status, input1, input2)
            } else {
                status = false
                result(status, input1, input2)
            }
        }
    }

//jika kondisi true maka langsung mejalankan pemain 1 menang
//jika kondisi false menjalankan pemain 2 menang
    private fun result(status: Boolean, input1: String, input2: String) {
        if (status) {
            println("Pemain 1 Menang!! $input1 menang melawan $input2")
        } else {
            println("Pemain 2 Menang!! $input2 mengalahkan $input1")
        }
    }
}



