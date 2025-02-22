package lab3_PartA_MessageDialog;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class MessageDialog {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageDialog window = new MessageDialog();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MessageDialog() {
		initialize();
		String text = "<HTML><i>This</i> is a <br><font color=\"red\">two-line message.";
		String title = "Attention!";
		int type = JOptionPane.ERROR_MESSAGE;
		JOptionPane.showMessageDialog(null, text, title, type);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
