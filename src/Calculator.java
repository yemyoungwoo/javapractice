import javax.swing.JFrame;

public class Calculator extends JFrame {
	
	public Calculator() {
		setTitle("계산기");
		setVisible(true);
		setSize(300, 370);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Calculator();
	}
}
