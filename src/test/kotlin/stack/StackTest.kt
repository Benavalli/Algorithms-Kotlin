package stack

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StackTest {

    @Test
    fun checkBrackets() {
        val s = "{{{((([[[]]])))}}}"
        val result = Stack().checkBrackets(s)
        val s1 = "{{{((([[[]])))}}}"
        val result1 = Stack().checkBrackets(s1)
        assertTrue(result)
        assertFalse(result1)
    }

    @Test
    fun checkBracketsHashAndMutableList() {
        val s = "{{{((([[[]]])))}}}"
        val result = Stack().checkBracketsHashAndMutableList(s)
        assertTrue(result)
    }

    @Test
    fun removeAllAdjacentDuplicates() {
        val s1 = "abbaca"
        val result1 = Stack().removeAllAdjacentDuplicates(s1)
        assertTrue(result1 == "ca")
    }

    @Test
    fun revmoveAllAdjacentDuplicates() {
       val s = "/a/b//c/d/../../d/"
       s.split("/").forEach{println(it)}
    }


}