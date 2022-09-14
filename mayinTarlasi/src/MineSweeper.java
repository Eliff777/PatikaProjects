import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    String[][] matrix;
    int numberOfMine;

    MineSweeper(int row,int col){
        this.matrix=new String[row][col];
        this.numberOfMine=row*col/4;
        for (String[] i: matrix)
            Arrays.fill(i, "-");
    }

    public void play(){
        boolean isRowAndColValid=false;
        Scanner input = new Scanner(System.in);
        String [][] temp = new String[matrix.length+2][matrix[0].length+2];
        int isGameOverCount=matrix[0].length*matrix.length-numberOfMine, row, col;

        putMine(matrix);
        printMatrix();

        while(isGameOverCount>0){
            System.out.print("Satır giriniz : ");
            row=input.nextInt();
            System.out.print("Sütun giriniz: ");
            col=input.nextInt();
            while(row<0 || col<0 || row>=matrix.length || col>=matrix[0].length){
                System.out.print("Tekrar satır giriniz : ");
                row=input.nextInt();
                System.out.print("Tekrar sütun giriniz: ");
                col=input.nextInt();
            }

            createNewMatrix(temp);

            if(matrix[row][col] == "*"){
                System.out.print("Kaybettiniz!");
                return;
            }else{
                if(matrix[row][col]=="-"){
                    matrix[row][col]=Integer.toString(getCountOfMine(row,col,temp));
                    isGameOverCount--;
                }
            }
            System.out.println("===========================");
            printMatrix();
        }
        System.out.print("Tebrikler. Kazandınız! ");
    }
    private void createNewMatrix(String [][] temp){
        for( int i=0;i< temp.length;i++){
            for(int j=0;j< temp[0].length;j++){
                if(i==0)
                    temp[i][j]="-";
                else if(j==0)
                    temp[i][j]="-";
                else if(j==temp[0].length-1)
                    temp[i][j]="-";
                else if(i==temp.length-1)
                    temp[i][j]="-";
                else
                    temp[i][j]=matrix[i-1][j-1];
            }
        }
    }
    private int getCountOfMine(int row,int col, String[][] temp){
        int total=0;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(temp[i][j]=="*")
                    total++;
            }
        }
        return total;
    }
    private void putMine(String [][] matrix){
        int x,y;
        for(int i=0;i<numberOfMine;i++){
            x=(int)(Math.random()*matrix.length);
            y=(int)(Math.random()*matrix[0].length);
            if(matrix[x][y] == "-")
                matrix[x][y]="*";
            else
                i--;
        }
    }
    private void printMatrix(){
        for (String[] i: matrix){
            for (String j :i){
                if(j=="*" || j== "-")
                    System.out.print("-");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
