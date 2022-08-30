fun main () {
    val amount = 20000
    val discountFromThousand = 100
    val discountFromTenThousands = 0.95
    val regularCustomer = true
    val regularDiscount = 0.99
    val result = if (amount > 1000 && amount < 10001) amount - discountFromThousand
        else if (amount > 10000) (amount * discountFromTenThousands).toInt()
        else amount
    println("Сумма покупок: " + result + " руб.")

    val resultFinal = if (regularCustomer) result * regularDiscount
    else result

    println("Сумма с учетом скидки постоянного покупателя: " + resultFinal + " руб.")
}