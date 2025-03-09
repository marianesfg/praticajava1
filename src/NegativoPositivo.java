import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int num = scan.nextInt();

        if (num < 0)
            System.out.print("Número negativo");
        else
            System.out.println("Número positivo");
    }
}


