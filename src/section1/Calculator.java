package section1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculator {

	int counter = 0;
	private JFrame frame;
	private JTextField textField;
	JButton btn7;
	JButton btnNewButton_2;
	JButton btnNewButton;
	JButton btnC;
	JButton btnmul;
	JButton btn8;
	JButton btn6;
	JButton btn5;
	JButton btn4;
	JButton btn3;
	JButton btn2;
	JButton btn1;
	JButton btn0;
	JButton btn;
	JButton btn9;
	JButton btnNewButton_1;
	JButton btndiv;
	JRadioButton rdbtnNewRadioButton;// on
	JRadioButton rdbtnNewRadioButton_1;// off
	double firstnumber;
	double secondnumber;
	double result;
	String answer;
	String operation;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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

	public void enable(JTextField textField, JButton... buttons) {
		textField.setEnabled(true);
		for (JButton button : buttons) {
			button.setEnabled(true);
		}

	}

	public void disable(JTextField textField, JButton... buttons) {
		textField.setEnabled(false);
		for (JButton button : buttons) {
			button.setEnabled(false);
		}

	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
		textField.setEditable(false);
		textField.setFocusable(true);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 311, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		textField.setBounds(70, 11, 183, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber = textField.getText() + btn7.getText();
				textField.setText(Enternumber);
			}
		});
		btn7.setBounds(10, 120, 50, 50);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber = textField.getText() + btn8.getText();
				textField.setText(Enternumber);

			}
		});
		btn8.setBounds(70, 120, 50, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn9.getText();
				textField.setText(Enternumber);
			}
		});
		btn9.setBounds(130, 120, 50, 50);
		frame.getContentPane().add(btn9);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn4.getText();
				textField.setText(Enternumber);

			}
		});
		btn4.setBounds(10, 181, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn5.getText();
				textField.setText(Enternumber);
			}
		});
		btn5.setBounds(70, 181, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn6.getText();
				textField.setText(Enternumber);
			}
		});
		btn6.setBounds(130, 181, 50, 50);
		frame.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = textField.getText() + btn1.getText();
				textField.setText(Enternumber);
			}
		});
		btn1.setBounds(10, 242, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// textField.setText(null);
				String Enternumber = textField.getText() + btn2.getText();
				textField.setText(Enternumber);

			}
		});
		btn2.setBounds(70, 242, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn3.getText();
				textField.setText(Enternumber);
			}
		});
		btn3.setBounds(130, 242, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btnC.setBounds(130, 59, 50, 50);
		frame.getContentPane().add(btnC);

		JButton btnNewButton = new JButton("%");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnNewButton.setBounds(70, 59, 50, 50);
		frame.getContentPane().add(btnNewButton);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber = textField.getText() + "0";
				textField.setText(Enternumber);

			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 303, 50, 50);
		frame.getContentPane().add(btn0);

		JButton btn = new JButton(".");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (counter == 0) {
					counter++;
					textField.setText(textField.getText() + ".");
				}

			}
		});
		btn.setBounds(70, 303, 50, 50);
		frame.getContentPane().add(btn);

		JButton btnper = new JButton("*");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnper.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnper.setBounds(190, 56, 65, 50);
		frame.getContentPane().add(btnper);

		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=0;
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnadd.setBounds(190, 120, 65, 50);
		frame.getContentPane().add(btnadd);

		JButton btnsub = new JButton("-");
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnsub.setBounds(188, 178, 65, 50);
		frame.getContentPane().add(btnsub);

		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBounds(188, 239, 65, 50);
		frame.getContentPane().add(btndiv);

		JButton button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondnumber = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = firstnumber + secondnumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "-") {

					try {
						secondnumber = Double.parseDouble(textField.getText());
						result = firstnumber - secondnumber;
						answer = String.format("%.2f", result);
						textField.setText(answer);

					} catch (Exception e) {
						// TODO: handle exception
					}
				} else if (operation == "*") {
					secondnumber = Double.parseDouble(textField.getText());
					result = firstnumber * secondnumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {
					secondnumber = Double.parseDouble(textField.getText());
					result = firstnumber / secondnumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "%") {
					secondnumber = Double.parseDouble(textField.getText());
					result = (firstnumber * secondnumber) / 100;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}

			}

		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(188, 303, 65, 50);
		frame.getContentPane().add(button);

		JButton[] buttons = new JButton[] { btn0, btn1, btn2, btn3, btn4, btn5,
				btn6, btn7, btn8, btn9 };
		JRadioButton rdbtnNewRadioButton = new JRadioButton("on");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enable(textField, buttons);
			}
		});
		rdbtnNewRadioButton.setBounds(10, 11, 42, 20);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("off");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disable(textField, buttons);
			}
		});
		rdbtnNewRadioButton_1.setBounds(10, 43, 42, 12);
		frame.getContentPane().add(rdbtnNewRadioButton_1);

		JButton btnNewButton_1 = new JButton("+-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Enternumber = Double.parseDouble(String
						.valueOf(textField.getText()));
				Enternumber *= -1;
				textField.setText(String.valueOf(Enternumber));

			}
		});
		btnNewButton_1.setBounds(130, 303, 50, 50);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("<-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;

				if (length > 0) {

					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textField.setText(store);
				}
			}
		});
		btnNewButton_2.setBounds(10, 59, 50, 50);
		frame.getContentPane().add(btnNewButton_2);

	}

}
