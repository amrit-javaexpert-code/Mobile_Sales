import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
class buy extends JFrame{
JFrame f;
ImageIcon i;
JLabel l;
LineBorder lb;

buy(){
i = new ImageIcon("td.jpeg");
f = new JFrame();
l = new JLabel(i);
lb  = new LineBorder(Color.red,4);

add(l);
l.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
setTitle("Buy Now");
l.setBorder(lb);
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
new buy();
}
}
