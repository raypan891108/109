import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MainFrame2 extends JFrame{
    private Container cp;
    private JButton jbtn_Exit = new JButton("EXIT");
    private JButton jbtn_Clear = new JButton("Clear");
    private JButton jbtn_Go = new JButton("GO");
    private JButton jbtn1 = new JButton("");
    private JButton jbtn2 = new JButton("");
    private JButton jbtn3 = new JButton("");
    private JButton jbtn4 = new JButton("");
    private JButton jbtn5 = new JButton("");
    private JButton jbtn6 = new JButton("");
    private JButton jbtn7 = new JButton("");
    private JButton jbtn8 = new JButton("");
    private JButton jbtn9 = new JButton("");
    private int n = 0;
    private int [] array = new int [10];


    
    public MainFrame2(){
        init();
    }

    private int function(int i){
        if(array[i] == 0){
            return 1;
        }else{
            return 0;
        }
    } 

    private void function1(){
        if((array[1] + array[2] + array[3]) == 3|| (array[4] + array[5] + array[6]) == 3 || (array[7] + array[8] + array[9]) == 3 || 
            (array[1] + array[4] + array[7]) == 3 || (array[2] + array[5] + array[8]) == 3 || (array[3] + array[6] + array[9]) == 3 ||
            (array[1] + array[5] + array[9]) == 3 || (array[3] + array[5] + array[7]) == 3){
            JOptionPane.showMessageDialog(null,"Player1 is winner");
            for(int i=0;i<10;i++){
                array[i] = 2;
            }
        }else if((array[1] + array[2] + array[3]) == -3 || (array[4] + array[5] + array[6]) == -3 || (array[7] + array[8] + array[9]) == -3 || 
                (array[1] + array[4] + array[7]) == -3 || (array[2] + array[5] + array[8]) == -3 || (array[3] + array[6] + array[9]) == -3 ||
                (array[1] + array[5] + array[9]) == -3 || (array[3] + array[5] + array[7]) == -3){
            JOptionPane.showMessageDialog(null,"Player2 is winner");
            for(int i=0;i<10;i++){
                array[i] = 2;
            }
            
        }
    }

    private void init(){
        for(int i=0;i<10;i++){
            array[i] = 0;
        }
        this.setBounds(100,150,300,400);
        cp = this.getContentPane();
        this.setLayout(null);
        cp.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cp.setLayout(new GridLayout(4,3,3,3));


        cp.add(jbtn1);
        cp.add(jbtn2);
        cp.add(jbtn3);
        cp.add(jbtn4);
        cp.add(jbtn5);
        cp.add(jbtn6);
        cp.add(jbtn7);
        cp.add(jbtn8);
        cp.add(jbtn9);
        cp.add(jbtn_Go);
        cp.add(jbtn_Exit);
        cp.add(jbtn_Clear);

        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(1) == 1){
                    if(n == 0){
                        jbtn1.setText("o");
                        n = 1;
                        array[1] = 1;
                    }else{
                        jbtn1.setText("x");
                        n = 0;
                        array[1] = -1;
                    }
                    function1();
                }
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(2) == 1){
                    if(n == 0){
                        jbtn2.setText("o");
                        n = 1;
                        array[2] = 1;
                    }else{
                        jbtn2.setText("x");
                        n = 0;
                        array[2] = -1;
                    }
                    function1();
                }
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(3) == 1){
                    if(n == 0){
                        jbtn3.setText("o");
                        n = 1;
                        array[3] = 1;
                    }else{
                        jbtn3.setText("x");
                        n = 0;
                        array[3] = -1;
                    }
                    function1();
                }
            }
        });
        jbtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(4) == 1){ 
                    if(n == 0){
                        jbtn4.setText("o");
                        n = 1;
                        array[4] = 1;
                    }else{
                        jbtn4.setText("x");
                        n = 0;
                        array[4] = -1;
                    }
                    function1();
                }
            }
        });
        jbtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(5) == 1){
                    if(n == 0){
                        jbtn5.setText("o");
                        n = 1;
                        array[5] = 1;
                    }else{
                        jbtn5.setText("x");
                        n = 0;
                        array[5] = -1;
                    }
                    function1();
                }
            }
        });
        jbtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(6) == 1){
                    if(n == 0){
                        jbtn6.setText("o");
                        n = 1;
                        array[6] = 1;
                    }else{
                        jbtn6.setText("x");
                        n = 0;
                        array[6] = -1;
                    }
                    function1();
                }
            }
        });
        jbtn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(7) == 1){
                    if(n == 0){
                        jbtn7.setText("o");
                        n = 1;
                        array[7] = 1;
                    }else{
                        jbtn7.setText("x");
                        n = 0;
                        array[7] = -1;
                    }
                    function1();
                }
            }
        });
        jbtn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(8) == 1){
                    if(n == 0){
                        jbtn8.setText("o");
                        n = 1;
                        array[8] = 1;
                    }else{
                        jbtn8.setText("x");
                        n = 0;
                        array[8] = -1;
                    }
                    function1();
                }
            }
        });
        jbtn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(function(9) == 1){
                    if(n == 0){
                        jbtn9.setText("o");
                        n = 1;
                        array[9] = 1;
                    }else{
                        jbtn9.setText("x");
                        n = 0;
                        array[9] = -1;
                    }
                    function1();
                }
            }
        });

        jbtn_Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<10;i++){
                    array[i] = 0;
                }
                jbtn1.setText("");
                jbtn2.setText("");
                jbtn3.setText("");
                jbtn4.setText("");
                jbtn5.setText("");
                jbtn6.setText("");
                jbtn7.setText("");
                jbtn8.setText("");
                jbtn9.setText("");
            }
        });

        jbtn_Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}