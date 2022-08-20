fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
    return generateSequence(
        Triple(signature[0], signature[1], signature[2])
    ) { (first, second, third) ->
        Triple(second, third, first + second + third)
    }.take(n)
        .map { it.first }
        .toList()
        .toDoubleArray()
}

fun fibonacci(): Sequence<Long> {
    return generateSequence(0L to 1L) {
        it.second to (it.first + it.second)
    }.take(20).map { it.first }
}