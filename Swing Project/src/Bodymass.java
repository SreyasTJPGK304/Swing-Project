import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bodymass {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	double num1;
	double num2;
	double res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bodymass window = new Bodymass();
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
	public Bodymass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 251, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(list);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setBounds(0, 0, 235, 51);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBodyMassIndex.setForeground(new Color(0, 128, 128));
		lblBodyMassIndex.setBounds(59, 11, 116, 29);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(0, 56, 235, 199);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(90, 23, 111, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 65, 111, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHeightm = new JLabel("Height(m):");
		lblHeightm.setBounds(20, 26, 60, 14);
		panel_1.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(kg):");
		lblWeightkg.setBounds(20, 68, 60, 14);
		panel_1.add(lblWeightkg);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 215, 0));
		textField_2.setBounds(65, 111, 60, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblOverweight = new JLabel("");
		lblOverweight.setForeground(new Color(255, 215, 0));
		lblOverweight.setBounds(143, 117, 68, 14);
		panel_1.add(lblOverweight);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				double res=(num1/num2/num2)*10000;
				String ans=String.format("%.2f",res);
				textField_2.setText(ans);
				if(res<18.5) {
					lblOverweight.setText("Under Weight");
				}
				else if(res>18.5 && res<24.5) {
					lblOverweight.setText("Normal Weight");
				}
				else if(res>25 && res<29.9) {
					lblOverweight.setText("Over Weight");
				}
				else {
					lblOverweight.setText("Obese");
				}
				
			}
		});
		btnCalculate.setBounds(10, 159, 84, 23);
		panel_1.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				lblOverweight.setText(null);
				
			}
		});
		btnClear.setBounds(95, 159, 68, 23);
		panel_1.add(btnClear);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBounds(165, 159, 60, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(20, 117, 46, 14);
		panel_1.add(lblBmi);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(154, 205, 50));
		panel_2.setBounds(0, 261, 235, 102);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("C://Users/User/Pictures/bodymass.jpg");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(0, 0, 235, 102);
		panel_2.add(btnNewButton_1);
	}
}
