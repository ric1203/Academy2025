import javax.swing.*;

public class JOptionPaneNames {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Ingrese un" +
                " nombre");
        JOptionPane.showMessageDialog(null, "Welcome "+name ,
                "Welcome", JOptionPane.INFORMATION_MESSAGE);
    }
}
