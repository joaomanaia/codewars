import MultiplesOf2Or5.solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MultiplesOf2Or5Test {
    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}