import java.util.Scanner;

public class maxMinAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int numberOne = sc.nextInt();
        System.out.println("Введіть друге число");
        int numberTwo = sc.nextInt();
        System.out.println("Введіть третє число");
        int numberThree = sc.nextInt();
        int max = 0;
        int min = 0;
        int average = 0;
        if (numberOne > numberTwo && numberOne > numberThree) {
            max = numberOne;
            if (numberTwo > numberThree) {
                min = numberThree;
                average = numberTwo;
            } else {
                min = numberTwo;
                average = numberThree;
            }
        }
        if (numberTwo > numberOne && numberTwo > numberThree) {
            max = numberTwo;
            if (numberOne > numberThree) {
                min = numberThree;
                average = numberOne;
            } else {
                min = numberOne;
                average = numberThree;
            }
        }
        if (numberThree > numberTwo && numberThree > numberOne) {
            max = numberThree;
            if (numberTwo > numberOne) {
                min = numberOne;
                average = numberTwo;
            } else {
                min = numberTwo;
                average = numberOne;
            }
        }
        System.out.printf("Найменше число - %d, середнє число - %d, найбільше число - %d", min, average, max);

    }
}
