package stack

import java.util.Stack

class Stack {

    fun checkBrackets(s: String): Boolean {

        val stack = Stack<Char>()

        for (i in s.indices) {

            val char = s[i]
            val peek = if (stack.empty()) ' ' else stack.peek()

            when {
                char == '}' && peek == '{' -> stack.pop()
                char == ')' && peek == '(' -> stack.pop()
                char == ']' && peek == '[' -> stack.pop()
                else -> stack.push(char)
            }
        }

        return stack.empty()
    }

    fun checkBracketsHashAndMutableList(s: String): Boolean {
        val map = mutableMapOf(
            '[' to ']',
            '(' to ')',
            '{' to '}'
        )

        val stack = mutableListOf<Char>()

        for (i in s.indices) {
            val char = s[i]
            if (map.containsKey(char)) {
                stack.add(char)
            } else {
                if (stack.isEmpty()) {
                    return false
                } else {
                    val prevEntry = stack.removeAt(stack.size - 1)
                    if (map[prevEntry] != char) {
                        return false
                    }
                }

            }
        }

        return stack.isEmpty()
    }

    // given abbaca -> aaca -> ca
    fun removeAllAdjacentDuplicates(s: String): String {
        val stack = StringBuilder()

        for (i in s.indices) {
            val char = s[i]
            if (stack.isEmpty() || char != stack[stack.length - 1]) {
                stack.append(char)
            } else {
                stack.deleteAt(stack.length - 1)
            }
        }

        return stack.toString()
    }
}