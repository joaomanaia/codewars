internal object MultiplesOf2Or5 {
    fun solution(number: Int): Int {
        val numbers = 1 until number

        return numbers.filter { n ->
            n % 3 == 0 || n % 5 == 0
        }.sum()
    }
}