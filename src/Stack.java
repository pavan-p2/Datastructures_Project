import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private int arr[];
	private int size;
	private int top = -1;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 443);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 138, 138));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stack Data Structure");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel.setBounds(219, 22, 178, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Stack Size");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(92, 88, 92, 15);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(206, 84, 113, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Stack");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				size = arr.length;
				JOptionPane.showMessageDialog(contentPane, "Stack length of "+size+" created");
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton.setBounds(357, 83, 120, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an element");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_2.setBounds(92, 185, 100, 15);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(239, 181, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Push");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top == size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Stack is full!! Push is not possible");
					element.setText("");
				}
				else
				{
					int elem = Integer.valueOf(element.getText());
					++top;
					arr[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "element inserted is:"+elem);
					element.setText("");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_1.setBounds(392, 180, 85, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Pop");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, "Stack is empty!! Pop is not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element Popped is:"+arr[top]);
					--top;
				}
			}
		});
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_2.setBounds(250, 258, 69, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Stack is empty");
					displaybox.setText("");
				}
				else
				{
					String message = "";
					for(int i=top;i>=0;i--)
					{
						message += " "+arr[i];
					}
					displaybox.setText(message);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_3.setBounds(239, 323, 85, 21);
		contentPane.add(btnNewButton_3);
		
		displaybox = new JTextField();
		displaybox.setBounds(92, 365, 385, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
