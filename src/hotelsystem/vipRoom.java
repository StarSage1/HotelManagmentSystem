package hotelsystem;
import javax.swing.JOptionPane;
public class vipRoom extends Rooms implements infooo,methodroom
{
    static final int numberofviproom=100;
    static final  int numberofsinglerooms=50;
    static final int numberofdoublerooms=30;
    static final int numberoftriplerooms=20;
    static final int priceforsingle=600;
    static final int pricefordouble=800;
    static final int pricefortriple=1000;
    boolean havejacuzi =true;
    boolean haveseaview=false;
    boolean havepoolview=true;
    public vipRoom() 
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
    public double price(int x,String w,String f) 
    {
        if(f=="Halfboard")
        {
         if(w=="Single")
    {
         return  price =800*x;
    }
    else if(w=="Double")
    {
          return  price =1000*x;
    }
    else  if(w=="Triple")
    {
          return price =1200*x; 
    }
        }
        if(f=="Fullboard")
        {
           if(w=="Single")
    {
         return  price =800*x*1.25f;
    }
    else if(w=="Double")
    {
          return  price =1000*x*1.25f;
    }
    else  if(w=="Triple")
    {
          return price =1200*x*1.25f; 
    }
        }
        else if(f=="Allinclusive")
        {
           if(w=="Single")
    {
         return  price =800*x*1.5f;
    }
    else if(w=="Double")
    {
          return  price =1000*x*1.5f;
    }
    else  if(w=="Triple")
    {
          return price =1200*x*1.5f; 
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
        JOptionPane.showMessageDialog(null,"vip room info: \n" + "price for single: "+priceforsingle+"\nprice for double: "+pricefordouble+"\nprice for triple: "+pricefortriple+"\nnumber of vip room:" + numberofviproom+"\nnumber of single vip rooms: "+numberofsinglerooms+"\nnumber of double vip rooms: "+numberofdoublerooms+"\nnumber of triple vip rooms: "+numberoftriplerooms+"\nhave jacuzi: "+havejacuzi+"\nhave sea view: "+haveseaview+"\nhave pool view: "+havepoolview );
    }
        @Override
    public String toString() {
        return"vip room info: \n" + "price for single: "+priceforsingle+"\nprice for double: "+pricefordouble+"\nprice for triple: "+pricefortriple+"\nnumber of vip room:" + numberofviproom+"\nnumber of single vip rooms: "+numberofsinglerooms+"\nnumber of double vip rooms: "+numberofdoublerooms+"\nnumber of triple vip rooms: "+numberoftriplerooms+"\nhave jacuzi: "+havejacuzi+"\nhave sea view: "+haveseaview+"\nhave pool view: "+havepoolview ;
    }
}