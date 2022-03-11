//  Description of variable
//  i = Number of lines
//  j = Number of spaces
//  k = Number of stars

class PatternFour {
    fun show(value: Int) {
        for (i in value.downTo(1)) {
            for (j in 1..value - i) {
                print(" ")
            }
            for (k in 1..value + i) {
                if (k <= (2 * value - 1)) {
                    if (k == 1 || k == (2 * i - 1)) {
                        print("*")
                    } else {
                        print(" ")
                    }
                }
            }
            println()
        }
        for (i in 2..value) {
            for (j in 1..value - i) {
                print(" ")
            }
            for (k in 1..value + i) {
                if (k <= (2 * value - 1)) {
                    if (k == 1 || k == (2 * i - 1)) {
                        print("*")
                    } else {
                        print(" ")
                    }
                }
            }
            println()
        }
    }
}