package common

fun IntArray.log() {
    println("-------------")
    this.forEach {
        print(it)
        print(",")
    }
    println()
    println("-------------")
}

fun <T> List<T>.log() {
    println(this.joinToString(","))
}
