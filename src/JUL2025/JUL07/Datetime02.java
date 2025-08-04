package JUL2025.JUL07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Datetime02 {


    // to get the current time we use localtime (not localDate)
    public static void main(String[] args) {

    LocalTime time1=LocalTime.now();
        System.out.println(time1);//prints current time

        // hour,minute,second,and nano can be gotten through appropriate methods
        int hour = time1.getHour();
        System.out.println(hour);

        int minute = time1.getMinute();
        System.out.println(minute);

        int second = time1.getSecond();
        System.out.println(second);

        int nano = time1.getNano();
        System.out.println(nano);

        //for future and past times again we use plus or minus methods
        LocalTime next = time1.plusMinutes(13).plusHours(3);
        System.out.println(next);
        next = next.minusMinutes(13).minusHours(3);
        System.out.println(next);

        // changing format of time and date YY/MM/DD

        //HH : mm  24 hour format
        //hh : mm  12 hour format without AM-PM
        //hh : mm a 12 hour format with AM-PM
        //HH : mm : ss 24 hour format with seconds

        // MM month number MMM month word with 3 chars MMMM month full name
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh : mm a");
        String newFormat=dtf1.format(time1);//  time1 is formatted
        System.out.println(newFormat);

        LocalDate date1=LocalDate.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String myDate = dtf2.format(date1);
        System.out.println(myDate);//date format changed

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String myDate1 = dtf3.format(date1);
        System.out.println(myDate1);//date format changed

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String myDate2 = dtf4.format(date1);
        System.out.println(myDate2);//date format changed

        //we can use another place date or time by using its zoneID
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        LocalDateTime ldt =  LocalDateTime.now();
        System.out.println(ldt);//2023-06-10T22:21:39.352451

        // to take a full date with time together we can use another format
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM.dd.yyyy - HH . mm");
        String formattedLdt = dtf.format(ldt);
        System.out.println(formattedLdt);



    }

}
