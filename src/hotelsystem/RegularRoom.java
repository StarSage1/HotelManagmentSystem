package hotelsystem;
import java.util.Random;
import javax.swing.JOptionPane;
public class RegularRoom extends Rooms implements infooo ,methodroom
{
    static final int numberofregularrooms=200;
    static final int numberofsinglerooms =100;
    static final int numberopfdoublerooms=60;
    static final int numberoftriplerooms=40;
    static final int priceforsingle=200;
    Guest l= new Guest();
    boolean havejacuzi=false;
    boolean haveseaview=false;
    boolean havepoolview=false;

    public void setprice()
    {
        this.price=price;
    }
    public double getprice(){
        return price;
    }
    @Override
    public double price(int x,String w,String f) 
    {
        if(f=="Halfboard")
        {
         if(w=="Single")
    {
         return  price =200*x;
    }
    else if(w=="Double")
    {
          return  price =400*x;
    }
    else  if(w=="Triple")
    {
          return price =600*x; 
    }
        }
        if(f=="Fullboard")
        {
           if(w=="Single")
    {
         return  price =200*x*1.25f;
    }
    else if(w=="Double")
    {
          return  price =400*x*1.25f;
    }
    else  if(w=="Triple")
    {
          return price =600*x*1.25f; 
    }
        }
        else if(f=="Allinclusive")
        {
           if(w=="Single")
    {
         return  price =200*x*1.5f;
    }
    else if(w=="Double")
    {
          return  price =400*x*1.5f;
    }
    else  if(w=="Triple")
    {
          return price =600*x*1.5f; 
    }
        }
         return 0;
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
               int type=Integer.parseInt(JOptionPane.showInputDialog(null,"enter type of room\n1 for single \n2 for double \n3 for triple"));
               d.type=type;
               int stay=Integer.parseInt(JOptionPane.showInputDialog(null,"enter type of stay\n1 for halfboard\n2 for fullboard\n3 for allinclusive"));
               d.typeofstay=stay;
            Guest x= new Guest(name, nationalId, number, nationality, email, age, gender);
            JOptionPane.showMessageDialog(null, "price is: "+ d.price());
    }*/
    @Override
    public void showinfo() 
    {
        JOptionPane.showMessageDialog(null,"regular room info: \n"+"price for single: "+priceforsingle+"\nprice for double: "+priceforsingle*2+"\nprice for triple: "+priceforsingle*4+"\nnumber of regular rooms: "+numberofregularrooms+"\nnumber of single rooms: "+numberofsinglerooms+"\nnumber of double rooms: "+"number of triple rooms: "+numberoftriplerooms+"\nhave jacuzi: "+havejacuzi+"\nhave sea view: "+haveseaview+"\nhave pool view: "+havepoolview);
    }

    @Override
    public String toString() {
        return "regular room info: \n"+"price for single: "+priceforsingle+"\nprice for double: "+priceforsingle*2+"\nprice for triple: "+priceforsingle*4+"\nnumber of regular rooms: "+numberofregularrooms+"\nnumber of single rooms: "+numberofsinglerooms+"\nnumber of double rooms: "+"number of triple rooms: "+numberoftriplerooms+"\nhave jacuzi: "+havejacuzi+"\nhave sea view: "+haveseaview+"\nhave pool view: "+havepoolview;
    }
    
}
