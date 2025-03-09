import java.util.Scanner;

public class ComparaInt {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro numero:");
        int num1 = scan.nextInt();
        System.out.println("Segundo numero:");
        int num2 = scan.nextInt();

        if (num1 == num2)
            System.out.println("Iguais");
        else
        {
            if (num1 < num2)
                System.out.println("O segundo é maior");
            else
                System.out.println("O primeiro é maior");
        }
    }
}
