package hotelsystem;
import javax.swing.JOptionPane;
public class Suite extends Rooms implements infooo , methodwedmet
{
    static final int  numberofsuites =20;
    static final int pricepernight =50000;
    boolean havejacuzi=true;
    boolean haveseaview=true;
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
      return  price =pricepernight*x;
    }    
    /*public void info(Rooms d)
    {
        String name=JOptionPane.showInputDialog(null,"Enter Name");
          int nationalId=Integer.parseInt(JOptionPane.showInputDialog(null, "enter national id"));
           int number=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your number"));
            String nationality=JOptionPane.showInputDialog(null,"enter nationality");
             String email=JOptionPane.showInputDialog(null,"Enter email");
             int age=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your age"));
               String gender=JOptionPane.showInputDialog(null,"Enter gender");
               int nightss=Integer.parseInt(JOptionPane.showInputDialog(null,"enter number of nights"));
               d.nights=nightss;
            Guest x= new Guest(name, nationalId, number, nationality, email, age, gender);
            JOptionPane.showMessageDialog(null, "price is: "+ d.price());
    }*/
    @Override
    public void showinfo() 
    {
        JOptionPane.showMessageDialog(null,"suite info: \n"+"price per night: "+pricepernight+"\nnumber of suites: "+ numberofsuites+"\nhave jacuzi: "+havejacuzi+"\nhave sea view: "+haveseaview);
    }
        @Override
    public String toString() {
        return "suite info: \n"+"price per night: "+pricepernight+"\nnumber of suites: "+ numberofsuites+"\nhave jacuzi: "+havejacuzi+"\nhave sea view: "+haveseaview;
    }
}
