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

/**
Проверка последней цифры
Создайте функцию, которая принимает число и проверяет, заканчивается ли оно на 5. Верните true, если заканчивается, и false, если нет.
 */

fun hw4(number: Int): Boolean{
    return number % 10 == 5
}

/**
Проверка, является ли сумма цифр четной
Реализуйте функцию, которая принимает число, суммирует его цифры и возвращает true, если сумма четная, и false, если нечетная.
 */

fun hw5 (number: Int):Boolean{
    // Преобразуем число в строку, чтобы разбить на отдельные цифры,
    // затем каждую цифру преобразуем обратно в Int и суммируем их
    val sumOfDigits = number.toString().map { it.toString().toInt() }.sum()
    return sumOfDigits % 2 == 0
}

/**
Сравнение двух чисел по модулю
Напишите функцию, которая принимает два числа и возвращает true, если модули чисел равны, и false в противном случае.
 */

fun hw6 (number: Int, number2: Int):Boolean{
    return number == number2 || number == -number2
}

/**
Проверка знака числа
Создайте функцию, которая принимает число и возвращает "Positive", если оно положительное, "Negative", если оно отрицательное,
и "Zero", если оно равно нулю.
 */

fun hw7(number: Int){
    if (number > 0){
        println("Positive")
    }
    if (number < 0){
        println("Negative")
    }
    if (number == 0){
        println("Zero")
    }

}

/**
Проверка делимости на 2 или 3
Напишите функцию, которая принимает число и возвращает true, если оно делится на 2 или на 3, и false в противном случае.
 */

fun hw8(number: Int):Boolean{
    return number % 2 == 0 || number % 3 == 0
}

/**
Четность суммы двух чисел
Создайте функцию, которая принимает два числа и возвращает "Even", если сумма чисел четная, и "Odd", если нечетная.
 */

fun hw9 (number: Int,number2: Int): String {
    val sum = number + number2
    return if (sum % 2 == 0) "Even" else "Odd"
}

/**
Определение числа, кратного и 4, и 6
Создайте функцию, которая проверяет, делится ли число на 4 и на 6 одновременно. Верните true, если да, и false, если нет.
 */

fun hw10 (number: Int): Boolean {
    return number % 4 == 0 && number % 6 == 0
}

/**
Проверка суммы на четность и кратность 10
Реализуйте функцию, которая принимает два числа и возвращает "Even and Divisible by 10",
если их сумма четная и делится на 10, "Even but not Divisible by 10", если сумма четная, но не делится на 10, и "Odd", если сумма нечетная.
 */

fun hw11(number: Int,number2: Int):String{
    val sum = number + number2
    return when {
        sum % 2 == 0 && sum % 10 == 0 -> "Even and Divisible by 10"
        sum % 2 == 0 -> "Even but not Divisible by 10"
        else -> "Odd"
    }
}

/**
Максимум трех чисел
Напишите функцию, которая принимает три числа и возвращает наибольшее из них.
 */

fun hw12(number: Int,number2: Int,number3: Int): Int{
    return if (number >= number2 && number >= number3) {
        number
    } else if (number2 >= number && number2 >= number3) {
        number2
    } else {
        number3
    }
}
/**
Проверка на палиндромность числа
Создайте функцию, которая принимает целое число и проверяет, является ли оно палиндромом (например, 121 или 12321). Верните true, если да, и false, если нет.
 */

fun hw13(number: Int): Boolean {
    var original = number
    var reversed = 0

    // Получаем число в обратном порядке
    while (original > 0) {
        val digit = original % 10 // Извлекаем последнюю цифру
        reversed = reversed * 10 + digit // Добавляем цифру в конец перевернутого числа
        original /= 10 // Убираем последнюю цифру из оригинального числа
    }

    // Сравниваем перевернутое число с оригинальным
    return number == reversed
}


/**
Кратность чисел и их сумма
Реализуйте функцию, которая принимает два числа. Если оба числа кратны 3, верните их сумму; если одно из них кратно 3, верните удвоенное значение второго числа; если ни одно не кратно 3, верните null.
 */

fun hw14(number: Int, number2: Int): Int? {
    return if (number % 3 == 0 && number2 % 3 == 0) {
        number + number2
    } else if (number % 3 == 0) {
        number2 * 2
    } else if (number2 % 3 == 0) {
        number * 2
    } else {
        null
    }
}

/**
Проверка возраста на категорию
Напишите функцию, которая принимает возраст и возвращает категорию: Child (до 12 лет), Teenager (от 13 до 17 лет), Adult (от 18 до 64 лет) или Senior (от 65 лет и старше).
 */

fun hw15(number: Int) {
    return if (number <= 12){
        println("Child")
    }else if (number >= 13 && number <= 17){
        println("Teenager")
    }else if (number >= 18 && number <= 64){
        println("Adult")
    }else {
        println("Senior")
    }
}

/**
Проверка на делимость с остальным значением
Создайте функцию, которая принимает два числа и проверяет, делится ли первое число на второе с остатком равным 2. Верните true, если делится с остатком 2, и false — если нет.
 */

fun hw16 (number: Int,number2: Int):Boolean{
   return number % number2 == 2
}