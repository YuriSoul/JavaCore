import java.util.Calendar;
import java.util.Date;

public class CalcPayDays {
    int dayOfMonth;
    //получить текущий день месяца
    void getDayOfTheMonth(){
        Date date = new Date(2023, 4, 31);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);
    }

    //расчет количества дней до аванса
    void calcDaysUntilAdvance(){
        System.out.println("До аванса - " + " дней");
    }

    //расчет количества дней до зарплаты
    void calcDaysUntilPayday(){
        System.out.println("До зарплаты - " + " дней");
    }

    //выбор расчета (дней до аванса или до зарплаты)
    void beforeSalaryOrAdvance(){
        if(dayOfMonth > 10 && dayOfMonth < 25){
            calcDaysUntilAdvance();
        } else if((dayOfMonth > 25 && dayOfMonth <= 31)||(dayOfMonth > 0 && dayOfMonth < 10)){
            calcDaysUntilPayday();
        } else if(dayOfMonth == 10){
            System.out.println("Сегодня день зарплаты УРА!!!");
        } else if(dayOfMonth == 25){
            System.out.println("Сегодня день аванса УРА!!!");
        }
    }

    public static void main(String[] args) {
        CalcPayDays calcPD = new CalcPayDays();
        calcPD.getDayOfTheMonth();
        calcPD.beforeSalaryOrAdvance();
    }
}
