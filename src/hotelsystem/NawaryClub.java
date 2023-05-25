package hotelsystem;
import hotelsystem.infooo;
import javax.swing.JOptionPane;
public class NawaryClub implements infooo
{
    int coffeshops=3;
    int tables=25;
    int bars=2;
    int bathrooms=2;
    public void showinfo()
    {
        JOptionPane.showMessageDialog(null, "Nawary Club Information: \n"+"Number of Coffee Shops: "+this.coffeshops+"\nNumber of Tables in Coffee Shops: "+this.tables+"\nNumber of bars in coffee Shops: "+this.bars +"\nNumber of Bathrooms in Restaurant " +this.bathrooms );
    }
        @Override
    public String toString() {
        return "Nawary Club Information: \n"+"Number of Coffee Shops: "+this.coffeshops+"\nNumber of Tables in Coffee Shops: "+this.tables+"\nNumber of bars in coffee Shops: "+this.bars +"\nNumber of Bathrooms in Restaurant " +this.bathrooms;
    }
    
}
