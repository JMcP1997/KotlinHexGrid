package hexcore

import kotlin.test.Test
import kotlin.test.assertEquals

class HexTest {

    @Test //mark as test function
    fun hexesWithSameCoordinatesAreEqual()
    {
        //Leverage the data class to assert that two hexes with the same q and r values are equal
        assertEquals(Hex(1, 2), Hex(1, 2))
    }
}
