import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.awt.event.ActionEvent;

public class ticketbooking {

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
	private JTable table;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	String aa="";
	String a1="";
	String v="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 803, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(180, 11, 386, 53);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblT = new JLabel("Ticket Booking");
		lblT.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblT.setBounds(93, 11, 260, 31);
		panel.add(lblT);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(377, 75, 400, 263);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTicketDetail = new JLabel("Ticket Detail");
		lblTicketDetail.setBounds(171, 0, 65, 14);
		panel_1.add(lblTicketDetail);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(32, 50, 46, 14);
		panel_1.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(94, 47, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(32, 91, 46, 14);
		panel_1.add(lblFrom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 85, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(32, 127, 46, 14);
		panel_1.add(lblTo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 124, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(32, 162, 46, 14);
		panel_1.add(lblDate);
		
		textField_3 = new JTextField();
		textField_3.setBounds(94, 159, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(32, 204, 46, 14);
		panel_1.add(lblTime);
		
		textField_4 = new JTextField();
		textField_4.setBounds(94, 201, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ticket No");
		lblNewLabel.setBounds(271, 91, 54, 14);
		panel_1.add(lblNewLabel);
		
		textField_5 = new JTextField();
		textField_5.setBounds(271, 105, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(271, 127, 46, 14);
		panel_1.add(lblPrice);
		
		textField_6 = new JTextField();
		textField_6.setBounds(271, 142, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(271, 165, 46, 14);
		panel_1.add(lblRoute);
		
		textField_7 = new JTextField();
		textField_7.setBounds(271, 180, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(90, 171, 51, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(201, 201, 83, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"3", "4", "5", "6", "7"}));
		frame.getContentPane().add(comboBox_2);
		

		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
                model.addRow(new String[] {
                        textField.getText(),
                        textField_5.getText(),
                        textField_1.getText(),
                        textField_2.getText(),
                        
                        (String)comboBox_2.getSelectedItem(),
                        textField_4.getText(),
                        textField_3.getText(),
                        v,
                        textField_6.getText(),
                });
				
				
                }
		});
		btnNewButton.setBounds(171, 232, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(10, 94, 46, 14);
		frame.getContentPane().add(lblName_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(90, 94, 101, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 124, 282, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(0, 133, 82, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setBounds(90, 133, 109, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(201, 133, 96, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("First Class");
		rdbtnNewRadioButton.setBounds(0, 171, 82, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(137, 171, 82, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(221, 171, 63, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 201, 72, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Arunachal Pradhesh", "Goa", "Jammu Kashmir"}));
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(90, 201, 96, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Andra Pradhesh", "Kerala", "Uttar Pradhesh"}));
		frame.getContentPane().add(comboBox_1);
		
				JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 243, 282, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=(String)textField_8.getText();
				textField.setText(name);
				String Combobox=(String)comboBox.getSelectedItem();
				textField_1.setText(Combobox);
				String Combbox=(String)comboBox_1.getSelectedItem();
				textField_2.setText(Combbox);
				
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_4.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_3.setText(tdate.format(timer.getTime()));
                
                Random ran = new Random();
                int n = ran.nextInt(1000000)+1;
                String val = String.valueOf(n);
                textField_5.setText(val);//ticket no

                
                
                if(rdbtnAc.isSelected())
                {
                    v="AC";
                }
                else
                {
                    v="Non";
                }
                String va=" ";
                String Ac=" ";
                String non=" ";
                double no=Double.parseDouble((String)comboBox_2.getSelectedItem());
                    if ((rdbtnAc.isSelected()==true) && (rdbtnSleeper.isSelected()==true) && (rdbtnSingleTicket.isSelected()==true ))
                   {
                        va="3400";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="200";
                        String aa=String.format("%s",sub);
                           
                           textField_10.setText(aa);
                          String a1=String.format("%s", Ac);
                           
                          textField_9.setText(a1);
                   }
                    
                    if ((rdbtnAc.isSelected()==true) && (rdbtnSleeper.isSelected()==true) && (rdbtnSingleTicket.isSelected()==false ))
                    {
                         va="4000";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="200";
                         String aa=String.format("%s",sub);
                            
                            textField_10.setText(aa);
                           String a1=String.format("%s", Ac);
                            
                           textField_9.setText(a1);
                    }
                    
                    if ((rdbtnAc.isSelected()==false) && (rdbtnSleeper.isSelected()==true) && (rdbtnSingleTicket.isSelected()==true ))
                    {
                         va="3000";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="100";
                         String aa=String.format("%s",sub);
                            
                            textField_10.setText(aa);
                           String a1=String.format("%s", Ac);
                            
                           textField_9.setText(a1);
                    }
                    
                    if ((rdbtnAc.isSelected()==false) && (rdbtnSleeper.isSelected()==true) && (rdbtnSingleTicket.isSelected()==false ))
                    {
                         va="3400";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="100";
                         String aa=String.format("%s",sub);
                            
                            textField_10.setText(aa);
                           String a1=String.format("%s", Ac);
                            
                           textField_9.setText(a1);
                    }
                    if ((rdbtnAc.isSelected()==true) && (rdbtnSleeper.isSelected()==false) && (rdbtnSingleTicket.isSelected()==true ))
                    {
                         va="3200";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="200";
                         String aa=String.format("%s",sub);
                            
                            textField_10.setText(aa);
                           String a1=String.format("%s", Ac);
                            
                           textField_9.setText(a1);
                    }
                    if ((rdbtnAc.isSelected()==true) && (rdbtnSleeper.isSelected()==true) && (rdbtnSingleTicket.isSelected()==false ))
                    {
                         va="3800";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="200";
                         String aa=String.format("%s",sub);
                            
                            textField_10.setText(aa);
                           String a1=String.format("%s", Ac);
                            
                           textField_9.setText(a1);
                    }
                    if ((rdbtnAc.isSelected()==false) && (rdbtnSleeper.isSelected()==false) && (rdbtnSingleTicket.isSelected()==true ))
                    {
                         va="2800";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="100";
                         String aa=String.format("%s",sub);
                            
                            textField_10.setText(aa);
                           String a1=String.format("%s", Ac);
                            
                           textField_9.setText(a1);
                    }
                    if ((rdbtnAc.isSelected()==false) && (rdbtnSleeper.isSelected()==false) && (rdbtnSingleTicket.isSelected()==false ))
                    {
                         va="3200";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="100";
                          aa=String.format("%s",sub);
                            
                            textField_10.setText(aa);
                           String a1=String.format("%s", Ac);
                            
                           textField_9.setText(a1);
                    }
                    double tax =Double.parseDouble(textField_9.getText());
                    double st=Double.parseDouble(textField_10.getText());
                    double c=tax+st;
                    String b=String.format("%s",c);
                    textField_11.setText(b);
                    
                    String price=(String)textField_11.getText();
                    textField_6.setText(price);
                    
                    textField_7.setText(Combobox+" to "+Combbox);
                    
			}
		});
		btnTotal.setBounds(10, 344, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
			}
		});
		btnReset.setBounds(102, 344, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Confirm","Exit",
						JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
				}
			}
		});
		btnExit.setBounds(203, 344, 89, 23);
		frame.getContentPane().add(btnExit);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "AC/Non-AC", "Price"},
				
			},
			new String[] {
				"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "AC/Non-AC", "Price"
			}
		));
		table.setBounds(10, 378, 767, 64);
		frame.getContentPane().add(table);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(10, 256, 62, 14);
		frame.getContentPane().add(lblTax);
		
		textField_9 = new JTextField();
		textField_9.setBounds(90, 253, 101, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(10, 287, 46, 14);
		frame.getContentPane().add(lblSubTotal);
		
		textField_10 = new JTextField();
		textField_10.setBounds(90, 284, 101, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total");
		lblNewLabel_1.setBounds(10, 312, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(90, 309, 101, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 336, 282, 2);
		frame.getContentPane().add(separator_2);
	}
	}
