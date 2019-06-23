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

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userGroups
     */
    public ArrayList<String> getUserGroups() {
        return userGroups;
    }

    /**
     * @param userGroups the userGroups to set
     */
    public void setUserGroups(ArrayList<String> userGroups) {
        this.userGroups = userGroups;
    }

    /**
     * @return the userType
     */
    public int getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(int userType) {
        this.userType = userType;
    }

    /**
     * @return the userDegree
     */
    public String getUserDegree() {
        return userDegree;
    }

    /**
     * @param userDegree the userDegree to set
     */
    public void setUserDegree(String userDegree) {
        this.userDegree = userDegree;
    }
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private ArrayList<String> userGroups;//TODO change to events type
    private int userType;//change to enum Student, professor, tutor
    private String userDegree;
    //Calendar calendar;//TODO verify if it's too complex of a feature
    
    public User(String firstName, String lastName, String username, String password, ArrayList<String> userGroups, int userType, String userDegree){
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.userGroups = userGroups;
    this.userType = userType;
    this.userDegree = userDegree;
    };
    
    public User(){
    this.firstName = "";
    this.lastName = "";
    this.username = "";
    this.password = "";
    this.userGroups = new ArrayList<String>();
    this.userType = 0;
    this.userDegree = "";
    };
    
    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    
    
}
