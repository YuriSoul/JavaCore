import java.util.Calendar;
import java.util.Date;


public class CalcPayDays {
    int dayOfMonth; //текущий день месяца
    int daysInCurrentMonth; //количество дней в текущем месяце
    final int PAYDAY = 10; //день зарплаты
    final int ADVANCE_DAY = 25; //день аванса
    
    int daysUntilAdvance;
    int daysUntilPayday;
    
    
    //получить текущий день месяца
    void getDayOfTheMonth(){
        //задаем текущую дату
        Date date = new Date(2024, 4, 30);
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
        daysInCurrentMonth = java.time.LocalDate.now().lengthOfMonth();
        if(dayOfMonth > ADVANCE_DAY && dayOfMonth <= daysInCurrentMonth){
            daysUntilPayday = ((daysInCurrentMonth - dayOfMonth) + PAYDAY);
            System.out.println("До зарплаты - " + daysUntilPayday + " дней");
        } else if(dayOfMonth >= 1 && dayOfMonth < PAYDAY){
            daysUntilPayday = (PAYDAY - dayOfMonth);
            System.out.println("До зарплаты - " + daysUntilPayday + " дней");
        }
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