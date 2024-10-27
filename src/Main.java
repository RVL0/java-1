import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        long second = scanner.nextLong();

        long result = first + second;

        System.out.println("Сума чисел " + first + " і " + second + "дорівнює " + result );

/*        System.out.println(x);
        System.out.println(y);*/

    }
}