package hotelsystem;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Guest extends Human 
{
public static Rooms r;
int numberofguests;
public int id;
 public static ArrayList<Guest> f= new ArrayList<>();
    public Guest(String Name, int NationalId, int number, String naionality, String email, int age, String gender,int id)
            {
        super(Name, NationalId, number, naionality, email, age, gender);
        this.id=id;
    }
     public Guest(String Name, int NationalId, int number, String naionality, String email, int age, String gender)
            {
        super(Name, NationalId, number, naionality, email, age, gender);
    }
public Guest (Guest c)
{
    super (c);
    this.r=c.r;
} 
public Guest()
{
    if(r instanceof RegularRoom)
    {
          r=new RegularRoom();
          r.type="regularroom";
    }
    else if(r instanceof vipRoom)
    {
         r= new vipRoom();
         r.type="viproom";
    }
    else if(r instanceof Suite)
    {
          r=new Suite();
          r.type="suite";
    }
}
  public static String search(int y)
    {
        for(Guest g:f)
        {
        if(y==g.id)
        {
            return "the name is: " + g.Name + "\ngender: " + g.gender ;
        }
        }
        return "not found";
    } 
    @Override
    public String toString() 
    {
        return  "name: " + Name + " \nid: " + NationalId + "\nroom type" + r.type;
    }
}