/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studygroupapp;
import javax.swing.*;
import View.View;
import Model.Model;
import Controller.Controller;
/**
 *
 * @author angel
 */
public class StudyGroupApp extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
    }
    
}
