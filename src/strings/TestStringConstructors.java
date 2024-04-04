package strings;

public class TestStringConstructors {
    public static void main(String[] args) {
        StringСonstructors sc = new StringСonstructors();
        sc.printString(sc.str); //пустая строка
        sc.printString(sc.str1); //сторка инициализированная массивом символов
        sc.printString(sc.str2); //сторка инициализированная поддиапазоном массива символов
        sc.printString(sc.str3); //сторка инициализированная другой строкой
        sc.printString(sc.str4); //сторка инициализированная массивом байт
        sc.printString(sc.str5); //сторка инициализированная строковым литералом
        sc.getLenghtString(sc.str4); //получение длины строки
        sc.printString(sc.str6); //сторка инициализированная несколькими строками (конкатенация)
        sc.printString(sc.str7); //строка инициализированная несколькими строками с различными типами данных
        sc.concatStrings(sc.str3, sc.str5); //метод выполняющий конкатенацию строк
    }
}
