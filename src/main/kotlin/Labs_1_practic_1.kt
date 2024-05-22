/**
 * @project KotlinProject
 * @author georgijpustovalov
 * @Date 21.03.2024
 */

/**
            Лабораторная работа №1
                             Вывод информации
 */
class Person(
    var name: String,
    var age: Int,
    var isEmployed: Boolean = false){

    fun hello() {
        println(
            name +"\n" + age +"\n" + isEmployed
        )
    }
}



fun main() {
   val person = Person("Иван", 35, true).hello();
    println();

}



/**
            Лабораторная работа №2
                    Работа с переменными
 */

val a: Int = 5
const val b: Double = 90.2
//const val b = 1.0f
val с: Char = 'F'
val s: String = "Привет"


//fun main() {
//    println(s)
//}


/**
            Лабораторная работа №3
                    Разделение числа на символы
 */


fun scan(str:String): String? {
    val exeptionString = "[Ошибка: несоответсвие с ТЗ]"
    if(str.length == 4){
        return str.forEachIndexed { index, char -> if(index == 3) { print(char) }else {print(char+", ")} }.toString();
    }else{
        print(exeptionString)
    }
    return null;
}



//fun main(args:Array<String>){
//    print("Число:  ")
//    var str ="";
//    while ( str==""){
//        str = readLine().toString()
//    }
//    print("Результат: ")
//    scan(str);
//}


/**
            Лабораторная работа №4
                    Работа с числами
 */




//fun main(args:Array<String>){
//
//    var inputDate: Int = 2642
//    var years:Int = 365;
//    var month:Int = 30;
//    var week:Int = 7;
//    var days:Int = 1;
//
//
////    Реализация с Месяцами
//
////    years = inputDate / years
////    month = (inputDate - years * 365) / month
////    week = (inputDate - ((years * 365) + (month * 30))) / 7
////    days = inputDate - ((years * 365) + (month * 30) + (week * 7))
////    print("Результат (с месяцами): \n Лет: ${years}, Месяцев: ${month}, Недель: ${week}, Дней: ${days}")
////
//
////    Реализация с ТЗ
//
//    years = inputDate / years
//    week = (inputDate - ((years * 365))) / 7
//    days = inputDate - ((years * 365)  + (week * 7))
//    print("\n Результат (с месяцами): \n Лет: ${years}, Недель: ${week}, Дней: ${days}")
//
//
//}
//



/**
            Лабораторная работа №5
                    Нахождение числа
 */


//fun main(args:Array<String>) {
//    print("Вводим: ")
//    var n = readLine()?.toInt();
//
//    var findNum: String= n.toString();
//
//
//    if (n != null) {
//        n = n*2
//       findNum += "" +n.toString();
//    };
//
//    print("Получаем: ${findNum}")
//}


/**
            Лабораторная работа №5
                    Работа с переменными
 */

//fun main(args:Array<String>) {
//    print("Введите Ваше имя: ")
//    var userName = readLine();
//    print("Введите Ваш возраст: ")
//    var userAge = readLine();
//    print("Привет, ${userName}! Тебе уже ${userAge}")
//}