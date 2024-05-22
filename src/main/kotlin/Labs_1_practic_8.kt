/**
 * @project KotlinProject
 * @author georgijpustovalov
 * @Date 15.05.2024
 */

/**
        Лабораторная работа №8
            Корутины + ктор
 */
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import jdk.jfr.internal.LogLevel
import kotlinx.coroutines.*
import java.io.File
import java.net.URL
import java.net.http.HttpClient

suspend fun downloadImage(client: HttpClient, url: String, filePath: String) {
    val response: ByteArray = client.get(url).body()
    File(filePath).writeBytes(response)
}

suspend fun downloadImagesWithCustomNames(client: HttpClient, urls: List<String>, outputDir: String) {
    urls.forEachIndexed { index, url ->
        val fileName = "image_$index.jpg"
        val filePath = "$outputDir/$fileName"
        downloadImage(client, url, filePath)
    }
}

suspend fun downloadImagesWithOriginalNames(client: HttpClient, urls: List<String>, outputDir: String) {
    urls.forEach { url ->
        val fileName = URL(url).path.split("/").last()
        val filePath = "$outputDir/$fileName"
        downloadImage(client, url, filePath)
    }
}

fun taskKtor(baseDir: String) = runBlocking {
    val client = HttpClient(CIO) {
        install(Logging) {
            level = LogLevel.INFO
        }
        install(ContentNegotiation) {
            json()
        }
    }

    val urls = List(100) { "https://via.placeholder.com/150?text=Image+$it" }

    val customNamesDir = "$baseDir/CustomNames"
    val originalNamesDir = "$baseDir/OriginalNames"

    // Создание директорий, если они не существуют
    File(customNamesDir).mkdirs()
    File(originalNamesDir).mkdirs()

    // Скачивание с заданием имен для файлов
    println("Скачивание с заданием имен для файлов:")
    downloadImagesWithCustomNames(client, urls, customNamesDir)

    // Скачивание с сохранением оригинального имени файла
    println("Скачивание с сохранением оригинального имени файла:")
    downloadImagesWithOriginalNames(client, urls, originalNamesDir)

    client.close()
}

fun main() {

    val baseDir = "F:/IntelliJ_projects/1/src/main/data"
    println("Выполнение курсового задания №2:")
    taskKtor(baseDir)
}