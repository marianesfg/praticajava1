import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = scan.nextInt();

        int fatorial = 1;
        for (int i=2; i<=num; i++)
        {
            fatorial *= i;
        }

        System.out.println(fatorial);
        scan.close();
    }
}
