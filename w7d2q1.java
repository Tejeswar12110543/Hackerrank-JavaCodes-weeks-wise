import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String password = scr.nextLine();
        password = password.toLowerCase().replace(' ', '$');
        System.out.println(password);
    }
}
