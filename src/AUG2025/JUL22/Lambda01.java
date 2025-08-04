package AUG2025.JUL22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer","Turkish Day",97,128);
        Course courseTurkishNight = new Course("Winter","Turkish Night",98,155);
        Course courseEnglishDay = new Course("Spring","English Day",95,132);
        Course courseEnglishNight = new Course("Winter","English Night",93,144);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        //1) check if all average scores are bigger than 91
        boolean result1= courseList.stream().allMatch(t->t.getAverageScore()>91);
        System.out.println(result1);

        //AllMatch : all elements int stream should satisfy the condition inside this if not returns false

        //2) check if any course name is turkish
        boolean result2= courseList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2);
        //AnyMatch :  if any element in the list satisfies condition returns true

        //3) check if any course has term "Fall"
        boolean result3= courseList.stream().noneMatch(t->t.getSeason().contains("Fall"));
        System.out.println(result3);
        //NoneMatch : Verilen sarta gore stream icindeki hicbir elemanin sarti saglamamasi durumunda true verir


        //4) order the courses average scores skip the first 2 in ordering
        List<Course>myList= courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
        System.out.println(myList);

        //5 order the courses average scores just take first 3
        List<Course>myList2= courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).limit(3).collect(Collectors.toList());
        System.out.println(myList2);

        //6 write the code that gives the count of english courses in courses list
        long ingilizceBolumSayisi= courseList.stream().filter(t->t.getCourseName().contains("English")).count();
        System.out.println(ingilizceBolumSayisi);



    }
}
