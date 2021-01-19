import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 */
public class model {
    private Loggbok logg;
    private GUI gui;
    private database db;


    public model(){
        this.db = new database();
        this.gui = new GUI();
        this.logg = gui.getCurrentLogg();
        this.gui.addLoadListener(new loadListener());
        this.gui.addSaveListener(new saveListener());
    }
    private class loadListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            //specifies what the name of the file is
            String FileName = JOptionPane.showInputDialog(null,"Write the name of the file");
            try {
                logg = fileManager.loadFile(FileName);
                gui.setLogg(logg);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    private class saveListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            //filename will be specified
            String FileName = JOptionPane.showInputDialog(null, "Write the name of the file");
            try {
                logg = gui.getCurrentLogg();
                fileManager.saveFile(logg, FileName);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
