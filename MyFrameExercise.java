/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ca.tut;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author KHULEKANI
 */
public class MyFrameExercise extends JFrame{
    
    public MyFrameExercise(){
        
        setTitle("MY GUI FRAME");
        setSize(500, 700);
        setForeground(Color.yellow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setVisible(true);
    }
}
