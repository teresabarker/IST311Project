/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.User;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class UsersData {
    ArrayList<User> usersData = new ArrayList<>();
    User user = new User();

    public UsersData() {
    ArrayList<String> temp = new ArrayList<>();
    User user1 = new User("firstName1", "lastName1", "username1", "password1",temp, 0, "UNDG");
    User user2 = new User("firstName1", "lastName1", "username1", "password1",temp, 0, "UNDG");

    usersData.add(user1);
    usersData.add(user2);
    writeUsersData();
    }
    
    
    public void loadUsersData(){
        try
        {
            User user;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("UsersData.xml")));
            user = new User();
            while (user != null)
            {
                try
                {
                    user = (User) decoder.readObject();
                    usersData.add(user);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }
    
    public void writeUsersData(){//TODO fix not properly writing
        try
        {
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("UsersData.xml")));
            encoder.writeObject(usersData);
            encoder.close();
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }
    
    public void loadStudyGroupData(){
    
    }
}
