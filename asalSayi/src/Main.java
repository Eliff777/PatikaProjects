
public class Main {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(i);
            }
            counter = 0;
        }

    }
}