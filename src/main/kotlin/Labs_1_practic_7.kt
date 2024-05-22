/**
 * @project KotlinProject
 * @author georgijpustovalov
 * @Date 10.05.2024
 */

import javafx.application.Application.launch
import jdk.nashorn.internal.objects.Global.println
import kotlinx.coroutines.*
import java.time.LocalTime


/**
        Лабораторная работа №1
            Точное время
 */

fun main() {
    exacTime()
}

fun exacTime() = runBlocking {
    launch {
        while (true) {
            println(LocalTime.now())
            delay(1000L)
        }
    }
}




/**
        Лабораторная работа №2
            Математические операции
 */
//fun main() {
//    mathCalculate()
//}

suspend fun mathOperation(a: Double, b: Double): Double {
    delay(2000L)
    return Math.pow(a, b) + Math.sqrt(a * b)
}

fun mathCalculate() = runBlocking {
    val result = async { mathOperation(2.0, 3.0) }
    println("Идут вычисления...")
    println("Результат вычисления: ${result.await()}")
}



/**
        Лабораторная работа №3
            Эффективность
 */
//fun main() {
//    efficiencyLabs()
//}

suspend fun parityCheckFunction(index: Int): Pair<Int, Boolean> {
    val number = Random.nextInt()
    return Pair(index, number % 2 == 0)
}

fun efficiencyLabs() = runBlocking {
    val results = mutableMapOf<Int, Boolean>()
    val time = measureTimeMillis {
        val jobs = List(100000) { index ->
            async {
                val result = parityCheckFunction(index)
                results[result.first] = result.second
            }
        }
        jobs.awaitAll()
    }
    val evenCount = results.values.count { it }
    println("Количество четных чисел: $evenCount")
    println("Общее время выполнения: $time ms")
}

suspend fun <T> timeBlocking(timeMillis: Long, defaultValue: T, block: suspend () -> T): T {
    return try {
        withTimeout(timeMillis) {
            block()
        }
    } catch (e: TimeoutCancellationException) {
        defaultValue
    }
}


/**
        Лабораторная работа №4
            Быстрота
 */
//fun main() {
//    speedRunningTask()
//}



suspend fun longRunningTask(duration: Long): String {
    delay(duration)
    return "Task completed"
}

fun speedRunningTask() = runBlocking {
    val shortTask = timeBlocking(1000L, "Timeout") {
        longRunningTask(500L)
    }
    println(shortTask)

    val longTask = timeBlocking(1000L, "Timeout") {
        longRunningTask(1500L)
    }
    println(longTask)
}
