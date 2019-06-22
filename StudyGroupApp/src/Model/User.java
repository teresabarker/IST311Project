/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class User {
    String firstName;
    String lastName;
    String username;
    String password;
    ArrayList<String> userGroups;//TODO change to events type
    int userType;//change to enum Student, professor, tutor
    String userDegree;
    //Calendar calendar;//TODO verify if it's too complex of a feature
    
    
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    
    
}
