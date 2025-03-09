import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = scan.nextInt();

        if (num % 2 == 0) System.out.println("par");
        else System.out.println("impar");
    }
}
