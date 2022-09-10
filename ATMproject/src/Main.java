import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3, select, balance = 2000;
        while (right > 0) {
            System.out.print("Kullanıcı adınızı girin :");
            userName = input.nextLine();

            System.out.print("Sifreyi girin :");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba kodluyoruz bankasana hosgeldiniz!");
                do {
                    System.out.println("1-Para yatirma\n2-Para cekme\n3-Bakiye sorgulama\n4-cikis ");
                    System.out.print("Lutfen yapmak istediginiz islemi secin : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatirmak istediginiz miktarı girin :");
                            int invest = input.nextInt();
                            balance += invest;
                            break;
                        case 2:
                            System.out.println("Çekmek istdeğiniz miktarı girin :");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                balance -= withdraw;
                                break;
                            }
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyin");
                if (right==0){
                    System.out.println("Kartınız bloke olmuştur.Lütfen bankayla iletişime geçiniz.");
                }else {
                    System.out.println("Kalan Hakkınız :"+right);
                }
            }
        }
    }
}