import java.util.Scanner;

public class valorDesconto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double valor;
        double desconto;
        double result;

        System.out.println("Digite o valor do Produto:");
        valor = teclado.nextDouble();
        System.out.println("Digite o valor do desconto %: ");
        desconto = teclado.nextDouble();

        result = valor * desconto / 100;
        System.out.println("Valor do produto " + valor);
        System.out.println("Valor do desconto " + desconto +" %");
        System.out.println("Valor do produto com desconto " + (valor - result));

    }
}