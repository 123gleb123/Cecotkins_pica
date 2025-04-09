import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class piceriainterface extends JFrame {
	
	private static ArrayList<klients> array = new ArrayList<klients>();
	
	public boolean isLogin(String username, String parole) {
		boolean flag = true;
		
		for(klients ui: array) {
			if(ui.getUsername().equals(username)&&
					ui.getParole().equals(parole)){
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public void regist(klients klients) {
		array.add(klients);
	}
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ArrayList<pica> picaSaraksts = new ArrayList<>();
	
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
		cardLayout = new CardLayout(0, 0);
		contentPane.setLayout(cardLayout);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "menu");
		panel.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\logo (1).png"));
		lblNewLabel_6.setBounds(401, 43, 300, 300);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Skatīt izvēlni");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\pizza.jpg"));
		lblNewLabel_7.setBounds(358, 354, 150, 150);
		panel.add(lblNewLabel_7);

		JButton btnNewButton_3 = new JButton("Skatīt izvēlni");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(374, 514, 119, 23);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(e -> {
			cardLayout.show(contentPane, "menuView");
		});
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\drinks.jpg"));
		lblNewLabel_8.setBounds(576, 354, 150, 150);
		panel.add(lblNewLabel_8);
		
		JButton btnNewButton_3_1 = new JButton("Skatīt izvēlni");
		btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_3_1.setBackground(Color.WHITE);
		btnNewButton_3_1.setBounds(592, 514, 119, 23);
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("Jusu konts\r\n");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_5.setBounds(1016, 0, 107, 23);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(e -> {
			cardLayout.show(contentPane, "Login");
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1, "menuView");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PICA MARGARITA\r\n");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2.setBounds(193, 45, 220, 34);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mocarella, tomātu mērce");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(193, 85, 172, 22);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\margharita.png"));
		lblNewLabel.setBounds(40, 22, 150, 150);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\bbq.png"));
		lblNewLabel_1.setBounds(40, 222, 150, 150);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Pievienot");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(237, 142, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("PICA BBQ\r\n");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(193, 245, 220, 34);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Vistas gaļa, BBQ mērce, \r\n\r\nmocarella un sarkanais sīpols");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(193, 285, 366, 22);
		panel_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1 = new JButton("Pievienot");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(237, 342, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\peperoni.png"));
		lblNewLabel_1_1.setBounds(40, 422, 150, 150);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("PICA PEPPERONI\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(193, 445, 220, 34);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Pepperoni desa, tomātu mērce un mocarella");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(193, 485, 298, 22);
		panel_1.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Pievienot");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(237, 542, 89, 23);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("30cm 7,99€");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(193, 115, 133, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("30cm 9,99€");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(193, 315, 133, 14);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("30cm 8,99€");
		lblNewLabel_4_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(193, 515, 133, 14);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("PICA ČETRI SIERI\r\n");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(729, 45, 220, 34);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Mocarella, gorgonzola, parmezāns un emmentāls");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(729, 85, 354, 22);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\quattro.png"));
		lblNewLabel_5.setBounds(569, 22, 150, 150);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\diavola.png"));
		lblNewLabel_1_2.setBounds(569, 222, 150, 150);
		panel_1.add(lblNewLabel_1_2);
		
		JButton btnNewButton_2 = new JButton("Pievienot");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(773, 145, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("PICA DIAVOLA\r\n");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1_2.setBounds(729, 245, 220, 34);
		panel_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Pikanti pepperoni, tomātu mērce un mocarella");
		lblNewLabel_3_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1_2.setBounds(729, 285, 366, 22);
		panel_1.add(lblNewLabel_3_1_2);
		
		JButton btnNewButton_1_2 = new JButton("Pievienot");
		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(773, 342, 89, 23);
		panel_1.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\2PT\\Desktop\\java 2PT\\Chechotkins_pica\\images\\mushroom.png"));
		lblNewLabel_1_1_1.setBounds(569, 422, 150, 150);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("SĒŅU PICA");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1_1_1.setBounds(729, 445, 220, 34);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Šampinjoni, mocarella un tomātu mērce");
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1_1_1.setBounds(729, 485, 298, 22);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Pievienot");
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(773, 542, 89, 23);
		panel_1.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_4_3 = new JLabel("30cm 7,99€");
		lblNewLabel_4_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(729, 115, 133, 14);
		panel_1.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("30cm 9,99€");
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(729, 315, 133, 14);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("30cm 7,99€");
		lblNewLabel_4_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4_2_1.setBounds(729, 515, 133, 14);
		panel_1.add(lblNewLabel_4_2_1);
		
		JButton btnNewButton_4 = new JButton("Atpakaļ");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(0, 0, 89, 23);
		panel_1.add(btnNewButton_4);
		btnNewButton_4.addActionListener(e -> {
			cardLayout.show(contentPane, "menu");

		});
		
		JButton btnNewButton_6 = new JButton("Jusu konts");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_6.setBounds(1015, 0, 108, 23);
		panel_1.add(btnNewButton_6);
		btnNewButton_6.addActionListener(e -> {
			cardLayout.show(contentPane, "Login");
		});
		

		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_2, "Login");
		panel_2.setLayout(null);
		

		
	}
}
