import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MainFrame extends JFrame{
    private Container cp;
    private JMenuBar jmb = new JMenuBar();
    private JMenu jm_file = new JMenu("file");
    private JMenu jm_set = new JMenu("set");
    private JMenu jm_Tool = new JMenu("Tool");
    private JMenuItem item_encrypt= new JMenuItem("encrypt");
    private JMenu jm_color = new JMenu("color");
    private JMenuItem item_red= new JMenuItem("red");
    private JMenuItem item_blue = new JMenuItem("blue");
    private JMenu jm_game = new JMenu("game");
    private JMenuItem itemooxx = new JMenuItem("OOXX");
    private JMenuItem itemmaze = new JMenuItem("maze");
    private JMenu jm_help = new JMenu("help");
    
    //private JInternalFrame jtf = new JInternalFrame();
    private encrypt jtf = new encrypt();
    private JDesktopPane jdp = new JDesktopPane();


    // private JMenuBar jmb1 = new JMenuBar();
    // private JMenu jm1_file = new JMenu("file");
    // private JMenuItem item1_open = new JMenuItem("open");

    // private JPanel jpn = new JPanel(new GridLayout(2, 5, 3, 3));
    // private JPanel jpn1 = new JPanel(new GridLayout(1, 2, 3, 3));

    // private JLabel jlb = new JLabel("");
    // private JLabel jlb_pw = new JLabel("password");

    
    
    public MainFrame(){
        init();
    }

 
    private void init(){
        this.setBounds(400,150,700,700);
        cp = this.getContentPane();
        
        cp.setLayout(new BorderLayout());
        jdp.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.add(jdp);
        
        this.setJMenuBar(jmb);
        jmb.add(jm_file);
        jmb.add(jm_set);
        jmb.add(jm_Tool);
        jmb.add(jm_game);
        jmb.add(jm_help);
        jm_game.add(itemooxx);
        jm_game.add(itemmaze);
        jm_set.add(jm_color);
        jm_color.add(item_blue);
        jm_color.add(item_red);
        jm_Tool.add(item_encrypt);

        // jmb1.add(jm1_file);
        // jm1_file.add(item1_open);

        

        // jtf.setJMenuBar(jmb1);
        //jtf.add(jpn);
        // jtf.add(jpn1);


        itemooxx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {   
                MainFrame2 mfrm = new MainFrame2();
                mfrm.setVisible(true);
                System.out.println("..");
                MainFrame.this.dispose();
            }
        });

        itemmaze.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {   
                maze mfrm = new maze();
                mfrm.setVisible(true);
                System.out.println("..");
                MainFrame.this.dispose();
            }
        });

        item_blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {   
                
            }
        });

        item_encrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jdp.add(jtf);
                jtf.setVisible(true);
                //jtf.setJMenuBar(jmb1);

            }
        });
        
       
    }
}