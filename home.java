import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
class home extends JFrame{
JFrame f;
JTextField t;
ImageIcon i;
JLabel l;
LineBorder lb;
JComboBox<String> c;

JButton search,next,add,update,delete,review;
home(){
String co[] = {"realme","OPPO","SAMSUNG","Apple","RedMi","VIVO"};
 c = new JComboBox<>(co);//JComboBOx support genericis what is generic 

f = new JFrame();
i = new ImageIcon("td.jpeg");
l = new JLabel(i);
t = new JTextField();
lb = new LineBorder(Color.red,4);

search = new JButton("Search");
next = new JButton("Next");
add = new JButton("Add");
update = new JButton("Update");
delete = new JButton("Delete");
review = new JButton("Review");

setTitle("Home Page");

add(t);
add(search);
add(next);
add(add);
add(update);
add(delete);
add(review);
add(c);

add(l);
c.setBounds(30,80,100,30);
search.setBounds(670,40,100,30);
next.setBounds(30,400,100,30);
t.setBounds(30,40,650,30);
add.setBounds(125,400,100,30);
update.setBounds(225,400,100,30);
delete.setBounds(325,400,100,30);
review.setBounds(425,400,100,30);
//setSize(600,600);
l.setBorder(lb);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setLayout(null);

l.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
setSize(i.getIconWidth()+18,i.getIconHeight()+39);
setLocation(
(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
);
setVisible(true);
}
public static void main(String[] args){
new home();
}
}

