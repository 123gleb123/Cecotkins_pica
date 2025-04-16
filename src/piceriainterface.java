import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class piceriainterface extends JFrame {
	
	klientsloginreg klientsloginreg = new klientsloginreg();
	ArrayList<Prece> cart = new ArrayList<>();
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		cardLayout = new CardLayout(0, 0);
		contentPane.setLayout(cardLayout);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_2, "Login");
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 12));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(478, 232, 166, 32);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setBounds(478, 300, 166, 32);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Reģistrēties");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_8.setBounds(455, 343, 107, 23);
		panel_2.add(btnNewButton_8);
		btnNewButton_8.addActionListener(e -> {
			cardLayout.show(contentPane, "Regestracija");
		});
		
		JButton btnNewButton_9 = new JButton("Pieteikties");
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_9.setBounds(563, 343, 107, 23);
		panel_2.add(btnNewButton_9);
		btnNewButton_9.addActionListener(e -> {
		    String username = textField.getText();
		    String parole = textField_1.getText();

		    if (username.isEmpty() || parole.isEmpty()) {
		        JOptionPane.showMessageDialog(panel_2, "Lūdzu, ievadiet gan lietotājvārdu, gan paroli.", "Kļūda", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    boolean success = klientsloginreg.loginUser(username, parole);
		    if (success) {
		        JOptionPane.showMessageDialog(panel_2,
		            "Pieteikšanās veiksmīga!\nSveicināts, " + username + "!",
		            "Laipni lūgts",
		            JOptionPane.INFORMATION_MESSAGE);
		         cardLayout.show(contentPane, "menu");
		    } else {
		        JOptionPane.showMessageDialog(panel_2,
		            "Nepareizs lietotājvārds vai parole.",
		            "Kļūda",
		            JOptionPane.ERROR_MESSAGE);
		    }
		});
		
		JLabel lblNewLabel_9 = new JLabel("Pieteikties");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_9.setBounds(484, 141, 154, 65);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Lietotājvārds");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10.setBounds(524, 207, 74, 14);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Parole");
		lblNewLabel_10_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10_1.setBounds(543, 275, 37, 14);
		panel_2.add(lblNewLabel_10_1);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "Regestracija");
		panel_3.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Arial", Font.BOLD, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(478, 348, 166, 32);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(478, 416, 166, 32);
		panel_3.add(textField_3);
		
		JButton btnNewButton_8_1 = new JButton("Reģistrēties");
		btnNewButton_8_1.addActionListener(e -> {
			 String vards = textField_4.getText();
			 String uzvards = textField_5.getText();
			 String username = textField_2.getText();
			 String parole = textField_3.getText();

			    if (username.isEmpty() || parole.isEmpty()) {
			        JOptionPane.showMessageDialog(panel_3, "Lietotājvārds un parole ir obligāti!", "Kļūda", JOptionPane.ERROR_MESSAGE);
			        return;
			    }
			    
			    boolean registered = klientsloginreg.registerUser(username, parole, vards, uzvards);
				
				 if (registered) {
				        JOptionPane.showMessageDialog(panel_3,
				            "Reģistrācija veiksmīga!\nLietotājs: " + username,
				            "Apstiprinājums",
				            JOptionPane.INFORMATION_MESSAGE);
				        cardLayout.show(contentPane, "Login");
				    } else {
				        JOptionPane.showMessageDialog(panel_3,
				            "Lietotājvārds jau eksistē. Lūdzu, mēģiniet vēlreiz.",
				            "Kļūda",
				            JOptionPane.ERROR_MESSAGE);
				    }
			    
		});
		
		btnNewButton_8_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_8_1.setBackground(Color.WHITE);
		btnNewButton_8_1.setBounds(508, 459, 107, 23);
		panel_3.add(btnNewButton_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Pieteikties");
		lblNewLabel_9_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_9_1.setBounds(484, 113, 154, 65);
		panel_3.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Lietotājvārds");
		lblNewLabel_10_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10_2.setBounds(524, 323, 74, 14);
		panel_3.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Parole");
		lblNewLabel_10_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10_1_1.setBounds(543, 391, 37, 14);
		panel_3.add(lblNewLabel_10_1_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("Arial", Font.BOLD, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(478, 203, 166, 32);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(478, 271, 166, 32);
		panel_3.add(textField_5);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Vards");
		lblNewLabel_10_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10_2_1.setBounds(540, 178, 43, 14);
		panel_3.add(lblNewLabel_10_2_1);
		
		JLabel lblNewLabel_10_1_1_1 = new JLabel("Uzvards");
		lblNewLabel_10_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10_1_1_1.setBounds(536, 246, 51, 14);
		panel_3.add(lblNewLabel_10_1_1_1);
		
		JButton btnNewButton_9_1 = new JButton("Atpakaļ");
		btnNewButton_9_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_9_1.setBackground(Color.WHITE);
		btnNewButton_9_1.setBounds(0, 0, 89, 23);
		panel_3.add(btnNewButton_9_1);
		btnNewButton_9_1.addActionListener(e -> {
			cardLayout.show(contentPane, "Login");
		});

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "menu");
		panel.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(getClass().getResource("/images/logo (1).png")));
		lblNewLabel_6.setBounds(411, 43, 300, 300);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Skatīt izvēlni");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setIcon(new ImageIcon(getClass().getResource("/images/pizza.jpg")));
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
		lblNewLabel_8.setIcon(new ImageIcon(getClass().getResource("/images/drinks.jpg")));
		lblNewLabel_8.setBounds(609, 354, 150, 150);
		panel.add(lblNewLabel_8);
		
		JButton btnNewButton_3_1 = new JButton("Skatīt izvēlni");
		btnNewButton_3_1.addActionListener(e -> {
			cardLayout.show(contentPane, "dzerieni");
		});
		btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_3_1.setBackground(Color.WHITE);
		btnNewButton_3_1.setBounds(625, 514, 119, 23);
		panel.add(btnNewButton_3_1);

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
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/images/margharita.png")));
		lblNewLabel.setBounds(40, 22, 150, 150);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/images/bbq.png")));
		lblNewLabel_1.setBounds(40, 222, 150, 150);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Pievienot");
		btnNewButton.addActionListener(e -> {
		    String[] sizes = {"30(7.99€)", "40 (9.99€)", "50 (11.99€)"};
		    String sizeStr = (String) JOptionPane.showInputDialog(null, "Izvēlies izmēru:", "Picas lielums",
		            JOptionPane.QUESTION_MESSAGE, null, sizes, sizes[0]);
		    if (sizeStr == null) return;

			int size = Integer.parseInt(sizeStr.substring(0, 2));
			double cena = switch (size) {
			    case 30 -> 7.99;
			    case 40 -> 9.99;
			    case 50 -> 11.99;
			    default -> 7.99;
			};

		    List<String> toppings = new ArrayList<>();
		    if (JOptionPane.showConfirmDialog(null, "Papildus mocarella?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus mocarella");
		        cena += 1.0;
		    }
		    cena = Math.round(cena * 100.0) / 100.0;
		    pica margarita = new pica("Margarita", size, cena, toppings);
		    cart.add(margarita);
		    margarita.showInfo();
		});

		

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
		btnNewButton_1.addActionListener(e -> {
			String[] sizes = {"30 (9.99€)", "40 (11.99€)", "50 (13.99€)"};
		    String sizeStr = (String) JOptionPane.showInputDialog(null, "Izvēlies izmēru:", "Picas lielums",
		            JOptionPane.QUESTION_MESSAGE, null, sizes, sizes[0]);
		    if (sizeStr == null) return;

			int size = Integer.parseInt(sizeStr.substring(0, 2));
			double cena = switch (size) {
			    case 30 -> 9.99;
			    case 40 -> 11.99;
			    case 50 -> 13.99;
			    default -> 9.99;
			};

		    List<String> toppings = new ArrayList<>();
		    if (JOptionPane.showConfirmDialog(null, "Papildus vistas gaļa?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus pikanti pepperoni");
		        cena += 1.0;
		    }
		    if (JOptionPane.showConfirmDialog(null, "Papildus mocarella?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus mocarella");
		        cena += 1.0;
		    }
		    if (JOptionPane.showConfirmDialog(null, "Papildus sarkanais sīpols?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		    	toppings.add("Papildus sarkanais sīpols");
		        cena += 1.0;
		    }
		    
		    cena = Math.round(cena * 100.0) / 100.0;

		    pica bbq = new pica("Bbq", size, cena, toppings);
		    cart.add(bbq);
		    bbq.showInfo();
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(237, 342, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(getClass().getResource("/images/peperoni.png")));
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
		btnNewButton_1_1.addActionListener(e -> {
		    String[] sizes = {"30 (8.99€)", "40 (10.99€)", "50 (12.99€)"};
		    String sizeStr = (String) JOptionPane.showInputDialog(null, "Izvēlies izmēru:", "Picas lielums",
		            JOptionPane.QUESTION_MESSAGE, null, sizes, sizes[0]);
		    if (sizeStr == null) return;

			int size = Integer.parseInt(sizeStr.substring(0, 2));
			double cena = switch (size) {
			    case 30 -> 8.99;
			    case 40 -> 10.99;
			    case 50 -> 12.99;
			    default -> 8.99;
			};

		    List<String> toppings = new ArrayList<>();
		    if (JOptionPane.showConfirmDialog(null, "Papildus pepperoni?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus pepperoni");
		        cena += 1.0;
		    }
		    if (JOptionPane.showConfirmDialog(null, "Papildus mocarella?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus mocarella");
		        cena += 1.0;
		    }

		    cena = Math.round(cena * 100.0) / 100.0;
		    pica pepperoni = new pica("Pepperoni", size, cena, toppings);
		    cart.add(pepperoni);
		    pepperoni.showInfo();
		});

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
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/images/quattro.png")));
		lblNewLabel_5.setBounds(569, 22, 150, 150);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon(getClass().getResource("/images/diavola.png")));
		lblNewLabel_1_2.setBounds(569, 222, 150, 150);
		panel_1.add(lblNewLabel_1_2);
		
		JButton btnNewButton_2 = new JButton("Pievienot");
		btnNewButton_2.addActionListener(e -> {
			String[] sizes = {"30 (7.99€)", "40 (9.99€)", "50 (11.99€)"};
			String sizeStr = (String) JOptionPane.showInputDialog(null, "Izvēlies izmēru:", "Picas lielums",
			        JOptionPane.QUESTION_MESSAGE, null, sizes, sizes[0]);
			if (sizeStr == null) return;

			int size = Integer.parseInt(sizeStr.substring(0, 2));
			double cena = switch (size) {
			    case 30 -> 7.99;
			    case 40 -> 9.99;
			    case 50 -> 11.99;
			    default -> 7.99;
			};

		    List<String> toppings = new ArrayList<>();
		    if (JOptionPane.showConfirmDialog(null, "Papildus mocarella?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus mocarella");
		        cena += 1.0;
		    }
		    if (JOptionPane.showConfirmDialog(null, "Papildus gorgonzola?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus gorgonzola");
		        cena += 1.0;
		    }
		    if (JOptionPane.showConfirmDialog(null, "Papildus parmezāns?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus parmezāns");
		        cena += 1.0;
		    }
		    if (JOptionPane.showConfirmDialog(null, "Papildus emmentāls?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus emmentāls");
		        cena += 1.0;
		    }

		    cena = Math.round(cena * 100.0) / 100.0;
		    pica fourCheese = new pica("Četri sieri", size, cena, toppings);
		    cart.add(fourCheese);
		    fourCheese.showInfo();
		});

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
		btnNewButton_1_2.addActionListener(e -> {
		    String[] sizes = {"30 (9.99€)", "40 (11.99€)", "50 (13.99€)"};
		    String sizeStr = (String) JOptionPane.showInputDialog(null, "Izvēlies izmēru:", "Picas lielums",
		            JOptionPane.QUESTION_MESSAGE, null, sizes, sizes[0]);
		    if (sizeStr == null) return;

			int size = Integer.parseInt(sizeStr.substring(0, 2));
			double cena = switch (size) {
			    case 30 -> 9.99;
			    case 40 -> 11.99;
			    case 50 -> 13.99;
			    default -> 9.99;
			};

		    List<String> toppings = new ArrayList<>();
		    if (JOptionPane.showConfirmDialog(null, "Papildus pikanti pepperoni?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus pikanti pepperoni");
		        cena += 1.0;
		    }
		    if (JOptionPane.showConfirmDialog(null, "Papildus mocarella?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus mocarella");
		        cena += 1.0;
		    }

		    cena = Math.round(cena * 100.0) / 100.0;
		    pica diavola = new pica("Diavola", size, cena, toppings);
		    cart.add(diavola);
		    diavola.showInfo();
		});

		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(773, 342, 89, 23);
		panel_1.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(getClass().getResource("/images/mushroom.png")));
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
		btnNewButton_1_1_1.addActionListener(e -> {
		    String[] sizes = {"30 (7.99€)", "40 (9.99€)", "50 (11.99€)"};
		    String sizeStr = (String) JOptionPane.showInputDialog(null, "Izvēlies izmēru:", "Picas lielums",
		            JOptionPane.QUESTION_MESSAGE, null, sizes, sizes[0]);
		    if (sizeStr == null) return;

			int size = Integer.parseInt(sizeStr.substring(0, 2));
			double cena = switch (size) {
			    case 30 -> 7.99;
			    case 40 -> 9.99;
			    case 50 -> 11.99;
			    default -> 7.99;
			};

		    List<String> toppings = new ArrayList<>();
		    if (JOptionPane.showConfirmDialog(null, "Papildus šampinjoni?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus šampinjoni");
		        cena += 1.0;
		    }
		    if (JOptionPane.showConfirmDialog(null, "Papildus mocarella?(+1€)", "Papildinājums", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
		        toppings.add("Papildus mocarella");
		        cena += 1.0;
		    }

		    cena = Math.round(cena * 100.0) / 100.0;
		    pica mushroom = new pica("Sēņu", size, cena, toppings);
		    cart.add(mushroom);
		    mushroom.showInfo();
		});

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
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(0, 0, 89, 23);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_4_1_1_1 = new JButton("Skatīt grozu");
		btnNewButton_4_1_1_1.addActionListener(e -> {
		    if (cart.isEmpty()) {
		        JOptionPane.showMessageDialog(null, "Grozs ir tukšs!", "Grozs", JOptionPane.INFORMATION_MESSAGE);
		        return;
		    }

		    StringBuilder sb = new StringBuilder("Tavs grozs:\n");
		    double total = 0;

		    for (Prece prece : cart) {
		        sb.append("• ").append(prece.toString()).append("\n");
		        total += prece.getCena();
		    }

		    sb.append("\nKopā: ").append(Math.round(total * 100.0) / 100.0).append("€");

		    JOptionPane.showMessageDialog(null, sb.toString(), "Grozs", JOptionPane.INFORMATION_MESSAGE);
		});


		btnNewButton_4_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_4_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_1.setBounds(1007, 0, 116, 23);
		panel_1.add(btnNewButton_4_1_1_1);
		
		JButton btnNewButton_4_1_1_1_1 = new JButton("Pasūtīt");
		btnNewButton_4_1_1_1_1.addActionListener(e -> {
			if (cart.isEmpty()) {
		        JOptionPane.showMessageDialog(null, "Grozs ir tukšs!", "Pirkums", JOptionPane.WARNING_MESSAGE);
		        return;
		    }

		    Object[] options = {"Paņemt pašam", "Piegāde (+3€)"};
		    int choice = JOptionPane.showOptionDialog(null,
		            "Kā vēlies saņemt pasūtījumu?", "Saņemšanas veids",
		            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
		            null, options, options[0]);

		    if (choice == JOptionPane.CLOSED_OPTION) return;

		    boolean isDelivery = (choice == 1);
		    double total = 0;
		    StringBuilder orderText = new StringBuilder("Pasūtījums:\n");

		    for (Prece prece : cart) {
		        orderText.append("• ").append(prece.toString()).append("\n");
		        total += prece.getCena();
		    }

		    if (isDelivery) {
		    	
		    	String adrese = JOptionPane.showInputDialog("Ievadi piegādes adrese");
			    String telnumurs = "";
				do {
					telnumurs = JOptionPane.showInputDialog("Ievadi telefonu numuru");
				}while(!Pattern.matches("^[2-9]{1}[0-9]{7}$",telnumurs));
		    	
		        orderText.append("Piegāde: +3.00€\n");
		        total += 3.00;
				
				orderText.append("\nKopā: ").append(Math.round(total * 100.0) / 100.0).append("€");

			    JOptionPane.showMessageDialog(null, orderText.toString()+"\nPiegādes adrese: "+adrese+"\nKlienta telnumurs adrese: "+telnumurs,"Pirkuma kopsavilkums", JOptionPane.INFORMATION_MESSAGE);
			    try (FileWriter writer = new FileWriter("dati.txt", true)) {
			        writer.write(orderText.toString());
			        writer.write("\nKlienta piegādes adrese: "+adrese);
			        writer.write("\nKlienta telnumurs adrese: "+telnumurs);
			        writer.write("\n----------------------------\n");
			    } catch (IOException ex) {
			        ex.printStackTrace();
			        JOptionPane.showMessageDialog(null, "Kļūda saglabājot failu!", "Kļūda", JOptionPane.ERROR_MESSAGE);
			    }

			    cart.clear();
				
		    } else {
		        orderText.append("Paņemt pašam\n");
		    }

		    
			});

		btnNewButton_4_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_4_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_1_1.setBounds(880, 0, 116, 23);
		panel_1.add(btnNewButton_4_1_1_1_1);
		
		JButton btnNewButton_4_1_1_1_1_1 = new JButton("Noņemt prece");
		btnNewButton_4_1_1_1_1_1.addActionListener(e -> {
			 if (cart.isEmpty()) {
			        JOptionPane.showMessageDialog(null, "Grozs ir tukšs!", "Noņemt preci", JOptionPane.WARNING_MESSAGE);
			        return;
			 }
			    String[] itemNames = new String[cart.size()];
			    for (int i = 0; i < cart.size(); i++) {
			        itemNames[i] = cart.get(i).toString();
			    }
			    
			    String itemToRemove = (String) JOptionPane.showInputDialog(null,
			            "Izvēlies preci, kuru noņemt:", "Noņemt preci",
			            JOptionPane.QUESTION_MESSAGE, null, itemNames, itemNames[0]);

			    if (itemToRemove != null) {
			        for (int i = 0; i < cart.size(); i++) {
			            if (cart.get(i).toString().equals(itemToRemove)) {
			            	cart.remove(i);
			                JOptionPane.showMessageDialog(null, "Prece veiksmīgi noņemta no groza.", "Noņemts", JOptionPane.INFORMATION_MESSAGE);
			                break;
			            }
			        }
			    }
		});
		btnNewButton_4_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_4_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_1_1_1.setBounds(753, 0, 116, 23);
		panel_1.add(btnNewButton_4_1_1_1_1_1);
		
		JButton btnNewButton_4_1_1_1_1_1_1 = new JButton("Pasūtijimu vēsture");
		btnNewButton_4_1_1_1_1_1_1.addActionListener(e -> {
			
		});	
		btnNewButton_4_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_4_1_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_1_1_1_1.setBounds(603, 0, 139, 23);
		panel_1.add(btnNewButton_4_1_1_1_1_1_1);
		btnNewButton_4.addActionListener(e -> {
			cardLayout.show(contentPane, "menu");
		});		
			JPanel panel_4 = new JPanel();
			panel_4.setLayout(null);
			panel_4.setBackground(Color.WHITE);
			contentPane.add(panel_4, "dzerieni");
			
			JLabel lblNewLabel_2_3 = new JLabel("ŪDENS");
			lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 25));
			lblNewLabel_2_3.setBounds(193, 45, 220, 34);
			panel_4.add(lblNewLabel_2_3);
			
			JLabel lblNewLabel_11 = new JLabel("New label");
			lblNewLabel_11.setIcon(new ImageIcon(piceriainterface.class.getResource("/images/water.png")));
			lblNewLabel_11.setBounds(40, 22, 150, 150);
			panel_4.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_3 = new JLabel("New label");
			lblNewLabel_1_3.setIcon(new ImageIcon(piceriainterface.class.getResource("/images/sprite.png")));
			lblNewLabel_1_3.setBounds(40, 222, 150, 150);
			panel_4.add(lblNewLabel_1_3);
			
			JButton btnNewButton_5 = new JButton("Pievienot");
			btnNewButton_5.addActionListener(e -> {
			    cart.add(new Prece("Ūdens 0.5L", 1.50));
			    JOptionPane.showMessageDialog(null, "Ūdens pievienots grozam!");
			});
			btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 12));
			btnNewButton_5.setBackground(Color.WHITE);
			btnNewButton_5.setBounds(193, 125, 89, 23);
			panel_4.add(btnNewButton_5);
			
			JLabel lblNewLabel_2_1_3 = new JLabel("SPRITE");
			lblNewLabel_2_1_3.setFont(new Font("Arial", Font.BOLD, 25));
			lblNewLabel_2_1_3.setBounds(193, 245, 220, 34);
			panel_4.add(lblNewLabel_2_1_3);
			
			JButton btnNewButton_1_3 = new JButton("Pievienot");
			btnNewButton_1_3.addActionListener(e -> {
			    cart.add(new Prece("Sprite 0.5L", 2.50));
			    JOptionPane.showMessageDialog(null, "Sprite pievienots grozam!");
			});
			
			btnNewButton_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
			btnNewButton_1_3.setBackground(Color.WHITE);
			btnNewButton_1_3.setBounds(193, 325, 89, 23);
			panel_4.add(btnNewButton_1_3);
			
			JLabel lblNewLabel_1_1_2 = new JLabel("New label");
			lblNewLabel_1_1_2.setIcon(new ImageIcon(piceriainterface.class.getResource("/images/fanta.png")));
			lblNewLabel_1_1_2.setBounds(40, 422, 150, 150);
			panel_4.add(lblNewLabel_1_1_2);
			
			JLabel lblNewLabel_2_1_1_2 = new JLabel("FANTA");
			lblNewLabel_2_1_1_2.setFont(new Font("Arial", Font.BOLD, 25));
			lblNewLabel_2_1_1_2.setBounds(193, 445, 220, 34);
			panel_4.add(lblNewLabel_2_1_1_2);
			
			JButton btnNewButton_1_1_2 = new JButton("Pievienot");
			btnNewButton_1_1_2.addActionListener(e -> {
			    cart.add(new Prece("Fanta 0.5L", 2.50));
			    JOptionPane.showMessageDialog(null, "Fanta pievienots grozam!");
			});
			
			btnNewButton_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
			btnNewButton_1_1_2.setBackground(Color.WHITE);
			btnNewButton_1_1_2.setBounds(190, 525, 89, 23);
			panel_4.add(btnNewButton_1_1_2);
			
			JLabel lblNewLabel_4_4 = new JLabel("0,5 1,50€");
			lblNewLabel_4_4.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel_4_4.setBounds(193, 90, 133, 14);
			panel_4.add(lblNewLabel_4_4);
			
			JLabel lblNewLabel_4_1_2 = new JLabel("0,5 2,50€");
			lblNewLabel_4_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel_4_1_2.setBounds(193, 290, 133, 14);
			panel_4.add(lblNewLabel_4_1_2);
			
			JLabel lblNewLabel_4_2_2 = new JLabel("0,5 2,50€");
			lblNewLabel_4_2_2.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel_4_2_2.setBounds(193, 490, 133, 14);
			panel_4.add(lblNewLabel_4_2_2);
			
			JLabel lblNewLabel_2_2_1 = new JLabel("COCA COLA");
			lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 25));
			lblNewLabel_2_2_1.setBounds(729, 45, 220, 34);
			panel_4.add(lblNewLabel_2_2_1);
			
			JLabel lblNewLabel_5_1 = new JLabel("New label");
			lblNewLabel_5_1.setIcon(new ImageIcon(piceriainterface.class.getResource("/images/cola.png")));
			lblNewLabel_5_1.setBounds(569, 22, 150, 150);
			panel_4.add(lblNewLabel_5_1);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("New label");
			lblNewLabel_1_2_1.setIcon(new ImageIcon(piceriainterface.class.getResource("/images/cola zero.png")));
			lblNewLabel_1_2_1.setBounds(569, 222, 150, 150);
			panel_4.add(lblNewLabel_1_2_1);
			
			JButton btnNewButton_2_1 = new JButton("Pievienot");
			btnNewButton_2_1.addActionListener(e -> {
			    cart.add(new Prece("Coca Cola 0.5L", 2.50));
			    JOptionPane.showMessageDialog(null, "Coca Cola pievienots grozam!");
			});
			
			btnNewButton_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
			btnNewButton_2_1.setBackground(Color.WHITE);
			btnNewButton_2_1.setBounds(729, 125, 89, 23);
			panel_4.add(btnNewButton_2_1);
			
			JLabel lblNewLabel_2_1_2_1 = new JLabel("COCA COLA ZERO");
			lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 25));
			lblNewLabel_2_1_2_1.setBounds(729, 245, 258, 34);
			panel_4.add(lblNewLabel_2_1_2_1);
			
			JButton btnNewButton_1_2_1 = new JButton("Pievienot");
			btnNewButton_1_2_1.addActionListener(e -> {
			    cart.add(new Prece("Coca Cola Zero 0.5L", 2.50));
			    JOptionPane.showMessageDialog(null, "Coca Cola Zero pievienots grozam!");
			});
			
			btnNewButton_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
			btnNewButton_1_2_1.setBackground(Color.WHITE);
			btnNewButton_1_2_1.setBounds(729, 325, 89, 23);
			panel_4.add(btnNewButton_1_2_1);
			
			JLabel lblNewLabel_1_1_1_1 = new JLabel("New label");
			lblNewLabel_1_1_1_1.setIcon(new ImageIcon(piceriainterface.class.getResource("/images/pivo.png")));
			lblNewLabel_1_1_1_1.setBounds(569, 422, 150, 150);
			panel_4.add(lblNewLabel_1_1_1_1);
			
			JLabel lblNewLabel_2_1_1_1_1 = new JLabel("ALUS");
			lblNewLabel_2_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 25));
			lblNewLabel_2_1_1_1_1.setBounds(729, 445, 220, 34);
			panel_4.add(lblNewLabel_2_1_1_1_1);
			
			JButton btnNewButton_1_1_1_1 = new JButton("Pievienot");
			btnNewButton_1_1_1_1.addActionListener(e -> {
			    cart.add(new Prece("Alus 0.5L", 4.50));
			    JOptionPane.showMessageDialog(null, "Alus pievienots grozam!");
			});
			
			btnNewButton_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
			btnNewButton_1_1_1_1.setBackground(Color.WHITE);
			btnNewButton_1_1_1_1.setBounds(729, 525, 89, 23);
			panel_4.add(btnNewButton_1_1_1_1);
			
			JLabel lblNewLabel_4_3_1 = new JLabel("0,5 2,50€");
			lblNewLabel_4_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel_4_3_1.setBounds(729, 90, 133, 14);
			panel_4.add(lblNewLabel_4_3_1);
			
			JLabel lblNewLabel_4_1_1_1 = new JLabel("0,5 2,50€");
			lblNewLabel_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel_4_1_1_1.setBounds(729, 290, 133, 14);
			panel_4.add(lblNewLabel_4_1_1_1);
			
			JLabel lblNewLabel_4_2_1_1 = new JLabel("0,5 4,50€");
			lblNewLabel_4_2_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel_4_2_1_1.setBounds(729, 490, 133, 14);
			panel_4.add(lblNewLabel_4_2_1_1);
			
			JButton btnNewButton_4_1 = new JButton("Atpakaļ");
			btnNewButton_4_1.addActionListener(e -> {
				cardLayout.show(contentPane, "menu");
			});
			btnNewButton_4_1.setFont(new Font("Arial", Font.BOLD, 12));
			btnNewButton_4_1.setBackground(Color.WHITE);
			btnNewButton_4_1.setBounds(0, 0, 89, 23);
			panel_4.add(btnNewButton_4_1);
			
			JButton btnNewButton_4_1_1_1_2 = new JButton("Skatīt grozu");
			btnNewButton_4_1_1_1_2.addActionListener(e -> {
			    if (cart.isEmpty()) {
			        JOptionPane.showMessageDialog(null, "Grozs ir tukšs!", "Grozs", JOptionPane.INFORMATION_MESSAGE);
			        return;
			    }

			    StringBuilder sb = new StringBuilder("Tavs grozs:\n");
			    double total = 0;

			    for (Prece prece : cart) {
			        sb.append("• ").append(prece.toString()).append("\n");
			        total += prece.getCena();
			    }

			    sb.append("\nKopā: ").append(Math.round(total * 100.0) / 100.0).append("€");

			    JOptionPane.showMessageDialog(null, sb.toString(), "Grozs", JOptionPane.INFORMATION_MESSAGE);
			});
			btnNewButton_4_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
			btnNewButton_4_1_1_1_2.setBackground(Color.WHITE);
			btnNewButton_4_1_1_1_2.setBounds(1007, 0, 116, 23);
			panel_4.add(btnNewButton_4_1_1_1_2);
			
			JButton btnNewButton_4_1_1_1_1_2 = new JButton("Pasūtīt");
			btnNewButton_4_1_1_1_1_2.addActionListener(e -> {
				if (cart.isEmpty()) {
			        JOptionPane.showMessageDialog(null, "Grozs ir tukšs!", "Pirkums", JOptionPane.WARNING_MESSAGE);
			        return;
			    }

			    Object[] options = {"Paņemt pašam", "Piegāde (+3€)"};
			    int choice = JOptionPane.showOptionDialog(null,
			            "Kā vēlies saņemt pasūtījumu?", "Saņemšanas veids",
			            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
			            null, options, options[0]);

			    if (choice == JOptionPane.CLOSED_OPTION) return;

			    boolean isDelivery = (choice == 1);
			    double total = 0;
			    StringBuilder orderText = new StringBuilder("Pasūtījums:\n");

			    for (Prece prece : cart) {
			        orderText.append("• ").append(prece.toString()).append("\n");
			        total += prece.getCena();
			    }

			    if (isDelivery) {
			    	
			    	String adrese = JOptionPane.showInputDialog("Ievadi piegādes adrese");
				    String telnumurs = "";
					do {
						telnumurs = JOptionPane.showInputDialog("Ievadi telefonu numuru");
					}while(!Pattern.matches("^[2-9]{1}[0-9]{7}$",telnumurs));
			    	
			        orderText.append("Piegāde: +3.00€\n");
			        total += 3.00;
					
					orderText.append("\nKopā: ").append(Math.round(total * 100.0) / 100.0).append("€");

				    JOptionPane.showMessageDialog(null, orderText.toString()+"\nPiegādes adrese: "+adrese+"\nKlienta telnumurs adrese: "+telnumurs,"Pirkuma kopsavilkums", JOptionPane.INFORMATION_MESSAGE);
				    try (FileWriter writer = new FileWriter("dati.txt", true)) {
				        writer.write(orderText.toString());
				        writer.write("\nKlienta piegādes adrese: "+adrese);
				        writer.write("\nKlienta telnumurs adrese: "+telnumurs);
				        writer.write("\n----------------------------\n");
				    } catch (IOException ex) {
				        ex.printStackTrace();
				        JOptionPane.showMessageDialog(null, "Kļūda saglabājot failu!", "Kļūda", JOptionPane.ERROR_MESSAGE);
				    }

				    cart.clear();
					
			    } else {
			        orderText.append("Paņemt pašam\n");
			    }
				});
			btnNewButton_4_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
			btnNewButton_4_1_1_1_1_2.setBackground(Color.WHITE);
			btnNewButton_4_1_1_1_1_2.setBounds(880, 0, 116, 23);
			panel_4.add(btnNewButton_4_1_1_1_1_2);
			
			JButton btnNewButton_4_1_1_1_1_1_2 = new JButton("Noņemt prece");
			btnNewButton_4_1_1_1_1_1_2.addActionListener(e -> {
				 if (cart.isEmpty()) {
				        JOptionPane.showMessageDialog(null, "Grozs ir tukšs!", "Noņemt preci", JOptionPane.WARNING_MESSAGE);
				        return;
				 }
				    String[] itemNames = new String[cart.size()];
				    for (int i = 0; i < cart.size(); i++) {
				        itemNames[i] = cart.get(i).toString();
				    }
				    
				    String itemToRemove = (String) JOptionPane.showInputDialog(null,
				            "Izvēlies preci, kuru noņemt:", "Noņemt preci",
				            JOptionPane.QUESTION_MESSAGE, null, itemNames, itemNames[0]);

				    if (itemToRemove != null) {
				        for (int i = 0; i < cart.size(); i++) {
				            if (cart.get(i).toString().equals(itemToRemove)) {
				            	cart.remove(i);
				                JOptionPane.showMessageDialog(null, "Prece veiksmīgi noņemta no groza.", "Noņemts", JOptionPane.INFORMATION_MESSAGE);
				                break;
				            }
				        }
				    }
			});
			btnNewButton_4_1_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
			btnNewButton_4_1_1_1_1_1_2.setBackground(Color.WHITE);
			btnNewButton_4_1_1_1_1_1_2.setBounds(753, 0, 116, 23);
			panel_4.add(btnNewButton_4_1_1_1_1_1_2);
			
			JButton btnNewButton_4_1_1_1_1_1_1_1 = new JButton("Pasūtijimu vēsture");
			btnNewButton_4_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
			btnNewButton_4_1_1_1_1_1_1_1.setBackground(Color.WHITE);
			btnNewButton_4_1_1_1_1_1_1_1.setBounds(603, 0, 139, 23);
			panel_4.add(btnNewButton_4_1_1_1_1_1_1_1);
	}
}
