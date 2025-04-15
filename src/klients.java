import javax.swing.JOptionPane;

public class klients {
	private String vards,uzvards,adress,parole,username;
	private int telnumurs;
	public klients(String vards ,String uzvards ,String adress ,String parole ,String username , int telnumurs) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.adress = adress;
        this.parole = parole;
        this.username = username;
        this.telnumurs = telnumurs;
    }
	public String getVards() { return vards; }
	public void setVards(String vards) {this.vards = vards;}
	public String getUzvards() { return uzvards; }
	public void setUzvards(String uzvards) {this.uzvards = uzvards;}
	public String getParole() { return parole; }
	public void setPassworld(String parole) {this.parole = parole;}
	public String getUsername() { return username; }
	public void setUsername(String username) {this.username = username;}
	public int getTelNumurs() { return telnumurs; }
	public String getAddress() { return adress; }
	
}
