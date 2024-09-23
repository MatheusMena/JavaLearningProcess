import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Algoritmo para valor gasto como combustivel

    public  static int ()


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("\n Escolha o seu combustivel: " + "\n 1---Gasolina " + "\n 2---Alcohol");
        int Combustivel = leia.nextInt();

        switch (Combustivel) {
            case 1:
                System.out.println("Digite  o valor do litro:");
                int litroGas = leia.nextInt();
                break;
            case 2:
                System.out.println("Digite  o valor do litro:");
                int litroAlcool = leia.nextInt();
                break;

        }
        System.out.println(Combustivel);

    }
}
