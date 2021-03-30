package problem.implementQueueUsingStacks

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

internal class SolutionTest {

    @Test
    fun `test case 1`() {
        val queue = MyQueueWithList()
        queue.push(1)
        assertEquals(1, queue.peek())
        queue.push(2)
        assertEquals(1, queue.peek())
        assertFalse(queue.empty())
    }
}
