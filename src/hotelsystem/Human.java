package hotelsystem;
public abstract class Human 
{
public String Name;
public int NationalId;
public int number;
public String naionality;
public String email;
public int age;
public String gender;
    public Human() 
    {
        
    }
    public Human(Human h) 
    {
        this.Name = h.Name;
        this.NationalId = h.NationalId;
        this.number = h.number;
        this.naionality = h.naionality;
        this.email = h.email;
        this.age = h.age;
        this.gender = h.gender;
    }
    public Human(String Name, int NationalId, int number, String naionality, String email, int age, String gender) 
    {
        this.Name = Name;
        this.NationalId = NationalId;
        this.number = number;
        this.naionality = naionality;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }
}
