import javax.swing.*;
 
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;
import javax.swing.text.DefaultEditorKit;
 
 
public class MyNote extends JFrame implements ActionListener {
    private JTextArea textArea = new JTextArea();
    private JScrollPane areaScrollPane;
    private JMenuBar menuBar = new JMenuBar();    
    private JMenu file = new JMenu();
    private JMenu edit = new JMenu();    
    private JMenu help = new JMenu();
    private JMenuItem openFile = new JMenuItem();
    private JMenuItem saveFile = new JMenuItem();
    private JMenuItem close = new JMenuItem();
    private JMenuItem newFile = new JMenuItem();
    private JMenuItem undo = new JMenuItem();
    private JMenuItem cut = new JMenuItem(new DefaultEditorKit.CutAction());
    private JMenuItem copy = new JMenuItem(new DefaultEditorKit.CopyAction());
    private JMenuItem paste = new JMenuItem(new DefaultEditorKit.PasteAction());
    private JMenuItem delete = new JMenuItem();    
    private JMenuItem about = new JMenuItem();
 
    public MyNote() {
        this.setSize(900, 600);
        this.setTitle("Java Notepad");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.textArea.setFont(new Font("Century Gothic", Font.BOLD, 12));
        this.textArea.setDragEnabled(true);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(textArea);
        this.areaScrollPane = new JScrollPane(textArea);
        this.areaScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.areaScrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.areaScrollPane.setPreferredSize(new Dimension(250, 250));
        this.getContentPane().add(areaScrollPane);
 
        this.setJMenuBar(this.menuBar);
        this.menuBar.add(this.file);
        this.menuBar.add(this.edit);
        this.menuBar.add(this.help);
 
        this.file.setText("File");
        this.edit.setText("Edit");       
        this.help.setText("Help");
 
        this.newFile.setText("New");
        this.newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        this.newFile.addActionListener(this);
        this.newFile.setMnemonic(KeyEvent.VK_N);
        this.file.add(this.newFile);
 
        this.openFile.setText("Open");
        this.openFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        this.openFile.addActionListener(this);
        this.openFile.setMnemonic(KeyEvent.VK_O);
        this.file.add(this.openFile);
 
        this.saveFile.setText("Save");
        this.saveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        this.saveFile.addActionListener(this);
        this.saveFile.setMnemonic(KeyEvent.VK_S);
        this.file.add(this.saveFile);
 
        this.close.setText("Close");
        this.close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.CTRL_MASK));
        this.close.setMnemonic(KeyEvent.VK_F4);
        this.close.addActionListener(this);
        this.file.add(this.close);
 
        this.undo.setText("Undo");        
        this.undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        this.undo.setMnemonic(KeyEvent.VK_U);
        this.undo.addActionListener(this);
        this.edit.add(this.undo);
        
        this.cut.setText("Cut");
        this.cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        this.cut.setMnemonic(KeyEvent.VK_T);
        this.edit.add(this.cut);
 
        this.copy.setText("Copy");
        this.copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        this.copy.setMnemonic(KeyEvent.VK_C);
        this.copy.addActionListener(this);
        this.edit.add(this.copy);
 
        this.paste.setText("Paste");
        this.paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        this.paste.setMnemonic(KeyEvent.VK_P);
        this.paste.addActionListener(this);
        this.edit.add(this.paste);
 
        this.about.setText("Authors");
        this.about.addActionListener(this);
        this.help.add(this.about);
    }
 
    public void actionPerformed(ActionEvent e) {
      
    }
 
    public static void main(String args[]) {
        MyNote app = new MyNote();
        app.setVisible(true);
    }
}
