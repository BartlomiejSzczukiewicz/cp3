public class Mats {
    static float maks (int number1, int number2){
        return Math.max(number1, number2);
    }
    static void what() {
        double pi = Math.PI;
        System.out.println(pi);
    }
    static int absolute (int number1) {
        return Math.abs(number1);
    }
    static void sqrt() {
        double result = Math.sqrt(9.0 / 2.0);
        System.out.println("The square root of 9 divided by 2 is: " + result);
    }
    static double los() {
        return Math.random();
    }
    static int los1() {
        return (int)(Math.random() * 10);
    }
    static double sinus() {
        double degrees = 90.0;
        double radians = Math.toRadians(degrees); 
        return Math.sin(radians); 
    }
}
