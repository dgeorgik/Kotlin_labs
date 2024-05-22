/**
 * @project KotlinProject
 * @author georgijpustovalov
 * @Date 21.03.2024
 */

/**
        Лабораторная работа №1
            Округление чисел
 */

//fun main() {
//    print("Введите число: ")
//    val bfNumber:Int = readLine()!!.toInt();
//    calculateYearsK(bfNumber)
//}

fun calculateYearsK(bfNumber: Int){
    var result: Int;
    var str: String;
    val s = bfNumber.toString()
    val digits = s.map(Character::getNumericValue).toIntArray()
    if (bfNumber > 1000){
        result = bfNumber / 1000
        if (digits[digits.size-3] > 5) result += 1
        str = result.toString() + "K"
        println(str)
    }
}


/**
        Лабораторная работа №2
            Правильное окончание для слов
 */


//fun main(){
//    print("Введите число: ")
//    var txt: String = readLine().toString();
//    calculateYears(txt);
//}

fun calculateYears(str: String){
    when(str.last()){
        '1' ->  print(str + " год")
        '2','3','4' -> print(str + " года")
        '5','6','7','8','9','0' -> print(str + " лет")
    }
}


/**
        Лабораторная работа №3
                Вычисление скидки
 */
//
//fun main(){
//    print("Введите сумму: ")
//    var priceDouble = readLine()?.toDouble()
//    print("Введите дисконт: ")
//    var saleDouble = readLine()?.toDouble()
//
//    discountAmountService(priceDouble, saleDouble)
//}

fun discountAmountService(price: Double?, sale: Double?) {
    if (sale != null) {
        if (sale <= 100) {
            var result = price?.minus(((price?.div(100)) * sale))
            val roundUp = String.format("%.2f", result)
            println(roundUp)
        }else{
            println("Скидка больше 100 - не пройдет")
        }
    }
}





/**
        Лабораторная работа №4
                Подсчет кол-ва слов в строке
 */
//
//fun main(){
//    calculateWorldCounts("Тестовое предложение")
//}

fun calculateWorldCounts(str: String): Int {
    val count = Regex("""(\s+|(\r\n|\r|\n))""").findAll(str.trim()).count() + 1
    println("Количество слов в придложении: " + count)
    return count
}