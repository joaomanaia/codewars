/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
*/

val alphabet = 'a'..'z'

fun high(str: String?): String? {
    return str
        ?.split(" ") // Split str into words
        ?.maxByOrNull { word ->
            // Get the score of the word by summing word char scores
            word.sumOf { char ->
                // Char score by using index char in alphabet
                alphabet.indexOf(char) + 1
            }
        }
}