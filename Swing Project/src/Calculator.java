import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 288, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 18, 248, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(UIManager.getColor("Button.background"));
		button.setForeground(Color.BLACK);
		button.setBounds(10, 88, 45, 23);
		frame.getContentPane().add(button);
		
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(79, 88, 45, 23);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		
		
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(148, 88, 45, 23);
		frame.getContentPane().add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBounds(213, 88, 45, 23);
		frame.getContentPane().add(button_3);
		
		
		JButton button_4 = new JButton("4");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBounds(10, 138, 45, 23);
		frame.getContentPane().add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_5 = new JButton("5");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setBounds(79, 138, 45, 23);
		frame.getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_6 = new JButton("6");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(148, 138, 45, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setBounds(213, 138, 45, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setBounds(10, 188, 45, 23);
		frame.getContentPane().add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_9 = new JButton("8");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.setBounds(79, 188, 45, 23);
		frame.getContentPane().add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_10 = new JButton("9");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_10.setBounds(148, 188, 45, 23);
		frame.getContentPane().add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_11.setBounds(213, 188, 45, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_12.setBounds(10, 234, 45, 23);
		frame.getContentPane().add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		
		JButton button_13 = new JButton(".");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_13.setBounds(85, 234, 45, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
					result=num1+num2;
					ans=String.format("%.2f",result);
							textField.setText(ans);
							
				}
				if(op=="-") {
					result=num1-num2;
					ans=String.format("%.2f",result);
							textField.setText(ans);
							
				}
				if(op=="*") {
					result=num1*num2;
					ans=String.format("%.2f",result);
							textField.setText(ans);
							
				}
				if(op=="/") {
					result=num1/num2;
					ans=String.format("%.2f",result);
							textField.setText(ans);
							
				}
				if(op=="%") {
					result=num1%num2;
					ans=String.format("%.2f",result);
							textField.setText(ans);
							
				}
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_14.setBounds(148, 234, 45, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_15.setBounds(213, 234, 45, 23);
		frame.getContentPane().add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		btnC.setBackground(Color.RED);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setForeground(Color.BLACK);
		btnC.setBounds(10, 283, 86, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b =null;
				if(btnB.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
				}
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnB.setBounds(137, 283, 56, 23);
		frame.getContentPane().add(btnB);
		
		JButton button_16 = new JButton("%");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_16.setBounds(213, 283, 45, 23);
		frame.getContentPane().add(button_16);
	}
}
