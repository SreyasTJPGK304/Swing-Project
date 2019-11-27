import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class scienticalc {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double result;
	double USA=70.89;
	double Canada=53.92;
	double UK=91.89;
	String op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scienticalc window = new scienticalc();
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
	public scienticalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 789, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandared = new JMenuItem("Standared");
		mntmStandared.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 290, 488);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(null);
			}
		});
		mnFile.add(mntmStandared);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 572, 488);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(null);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 789, 488);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(null);
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Confirm","Exit",
						JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(569, 11, 194, 277);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblC = new JLabel("Currency Converter");
		lblC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblC.setBounds(28, 21, 142, 14);
		panel.add(lblC);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "Canada", "UK"}));
		comboBox.setBounds(28, 65, 130, 20);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(28, 108, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(38, 147, 105, 32);
		panel.add(l2);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp = Double.parseDouble(textField.getText());
                if(comboBox.getSelectedItem().equals("USA"))
                {
                    String c = String.format("Rs %.2f", bp*USA);
                    l2.setText(c);
                }
                if(comboBox.getSelectedItem().equals("Canada"))
                {
                    String c = String.format("Rs %.2f", bp*Canada);
                    l2.setText(c);
                    
                }
                if(comboBox.getSelectedItem().equals("UK"))
                {
                    String c = String.format("Rs %.2f", bp*UK);
                    l2.setText(c);
                }
			}
		});
		btnConvert.setBounds(10, 226, 89, 23);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setBounds(109, 226, 75, 23);
		panel.add(btnClear);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 204, 45);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b =null;
				if(btnNewButton.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField_1.getText());
					strB.deleteCharAt(textField_1.getText().length()-1);
					b=strB.toString();
					textField_1.setText(b);
				}
			}
		});
		btnNewButton.setBounds(10, 67, 45, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCe.setBounds(59, 67, 51, 36);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
			}
		});
		btnC.setBounds(114, 67, 45, 36);
		frame.getContentPane().add(btnC);
		
		JButton button = new JButton("+-");
		button.setBounds(163, 67, 51, 36);
		frame.getContentPane().add(button);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=Math.sqrt(num1);
				textField_1.setText(String.valueOf(num1));
			}
		});
		btnSqrt.setBounds(218, 67, 58, 36);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnL = new JButton("L..");
		btnL.setBounds(286, 67, 51, 36);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=Math.sin(num1);
				textField_1.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(347, 67, 63, 36);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinH = new JButton("Sin h");
		btnSinH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=Math.sinh(num1);
				textField_1.setText(String.valueOf(num1));
			}
		});
		btnSinH.setBounds(423, 67, 63, 36);
		frame.getContentPane().add(btnSinH);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				op="%";
			}
		});
		btnMod.setBounds(496, 67, 63, 36);
		frame.getContentPane().add(btnMod);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_1.getText();
				textField_1.setText(Number);
			}
		});
		button_1.setBounds(10, 106, 45, 36);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(59, 106, 45, 36);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_3.getText();
				textField_1.setText(Number);
			}
		});
		button_3.setBounds(114, 106, 45, 36);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("/");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				op="/";
			}
		});
		button_4.setBounds(163, 106, 45, 36);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("%");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				op="%";
			}
		});
		button_5.setBounds(218, 106, 58, 36);
		frame.getContentPane().add(button_5);
		
		JButton btnPi = new JButton("Pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=3.14;
				String s=String.format("%.2f", a);
				textField_1.setText(s);
			}
		});
		btnPi.setBounds(286, 106, 51, 36);
		frame.getContentPane().add(btnPi);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=Math.cos(num1);
				textField_1.setText(String.valueOf(num1));
			}
		});
		btnCos.setBounds(350, 106, 61, 36);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosH = new JButton("Cosh");
		btnCosH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=Math.cosh(num1);
				textField_1.setText(String.valueOf(num1));
			}
		});
		btnCosH.setBounds(423, 106, 63, 36);
		frame.getContentPane().add(btnCosH);
		
		JButton btnInx = new JButton("Inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnInx.setBounds(496, 106, 63, 36);
		frame.getContentPane().add(btnInx);
		
		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_6.getText();
				textField_1.setText(Number);
			}
		});
		button_6.setBounds(10, 148, 45, 36);
		frame.getContentPane().add(button_6);
		
		JButton btnNewButton_1 = new JButton("5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+btnNewButton_1.getText();
				textField_1.setText(Number);
			}
		});
		btnNewButton_1.setBounds(65, 148, 45, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_7.getText();
				textField_1.setText(Number);
			}
		});
		button_7.setBounds(114, 148, 45, 36);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				op="*";
			}
		});
		button_8.setBounds(163, 148, 45, 36);
		frame.getContentPane().add(button_8);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=1/num1;
				textField_1.setText(String.valueOf(num1));
				
			}
		});
		btnx.setBounds(218, 148, 58, 36);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				op="x^y";
			}
		});
		btnXy.setBounds(286, 148, 63, 36);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=Math.tan(num1);
				textField_1.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(350, 148, 63, 36);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=Math.tanh(num1);
				textField_1.setText(String.valueOf(num1));
			}
		});
		btnTanh.setBounds(423, 148, 63, 36);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
			}
		});
		btnC_1.setBounds(496, 148, 63, 36);
		frame.getContentPane().add(btnC_1);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_9.getText();
				textField_1.setText(Number);
			}
		});
		button_9.setBounds(10, 195, 45, 36);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_10.getText();
				textField_1.setText(Number);
			}
		});
		button_10.setBounds(65, 195, 45, 36);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_11.getText();
				textField_1.setText(Number);
			}
		});
		button_11.setBounds(114, 195, 45, 36);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				op="-";
			}
		});
		button_12.setBounds(163, 195, 45, 36);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField_1.getText());
				if(op=="+") {
					result=num1+num2;
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
				if(op=="-") {
					result=num1-num2;
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
				if(op=="*") {
					result=num1*num2;
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
				if(op=="/") {
					result=num1/num2;
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
				if(op=="%") {
					result=num1%num2;
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
				if(op=="mod") {
					result=num1%num2;
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
				if(op=="cbr") {
					result=(num1/num2)*100;
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
				if(op=="%") {
					result=num1%num2;
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
				if(op=="x^y") {
					result=Math.pow(num1, num2);
					ans=String.format("%.2f",result);
							textField_1.setText(ans);
							
				}
			}
		});
		button_13.setBounds(218, 195, 58, 87);
		frame.getContentPane().add(button_13);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				double a=num1*num1;
				String d=String.format("%.2f", a);
				textField_1.setText(d);
				
			}
		});
		btnX.setBounds(286, 195, 63, 36);
		frame.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				op="cbr";
			}
		});
		btnCbr.setBounds(360, 195, 61, 36);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				num1=Math.round(num1);
				textField_1.setText(String.valueOf(num1));
			}
		});
		btnRund.setBounds(423, 195, 63, 36);
		frame.getContentPane().add(btnRund);
		
		JButton btnpi = new JButton("2*Pi");
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("6.28");
			}
		});
		btnpi.setBounds(500, 195, 58, 36);
		frame.getContentPane().add(btnpi);
		
		JButton button_14 = new JButton("0");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_14.getText();
				textField_1.setText(Number);
			}
		});
		button_14.setBounds(10, 246, 94, 36);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton(".");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_1.getText()+button_15.getText();
				textField_1.setText(Number);
			}
			
		});
		button_15.setBounds(115, 246, 44, 36);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("+");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				op="+";
			}
		});
		button_16.setBounds(163, 246, 45, 36);
		frame.getContentPane().add(button_16);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_1.getText());
				double a=num1*num1*num1;
				String d=String.format("%.2f", a);
				textField_1.setText(d);
			}
		});
		btnX_1.setBounds(286, 242, 63, 36);
		frame.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField_1.getText());
				textField_1.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setBounds(362, 242, 59, 36);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField_1.getText());
				textField_1.setText(Integer.toHexString(a));
			}
		});
		btnHex.setBounds(423, 242, 63, 36);
		frame.getContentPane().add(btnHex);
		
		JButton btnOc = new JButton("Oc");
		btnOc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField_1.getText());
				textField_1.setText(Integer.toOctalString(a));
			}
		});
		btnOc.setBounds(501, 242, 58, 36);
		frame.getContentPane().add(btnOc);
	}
}
