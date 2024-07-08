package hashing.couting

import java.lang.StringBuilder

class StringCounting {

    fun computeOccurences() {
        val strings = listOf("a","abc","dfg", "b", "abd", "klklk")
        val query = "ab"
        val map = HashMap<Int, MutableList<String>>()
        strings.forEach {
            val occurrence = compareMatches(query, it)
            val list = map.getOrDefault(occurrence, mutableListOf()).apply {
                add(it)
            }
            map[occurrence] = list
        }

        val sortedKeys = map.keys.toList().sortedDescending()
        val result = mutableListOf<String>()


        sortedKeys.forEach { key ->
            result.addAll(map[key] as MutableList<String>)
        }

        println(result)

    }

    private fun compareMatches(query: String, target: String): Int {
        var matches = 0
        var queryIndex = 0
        for (i in target.indices) {
            if (i <= query.length -1 && target[i] == query[i]) {
                matches++
                queryIndex++
            } else {
                break
            }
        }
        return matches
    }

}