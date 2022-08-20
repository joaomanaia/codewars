fun revRot(nums: String, sz: Int): String {
    if (sz <= 0 || nums.isBlank()) return ""

    // If sz is grater than the length of nums it is impossible
    // to take a chunk of site sz hence return "".
    if (sz > nums.length) return ""

    return nums
        .map(Char::digitToInt) // Converts nums to int list
        .asSequence()
        .chunked(sz) // Creates chunks from sz
        .filter { list -> // Ignore cunks if its size is less than sz
            list.size == sz
        }.map { chunk ->
            // Sum the chunk and check if is divisible by 2,
            // if is divisible by 2 reverse the chunk
            if (chunk.sum() % 2 == 0) {
                return@map chunk.reversed()
            }

            // otherwise rotate it to the left by one position
            chunk.rotateByOnePosition()
        }.flatten() // Make all chunks (List<List<Int>>) in one list
        .joinToString("") // Make all numbers to string
}

private fun <T> List<T>.rotateByOnePosition(): List<T> {
    val firstChar = first()

    return toMutableList().apply {
        removeFirst()
        add(firstChar)
    }
}