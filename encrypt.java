import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class encrypt extends JInternalFrame{
    private Container cp;
    private JInternalFrame jtf = new JInternalFrame();

    private JMenuBar jmb = new JMenuBar();
    private JMenu jm_file = new JMenu("file");
    private JMenuItem item_open = new JMenuItem("open");

    private JPanel jpn = new JPanel(new GridLayout(2, 5, 3, 3));
    private JPanel jpn1 = new JPanel(new GridLayout(1, 2, 10, 10));
    private JPanel jpn2 = new JPanel(new BorderLayout());

    private JLabel jlb = new JLabel("Encrypt Algorithm");
    public String [] algos = {"XOR","caesar"};
    private JComboBox jcb = new JComboBox(algos);
    private JLabel jlb_pw = new JLabel("password");
    private JLabel jlb_ED = new JLabel("E/D");
    private JTextField jtf1 = new JTextField("");
    private JButton jbtn_GO = new JButton("GO");
    private JButton jbtn_EXIT = new JButton("EXIT");
    private JButton jbtn_Reset = new JButton("Reset");
    private ButtonGroup bg = new ButtonGroup();
    private JRadioButton jrd_encrypt = new JRadioButton("encrypt");
    private JRadioButton jrd_Decrypt = new JRadioButton("Decrypt");
    private JTextArea jta1 = new JTextArea();
    private JTextArea jta2 = new JTextArea();
    private JScrollPane jsp1 = new JScrollPane(jta1);
    private JScrollPane jsp2 = new JScrollPane(jta2);
    private JLabel jlb_file = new JLabel("FileName:");
    private JTextField jtf2 = new JTextField("");
    private JButton jbtn_save = new JButton("save");

    private JFileChooser jfc = new JFileChooser();
    
    


    public encrypt(){
        init();
    }

    public void init(){
        this.setBounds(0,0,300,500);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(jmb);
        jmb.add(jm_file);
        jm_file.add(item_open);
        jpn.add(jlb);
        jpn.add(jcb);
        jpn.add(jlb_pw);
        jpn.add(jtf1);
        jpn.add(jbtn_GO);
        jpn.add(jlb_ED);
        jpn.add(jrd_encrypt);
        jpn.add(jrd_Decrypt);
        jpn.add(jbtn_Reset);
        jpn.add(jbtn_EXIT);
        bg.add(jrd_encrypt);
        bg.add(jrd_Decrypt);

        jpn1.add(jsp1);
        jpn1.add(jsp2);
        jpn2.add(jlb_file, BorderLayout.WEST);
        jpn2.add(jtf2, BorderLayout.CENTER);
        jpn2.add(jbtn_save, BorderLayout.EAST);
        cp.add(jpn,BorderLayout.NORTH);
        cp.add(jpn1,BorderLayout.CENTER);
        cp.add(jpn2,BorderLayout.SOUTH);

        item_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {   
                
            }
        });

        jbtn_GO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {   
                if(jcb.getSelectedItem() == "XOR"){
                    if(jrd_Decrypt.isSelected()){
                        XOR_Decrypt();
                    }else if(jrd_encrypt.isSelected()){
                        XOR_encrypt();
                    }
                }else if(jcb.getSelectedItem() == "caesar"){

                }
            }
        });
    }

    public static void XOR_encrypt(){
        String str = "";
        while((str = jsp1.getText()) != null){}
    }

    public static void XOR_Decrypt(){

    }

    public static void caesar_encrypt(){

    }

    public static void caesar_Decrypt(){

    }
    
}