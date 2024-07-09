import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
   class orderplaced extends JFrame {
   JLabel l1;
   JButton b1;
   ImageIcon i1;
LineBorder lb;
   orderplaced() {
   JFrame f= new JFrame("Orderplaced");
    i1 = new ImageIcon("pic4.jpg");
l1 = new JLabel(i1);
b1 = new JButton("HOME");
lb = new LineBorder(Color.red,4);
    add(b1);
      add(l1);
       l1.setBorder(lb);
   b1.setBounds(300,300,100,30);
    l1.setBounds(0,0,i1.getIconWidth(),i1.getIconHeight());
      setSize(i1.getIconWidth()+18,i1.getIconHeight()+38);
setLocation(
(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
);
    setLayout(null);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
  public static void main(String args[])   { 
      new orderplaced();
 }
}