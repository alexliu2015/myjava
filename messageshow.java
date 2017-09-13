import javax.swing.JOptionPane;

public class messageshow{
    public static void main(String[] args) {
        messageshow.infobox("this","that");    
    }
    public static void infobox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, "something wrong here", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }
}