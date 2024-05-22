/**
 * @project KotlinProject
 * @author georgijpustovalov
 * @Date 21.03.2024
 */


/**
    Лабораторная работа №1
        Числа в диапазоне
 */

//fun main() {
//    print("Введите диапазон от: ")
//    val bfNumber:Int = readLine()!!.toInt();
//    print("Введите диапазон до: ")
//    val afNumber:Int = readLine()!!.toInt();
//
//    var numberArray = intArrayOf();
//
//    if(bfNumber < afNumber){
//        for(i in bfNumber..afNumber) {
//            numberArray += i;
//        }
//    } else{
//        for(i in afNumber..bfNumber) {
//            numberArray += i;
//        }
//    }
//
//    val str: String = numberArray.map { it.toString() }.reduce { x, y -> "$x, $y" }
//
//    println("Результат: ${str}")
//}



/**
        Лабораторная работа №2
            Создание и вывод массива
 */

//fun main() {
//
//    var numberArray: Array<Int> = arrayOf(8, 21, 5, 90, 11, 0);
//
//    numberArray.set(0, 90);
//
//    numberArray.drop(numberArray.get(4))
//    val mutableList = numberArray.toMutableList()
//    mutableList.removeAt(4)
//    mutableList += -35;
//    val finalArray = mutableList.toTypedArray()
//    println("Массив: ${finalArray.contentToString()}")
//
//}







/**
    Лабораторная работа №3
         Минимум и максимум
 */


//fun main() {
//    print("Введите элементы в массив: ")
//    val bfNumber:String = readLine().toString();
//    addToElem(bfNumber)
//}

fun addToElem(bfNumber: String) {

    val numberArray = bfNumber.split(", ").toTypedArray();

    numberArray.sorted();

    println("Результат: min - ${numberArray[0]} / max - ${numberArray[numberArray.size-1]}")

}

/**
        Лабораторная работа №4
            Почти самый маленький
 */
//fun main() {
//    print("Введите размер массива - ")
//    val size = readLine()?.toInt()
//    var arr = IntArray(0)
//
//    println("Введите числа:")
//
//        for (i in 1..size!!) {
//            val input = readLine()?.toInt()
//            if (input != null) {
//            arr += input.toInt()
//        }
//    }
//    println("Массив: " + arr.contentToString())
//    arr.sort()
//    println("Отсортированный: " + arr.contentToString())
//    println("2 елемент: " +  arr[1])
//}


/**
        Лабораторная работа №5
            Сортировка массива
 */


//fun main() {
//    print("Введите размер массива")
//    val size = readLine()?.toInt()
//    var arr = IntArray(0)
//    for (i in 1..size!!) {
//        println("Введите число:")
//        val input = readLine()?.toInt()
//        if (input != null) {
//            arr += input.toInt()
//        }
//    }
//    println("Массив: " + arr.contentToString())
//    massivSorted(arr)
//    println("Отсортированный: " + arr.contentToString())
//}

fun massivSorted(arr: IntArray) {
    val contractSize = arr.size
    for (n in 0 until contractSize - 1) {
        for (m in 0 until contractSize - n - 1) {
            if (arr[m] > arr[m + 1]) {
                val temp = arr[m]
                arr[m] = arr[m + 1]
                arr[m + 1] = temp
            }
        }
    }
}





/**
        Лабораторная работа №6
            Среднее арифмитическое
 */



//fun main(){
//    println("Введите размер массива")
//    val size = readLine()?.toInt()
//    var arr = IntArray(0)
//    println("Введите число:")
//    for (i in 1..size!!){
//        val input = readLine()?.toInt()
//        if (input != null) {
//            arr += input.toInt()
//        }
//    }
//    var sum: Int = 0
//    for(j in arr){
//        sum += j
//    }
//    var arithmetic: Double = sum.toDouble()/arr.size
//
//
//    println(" ")
//    print("Массив: ")
//    for(j in arr){
//        if (arr.indexOf(j) < (arr.size - 1)){
//            if (j > arithmetic) {
//                print(" $j,")
//            }
//        }
//    }
//}






