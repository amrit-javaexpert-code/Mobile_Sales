import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
class Review extends JFrame{
JFrame f;
JTextArea a;
JButton b;
JLabel l,im;
ImageIcon i;
LineBorder lb;
Review(){
f = new JFrame();
a = new JTextArea();
b = new JButton("Submit");
l = new JLabel("Please Share Your Review With Us");
i = new ImageIcon("td.jpeg");
im = new JLabel(i);
lb = new LineBorder(Color.red,4);
add(l);
add(a);
add(b);
add(im);
l.setFont(new Font("serif" , Font.PLAIN,19));
im.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
a.setBounds(40,90,400,200);
b.setBounds(40,300,90,30);
l.setBounds(100,10,300,100);
im.setBorder(lb);
setTitle("Review");
setSize(i.getIconWidth()+18,i.getIconHeight()+39);
setLayout(null);
setLocation(
(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args){
new Review();
}
}
