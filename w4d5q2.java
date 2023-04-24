import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String[] array1 = str.nextLine().split(" ");
        String[] array2 = str.nextLine().split(" ");

        int c = 0;
        for (String item1 : array1) {
            for (String item2 : array2) {
                if (item1.equals(item2)) {
                    c++;
                }
            }
        }

        System.out.println(c);
    }
}
