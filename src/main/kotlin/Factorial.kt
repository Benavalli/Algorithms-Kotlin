class Factorial {

    fun factorial(number: Int): Int {
        return if (number == 1) {
            1
        } else {
            number * factorial(number - 1)
        }
    }
}