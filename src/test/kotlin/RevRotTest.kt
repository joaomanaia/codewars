import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class RevRotTest {
    @Test
    fun test1() {
        var s = "733049910872815764"
        assertEquals("330479108928157", revRot(s, 5))

        s = "73304991087281576455176044327690580265896"
        assertEquals( "1994033775182780067155464327690480265895", revRot(s, 8))

        s = "73304991087281576455176044327690580265896896028"
        assertEquals("1994033775182780067155464327690480265895", revRot(s, 8))
    }
}