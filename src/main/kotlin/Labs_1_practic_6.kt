/**
 * @project KotlinProject
 * @author georgijpustovalov
 * @Date 05.05.2024
 */

/**
Лабораторная работа №6
Функции высшего порядка
 */


fun main(){
    highFunction()
}

fun <T, R> List<T>.safeMap(transform: (T) -> R, defaultValue: R): List<R> {
    val result = mutableListOf<R>()
    for (item in this) {
        try {
            result.add(transform(item))
        } catch (e: Exception) {
            result.add(defaultValue)
        }
    }
    return result
}

fun highFunction() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val safeResults = numbers.safeMap({
        if (it % 2 == 0) throw Exception("Even number")
        it * it
    }, -1)
    println(safeResults) // [1, -1, 9, -1, 25]
}
