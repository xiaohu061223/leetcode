package core

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

@TestInstance(PER_CLASS)
abstract class ISolutionTest<K, V> {
    protected abstract val solutions: List<ISolution<K, V>>
    protected abstract val testCases: List<Pair<K, V>>

//    fun inputs() = solutions.

    @ParameterizedTest
    @MethodSource("inputs")
    fun runTest(solution: ISolution<K, V>, testCase: Pair<K, V>) {
        assertThat(solution.run(testCase.first)).isEqualTo(testCase.second)
    }

}
