package chapter4

class Dollar(private var amount: Int) {

    fun times(multiplier: Int): Dollar {
        return Dollar(this.amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Dollar) this.amount == other.amount
        else false
    }

}