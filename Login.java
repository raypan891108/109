import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Login extends JFrame{
    private Container cp;
    private JLabel jlb_ID = new JLabel("ID:");
    private JLabel jlb_PW = new JLabel("PW:");
    private JTextField jtf = new JTextField("");
    static JPasswordField jpf = new JPasswordField("");
    private JButton jbtn_EXIT = new JButton("EXIT");
    private JButton jbtn_Keyboard = new JButton("Keyboard");
    private JButton jbtn_enter = new JButton("enter");
    private JPanel jpn1 = new JPanel(new GridLayout(8,1,3,3));
    private JPanel jpn2 = new JPanel(new GridLayout(8,1,3,3));
    private JPanel jpn3 = new JPanel(new GridLayout(1,3,3,3));
    


    
    public Login(){
        init();
    }

 


    private void init(){
        this.setBounds(400,150,300,500);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpn1.add(jlb_ID);
        jpn1.add(jlb_PW);
        cp.add(jpn1,BorderLayout.WEST);
        cp.add(jpn2,BorderLayout.CENTER);
        jpn2.add(jtf);
        jpn2.add(jpf);
        

        jpn3.add(jbtn_EXIT);
        jpn3.add(jbtn_Keyboard);
        jpn3.add(jbtn_enter);
        cp.add(jpn3,BorderLayout.SOUTH);


    

        
        jbtn_EXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jbtn_Keyboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Keyboard kb = new Keyboard();
                kb.setVisible(true);
            }
        });

        jbtn_enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jtf.getText().equals("123") && String.valueOf(jpf.getPassword()).equals("123")){
                    MainFrame mfrm = new MainFrame();
                    mfrm.setVisible(true);
                    System.out.println("OK");
                    Login.this.dispose();
                    
                }
                System.out.println(jtf.getText());
                System.out.println(String.valueOf(jpf.getPassword()));
            }
        });
       
      
        

    }
}