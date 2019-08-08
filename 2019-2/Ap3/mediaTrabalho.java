import javax.swing.*;

public class mediaTrabalho {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double trabalho;
        double media;
        String teclado;

        teclado = JOptionPane.showInputDialog("Digite a nota da sua prova 1:");
        nota1 = Double.parseDouble(teclado);
        teclado = JOptionPane.showInputDialog("Digite a nota da sua prova 2:");
        nota2 = Double.parseDouble(teclado);
        teclado = JOptionPane.showInputDialog("Digite a nota de seu trabalho:");
        trabalho = Double.parseDouble(teclado);

        media = (nota1 + nota2 + trabalho)/3;
        if (media < 6 ){
            JOptionPane.showMessageDialog(null,"Reprovado com nota "+media);
        }else{
            JOptionPane.showMessageDialog(null, "Aprovado com nota "+media);
        }
    }
}
