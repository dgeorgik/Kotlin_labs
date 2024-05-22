import jdk.nashorn.internal.objects.Global.print
import jdk.nashorn.internal.objects.Global.println
import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine

/**
 * @project KotlinProject
 * @author georgijpustovalov
 * @Date 21.03.2024
 */



/**
        Лабораторная работа №1
            Остаток от деления
 */

fun callResult(rem: Int) {
    if(rem >0) {
        print("Получилось значение большее чем ноль!");
    }else{
        print("Result: ${rem}")
    }

}

//fun main() {
////    val n : Double = 20.0
////    val m : Double = 17.0
////    val result = "%.0f".format(n % m)
////    print(result)
//    val m : Int = 20
//    val n : Int = 17
//    callResult(m.rem(n))
//}


/**
        Лабораторная работа №2
                Простое условие
 */


//fun main() {
//
//    print("Введите Ваш возраст: ")
//    val age:Int = readLine()!!.toInt();
//    var age_group ="";
//    when  {
//       age < 18 -> age_group = "Вы еще слишком молоды"
//        age > 18 -> age_group = "Вам уже все можно"
//        age == 18 -> age_group = "Ура, Вам 18 лет!"
//
//    }
//
//    print(age_group);
//}



/**
        Лабораторная работа №3
                Небольшой калькулятор
 */

//fun main() {
//    var m : Int = 2
//    var n : Int = 6
//    print("Выберете что хотите сделать: \n1.Добавить\n2. Отнять \n0. Ничего \nВаш выбор: ")
//    val choiceMethod:Int = readLine()!!.toInt();
//
//    when(choiceMethod == 1 )
//    {
//        //1. Добавить
//        true -> print("${m} + ${n} = ${m+n}");
//    }
//    when(choiceMethod == 2 )
//    {
//        //2. Отнять
//        true -> print("${m} - ${n} = ${m-n}");
//    }
//    when(choiceMethod == 0 )
//    {
//        //0. Ничего
//            true -> print("Ну ок");
//    }
//}
//
//







/**
        Лабораторная работа №4
                Определение дня недели
 */

//fun main() {
//    print("Введите число от 1 до 7\nВаше число: ")
//    val inputUser = readLine()!!.toInt();
//        val resultUser = when (inputUser) {
//            1 -> println("Понедельник")
//            2 -> println("Вторник")
//            3 -> println("Среда")
//            4 -> println("Четверг")
//            5 -> println("Пятница")
//            6 -> println("Суббота")
//            7 -> println("Воскресенье")
//            else ->  println("Для сведения, в неделе 7 дней")
//        }
//
//}


/**
        Лабораторная работа №5
                Среднее число
 */

fun main() {
    var subscribers = intArrayOf();
    var subscribers_tets = intArrayOf();
       subscribers_tets = subscribers;
    print("Введите три числа: ")
    print("\nПервое: ")
    subscribers += readLine()!!.toInt();
    print("Второе: ")
    subscribers += readLine()!!.toInt();
    print("Третье: ")
    subscribers += readLine()!!.toInt();

    subscribers_tets.sort();

    // 1
    // 15
    // 20

    println(subscribers[1]);

    if (subscribers_tets[0] == subscribers_tets[1] || subscribers_tets[1] == subscribers_tets[2]){
        print("Ошибка")
    }
//    else{
//        var median = (subscribers.get(0) + subscribers.get(2)) / 2;
//        if(subscribers.contains(median)){
//            print("Мы нашли среднее значение, это число - ${median}")
//        }else{
//            print("Что-то вы навводили не то")
//        }
//    }
}


/**
        Лабораторная работа №6
             Подсчет прибыли
 */

//fun main() {
//
//    println("Введите запрашиваемые данные: ")
//    print("Потери -  ")
//    var loss = readLine()!!.toInt();
//    print("Прибыль - ")
//    var income = readLine()!!.toInt();
//
//    when (loss > income)
//    {
//        true -> print("Ваши убытки составили: ${loss-income}");
//        false -> print("Ваши прибыль составила: ${income-loss}");
//    }
//}




/**
        Лабораторная работа №7
                Проверка переменных
 */

//fun main() {
//
//    println("Введите запрашиваемые данные: ")
//    print("Переменная 1 -  ")
//    var paramFirst = readLine()!!.toInt();
//    print("Переменная 2 - ")
//    var paramSecond = readLine()!!.toInt();
//
//    var isDel:Boolean;
//// isDel = paramFirst % 2 == 0 && paramSecond % 2 == 0;
//    if (paramFirst % 2 == 0 && paramSecond % 2 == 0) isDel = true;
//    else isDel = false;
//
//    println(isDel);
//
//}