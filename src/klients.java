import javax.swing.JOptionPane;

public class klients {
	private String vards,uzvards,adress;
	private int telnumurs;
	public klients(String vards ,String uzvards,String adress,int telnumurs) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.adress = adress;
        this.telnumurs = telnumurs;
    }
	public String getVards() { return vards; }
	public String getUzvards() { return uzvards; }
	public int getTelNumurs() { return telnumurs; }
	public String getAddress() { return adress; }
	
	public void showInfo() {
        String message = "Vards: " + vards +
                         "\nUzvards: " + uzvards +
                         "\nTelefona numurs: " + telnumurs +
                         "\nAdrese: " + adress;
        
        JOptionPane.showMessageDialog(null, message, "Informācija par klientu", JOptionPane.INFORMATION_MESSAGE);
    }
	
}
