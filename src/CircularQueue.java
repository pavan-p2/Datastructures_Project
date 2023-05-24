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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int arr[];
	private int size;
	private int rear=-1;
	private int front =0;
	private int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(252, 182, 198));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CircularQueue DataStructure");
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(138, 30, 230, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Queue Size :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(65, 95, 110, 15);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(210, 94, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Queue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				size = arr.length;
				String message = "Array of length "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(362, 93, 125, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Enter An Element :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(65, 190, 124, 15);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(210, 189, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible!!");
					element.setText("");
				}
				else
				{
					int elem = Integer.valueOf(element.getText());
					rear=(rear+1)%size;
					arr[rear] = elem;
					count++;
					String message = "element "+elem+" is inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(362, 188, 90, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible!!");
					element.setText("");
				}
				else
				{
					String message = "element deleted is"+arr[front];
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
					front = (front+1)%size;
					--count;
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(123, 279, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int f1 = front;
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane, "Queue is Empty! Nothing to display");
					element.setText("");
				}
				else
				{
					String message = "";
					for(int i=1;i<=count;i++)
					{
						message += " "+arr[f1];
						f1 = (f1+1)%size;
					}
					displaybox.setText(message);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(294, 279, 85, 21);
		contentPane.add(btnNewButton_3);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(233, 252, 241));
		displaybox.setBounds(65, 356, 366, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
