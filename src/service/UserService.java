package service;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UserService {
    List<User> users = new ArrayList<>();
    int nextId = 1;

    public void createUser(String name, LocalDate birthDate, String profession){
        User newUser = new User(nextId, name, birthDate, profession);
        users.add(newUser);

        nextId++;
    }

    public User readUser(int id){
        for(User user : users){
            if(id == user.getId()){
                System.out.println("------USER------");
                System.out.println("Id: " + user.getId());
                System.out.println("Name: " + user.getName());
                System.out.println("Age: " + user.getAge());
                System.out.println("Profession: " + user.getProfession());
                System.out.println("----------------");
                return user;
            }
        }
        throw new NoSuchElementException("User not found");
    }

    public void updateUser(int id, String name, LocalDate birthDate, String profession){
        for(User user : users){
            if(id == user.getId()){
                user.setName(name);
                user.setProfession(profession);
                user.setBirthDate(birthDate);
                return;
            }
        }
        throw new NoSuchElementException("User not found");
    }

    public void deleteUser(int id){

        boolean removed = users.removeIf(user -> user.getId() == id);

        if(!removed){
            throw new NoSuchElementException("User not found");
        }

    }

    public List<User> listUsers(){
        if(!users.isEmpty()){
            for(User user : users){
                System.out.println("------USER------");
                System.out.println("Id: " + user.getId());
                System.out.println("Name: " + user.getName());
                System.out.println("Age: " + user.getAge());
                System.out.println("Profession: " + user.getProfession());
                System.out.println("----------------");
            }
        }else{
            System.out.println("No users Registered");
        }
        return null;
    }


}
