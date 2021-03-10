import java.awt.*;  
import java.awt.event.*;  
public class Mouseeventoncmd extends Frame implements MouseListener{  
    Label a;  
    Mouseeventoncmd(){  
        addMouseListener(this); 
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing (WindowEvent e)
             {
                System.exit(0);
            }
        }
        
        ); 
          
        a=new Label();  
        add(a);  
        setSize(450,450);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) 
    {  
        System.out.println("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e)
     {  
        System.out.println("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) 
    {  
     System.out.println("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e)
     {  
        System.out.println("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) 
    {  
        System.out.println("Mouse Released");  
    }  
public static void main(String[] args)
 {  
    new Mouseeventoncmd();  
}  
} 