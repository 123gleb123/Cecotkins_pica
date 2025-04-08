import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class piceriainterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					piceriainterface frame = new piceriainterface();
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
	public piceriainterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "name_433248374601700");
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PICA MARGARITA\r\n");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2.setBounds(200, 45, 220, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mocarella, tomātu mērce");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(200, 85, 172, 22);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\margharita.png"));
		lblNewLabel.setBounds(40, 22, 150, 150);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\bbq.png"));
		lblNewLabel_1.setBounds(40, 222, 150, 150);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Pievienot");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(244, 142, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("PICA BBQ\r\n");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(200, 245, 220, 34);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Vistas gaļa, BBQ mērce, \r\n\r\nmocarella un sarkanais sīpols");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(200, 285, 366, 22);
		panel.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1 = new JButton("Pievienot");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(244, 322, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\peperoni.png"));
		lblNewLabel_1_1.setBounds(40, 422, 150, 150);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("PICA PEPPERONI\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(200, 445, 220, 34);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Pepperoni desa, tomātu mērce un mocarella");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(200, 485, 298, 22);
		panel.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Pievienot");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(244, 522, 89, 23);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("30cm 7,99€‎");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(200, 118, 133, 14);
		panel.add(lblNewLabel_4);
	}
}
