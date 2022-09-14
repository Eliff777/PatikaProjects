import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.println("Mayın tarlası oyununa hoş geldiniz. ");
        System.out.print("Lütfen satır sayısını giriniz : ");
        row=input.nextInt();
        System.out.print("Lütfen sütun sayısını giriniz : ");
        col=input.nextInt();

        MineSweeper player = new MineSweeper(row,col);
        player.play();
    }
}