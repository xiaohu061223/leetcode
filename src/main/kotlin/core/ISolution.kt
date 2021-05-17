package core

interface ISolution<I, O> {
    fun run(input: I): O

}
