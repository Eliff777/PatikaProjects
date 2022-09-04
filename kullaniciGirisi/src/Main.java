import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        username = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if(username == "patika" && password == "java123") {
            System.out.println("Giriş yaptınız.");
        }else {
            System.out.print("Bilgiler Yanlış!\nŞifreyi sıfırlamak ister misinz? Please write yes or no.");
            if(input.nextLine().equals("yes")){
                System.out.print("Lütfen yeni şifrenizi giriniz : ");
                newPassword = input.nextLine();
                if(newPassword.equals("java123") || newPassword.equals(password)){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.print("Şifre oluşturuldu. " );
                }
            }else {
                System.out.print("Program sonlandırıldı. " );
            }
        }
    }
}