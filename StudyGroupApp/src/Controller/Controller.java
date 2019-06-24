/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Model;
import Model.UsersData;
import View.View;
import View.LoginScreen;

/**
 *
 * @author angel
 */
public class Controller {
    static LoginScreen temp = new LoginScreen();
    static UsersData temp2 = new UsersData();
    public Controller(Model model, View view){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            temp.setVisible(true);
        }
        });
        
        
    }
    
    public static void closeLoginScreen(){
        temp.dispose();
    }
    
    public static UsersData getUsersData(){
    return temp2;
    }
    
}
