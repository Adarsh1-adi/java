import java.awt.*;  
class TextFieldExample{  
public static void main(String args[]){  
    Frame f= new Frame("TextField");  
    TextField t1;  
    t1=new TextField("Enter Your Name.");  
    t1.setBounds(50,100, 200,30);  
   
    f.add(t1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
}
