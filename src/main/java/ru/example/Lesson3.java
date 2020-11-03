package ru.example;

public class Lesson3 {
    /*
    Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
    Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte.
    */
    public static byte byteAndShort(byte a, short b) {
        return (byte) (a + b); //если b не входит в допустимый диапазон byte возникнет переполнение при сложении и неправильный результат
    }

    /*
    Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long.
    Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int.
     */
    public static int intAndLong(int a, long b) {
        return (int) (a * b); //если b не входит в допустимый диапазон int возникнет переполнение при умножении и неправильный результат
    }
    /*
    Написать метод getMaxNumber принимающий 2 параметра: int и int. Метод должен сравнить переданные параметры между собой и вернуть максимальный.
    Для решения необходимо использовать IF или тернарный оператор ?:
     */
    public static int getMaxNumber(int a, int b) {
        return a > b ? a : b;
    }

    /*
    Написать метод isCharA принимающий 1 параметр типа char. Если передана буква 'А', то возвращать true, а в остальных случаях false
     */
    public static boolean isCharA(char a) {
        return (a == 'А' ? true : false);
    }

    /*
    Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true, а в остальных случаях false
     */
    public static boolean isCharNumber(char a) {
        boolean result = false;
        if (a >= '0' & a <= '9' ) {
            result = true;
        }
        return result;
    }

    /*
    Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
    Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
     */
    public static void numbersToBinary() {
        for (int a = 0; a < 31; a++) {
            System.out.println(Integer.toBinaryString(a));
        }
    }

    /*
    Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1.
    Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
    Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти
     */
    public static void integerMaxValueShowInMemory() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE+1));
    }

    /*
    Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
    */
    public static int charToInt(char a) {
        return a;
    }

    /*
    Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
     */
    public static char intToChar(int a) {
        return (char) a;
    }
}