import java.util.Calendar;
import java.util.Date;


public class CalcPayDays {
    int dayOfMonth; //текущий день месяца
    int daysInTheMonth; //количество дней в месяце
    final int PAYDAY = 10; //день зарплаты
    final int ADVANCE_DAY = 25; //день аванса
    
    int daysUntilAdvance;
    int daysUntilPayday;
    
    
    //получить текущий день месяца
    void getDayOfTheMonth(){
        //задаем текущую дату
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        //получаем число текущей даты
        dayOfMonth =    cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);
    }

    //расчет количества дней до аванса
    void calcDaysUntilAdvance(){
        daysUntilAdvance = ADVANCE_DAY - dayOfMonth;
        System.out.println("До аванса - " + daysUntilAdvance + " дней");
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
            System.out.println("Сегодня день   зарплаты УРА!!!");
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