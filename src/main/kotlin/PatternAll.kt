class PatternAll {
    fun show(value: Int) {
        // PatternOne
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
        println()

        // PatternTwo
        for (i in value.downTo(1)) {
            for (j in 1..value - i) {
                print(" ")
            }
            for (k in 1..value + i) {
                if (k <= (2 * i - 1))
                    print("*")
            }
            println()
        }
        println()

        // PatternThree
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
        val valueDown = value - 1
        for (i in valueDown.downTo(1)) {
            for (j in 1..value - i) {
                print(" ")
            }
            for (k in 1..value + i) {
                if (k <= (2 * i - 1))
                    print("*")
            }
            println()
        }
        println()

        // PatternFour
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
        println()

        // PatternFive
        for (i in 1..value) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }
}