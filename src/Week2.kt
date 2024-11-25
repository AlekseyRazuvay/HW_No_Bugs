import kotlin.contracts.contract

/**
 * Задача 1. Создание класса "Книга"
 * Создайте класс Book с полями:
 * title (название книги, тип String),
 * author (автор, тип String),
 * price (цена, тип double).
 * Реализуйте:
 * Конструктор, который принимает все поля.
 * Геттеры и сеттеры для каждого поля.
 * В методе main создайте объект класса Book, измените через сеттеры автора и цену, а затем выведите в консоль информацию о книге.
 *
 */
class Book(
    private var title: String,
    private var author: String,
    private var price: Double
) {
    // Геттеры
    fun getTitle(): String {
        return title
    }

    fun getAuthor(): String {
        return author
    }

    fun getPrice(): Double {
        return price
    }

    // Сеттеры
    fun setTitle(newTitle: String) {
        title = newTitle
    }

    fun setAuthor(newAuthor: String) {
        author = newAuthor
    }

    fun setPrice(newPrice: Double) {
        price = newPrice
    }

    // Метод для вывода информации о книге
    fun printInfo() {
        println("Название: $title, Автор: $author, Цена: $price")
    }
}

/**
 * Создайте класс Person с полями:
 * name (имя, тип String),
 * age (возраст, тип int),
 * gender (пол, тип String).
 * Реализуйте:
 * Конструктор с параметрами name и age.
 * Конструктор по умолчанию (без параметров).
 * Геттеры и сеттеры.
 * Добавьте метод printInfo(), который выводит информацию о человеке в формате:
 * php
 * Copy code
 * Имя: <name>, Возраст: <age>, Пол: <gender>
 *
 *В методе main создайте несколько объектов класса Person, вызовите метод printInfo() для каждого объекта.
 */

class Person {
    var name: String
    var age: Int
    var gender: String

    // Конструктор с параметрами name и age
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        this.gender = "Не указан" // Значение по умолчанию для gender
    }

    // Конструктор по умолчанию
    constructor() {
        this.name = "Неизвестно"
        this.age = 0
        this.gender = "Не указан"
    }

    // Метод для вывода информации о человеке
    fun printInfo() {
        println("Имя: $name, Возраст: $age, Пол: $gender")
    }
}

/**
 * Создайте класс Car с полями:
 * brand (бренд, тип String),
 * model (модель, тип String),
 * year (год выпуска, тип int),
 * price (цена, тип double).
 * Реализуйте:
 * Конструктор, который принимает параметры brand, model, year.
 * Методы:
 * getBrand(), getModel(), getYear() и getPrice().
 * setPrice(double price).
 * Метод printCarInfo(), который выводит:
 * php
 * Copy code
 * Бренд: <brand>, Модель: <model>, Год: <year>, Цена: <price>
 *
 *
 * В методе main создайте объект класса Car, задайте цену через сеттер, а затем выведите всю информацию о машине.
 *
 */

class Car {
    var brand: String
    var model: String
    var year:Int
    var price: Double = 0.0

    constructor(brand:String,model:String,year:Int){
        this.brand = brand
        this.model = model
        this.year = year
    }

    fun getBrand() {
        this.brand = brand
    }
    fun getModel() {
        this.model = model
    }
    fun getYear(){
        this.year=year
    }
    fun getPrice(){
        this.price=price
    }
   /* fun setPrice(d: Double) {
        this.price=price
    }*/

    fun printCarInfo(){
        println("Брэнд: $brand, Модель: $model, Год: $year, Цена: $price" )
    }

}

/**
 * Задача 4. Класс "Товар"
 * Создайте класс Product с полями:
 * name (название товара, тип String),
 * category (категория товара, тип String),
 * quantity (количество, тип int),
 * pricePerUnit (цена за единицу, тип double).
 * Реализуйте:
 * Конструктор с параметрами для всех полей.
 * Геттеры и сеттеры.
 * Метод calculateTotalPrice(), который возвращает общую стоимость товара (quantity * pricePerUnit).
 * Метод printProductInfo(), который выводит:
 * php
 * Copy code
 * Товар: <name>, Категория: <category>, Количество: <quantity>, Общая стоимость: <totalPrice>
 *
 *
 * В методе main создайте объект, измените количество через сеттер, а затем выведите полную информацию о товаре.
 *
 */

class Product {
    private var name: String
    private var category: String
    private var quantity: Int
    private var pricePerUnit: Double

    // Конструктор с параметрами для всех полей
    constructor(name: String, category: String, quantity: Int, pricePerUnit: Double) {
        this.name = name
        this.category = category
        this.quantity = quantity
        this.pricePerUnit = pricePerUnit
    }

    // Геттеры и сеттеры
    fun getName(): String = name
    fun getCategory(): String = category
    fun getQuantity(): Int = quantity
    fun getPricePerUnit(): Double = pricePerUnit

    fun setName(name: String) {
        this.name = name
    }

    fun setCategory(category: String) {
        this.category = category
    }

    fun setQuantity(quantity: Int) {
        this.quantity = quantity
    }

    fun setPricePerUnit(pricePerUnit: Double) {
        this.pricePerUnit = pricePerUnit
    }

    // Метод для расчёта общей стоимости
    fun calculateTotalPrice(): Double {
        return quantity * pricePerUnit
    }

    // Метод для вывода информации о товаре
    fun printProductInfo() {
        val totalPrice = calculateTotalPrice()
        println("Товар: $name, Категория: $category, Количество: $quantity, Общая стоимость: $totalPrice")
    }
}

/**
 * Создайте класс Student с полями:
 * name (имя, тип String),
 * studentId (идентификатор студента, тип int),
 * gpa (средний балл, тип double).
 * Реализуйте:
 * Конструктор для всех полей.
 * Геттеры и сеттеры.
 * Метод printStudentDetails(), который выводит:
 * php
 * Copy code
 * Студент: <name>, ID: <studentId>, GPA: <gpa>
 *
 *
 * В методе main создайте массив из объектов Student, заполните его, и выведите данные каждого студента.
 *
 * Вот еще несколько задачек, чтобы в общей сложности получилось 15:
 *
 */

class Student(
    var name: String,
    var studentId: Int,
    var gpa: Double = 1.0
) {
    fun getname() {
        this.name = name
    }
    fun getstudentId(){
        this.studentId = studentId
    }
    fun getgpa(){
        this.gpa = gpa
    }
    fun setname(){
        this.name = name
    }
    fun setstudentId(){
        this.studentId =studentId
    }
    fun setgpa(){
        this.gpa = gpa
    }
    fun printStudentDetails(){
        println("Студент: $name, ID: $studentId, GPA: $gpa")
    }
}

/**
 * fun main(){
 *     val students = arrayOf(
 *         Student("Alice", 101, 3.8),
 *         Student("Bob", 102, 3.6),
 *         Student("Charlie", 103, 3.9)
 *     )
 *     for (student in students) {
 *         student.printStudentDetails()
 *     }
 * }
 */

/**
 * Создайте класс Currency с полями:
 * name (название валюты, тип String),
 * rateToUSD (курс валюты к доллару США, тип double).
 * Реализуйте:
 * Конструктор для инициализации полей.
 * Геттеры и сеттеры.
 * Метод convertToUSD(double amount), который возвращает сумму в долларах для заданного количества валюты.
 * Метод printCurrencyInfo(), который выводит:
 * php
 * Copy code
 * Валюта: <name>, Курс к USD: <rateToUSD>
 *
 *
 * В методе main создайте объект валюты, выведите курс и выполните конвертацию заданной суммы в USD.
 *
 */

class Currency(
    var name: String,
    var rateToUSD: Double = 0.0
) {
   /* constructor(name: String, rateToUSD: Double) {
        this.name = name
        this.rateToUSD = rateToUSD
    }*/
    fun convertToUSD(){
        print("Введите количество в валюте $name: ")
        val quantity:Double? = readLine()?.toDoubleOrNull()
       if (quantity != null) {
           val sum = quantity * rateToUSD
           println("Сумма: $quantity $name, В Рублях будет: $sum РУБ")
       } else {
           println("Ошибка ввода. Введите корректное число.")
       }
    }
    fun printCurrencyInfo(){
        println("Валюта: $name, Курс к USD: $rateToUSD ")
    }
}