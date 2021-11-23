fun main(){
    //no1
    println("No1")
    for (i in 1..4) {
        for (j in 1..i) {
            print( j )
        }
        println()
    }
    //no2
println("----------------------------------------------------------")
    println("No2")

    var angka = 2
    var pangkat = 5
    var hasil =1
    for (i in 1..pangkat) {
        hasil = hasil * angka
    }
    println("Hasil $angka pangkat $pangkat = $hasil")
}