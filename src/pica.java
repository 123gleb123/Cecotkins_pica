import java.util.List;

import javax.swing.JOptionPane;

public class pica extends Prece {
    private int size;
    private List<String> toppings;

    public pica(String name, int size, double price, List<String> toppings) {
        super(name + " " + size + "cm", price);
        this.size = size;
        this.toppings = toppings;
    }

    public void showInfo() {
        StringBuilder info = new StringBuilder(getNosaukums() + "\nCena: " + getCena() + "€\n");
        if (!toppings.isEmpty()) {
            info.append("Papildinājumi:\n");
            for (String t : toppings) {
                info.append("• ").append(t).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, info.toString(), "Pica pievienota", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
