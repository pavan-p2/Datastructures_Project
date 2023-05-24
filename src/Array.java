import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 537);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(182, 184, 103));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Array Data Structure");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(294, 21, 203, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Array Length:");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel_1.setBounds(139, 86, 146, 19);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(331, 84, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton bca = new JButton("create array");
		bca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		bca.setFont(new Font("Constantia", Font.BOLD, 12));
		bca.setBounds(537, 83, 115, 27);
		contentPane.add(bca);
		
		JLabel lblNewLabel_2 = new JLabel("Enter an integer element:");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel_2.setBounds(139, 183, 188, 19);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(352, 182, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("position");
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel_3.setBounds(490, 185, 59, 19);
		contentPane.add(lblNewLabel_3);
		
		insertposition = new JTextField();
		insertposition.setBounds(597, 182, 96, 19);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JButton bi = new JButton("Insert");
		bi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos] = elem;
				String message = "element "+elem+" inserted at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		bi.setFont(new Font("Constantia", Font.BOLD, 12));
		bi.setBounds(379, 249, 90, 23);
		contentPane.add(bi);
		
		JLabel lblNewLabel_4 = new JLabel("Enter the position:");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel_4.setBounds(153, 334, 140, 19);
		contentPane.add(lblNewLabel_4);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(352, 333, 96, 19);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JButton bd = new JButton("Delete");
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  pos = Integer.valueOf(deleteposition.getText());
				arr[pos] = 0;
				String message = "element deleted at the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		bd.setFont(new Font("Constantia", Font.BOLD, 12));
		bd.setBounds(518, 332, 90, 23);
		contentPane.add(bd);
		
		JButton bdi = new JButton("Display");
		bdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "";
				for(int i=0;i<=arr.length-1;i++)
				{
					message += " "+arr[i];
				}
				displaybox.setText(message);
			}
		});
		bdi.setFont(new Font("Constantia", Font.BOLD, 12));
		bdi.setBounds(379, 406, 90, 25);
		contentPane.add(bdi);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(206, 206, 206));
		displaybox.setBounds(139, 459, 554, 31);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
