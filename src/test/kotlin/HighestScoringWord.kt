import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class HighestScoringWord {
    @Test
    fun testFixed() {
        assertEquals("taxi", high("man i need a taxi up to ubud"))
        assertEquals("volcano", high("what time are we climbing up the volcano"))
        assertEquals("semynak", high("take me to semynak"))
        assertEquals("aa", high("aa b"))
        assertEquals("b", high("b aa"))
        assertEquals("bb", high("bb d"))
        assertEquals("d", high("d bb"))
        assertEquals("aaa", high("aaa b"))
    }
}