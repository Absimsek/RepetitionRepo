package Temmuz2025.t7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Datetime01 {

    public static void main(String[] args) {
 LocalDate curr= LocalDate.now();// curr is assigned as computers current date
        System.out.println(curr);//2025-07-07 so YY/MM/DD format


        //to find things specifically we use that date we found
        int monthV=curr.getMonthValue();// assigns month of date to new data
        System.out.println(monthV);// prints month by number

        int yearV=curr.getYear();//assigns year of date to new data
        System.out.println(yearV);//prints year

        int dayV=curr.getDayOfMonth();//assigns day of date to new data
        System.out.println(dayV);//prints day by number

        // to find the names of month and days gotten we use ENUM
        // ENUMs are used to storage the constant values

        Month month02=curr.getMonth();// get month and assigns to enum data
        System.out.println(month02);//prints month name, enum brings name by month number

        DayOfWeek day02=curr.getDayOfWeek();// get day and assign to enum data
        System.out.println(day02);//prints day name, enum matches number with name

        //what about future time dates? to go future we should use new methods
        //plusDays(i) method adds i days to specified date
        //plusMonths(i) method adds i months to specified date
        //plusYears(i) method adds i years to specified date

        System.out.println(curr.plusDays(5).plusMonths(7).plusYears(5));

        // to go past instead we use same methods but instead of plus this time minus comes for method names
        System.out.println(curr);
        System.out.println(curr.minusDays(6).minusMonths(2).minusYears(5));

        //another way is to create a new date object
        LocalDate date1= LocalDate.of(2004,9,17);
        System.out.println(date1);

        // we can compare dates
        // isAfter() and isBefore() methods are used to compare
        // isEqual() used for find out if the dates are exact same


    }
}
