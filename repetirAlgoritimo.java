import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static  void mensagem(String mensagemUser) {
        Scanner leia = new Scanner(System.in);

        System.out.println(mensagemUser);
        System.out.println("Deseja continuar?:  1--sim, 0--não");
        int escolha = leia.nextInt();

        if (escolha == 1){
            System.out.println("Digite outra mensagem");
                 String msm = leia.next();
            mensagem(msm);
        }
        else return;
    }

    public static void main(String[] args) {

    mensagem("oi");

    }
}
