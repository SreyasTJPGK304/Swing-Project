import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Sample {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Page");
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsername.setText("Username");
		txtUsername.setBounds(200, 11, 151, 39);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPassword.setText("Password");
		txtPassword.setBounds(200, 61, 151, 39);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(90, 25, 80, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(90, 75, 73, 14);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxRemainderMe = new JCheckBox("Remainder me");
		chckbxRemainderMe.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxRemainderMe.setBounds(200, 107, 109, 23);
		frame.getContentPane().add(chckbxRemainderMe);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setForeground(new Color(0, 0, 205));
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignIn.setBounds(81, 162, 89, 39);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignOut = new JButton("Sign Up");
		btnSignOut.setForeground(new Color(255, 0, 0));
		btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignOut.setBounds(244, 162, 96, 39);
		frame.getContentPane().add(btnSignOut);
	}
}
