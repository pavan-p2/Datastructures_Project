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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element1;
	class Node
	{
		int data;
		Node prelink;
		Node nextlink;
	}
	private Node first;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(106, 181, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DoublyLinkedList Data Structure");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel.setBounds(166, 29, 265, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Element :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(87, 102, 95, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Element :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(87, 156, 95, 13);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(231, 100, 110, 21);
		contentPane.add(element);
		element.setColumns(10);
		
		element1 = new JTextField();
		element1.setBounds(231, 153, 110, 21);
		contentPane.add(element1);
		element1.setColumns(10);
		
		JButton btnNewButton = new JButton("Insert Rear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				int elem = Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if(first == null)
				{
					first = newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion Successfull");
					element.setText("");
				}
				else
				{
					temp = first;
					while(temp.nextlink!=null)
					{
						temp = temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
					JOptionPane.showMessageDialog(contentPane,"Insertion Successfull");
					element.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(418, 102, 110, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insert Front");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(element1.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.nextlink = null; 
				newnode.prelink = null;
				if(first==null)
				{
					first = newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion Successfull");
					element1.setText("");
				}
				else
				{
					newnode.nextlink = first; 
					first.prelink =	newnode;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane,"Insertion Successfull");
					element1.setText("");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(418, 152, 110, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete Rear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "DoublyLinkedList doesn't exist");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+first.data);
					first= null;
				}
				else
				{
					temp = first;
					while(temp.nextlink.nextlink!=null)
					{
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Deleted Element is"+temp.nextlink.data);
					temp.nextlink = null;
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(231, 225, 110, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete Front");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"LinkedList doesn't exist!");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+first.data);
					first = null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,"Deleted element is : "+first.data); 
					first = first.nextlink; 
					first.prelink=null;
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(232, 286, 110, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Display Forward");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String message = "";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane,"DoublyLinke dList doesn't exist! Display not possible");
					displaybox.setText("");
				}
				else if(first.nextlink==null)
				{
					message += " "+first.data;
				}
				else
				{
					temp = first;
					while(temp!=null)
					{
						message += " "+temp.data;
						temp = temp.nextlink;
					}
				}
				displaybox.setText(message);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(122, 346, 135, 21);
		contentPane.add(btnNewButton_4);
		
		displaybox = new JTextField();
		displaybox.setBounds(87, 391, 441, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Display Reverse");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane,"DoublyLinke dList doesn't exist! Display not possible");
					displaybox.setText("");
				}
				else if(first.nextlink == null)
				{
				msg=msg+" "+first.data;
				}
				else
				{ 
					temp = first;
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					while(temp != null)
					{
						msg=msg+" "+temp.data;
						temp = temp.prelink;
					}
				} 
				displaybox.setText(msg);	
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBounds(323, 346, 135, 21);
		contentPane.add(btnNewButton_5);
	}

}
