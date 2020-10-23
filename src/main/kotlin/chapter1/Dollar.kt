package chapter1

class Dollar(var amount: Int) {

    fun times(multiplier: Int) {
        this.amount *= multiplier
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Dollar) this.amount == other.amount
        else false
    }

}