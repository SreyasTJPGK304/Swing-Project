import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;

public class Project {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
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
	public Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setForeground(Color.WHITE);
		frame.setBounds(100, 100, 749, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(53, 218, 590, 45);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		JButton btnNewButton1 = new JButton(new ImageIcon("C://Users/User/Desktop/image.png"));
		btnNewButton1.setForeground(new Color(255, 255, 255));
		btnNewButton1.setBackground(new Color(255, 255, 255));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JButton btnNewButton = new JButton(new ImageIcon("C://Users/User/Desktop/.jpg"));
			}
		});
		btnNewButton1.setBounds(183, 95, 303, 89);
		frame.getContentPane().add(btnNewButton1);
		
		JLabel lblGmail = new JLabel("Gmail");
		lblGmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGmail.setBounds(513, 65, 46, 14);
		frame.getContentPane().add(lblGmail);
		
		JLabel lblImages = new JLabel("Images");
		lblImages.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblImages.setBounds(569, 65, 46, 14);
		frame.getContentPane().add(lblImages);
		
		Button button = new Button("Sign in");
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 205));
		button.setBounds(642, 57, 70, 32);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("Google Search");
		btnNewButton_1.setBackground(new Color(245, 245, 245));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(163, 305, 131, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnIAm = new JButton("I 'm  Feeling Lucky");
		btnIAm.setBackground(new Color(245, 245, 245));
		btnIAm.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnIAm.setBounds(367, 305, 159, 32);
		frame.getContentPane().add(btnIAm);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(-2, 19, 732, -19);
		frame.getContentPane().add(layeredPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(512, -197, 274, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(-2, 36, 732, 18);
		frame.getContentPane().add(separator_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(-2, 0, 732, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBounds(-2, 380, 735, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBounds(-2, 412, 732, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel lblIndia = new JLabel("India");
		lblIndia.setBounds(10, 387, 46, 14);
		frame.getContentPane().add(lblIndia);
		
		JLabel lblAdvertising = new JLabel("Advertising");
		lblAdvertising.setBounds(8, 425, 70, 14);
		frame.getContentPane().add(lblAdvertising);
		
		JLabel lblBussiness = new JLabel("Bussiness");
		lblBussiness.setBounds(84, 425, 54, 14);
		frame.getContentPane().add(lblBussiness);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(148, 425, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblHowSearchWorks = new JLabel("How Search Works");
		lblHowSearchWorks.setBounds(204, 425, 114, 14);
		frame.getContentPane().add(lblHowSearchWorks);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setBounds(669, 425, 54, 14);
		frame.getContentPane().add(lblSettings);
		
		JLabel lblTerms = new JLabel("Terms");
		lblTerms.setBounds(625, 425, 42, 14);
		frame.getContentPane().add(lblTerms);
		
		JLabel lblPrivacy = new JLabel("Privacy");
		lblPrivacy.setBounds(569, 425, 46, 14);
		frame.getContentPane().add(lblPrivacy);
	}
}
