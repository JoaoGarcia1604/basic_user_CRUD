package model;

import java.time.LocalDate;
import java.time.Period;

public class User {

    private int id;
    private String name;
    private LocalDate birthDate;
    private String profession;

    public User(int id, String name, LocalDate birthDate, String profession){
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.birthDate = birthDate;
    }

    public int getId(){
        return id;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setProfession(String newProfession){
        this.profession = newProfession;
    }

    public String getProfession(){
        return profession;
    }

    public int getAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

}
