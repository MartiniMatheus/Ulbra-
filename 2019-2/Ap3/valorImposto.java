import javax.swing.*;

public class valorImposto {
    public static void main(String[] args) {

        String teclado;
        double valorVenal;
        double valorNegociado;
        double imposto;
        double total;

        teclado=JOptionPane.showInputDialog("Digite o valor da transação: ");
        valorNegociado = Double.parseDouble(teclado);
        teclado=JOptionPane.showInputDialog("Digite o valor da venal: ");
        valorVenal= Double.parseDouble(teclado);
        teclado=JOptionPane.showInputDialog("Digite o valor do imposto: ");
        imposto= Double.parseDouble(teclado);

        if (valorNegociado> valorVenal){
            total = valorNegociado*imposto/100;
        }else{
            total = valorVenal*imposto/100;
        }
        JOptionPane.showMessageDialog(null, "Valor a pagar é de  "+ total );
    }
}
