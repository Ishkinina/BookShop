import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by eishkinina on 21.09.16.
 */
public class MyScanner {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int i;
        int j;

        for (; ; ) { //while interrapted = (true) и брейк при фолсе
            try {
                i = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите число"); // выделить в отдельный метод
                return;
            }


            try {
                j = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите число");
                return;
            }

            System.out.println(i % j);
            System.out.println("Продолжить?");

            sc.nextLine();

            String a = sc.nextLine();
            if(a.equalsIgnoreCase("Да") || a.equalsIgnoreCase("Yes") || a.equalsIgnoreCase("Y")) {

            }
            else return; // прощание; return в if

        }
    }
}