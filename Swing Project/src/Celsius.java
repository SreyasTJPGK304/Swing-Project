import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Celsius {

	private JFrame frame;
	private JTextField textField;
	double num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Celsius window = new Celsius();
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
	public Celsius() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 345, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDegrees.setBounds(55, 17, 64, 20);
		frame.getContentPane().add(lblDegrees);
		
		textField = new JTextField();
		textField.setBounds(129, 16, 142, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblResult.setBounds(82, 83, 58, 14);
		frame.getContentPane().add(lblResult);
		
		JLabel label = new JLabel("=");
		label.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label.setBounds(150, 83, 18, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(178, 85, 58, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnToCelsius = new JButton("To Celsius");
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				double res=(num-32)*5/9;
				String ans=String.format("%.1f",res);
				lblNewLabel.setText(ans);
				
			}
		});
		btnToCelsius.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnToCelsius.setBounds(27, 123, 113, 38);
		frame.getContentPane().add(btnToCelsius);
		
		JButton btnToFahrenheit = new JButton("To Fahrenheit");
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				double res=num*9/5+32;
				String ans=String.format("%.1f",res);
				lblNewLabel.setText(ans);
			}
		});
		btnToFahrenheit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnToFahrenheit.setBounds(164, 123, 137, 36);
		frame.getContentPane().add(btnToFahrenheit);
	}
}
