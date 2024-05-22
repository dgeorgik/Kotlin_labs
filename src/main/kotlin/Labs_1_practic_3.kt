import kotlin.system.exitProcess

/**
 * @project KotlinProject
 * @author georgijpustovalov
 * @Date 21.03.2024
 */



/**
        Лабораторная работа №1
                Рисование числами
 */

//fun main() {
//
//    print("Введите глубину цикла: ")
//    val lengthFor:Int = readLine()!!.toInt();
//
//    for (i in 1..lengthFor) {
//        if(i != 1) println()
//        for (y in 1 .. i){
//            print(i)
//            continue;
//        }
//    }
//}


/**
        Лабораторная работа №2
                Простая игра
 */


//fun randomGenerate(rndsUserAnswer: Int) {
//    val rnds = (1..9).random()
//    if(rnds == rndsUserAnswer) {print("Вы угадали!");}
//    else {print("Попробуй снова ${main()}")}
//}
//
//fun main() {
//    print("Угадайка: ")
//    val rndsUserAnswer:Int = readLine()!!.toInt();
//
//    randomGenerate(rndsUserAnswer);
//
//}







/**
Лабораторная работа №3
Простая игра
 */

//fun main() {
//    print("Введите число: ")
//    val userNumber:Int = readLine()!!.toInt();
//
//    var answer = intArrayOf();
//
//    for (i in 1..userNumber) {
//        if (userNumber % i == 0)
//            answer+=i;
//    }
//    val str: String = answer.map { it.toString() }.reduce { x, y -> "$x, $y" }
//
//    println("Все найденные делители: ${str}")
//
//}


/**
        Лабораторная работа №4
                Четные и нечетные цифры числа
 */

//fun main() {
//    print("Введите число: ")
//    var userNumber: String? = readLine();
//
//    val lenghtNumber = userNumber?.count { it.isDigit() }
//
//    var even = 0;
//    var odd = 0;
//    if (userNumber != null) {
//
//        if (lenghtNumber != null) {
//            for (i in 0..lenghtNumber-1!!){
//                if (Integer.parseInt(userNumber[i].toString()) % 2 == 0) even +=1
//                else odd +=1
//            }
//        }
//    }
//    print("Четных цифр - ${even} / Нечетных цифр - ${odd}")
//
//}



/**
        Лабораторная работа №5
                Сумма чисел
 */

//fun main() {
//
//    var answer = intArrayOf();
//
//    for (x in 1..100) {
//        if(x % 4 == 0) {
//            answer +=x
//        }
//    }
//
//    var str: String = answer.map { it.toString() }.reduce { x, y -> "$x, $y" }
//
//    print("Получившиеся числа - ${str}")
//
//    var sum = 0;
//    for (x in 0 .. answer.size-1) {
//        sum = sum + answer[x];
//    }
//
//    print("\nСумма кратных числе - ${sum}")
//
//}





/**
        Лабораторная работа №6
                Нахождение суммы
 */

//fun main() {
//    var x = 4;
//    var answer = 0;
//
//    loop@ while(x >= 4 && x < 57 ){
//        x++;
//        when(x){
//            34 -> continue@loop;
//            46 ->continue@loop;
//            52 ->continue@loop;
//        }
//        answer += x;
//    }
//    print("Сумма числе в диапазоне с исключение - ${answer}")
//
//}





