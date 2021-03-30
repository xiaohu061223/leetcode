package problem.designHashSet

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case`() {
        val hashSet = solution
        hashSet.add(1)
        hashSet.add(2)
        assertThat(hashSet.contains(1)).isTrue
        assertThat(hashSet.contains(3)).isFalse
        hashSet.add(2)
        assertThat(hashSet.contains(2)).isTrue
        hashSet.remove(2)
        assertThat(hashSet.contains(2)).isFalse
    }
}
