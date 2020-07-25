package swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel firstNumberLbl;
	private JLabel secondNumberLbl;
	private JLabel resultLbl;

	private JTextField firstTxtField;
	private JTextField secondTxtField;
	private JTextField resultTxtField;

	private JButton addButton;
	private JButton clearButton;

	public Calculator() {
		super("Calculator Demo");
		// setTitle("Calculator Demo");
		setSize(400, 300);
		// setBounds(200, 100, 400, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		firstNumberLbl = new JLabel("Enter First Number: ");
		secondNumberLbl = new JLabel("Enter Second Number: ");
		resultLbl = new JLabel("Result is: ");

		firstTxtField = new JTextField();
		secondTxtField = new JTextField();
		resultTxtField = new JTextField();
		resultTxtField.setEditable(false);

		addButton = new JButton("Add");
		clearButton = new JButton("Clear");

		getContentPane().add(firstNumberLbl).setBounds(5, 5, 150, 30);
		getContentPane().add(secondNumberLbl).setBounds(5, 55, 150, 30);
		getContentPane().add(resultLbl).setBounds(5, 105, 150, 30);

		getContentPane().add(firstTxtField).setBounds(165, 5, 150, 30);
		getContentPane().add(secondTxtField).setBounds(165, 55, 150, 30);
		getContentPane().add(resultTxtField).setBounds(165, 105, 150, 30);

		getContentPane().add(addButton).setBounds(165, 155, 70, 30);
		getContentPane().add(clearButton).setBounds(245, 155, 70, 30);

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(firstTxtField.getText());
				int n2 = Integer.parseInt(secondTxtField.getText());

				int sum = n1 + n2;

				resultTxtField.setText(String.valueOf(sum));
			}
		});

		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstTxtField.setText("");
				secondTxtField.setText("");
				resultTxtField.setText("");
			}
		});

	}

}
