package core

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

@TestInstance(PER_CLASS)
abstract class ISolutionTest<I, E> {
    protected abstract val solutions: List<ISolution<I, E>>
    protected abstract val testCases: List<Pair<I, E>>

    @ParameterizedTest
    @MethodSource("args")
    fun runTest(solution: ISolution<I, E>, input: I, expect: E) {
        assertThat(solution.run(input)).isEqualTo(expect)
    }

    fun args() = solutions.flatMap { s -> testCases.map { arguments(s, it.first, it.second) } }.stream()
}
