package common

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

fun List<Int?>.buildTree(): TreeNode? {
    TODO()
}

class TreeNodeExtension {
    /**
     * TODO
     */
    @Test
    @Disabled
    fun `build tree with in order`() {
        val tree = listOf(7, 3, null, null, 15, 9, null, null, 20, null, null).buildTree()
        assertThat(tree?.`val`).isEqualTo(7)
        assertThat(tree?.left?.`val`).isEqualTo(3)
        assertThat(tree?.left?.left?.`val`).isEqualTo(null)
        assertThat(tree?.left?.right?.`val`).isEqualTo(null)
        assertThat(tree?.right?.`val`).isEqualTo(15)
        assertThat(tree?.right?.left?.`val`).isEqualTo(9)
        assertThat(tree?.right?.right?.`val`).isEqualTo(20)
        assertThat(tree?.right?.right?.left?.`val`).isEqualTo(null)
        assertThat(tree?.right?.right?.right?.`val`).isEqualTo(null)
    }
}
