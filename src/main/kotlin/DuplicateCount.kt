fun duplicateCount(text: String): Int = text
    .map(Char::lowercaseChar)
    .groupingBy { it }
    .eachCount()
    .count { it.value > 1 }