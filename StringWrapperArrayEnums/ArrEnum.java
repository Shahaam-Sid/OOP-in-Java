public class ArrEnum {

    //Enums
    public enum Days{
        SUNDAY(1, "sun"), MONDAY(2, "mon"),
        TUESDAY(3, "tue"), WEDNESDAY(4, "wed"),
        THURSDAY(5, "thur"), FRIDAY(6, "fri"),
        SATURDAY(7, "sat");

        final int num;
        final String shortForm;

        Days (int num, String shortForm) {
            this.num = num;
            this.shortForm = shortForm;
        }
    }
    public static void main(String[] args) {
        
        Days OrientaionsDay = Days.THURSDAY;

        if (OrientaionsDay == Days.THURSDAY){
            System.out.println("Orientation Day to be Conducted On Thursday");
        }
        
        for (Days day : Days.values()) {
            System.out.print(day + " - ");
            System.out.print(day.num + " - ");
            System.out.println(day.shortForm);
        }

        
        
        //Arrays
        String[] students = new String[5];

        students[0] = "John";
        students[1] = "Jack";
        students[3] = "Jim";

        int[] ages = {20, 21, 0, 19, 0};


        int n = students.length;

        for (int i = 0; i < n; i++) {
            System.out.print(students[i] + " :: ");
            System.out.println(ages[i]);
        }

    }
}
