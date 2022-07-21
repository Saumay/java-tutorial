// If you which data type you will be getting, scanner is the best option.
// It provides flexibility for reading different data types
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);

        int i = sc.nextInt();
        System.out.println(i);

        sc.nextLine();                  // for reading the extra \n stored in buffer after reading from nextInt
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
