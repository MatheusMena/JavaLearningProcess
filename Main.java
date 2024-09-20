//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // lugar onde ficam as funções;
    public  static  void  saudacoesSimples() { // retorna void
        System.out.println("Olá mundo!");
    }
    public static  void mensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public  static  int numeroRandom() {
        return (int)  (Math.random() * 100);

    }

    public  static int somar (int a, int b) {
        return  (a + b);
    }

    //Receber 2 numeros inteiros e verificar se o primeiro e divisivel pelo segundo
    public  static  void Divisivel (int a, int b){

        int numero = a / b;

        if(numero % 2 == 0){
            System.out.println("É divisivel");
        }else {
            System.out.println("não divisivel");
        }
    }
    //perguntas:
    //não entendi o conceito de retorno , porque o sout é divisivel naõ é um retorno?


    // receba um numero e imprima a tabuada
    public  static void Tabuada (int numero){
        if(numero <= 0){return;}
        for (int i =1;i <=10; i++){
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }
    }

    // um programa que realize as 4 operações, receba 2 valores, calcule e receba o resultado;

    public  static void Operacao (String nomeOperacao, int valor1, int valor2){
        int escolha = 0;
        if (nomeOperacao == "soma" || nomeOperacao == "Soma"){escolha = 1;}
        if (nomeOperacao == "subtração" || nomeOperacao == "Subtração"){escolha = 2;}
        if (nomeOperacao == "multiplicação" || nomeOperacao == "Multiplicação"){escolha = 3;}
        if (nomeOperacao == "divisão" || nomeOperacao == "Divisão"){escolha = 4;}


        switch (escolha) {
            case 1:
                System.out.println((valor1 + valor2));
                break;
            case 2:
                System.out.println((valor1 - valor2));
                break;
            case 3:
                System.out.println((valor1 * valor2));
                break;
            case 4:
                System.out.println((valor1 / valor2));
                break;
        }
    }

    public static void main(String[] args) { // funcão
    saudacoesSimples();
    mensagem("oi");
    System.out.println("este é o numero " + numeroRandom());
    System.out.println("Esta é a soma: " + somar(2,3));
    Divisivel(4,2);
    Tabuada(0);
    Operacao("soma", 2,3);
    }


}