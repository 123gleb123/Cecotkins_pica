import java.io.*;
import java.util.*;

public class klientsloginreg {
    private static final String FILE_PATH = "klienti.txt";

    public boolean registerUser(String username, String parole, String vards, String uzvards) {
        if (vaiKlientsEksiste(username)) {
            return false;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(username+","+parole+","+vards+","+uzvards);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean loginUser(String username, String parole) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] klientuDetali = line.split(",");
                if (klientuDetali[0].equals(username) && klientuDetali[1].equals(parole)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean vaiKlientsEksiste(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] klientuDetali = line.split(",");
                if (klientuDetali[0].equals(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
