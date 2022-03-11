//  Description of variable
//  i = Number of lines
//  j = Number of stars

class PatternFive {
    fun show(value: Int) {
        for (i in 1..value) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }
}