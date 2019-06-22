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
    ArrayList<User> usersData = new ArrayList<User>();
    
    
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
    
    public void writeUsersData(){
        User user2 = new User();
        try
        {
            User user;
            XMLEncoder encoder;
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("UsersData.xml")));
            user = new User();
            while (user != null)
            {
                try
                {
                    //user = (User) encoder.writeObject( new User());
                    usersData.add(user);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    break;
                }
            }
            encoder.close();
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }
    
    public void loadStudyGroupData(){
    
    }
}
