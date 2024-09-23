import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Um programa que converta o valor do dolar para real


    public  static  int dolarReal(int real) {
        return (int)  (real * 5.5);

    }


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero para ser convertido em dolar: ");
        int numeroDolar = leia.nextInt();
        
        System.out.println("O numero convertido é: " + dolarReal(numeroDolar));


    }
}
