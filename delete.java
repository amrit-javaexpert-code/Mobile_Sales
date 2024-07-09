import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
class delete extends JFrame{
JFrame f;
ImageIcon i;
JLabel l;
LineBorder lb;
delete(){

f= new JFrame("Delete");
i = new ImageIcon("td.jpeg");
l = new JLabel(i);
lb = new LineBorder(Color.red,4);
setTitle("Delete");
add(l);
l.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
setSize(i.getIconWidth()+18,i.getIconHeight()+39);
l.setBorder(lb);
setLayout(null);
setLocation(
(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args){
new delete();
}}
