/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author User
 */
public abstract class Human {
    private String Name;
    private int NationalID;
    private int Number;
    private String Nationality;
    private String Email;
    private int Age;
    private String Gender;

    public Human() {
    }

    public Human(String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) {
        this.Name = Name;
        this.NationalID = NationalID;
        this.Number = Number;
        this.Nationality = Nationality;
        this.Email = Email;
        this.Age = Age;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNationalID() {
        return NationalID;
    }

    public void setNationalID(int NationalID) {
        this.NationalID = NationalID;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
   public Human(Human H){
   this.Name = H.Name;
        this.NationalID = H.NationalID;
        this.Number = H.Number;
        this.Nationality = H.Nationality;
        this.Email = H.Email;
        this.Age = H.Age;
        this.Gender = H.Gender;
   }

    @Override
    public String toString() {
        return "Human{" + "Name=" + Name + ", NationalID=" + NationalID + ", Number=" + Number + ", Nationality=" + Nationality + ", Email=" + Email + ", Age=" + Age + ", Gender=" + Gender + '}';
    }

   
   
    
   
}
