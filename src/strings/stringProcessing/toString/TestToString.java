package strings.stringProcessing.toString;

/*
Каждый класс реализует метод toString(), т.к. он определен в Object.
Чтобы его реализовать необходимо возвратить объект String - String toString(), содержащий удобочитаемую строку
которая нужным образом описывает объект. Т.о. объекты содержащие переопределенный метод toString() можно напрямую
использовать в качестве строкового представления в методах print() и println(), а также при конкатенации строк
 */
public class TestToString {
    //создадим объект Box - коробка
    double width; //ширина
    double height; //высота
    double depth; //глубина

    //инициализируем коробку
    TestToString(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //переопределяем метод toString() для строкового представления полей объекта Box - коробка
    public String toString(){
        return "Коробка: " + width + " на " + height + " на " + depth + ".";
    }

    public static void main(String[] args) {
        TestToString box = new TestToString(5.0, 7.0, 9.0); //создаем объект Box - коробка
        System.out.println("Объект box - " + box); //так как класс TestToString имеет переопределенный метод toString
        //мы можем вывести его строковое представление на печать
        //В данном случае метод toString() из объекта TestToString при использовании в методе println() вызывается автоматически

    }
}
