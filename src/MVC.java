import java.awt.*;

public class MVC {

    GUI gui;

    public MVC(GUI gui){

        this.gui = gui;

    }
    public void newFile(){

        gui.textArea.setText("");
        gui.window.setTitle("New");

    }
    public void openFile(){

        FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);
    }
}
