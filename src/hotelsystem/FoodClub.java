package hotelsystem;
import hotelsystem.infooo;
import javax.swing.JOptionPane;
public class FoodClub implements infooo
{
     int Restaurants=1;
     int RestaurantTables=50;
     int Bars=2;
     int bathrooms=4;
    public void showinfo()
    {
        JOptionPane.showMessageDialog(null, "Food Club Information: \n" +"Number of Restaurants: "+this.Restaurants+"\nNumber of Tables in Restaurant: "+this.RestaurantTables+"\nNumber of bars: "+this.Bars+"\nNumber of Bathrooms in Restaurant " +this.bathrooms );
    }
       @Override
    public String toString() {
        return  "Food Club Information: \n" +"Number of Restaurants: "+this.Restaurants+"\nNumber of Tables in Restaurant: "+this.RestaurantTables+"\nNumber of bars: "+this.Bars+"\nNumber of Bathrooms in Restaurant " +this.bathrooms;
    }
    
}
