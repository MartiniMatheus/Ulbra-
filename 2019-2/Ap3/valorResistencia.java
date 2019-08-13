import javax.swing.*;

public class valorResistencia {
    public static void main(String[] args) {

        int cont;
        double re;
        double r1, r2, r3, r4;

        r1 = Double.parseDouble(JOptionPane.showInputDialog("digite a r1:"));
        r2 = Double.parseDouble(JOptionPane.showInputDialog("digite a r2:"));
        r3 = Double.parseDouble(JOptionPane.showInputDialog("digite a r3:"));
        r4 = Double.parseDouble(JOptionPane.showInputDialog("digite a r4:"));

        re = r1 + r2 + r3 + r4;

        if (r1 < r2 && r1 < r3 && r1 < r4){
            JOptionPane.showMessageDialog(null,"Valor de resistencia menor "+r1);
        }else if (r2 < r1 && r2 < r3 && r2 < r4){
            JOptionPane.showMessageDialog(null,"Valor de resistencia menor "+r2);
        }else if (r3 < r2 && r3 < r1 && r3 < r4){
            JOptionPane.showMessageDialog(null,"Valor de resistencia menor "+r3);
        }else if (r4 < r2 && r4 < r3 && r4 < r1){
            JOptionPane.showMessageDialog(null,"Valor de resistencia menor "+r4);
        }
        if (r1 > r2 && r1 > r3 && r1 > r4){
            JOptionPane.showMessageDialog(null,"Valor de resistencia maior "+r1);
        }else if (r2 > r1 && r2 > r3 && r2 > r4){
            JOptionPane.showMessageDialog(null,"Valor de resistencia maior "+r2);
        }else if (r3 > r2 && r3 > r1 && r3 > r4){
            JOptionPane.showMessageDialog(null,"Valor de resistencia maior "+r3);
        }else if (r4 > r2 && r4 > r3 && r4 > r1){
            JOptionPane.showMessageDialog(null,"Valor de resistencia maior "+r4);
        }
        JOptionPane.showMessageDialog(null, "Valor da resistencia:" + re);
    }
}
