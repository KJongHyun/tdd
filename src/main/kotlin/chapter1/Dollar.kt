package chapter1

class Dollar(var amount: Int) {

    fun times(multiplier: Int) {
        this.amount *= multiplier
    }

}