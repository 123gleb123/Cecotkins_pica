import java.util.List;

import javax.swing.JOptionPane;	

public class pica {
	private List<String> toppings;
	private String tips;
	private int size;
	private double cena;
	
	  public pica(String tips, int size, double cena, List<String> toppings) {
	        this.tips = tips;
	        this.size = size;
	        this.cena = cena;
	        this.toppings = toppings;
	    }
	  
	  public void showInfo() {
	        String message = "Picas tips: " + tips +
	                         "\nLielums: " + size + " см" +
	                         "\nPapildinājumi: " + toppings +
	                         "\nCena: " + cena + " EUR";
	        
	        JOptionPane.showMessageDialog(null, message, "Informācija par picu", JOptionPane.INFORMATION_MESSAGE);
	    }

	    public void applyDiscount() {
	        String input = JOptionPane.showInputDialog("Ievadiet EUR atlaides lielumu:");
	        try {
	            double discount = Double.parseDouble(input);
	            if (discount > 0 && discount <= cena) {
	                cena -= discount;
	                JOptionPane.showMessageDialog(null, "Jauna cena pēc atlaides:v" + cena + " EUR");
	            } else {
	                JOptionPane.showMessageDialog(null, "Nekorekta atlaide! ", "Kļūda", JOptionPane.ERROR_MESSAGE);
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Ievadiet derīgu skaitli!", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	    
}
