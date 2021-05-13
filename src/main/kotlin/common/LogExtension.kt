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


fun Array<LongArray>.log() {
    repeat(this.size) {
        println(this[it].joinToString("|"))
    }

}

