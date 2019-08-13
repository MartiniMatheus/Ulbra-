import javax.swing.*;

public class tabuada {
    public static void main(String[] args) {
        int i;
        int cont=0;
        int n;
        int result;
        String teclado;

        teclado = JOptionPane.showInputDialog("Digite um numero para saber seus multiplos:");
        n = Integer.parseInt(teclado);
        for (i=0; i<=10; i++){
            result = n * i;
            JOptionPane.showMessageDialog(null,n +" x "+ cont++ +" = " + result);
        }
    }
}
