import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hotelmanage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	double num1;
	double num2;
	double result;
	double a;
	double b;
	double d;
	double qty;
	double India=10;
	double Canada=53.92;
	double USA=70.89;
	String op;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelmanage window = new hotelmanage();
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
	public hotelmanage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 940, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 54, 362, 206);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblChickenBurger.setBounds(10, 11, 104, 14);
		panel.add(lblChickenBurger);
		
		textField = new JTextField();
		textField.setBounds(176, 11, 104, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblChickenBurgerMeal.setBounds(10, 45, 132, 14);
		panel.add(lblChickenBurgerMeal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 42, 104, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCheeseBurger.setBounds(10, 80, 104, 14);
		panel.add(lblCheeseBurger);
		
		textField_2 = new JTextField();
		textField_2.setBounds(176, 77, 104, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 116, 257, 2);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDrink.setBounds(10, 124, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblQty.setBounds(158, 124, 46, 14);
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Coffee"}));
		comboBox.setBounds(10, 144, 104, 20);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(181, 144, 99, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home delivery");
		rdbtnHomeDelivery.setBounds(10, 171, 109, 23);
		panel.add(rdbtnHomeDelivery);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setBounds(158, 171, 109, 23);
		panel.add(rdbtnTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(382, 54, 272, 206);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setBounds(42, 11, 169, 30);
		lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblCurrencyConverter);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(52, 52, 169, 30);
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"India", "Canada", "USA"}));
		panel_1.add(comboBox_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(51, 93, 169, 30);
		panel_1.add(textField_7);
		textField_7.setColumns(10);

		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(23, 172, 89, 23);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double bp = Double.parseDouble(textField_7.getText());
				if(comboBox.getSelectedItem().equals("India"))
                {
                    String c = String.format("Rs %.2f", bp*India);
                    textField_12.setText(c);
                }
                if(comboBox.getSelectedItem().equals("Canada"))
                {
                    String c = String.format("Rs %.2f", bp*Canada);
                    textField_12.setText(c);
                    
                }
                if(comboBox.getSelectedItem().equals("USA"))
                {
                    String c = String.format("Rs %.2f", bp*USA);
                    textField_12.setText(c);
                }

                if(rdbtnTax.isSelected()==true) {
					double cvrt=Double.parseDouble(textField_7.getText());
					double crt=(cvrt*18)/100;
					String ct=String.format("%.2f", crt);
					textField_8.setText(ct);
					
				}
				
			}
		});
		btnConvert.setFont(new Font("Times New Roman", Font.BOLD, 13));
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(147, 172, 89, 23);
		btnClose.setFont(new Font("Times New Roman", Font.BOLD, 13));
		panel_1.add(btnClose);
		
		textField_12 = new JTextField();
		textField_12.setBounds(93, 134, 104, 27);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
				
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(10, 271, 362, 152);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCostOfDrinks.setBounds(10, 24, 81, 14);
		panel_3.add(lblCostOfDrinks);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setForeground(Color.BLACK);
		textField_4.setBounds(179, 21, 101, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCostOfMeal.setBounds(10, 72, 81, 14);
		panel_3.add(lblCostOfMeal);
		
		textField_5 = new JTextField();
		textField_5.setBounds(181, 69, 99, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCostOfDelivery.setBounds(10, 115, 101, 14);
		panel_3.add(lblCostOfDelivery);
		
		textField_6 = new JTextField();
		textField_6.setBounds(179, 112, 101, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(382, 271, 272, 152);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTax.setBounds(26, 21, 46, 14);
		panel_4.add(lblTax);
		
		textField_8 = new JTextField();
		textField_8.setBounds(118, 18, 132, 20);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblSubTotal.setBounds(26, 61, 56, 14);
		panel_4.add(lblSubTotal);
		
		textField_9 = new JTextField();
		textField_9.setBounds(118, 58, 132, 20);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTotal.setBounds(26, 99, 46, 14);
		panel_4.add(lblTotal);
		
		textField_10 = new JTextField();
		textField_10.setBounds(118, 96, 132, 20);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(10, 434, 904, 53);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 a=Double.parseDouble(textField.getText());
				 b=Double.parseDouble(textField_1.getText());
				 d=Double.parseDouble(textField_2.getText());
				qty=Double.parseDouble(textField_3.getText());
				
				if(comboBox.getSelectedItem().equals("Tea")) {
					double tea=9*qty;
					String t=String.format("%.2f", tea);
					textField_4.setText(t);
				}

				if(comboBox.getSelectedItem().equals("Coffee")) {
					double coffee=13*qty;
					String c=String.format("%.2f", coffee);
					textField_4.setText(c);
				}
				double meals=(a*50)+(b*75)+(d*95);
				String m=String.format("%.2f", meals);
				textField_5.setText(m);
				if(rdbtnHomeDelivery.isSelected()==true) {
				double cost=25;
				String p=String.format("%.2f", cost);
				textField_6.setText(p);
				
				
				}else {
					double cst=0;
					String q=String.format("%.2f", cst);
					textField_6.setText(q);
				}
				
				double cd=Double.parseDouble(textField_4.getText());
				double cm=Double.parseDouble(textField_5.getText());
				double tx=Double.parseDouble(textField_6.getText());
				
				double total=cd+cm+tx;
				String ttl=String.format("%.2f", total);
				textField_7.setText(ttl);
				
				
			
				
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnTotal.setBounds(42, 11, 89, 23);
		panel_5.add(btnTotal);
		
		JButton btnRece = new JButton("Rece...");
		btnRece.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnRece.setBounds(188, 11, 89, 23);
		panel_5.add(btnRece);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnReset.setBounds(345, 11, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnExit.setBounds(505, 11, 89, 23);
		panel_5.add(btnExit);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		tabbedPane.setBounds(664, 54, 250, 372);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField_11 = new JTextField();
		textField_11.setBounds(10, 11, 219, 43);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String b =null;
				if(btnNewButton.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField_11.getText());
					strB.deleteCharAt(textField_11.getText().length()-1);
					b=strB.toString();
					textField_11.setText(b);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(10, 76, 46, 36);
		panel_2.add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_11.setText(null);
			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnC.setBounds(66, 76, 46, 36);
		panel_2.add(btnC);
		
		JButton button = new JButton("...");
		button.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button.setBounds(117, 76, 46, 36);
		panel_2.add(button);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField_11.getText());
				textField_11.setText("");
				op="+";
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_1.setBounds(167, 76, 46, 36);
		panel_2.add(button_1);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+btnNewButton_1.getText();
				textField_11.setText(Number);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBounds(10, 123, 46, 36);
		panel_2.add(btnNewButton_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_2.getText();
				textField_11.setText(Number);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_2.setBounds(10, 170, 46, 36);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_3.getText();
				textField_11.setText(Number);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_3.setBounds(10, 217, 46, 36);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("0");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_4.getText();
				textField_11.setText(Number);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_4.setBounds(10, 264, 46, 36);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_5.getText();
				textField_11.setText(Number);
				
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_5.setBounds(66, 123, 46, 36);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_6.getText();
				textField_11.setText(Number);
			}
			
		});
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_6.setBounds(66, 170, 46, 36);
		panel_2.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_7.getText();
				textField_11.setText(Number);
			}
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_7.setBounds(66, 217, 46, 36);
		panel_2.add(button_7);
		
		JButton button_8 = new JButton(".");
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_8.setBounds(66, 264, 46, 36);
		panel_2.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_9.getText();
				textField_11.setText(Number);
			}
		});
		button_9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_9.setBounds(117, 123, 46, 36);
		panel_2.add(button_9);
		
		JButton button_10 = new JButton("6");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_10.getText();
				textField_11.setText(Number);
			}
		});
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_10.setBounds(117, 170, 46, 36);
		panel_2.add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField_11.getText()+button_11.getText();
				textField_11.setText(Number);
			}
		});
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_11.setBounds(117, 217, 46, 36);
		panel_2.add(button_11);
		
		JButton button_12 = new JButton("New button");
		button_12.setBounds(117, 264, 46, 36);
		panel_2.add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField_11.getText());
				textField_11.setText("");
				op="-";
			}
		});
		button_13.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_13.setBounds(167, 123, 46, 36);
		panel_2.add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField_11.getText());
				textField_11.setText("");
				op="*";
			}
		});
		button_14.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_14.setBounds(167, 170, 46, 36);
		panel_2.add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField_11.getText());
				textField_11.setText("");
				op="/";
			}
		});
		button_15.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_15.setBounds(167, 217, 46, 36);
		panel_2.add(button_15);
		
		JButton button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ans;
				num2=Double.parseDouble(textField_11.getText());
				if(op=="+") {
					result=num1+num2;
					ans=String.format("%.2f", result);
					textField_11.setText(ans);
				}
				if(op=="-") {
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField_11.setText(ans);
				}
				if(op=="*") {
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField_11.setText(ans);
				}
				if(op=="/") {
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField_11.setText(ans);
				}
			}
			
		});
		button_16.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_16.setBounds(167, 264, 46, 36);
		panel_2.add(button_16);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblRestaurantManagementSystems = new JLabel("Restaurant Management Systems");
		lblRestaurantManagementSystems.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRestaurantManagementSystems.setForeground(new Color(0, 0, 255));
		lblRestaurantManagementSystems.setBounds(10, 23, 229, 14);
		panel_6.add(lblRestaurantManagementSystems);
		
		JLabel lblChickenBurger_1 = new JLabel("Chicken Burger");
		lblChickenBurger_1.setForeground(new Color(0, 0, 255));
		lblChickenBurger_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblChickenBurger_1.setBounds(10, 74, 107, 14);
		panel_6.add(lblChickenBurger_1);
		
		JLabel lblChickenBurgerMeal_1 = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal_1.setForeground(new Color(0, 0, 255));
		lblChickenBurgerMeal_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblChickenBurgerMeal_1.setBounds(10, 99, 132, 14);
		panel_6.add(lblChickenBurgerMeal_1);
		
		JLabel lblBaconAndCheese = new JLabel("Bacon and Cheese Burger");
		lblBaconAndCheese.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblBaconAndCheese.setForeground(new Color(0, 0, 255));
		lblBaconAndCheese.setBounds(10, 124, 151, 14);
		panel_6.add(lblBaconAndCheese);
		
		JLabel lblThanksForUsing = new JLabel("Thanks for using Job Estimator");
		lblThanksForUsing.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblThanksForUsing.setForeground(new Color(0, 0, 255));
		lblThanksForUsing.setBounds(10, 174, 190, 14);
		panel_6.add(lblThanksForUsing);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(171, 74, 46, 14);
		panel_6.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(171, 99, 46, 14);
		panel_6.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(171, 124, 46, 14);
		panel_6.add(label);
	}
}
