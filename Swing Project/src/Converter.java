import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Converter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double height;
	double weight;
	double res1;
	double res2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
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
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 240, 230));
		frame.setBounds(100, 100, 369, 261);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(105, 66, 108, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 115, 108, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHeight.setBounds(49, 69, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWeight.setBounds(49, 118, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblUsMeasurement.setBounds(114, 39, 99, 14);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblMetric.setBounds(246, 39, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblM = new JLabel("");
		lblM.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblM.setBounds(246, 69, 46, 14);
		frame.getContentPane().add(lblM);
		
		JLabel lblKg = new JLabel("");
		lblKg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblKg.setBounds(246, 118, 46, 14);
		frame.getContentPane().add(lblKg);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				height=Double.parseDouble(textField.getText());
				weight=Double.parseDouble(textField_1.getText());
				//textField.setText("");
				res1=height*0.296;
				String ans1=String.format("%.2fm",res1);
				res2=weight*0.4514;
				String ans2=String.format("%.0fkg",res2);
		
			lblM.setText(ans1);
			lblKg.setText(ans2);
				
			}
		});
		btnOk.setBounds(105, 176, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(220, 176, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHelp.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAbout.setBounds(49, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
	}
}
