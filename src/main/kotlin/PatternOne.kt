//  Description of variable
//  i = Number of lines
//  j = Number of spaces
//  k = Number of stars

class PatternOne {
    fun show(value: Int) {
        for (i in 1..value) {
            for (j in 1..value - i) {
                print(" ")
            }
            for (k in 1..value + i) {
                if (k <= (2 * i - 1))
                    print("*")
            }
            println()
        }
    }
}