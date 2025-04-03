import javax.swing.JOptionPane;

public class pica {
	String type;
	int size;
	double cena;
	
	  public pica(String type, int size, double cena) {
	        this.type = type;
	        this.size = size;
	        this.cena = cena;
	    }
	  
	  public void showInfo() {
	        String message = "Picas tips: " + type +
	                         "\nLielums: " + size + " см" +
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
