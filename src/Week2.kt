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
