package common

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BuilderExtensionKtTest {

    @Test
    fun `build binary search tree by bracket representation test case 1`() {
        val root = treeNodeBracketOf("1(2)(3)")
        assertThat(root).isNotNull
        assertThat(root?.`val`).isEqualTo(1)
        assertThat(root?.left?.`val`).isEqualTo(2)
        assertThat(root?.right?.`val`).isEqualTo(3)
    }

    @Test
    fun `build binary search tree by bracket representation test case 2`() {
        val root = treeNodeBracketOf("4(2(3)(1))(6(5))")
        assertThat(root).isNotNull
        assertThat(root?.`val`).isEqualTo(4)
        assertThat(root?.left?.`val`).isEqualTo(2)
        assertThat(root?.left?.left?.`val`).isEqualTo(3)
        assertThat(root?.left?.right?.`val`).isEqualTo(1)
        assertThat(root?.right?.left?.`val`).isEqualTo(5)
    }

    @Test
    fun `build binary search tree by bracket representation test case 3`() {
        val root = treeNodeBracketOf("1(2()(4))(3)")
        assertThat(root).isNotNull
        assertThat(root?.`val`).isEqualTo(1)
        assertThat(root?.left?.`val`).isEqualTo(2)
        assertThat(root?.left?.left).isNull()
        assertThat(root?.left?.right?.`val`).isEqualTo(4)
        assertThat(root?.right?.`val`).isEqualTo(3)
    }
}
