import kotlin.math.sqrt

/**
Функция которая принимает целое число и возвращает true, если оно одновременно делится и на 5 и на 7
и false если не делится.
 */
fun hw1(number: Int): Boolean {
    return number % 5 == 0 && number % 7 == 0
}

/**
Создайте функцию которая принимает число и проверяет, входит ли оно в интервал
от 10 до 20 включительно. Если попадает то true если нет то false.
 */
fun hw2(number: Int): Boolean{
    return number <= 20 && number >= 10
}

/**
Напишите функцию которая принимает два числа и возвращает true если одно из чисел
является квадратом другого, и false если нет.
 */
fun hw3(number: Int, number2: Int): Boolean{
    return (sqrt(number2.toDouble()).toInt() == number ||
            (sqrt(number.toDouble()).toInt()  == number2))
}

fun main() {
    val number = 81
    val number2 = 9
    val result = hw3(number,number2)
    println("Ответ -> $result" )
}