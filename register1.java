import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
//import java.awt.event;
class register1 extends JFrame implements ActionListener{
JFrame f;
ImageIcon i = new ImageIcon("pic1.gif");
      JLabel la = new JLabel(i);
JLabel name,email,cont,usr,pas,rpw;
JTextField name1,email1,cont1,usr1,pas1,rpw1,co;
JButton reg,exit; //,ex;
  LineBorder lb ;
register1(){
f = new JFrame("Register");
name = new JLabel("Name : ");
name.setForeground(Color.white);
name1 = new JTextField();
email = new JLabel("Email : ");
email.setForeground(Color.white);
email1 = new JTextField();
cont = new JLabel("Contact Number : ");
cont.setForeground(Color.white);
cont1 = new JTextField();
usr = new JLabel("User Name : ");
usr.setForeground(Color.white);
usr1 = new JTextField();
pas = new JLabel("Password : ");
pas.setForeground(Color.white);
pas1 = new JTextField();
rpw = new JLabel("Retype Password : ");
rpw.setForeground(Color.white);

rpw1 = new JTextField();
co = new JTextField("yo");
reg = new JButton("Register");
exit = new JButton("Exit");
// ex = new JButton("Cancel");
 lb = new LineBorder(Color.red,4);
exit.addActionListener(this);
add(name);
add(name1);
add(email);
add(email1);
add(cont);
add(cont1);
add(usr);
add(usr1);
add(pas);
add(pas1);
add(rpw);
add(rpw1);
add(co);
add(reg);
add(exit);
//add(ex);
add(la);
setLayout(null);
name.setBounds(40,50,100,60);
name1.setBounds(175,65,150,30);
email.setBounds(40,90,100,60);
email1.setBounds(175,105,150,30);
cont1.setBounds(175,145,150,30);
usr1.setBounds(175,185,150,30);
pas1.setBounds(175,225,150,30);
//rpw1.setBounds(30,40,100,60);
cont.setBounds(40,130,150,60);
usr.setBounds(40,170,150,60);
rpw1.setBounds(175,265,150,30);
//co.setBounds(175,265,150,30);
//co.setBounds(30,165,150,30);
pas.setBounds(40,210,150,60);
rpw.setBounds(40,250,150,60);
reg.setBounds(150,350,150,30);
exit.setBounds(350,350,150,30);
//ex.setBounds(400,300,150,30);
reg.setForeground(Color.white);
reg.setBackground(Color.black);
exit.setForeground(Color.white);
exit.setBackground(Color.black);
//ex.setForeground(Color.white);
//ex.setBackground(Color.black);

la.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
la.setBorder(lb);
setSize(i.getIconWidth()+18,i.getIconHeight()+39);
setLayout(null);
setLocation(
(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
);
setVisible(true);

}
public void actionPerformed(ActionEvent e){
Object o = e.getSource();
if(o==exit){
System.exit(0);
}
if(o==reg){
JOptionPane.showMessageDialog(this,"Registered Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
System.out.println("REGISTERED SUCCESSFULLY");
}


}
public static void main(String[] args){
new register1();
}
}
