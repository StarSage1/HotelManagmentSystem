package hotelsystem;
import javax.swing.JOptionPane;
public class WeddingRoom extends Rooms implements methodwedmet
{
    public WeddingRoom()
    {
        
    }
    public void setprice()
    {
        this.price=price;
    }
    public double getprice(){
        return price;
    }
    @Override
    public double price(int x)
    {
        return x*100;
    }
    /*@Override
    public void info(Rooms d) 
    {
          String name=JOptionPane.showInputDialog(null,"Enter Name");
          int nationalId=Integer.parseInt(JOptionPane.showInputDialog(null, "enter national id"));
           int number=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your number"));
            String nationality=JOptionPane.showInputDialog(null,"enter nationality");
             String email=JOptionPane.showInputDialog(null,"Enter email");
             int age=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your age"));
               String gender=JOptionPane.showInputDialog(null,"Enter gender");
               int numberofguestss=Integer.parseInt(JOptionPane.showInputDialog(null,"enter number of guests"));
            d.numberofguests=numberofguestss;
            JOptionPane.showMessageDialog(null, "price is: "+ d.price());
    }*/
}
