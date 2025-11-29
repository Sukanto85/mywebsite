import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String user = "admin";
        String pass = "12345";

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String inputUser = input.nextLine();

        System.out.print("Masukkan Password: ");
        String inputPass = input.nextLine();

        if (inputUser.equals(user) && inputPass.equals(pass)) {
            System.out.println("Login Berhasil!");
        } else {
            System.out.println("Login Gagal!");
        }
    }
}
