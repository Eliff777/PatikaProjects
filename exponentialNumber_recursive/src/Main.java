import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban, üs, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen taban değerini giriniz: ");
        taban = input.nextInt();
        System.out.print("Lütfen üs değerini giriniz: ");
        üs = input.nextInt();
        if(üs<0){
            System.out.print("Üs değeri sıfırdan küçük olamaz! ");
            return;
        }
        result= expo(taban,üs);
        System.out.print("Sonuç :  " + result);
    }
    static int expo(int taban,int üs){
        if(taban==0)
            return 0;
        if(üs==0)
            return 1;
        if(üs==1)
            return taban;
        return taban * expo(taban,üs-1);


    }
}