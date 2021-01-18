
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI{

    private JTextField author;
    private JPanel panel;
    JFrame window;
    JTextArea textArea;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem iNew, iOpen, iSave;

    MVC file = new MVC(this);

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        createWindow();
        createTextArea();
        createmenuBar();
        createFileMenu();
        this.window.setVisible(true);
    }
    public void createWindow() {
        this.window = new JFrame("Loggbok");
        this.window.setSize(1000, 800);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel = new JPanel();
        this.window.add(panel);
    }
    public void createTextArea(){

        this.author = new JTextField("Author", 80);
        this.textArea = new JTextArea(80, 80);
        this.scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.panel.add(author);
        this.panel.add(scrollPane);



    }
    public void createmenuBar(){
        this.menuBar = new JMenuBar();
        this.window.setJMenuBar(menuBar);

        this.menuFile = new JMenu("File");
        this.menuBar.add(menuFile);

    }
    public void createFileMenu() {

        this.iNew = new JMenuItem("New");
        this.menuFile.add(iNew);

        this.iOpen = new JMenuItem("Open");
        this.menuFile.add(iOpen);

        this.iSave = new JMenuItem("Save");
        this.menuFile.add(iSave);

    }
    void addLoadListener(ActionListener listenForLoadListener){
        this.iOpen.addActionListener(listenForLoadListener);
    }
    void addSaveListener(ActionListener listenForLoadListener){
        this.iSave.addActionListener(listenForLoadListener);
    }
    void addDatabaseListener(ActionListener listenForLoadListener){

    }

    public Loggbok getCurrentLogg(){
        return new Loggbok(author.getText(), textArea.getText());
    }
    public void setLogg(Loggbok logg){
        this.textArea.setText(logg.getBody());
        this.author.setText(logg.getCreator());
    }
}
