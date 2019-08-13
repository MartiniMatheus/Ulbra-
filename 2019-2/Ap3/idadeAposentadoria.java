import javax.swing.*;

public class idadeAposentadoria {

    public static void main(String[] args) {
        double idade;
        double contribuicao;
        double rest;
        String sexo;
        String teclado;

        teclado = JOptionPane.showInputDialog("Digite sua idade: ");
        idade = Double.parseDouble(teclado);
        teclado = JOptionPane.showInputDialog("Digite seus anos de contribuição:");
        contribuicao = Double.parseDouble(teclado);
        sexo = JOptionPane.showInputDialog("Digite seu sexo:");
        if (sexo.equals("masculino") || sexo.equals("MASCULINO")){
            if (idade >= 65){
                JOptionPane.showMessageDialog(null, "Ja pode se aposentar por idade");
            }else if (idade >= 65 && contribuicao >= 35){
                JOptionPane.showMessageDialog(null, "Ja pode se aposentar pela idade e contribuição");
            }else
                if (contribuicao >= 30){
                    JOptionPane.showMessageDialog(null,"Pode se aposentar por contriubuição!");
            }else{
                    rest = 65 - idade;
                    JOptionPane.showMessageDialog(null,"Ainda faltam "+rest+" anos para se aposentar");
                }
        }else
            if (sexo.equals("feminino") || sexo.equals("FEMININO")){
                if (idade >= 60){
                    JOptionPane.showMessageDialog(null, "Ja pode se aposentar por idade");
                }else if (idade >= 60 && contribuicao >= 30){
                    JOptionPane.showMessageDialog(null, "Ja pode se aposentar pela idade e contribuição");
                }else
                if (contribuicao >= 30){
                    JOptionPane.showMessageDialog(null,"Pode se aposentar por contriubuição!");
                }else{
                    rest = 60 - idade;
                    JOptionPane.showMessageDialog(null,"Ainda faltam "+rest+" anos para se aposentar");
                }
        }else{
                JOptionPane.showMessageDialog(null,"Tente dnv");
            }
    }
}
