import javax.swing.*;    
public class TableExample {    
    JFrame f;    
    TableExample(){    
    f=new JFrame();    
    String data[][]={ {"101","Adarsh","B.Tech"},    
                          {"102","Adi","Bsc"},    
                          {"101","Addu","B.Com"}};    
    String column[]={"ID","NAME","Course"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(800,800);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new TableExample();    
}    
}  