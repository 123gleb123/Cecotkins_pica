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
	  
	  public String getTips() {return tips;}
	  public int getSize() {return size;}
	  public double getCena() {return cena;}
	  public List<String> getToppings() {return toppings;}
	  
	  public void showInfo() {
	        String message = "Picas tips: " + tips +
	                         "\nLielums: " + size + " см" +
	                         "\nPapildinājumi: " + toppings +
	                         "\nCena: " + cena + " EUR";
	        
	        JOptionPane.showMessageDialog(null, message, "Informācija par picu", JOptionPane.INFORMATION_MESSAGE);
	    }
	    
}
