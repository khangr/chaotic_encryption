package kaotikleme;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Kaotikleme {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("kaotikleme.Kaotikleme.main()");
        } catch (InstantiationException ex) {
            System.out.println("kaotikleme.Kaotikleme.main()");
        } catch (IllegalAccessException ex) {
            System.out.println("kaotikleme.Kaotikleme.main()");
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println("kaotikleme.Kaotikleme.main()");
        }
        
        new form.MainForm().setVisible(true);
        
        
    }
    
}
