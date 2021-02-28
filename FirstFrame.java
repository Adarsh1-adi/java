import java.awt.*;
class Firstframe
{
public static void main(String[]args){        
Frame f1=new Frame();
Label l1=new Label();
l1.setSize(80,80);
l1.setVisible(true);
f1.add(l1);
Button b1=new Button("adarsh sharma");


f1.add(b1);

f1.setTitle("First Frame");
f1.setSize(500,500);
f1.setVisible(true);
}
}
