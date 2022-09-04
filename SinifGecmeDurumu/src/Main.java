import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, phy, trk, chm, msc, counter=0,total=0;

        Scanner grade = new Scanner(System.in);

        System.out.println("Please enter your math grade : ");
        math = grade.nextInt();
        if(math>=0 && math<=100){
            counter++;
            total +=math;
        }
        System.out.println("Please enter your physic grade : ");
        phy = grade.nextInt();
        if(phy>=0 && phy<=100){
            counter++;
            total +=phy;
        }
        System.out.println("Please enter your turkish grade : ");
        trk = grade.nextInt();
        if(trk>=0 && trk<=100){
            counter++;
            total +=trk;
        }
        System.out.println("Please enter your chemistry grade : ");
        chm = grade.nextInt();
        if(chm>=0 && chm<=100){
            counter++;
            total +=chm;
        }
        System.out.println("Please enter your music grade : ");
        msc = grade.nextInt();
        if(msc>=0 && msc<=100){
            counter++;
            total +=msc;
        }
        double avgGrade = (double) total/counter;
        if(counter==0){
            System.out.print("You haven\'t entered any valid grade.");
        }else {
            if(avgGrade>=55){
                System.out.print("Tebrikler geçtiniz.\nOrtalamanız : " + avgGrade);
            }else{
                System.out.print("Kaldınız.\nOrtalamanız : " + avgGrade);
            }
        }
    }
}