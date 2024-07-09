import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
     class log_reg extends JFrame {
      ImageIcon i;
      JLabel l1;
     JFrame f;
    JButton b1;
    JButton b2;
    JButton b3;
   LineBorder lb;
      log_reg() {
       i = new ImageIcon("pic.jpg");
      l1 = new JLabel(i);
       f = new JFrame(); 
       b1  = new JButton("LOGIN");
       b2 = new JButton("REGISTER");
       b3 = new JButton("EXIT");
       lb = new LineBorder(Color.red,4);
      b1.setForeground(Color.white);
         b2.setForeground(Color.white);
         b3.setForeground(Color.white);
            b1.setBackground(Color.black);
           b2.setBackground(Color.black);
          b3.setBackground(Color.black);
         b1.setBounds(40,150,85,30);
         b2.setBounds(130,150,100,30);
        b3.setBounds(237,150,85,30);

       add(b1);
       add(b2);
       add(b3);
     add(l1); 
     l1.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
     l1.setBorder(lb);

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
     
   setSize(i.getIconWidth()+18,i.getIconHeight()+39);
setLocation(
(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
);
  setVisible(true);
  
  }
 public static void main(String args[]) {
   new log_reg();
   }
}      


