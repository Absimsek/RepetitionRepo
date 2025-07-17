package AUG2025.AUG17;

public enum Names {
    //ENUMS are used when there is a certain format for each object.
    // instead of creating objects one by one through class declared enums can be used
    // declarations can also be done by user input if needed
    // since private information are need to be secret values started private.


    ALI(21,"Sivas","IT"),
    BERKAY(21, "ANKARA","IT"),
    FATIH(28,"KIRIKKALE","IT"),
    MEHMET(35,"KIRIKKALE", "Accounting"),
    IREM(27,"KIRSEHIR","Human Resources"),
    MUSTAFA(28,"KIRIKKALE","Data Analyst"),
    SERDAR(40,"SAMSUN","MAPPING"),
    SAMET(30,"KIRIKKALE","Garage Manager"),
    EMRE(30,"KIRIKKALE","Emergency");
private final int age;
private final String city;
private final String major;

Names(int age,String city,String major){
    this.age=age;
    this.city=city;
    this.major=major;
}

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getMajor() {
        return major;
    }
}
