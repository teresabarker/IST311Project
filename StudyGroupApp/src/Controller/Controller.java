/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Model;
import View.View;
import View.LoginScreen;

/**
 *
 * @author angel
 */
public class Controller {
    
    public Controller(Model model, View view){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new LoginScreen().setVisible(true);
        }
        });
    }
}
