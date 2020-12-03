import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MainFrame extends JFrame{
    private Container cp;
    private JMenuBar jmb = new JMenuBar();
    private JMenu jm_file = new JMenu("file");
    private JMenu jm_set = new JMenu("set");
    private JMenu jm_game = new JMenu("game");
    private JMenuItem itemooxx = new JMenuItem("OOXX");
    private JMenu jm_help = new JMenu("help");
    


    
    public MainFrame(){
        init();
    }

 
    private void init(){
        this.setBounds(400,150,300,500);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setJMenuBar(jmb);
        jmb.add(jm_file);
        jmb.add(jm_set);
        jmb.add(jm_game);
        jmb.add(jm_help);
        jm_game.add(itemooxx);

        itemooxx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {   
                MainFrame2 mfrm = new MainFrame2();
                mfrm.setVisible(true);
                System.out.println("..");
                MainFrame.this.dispose();
            }
        });
        
       
    }
}