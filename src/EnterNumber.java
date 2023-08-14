import javax.swing.JOptionPane;

public class EnterNumber {
    public static void main(String[] args) {
	int n = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number."));
	for (int i = 1; i <= n; i++) {
	    JOptionPane.showMessageDialog(null, i);
	}
    }
}
