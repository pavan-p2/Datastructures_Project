import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(170, 162, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("choose a data structure");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(263, 10, 227, 25);
		contentPane.add(lblNewLabel);
		
		JButton ba = new JButton("Array");
		ba.setForeground(new Color(0, 0, 0));
		ba.setBackground(new Color(240, 240, 240));
		ba.setFont(new Font("Constantia", Font.BOLD, 15));
		ba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Array a = new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		ba.setBounds(289, 62, 160, 27);
		contentPane.add(ba);
		
		JButton bs = new JButton("Stack");
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
			}
		});
		bs.setFont(new Font("Constantia", Font.BOLD, 15));
		bs.setBounds(128, 127, 105, 27);
		contentPane.add(bs);
		
		JButton bq = new JButton("Queue");
		bq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		bq.setFont(new Font("Constantia", Font.BOLD, 15));
		bq.setBounds(506, 129, 105, 27);
		contentPane.add(bq);
		
		JButton bcq = new JButton("Circular Queue");
		bcq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CircularQueue().setVisible(true);
			}
		});
		bcq.setFont(new Font("Constantia", Font.BOLD, 15));
		bcq.setBounds(114, 235, 150, 27);
		contentPane.add(bcq);
		
		JButton bl = new JButton("linked list");
		bl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LinkedList().setVisible(true);
			}
		});
		bl.setFont(new Font("Constantia", Font.BOLD, 15));
		bl.setBounds(506, 237, 150, 27);
		contentPane.add(bl);
		
		JButton bdl = new JButton("Dobly linked list");
		bdl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DoublyLinkedList().setVisible(true);
			}
		});
		bdl.setFont(new Font("Constantia", Font.BOLD, 15));
		bdl.setBounds(289, 337, 160, 27);
		contentPane.add(bdl);
	}
}
