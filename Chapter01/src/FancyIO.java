import javax.swing.JOptionPane;

public class FancyIO {

    public static void main(String[] args) {
        // Request a number from the user
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
        JOptionPane.showMessageDialog(null, "You entered " + x);
    }

}
