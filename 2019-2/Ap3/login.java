import javax.swing.*;

public class login {
    public static void main(String[] args) {
        String nome = "java8";
        String senha = "java8";
        String compNome;
        String compSenha;
        int cont = 3;

        do {
            cont--;
            compNome = JOptionPane.showInputDialog("Digite o usuario: ");
            compSenha = JOptionPane.showInputDialog("Digite a senha: ");
            if (!compNome.equals(nome) && !compSenha.equals(senha)) {
                JOptionPane.showMessageDialog(null, "Errado! Voce ainda tem " + cont + " tentativas");
            }

        } while (!compNome.equals(nome) && !compSenha.equals(senha) || !(cont == 0));
        if (compNome.equals(nome) && compSenha.equals(senha)) {
            JOptionPane.showMessageDialog(null,"Acesso Permitido!");
        } else {
            JOptionPane.showMessageDialog(null, "try again!");
        }
    }
}
