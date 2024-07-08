package arrays_strings.three_pointers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ThreePointersTest {

    @Test
    fun findTripletEqualTarget() {
        val result = ThreePointers().findTripletEqualTarget(intArrayOf(12, 3, 4, 1, 6, 9), 24)
        assertTrue(result)
    }

    @Test
    fun finAllTripletsThatSumEqualZero() {
        val result = ThreePointers().finAllTripletsThatSumEqualZero(intArrayOf(0, 0, 0))
        //assertArrayEquals(result.toTypedArray(), listOf(0, 0, 0))

    }

    @Test
    fun threeSumClosest() {
        val result = ThreePointers().threeSumClosest(intArrayOf(-1,2,1,-4), 1)
        assertEquals(result, 2)
    }
}