package TimeClass;

public class TestTime {
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        Time t4 = new Time();

        t1.setTime(21, 10, 59);
        t2.setTime(10, 20, 0);
        t3.setTime(11, 59, 59);
        t4.setTime(12, 0, 0);

        System.out.println("Time object t1 = " + t1);
        System.out.println("Time object t2 = " + t2);
        System.out.println("Time object t3 = " + t3);
        System.out.println("Time object t4 = " + t4);

        System.out.println("================================");

        t1.nextSecond();
        t2.previousSecond();
        t3.nextSecond();
        t4.previousSecond();

        System.out.println("NextSecond of Time t1 = " + t1);
        System.out.println("PreviousSecond of Time t2 = " + t2);
        System.out.println("NextSecond of Time t3 = " + t3);
        System.out.println("PreviousSecond of Time t4 = " + t4);

        t1.toString();
        t2.toString();
        t3.toString();
        t4.toString();

        System.out.println("Final time for object t1 is " + t1);
        System.out.println("Final time for object t2 is " + t2);
        System.out.println("Final time for object t3 is " + t3);
        System.out.println("Final time for object t4 is " + t4);
    }
}
