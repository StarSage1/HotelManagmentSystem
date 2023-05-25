/*package hotelsystem;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;
public class HotelSystem 
{ 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);;
        int room;
        int h=Integer.parseInt(JOptionPane.showInputDialog(null,"1 for reservation \n 2 for empolyee \n3 for hotel info"));
        if(h==1)
        {
            int j;
            j=Integer.parseInt(JOptionPane.showInputDialog(null,"1 for rooms\n2 for weedings rooms\n3 for meeting rooms"));
            if(j==1)
            {
        room=Integer.parseInt(JOptionPane.showInputDialog(null,"1 for regular room \n2 for vip room \n3 for suite"));
        if(room==1)
        {
           RegularRoom d= new RegularRoom();
           d.info(d);   
        }
        else if(room==2)
        {
           vipRoom d= new vipRoom();
           d.info(d);
        }
        else if(room==3)
        {
            Suite x=new Suite();
            x.info(x);
        }
            }
            else if(j==2)
            {
            WeddingRoom d= new WeddingRoom();
            d.info(d);
            }
            else if(j==3)
            {
                meetings d= new meetings();
                d.info(d);
            }  
} 
        else if(h==2)
        {
            int f=Integer.parseInt(JOptionPane.showInputDialog(null,"1 for manager\n2 for waiter\n3 for chieff\n4 for event planer\n5 for conierge"));
            if(f==1)
            {
                Manager m=new Manager();
                m.info();
            }
            else if(f==2)
            {
                Waiter m=new Waiter();
                m.info();
            }
            else if(f==3)
            {
                Chieff c=new Chieff();
                c.info();
            }
            else if(f==4)
            {
                EventPlanner x=new EventPlanner();
                x.info();
            }
            else if(f==5)
            {
                Concierge w=new Concierge();
                w.info();
            }
        }
        else if(h==3)
        {
        HealthClub h1=new HealthClub();
        FoodClub f1=new FoodClub();
        NawaryClub n1=new NawaryClub();
        vipRoom v1=new vipRoom();
        Suite s1=new Suite();
        RegularRoom r1=new RegularRoom();
        h1.showinfo();
        f1.showinfo();
        n1.showinfo();
        r1.showinfo();
        v1.showinfo();
        s1.showinfo();
        }
    }
}
*/