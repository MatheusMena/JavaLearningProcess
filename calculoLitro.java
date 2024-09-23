import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Algoritmo para valor gasto como combustivel

    public  static void calculoGasto (double custo, String combustivel, double distancia) {
        if(combustivel == "gas"){
             System.out.println("O preço sera: "+((distancia / 13) * custo));
        }
        else if (combustivel == "al"){
            System.out.println("O preço sera: "+((distancia / 9) * custo));
        }
    }


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("\n Escolha o seu combustivel: " + "\n 1---Gasolina " + "\n 2---Alcohol");
        int Combustivel = leia.nextInt();

        System.out.println("Digite  o percurso em km :");
        double km1 = leia.nextDouble();
        switch (Combustivel) {
            case 1:
                System.out.println("Digite  o valor do litro :");
                double litroGas = leia.nextDouble();
                calculoGasto(litroGas, "gas", km1);
                break;
            case 2:
                System.out.println("Digite  o valor do litro:");
                double litroAlcool = leia.nextDouble();

                calculoGasto(litroAlcool, "al", km1);

                break;

        }

    }
}
