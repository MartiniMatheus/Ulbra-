import javax.swing.*;

public class produtorValor {
    public static void main(String[] args) {
        String produto;
        double preco;
        double valorFinal;

        produto = JOptionPane.showInputDialog("Digite o nome do produto: ");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));

        if (preco >= 50 && preco < 200){
            valorFinal = preco - preco * 5/100;
            JOptionPane.showMessageDialog(null,produto+ " de preço "+preco);
            JOptionPane.showMessageDialog(null,"Com o desconto, o valor final do produto é :"+ valorFinal);
        }else if (preco >= 200 && preco < 500){
            valorFinal = preco - preco * 6/100;
            JOptionPane.showMessageDialog(null,produto+ " de preço "+preco);
            JOptionPane.showMessageDialog(null,"Com o desconto, o valor final do produto é :"+ valorFinal);
        }else if (preco >= 500 && preco < 1000){
            valorFinal = preco - preco * 7/100;
            JOptionPane.showMessageDialog(null,produto+ " de preço "+preco);
            JOptionPane.showMessageDialog(null,"Com o desconto, o valor final do produto é :"+ valorFinal);
        }else if (preco >= 1000){
            valorFinal = preco - preco * 8/100;
            JOptionPane.showMessageDialog(null,produto+ " de preço "+preco);
            JOptionPane.showMessageDialog(null,"Com o desconto, o valor final do produto é :"+ valorFinal);
        }else{
            JOptionPane.showMessageDialog(null, "O valor digitado esta incorreto!");
        }
    }
}
