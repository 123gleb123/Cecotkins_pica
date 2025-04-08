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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gchec\\Desktop\\JAVa\\Chechotkin_pica\\images\\margharita.png"));
		lblNewLabel.setBounds(40, 22, 150, 150);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gchec\\Desktop\\JAVa\\Chechotkin_pica\\images\\bbq.png"));
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
		btnNewButton_1.setBounds(244, 342, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\gchec\\Desktop\\JAVa\\Chechotkin_pica\\images\\peperoni.png"));
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
		btnNewButton_1_1.setBounds(244, 542, 89, 23);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("30cm 7,99€");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(200, 115, 133, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("30cm 9,99€");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(200, 315, 133, 14);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("30cm 8,99€");
		lblNewLabel_4_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(200, 515, 133, 14);
		panel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("PICA ČETRI SIERI\r\n");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(736, 45, 220, 34);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Mocarella, gorgonzola, parmezāns un emmentāls");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(736, 85, 354, 22);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\gchec\\Desktop\\JAVa\\Chechotkin_pica\\images\\quattro.png"));
		lblNewLabel_5.setBounds(576, 22, 150, 150);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\gchec\\Desktop\\JAVa\\Chechotkin_pica\\images\\diavola.png"));
		lblNewLabel_1_2.setBounds(576, 222, 150, 150);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton_2 = new JButton("Pievienot");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(780, 142, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("PICA DIAVOLA\r\n");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1_2.setBounds(736, 245, 220, 34);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Pikanti pepperoni, tomātu mērce un mocarella");
		lblNewLabel_3_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1_2.setBounds(736, 285, 366, 22);
		panel.add(lblNewLabel_3_1_2);
		
		JButton btnNewButton_1_2 = new JButton("Pievienot");
		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(780, 342, 89, 23);
		panel.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\gchec\\Desktop\\JAVa\\Chechotkin_pica\\images\\mushroom.png"));
		lblNewLabel_1_1_1.setBounds(576, 422, 150, 150);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("SĒŅU PICA");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1_1_1.setBounds(736, 445, 220, 34);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Šampinjoni, mocarella un tomātu mērce");
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1_1_1.setBounds(736, 485, 298, 22);
		panel.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Pievienot");
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(780, 542, 89, 23);
		panel.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_4_3 = new JLabel("30cm 7,99€");
		lblNewLabel_4_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(736, 115, 133, 14);
		panel.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("30cm 9,99€");
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(736, 315, 133, 14);
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("30cm 7,99€");
		lblNewLabel_4_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_2_1.setBounds(736, 515, 133, 14);
		panel.add(lblNewLabel_4_2_1);
	}
}
