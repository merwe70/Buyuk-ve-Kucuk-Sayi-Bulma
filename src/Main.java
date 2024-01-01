import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz? : ");
        number = inp.nextInt();
        int[] number1 = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            number1[i] = inp.nextInt();
        }

        int min = number1[0];
        int max = number1[0];

        for (int k = 1; k < number; k++) {
            if (number1[k] < min) {
                min = number1[k];
            }
            if (number1[k] > max) {
                max = number1[k];
            }
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}