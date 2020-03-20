
package com.mycompany.minesweeper;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Program extends JFrame {
   private JButton[][] grid;
    public Program(){
        JPanel panel =new JPanel();
        getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setSize(600,600);
        GridLayout gl=new GridLayout(10,10);
        panel.setLayout(gl);
        
        grid=new JButton[10][10];
        for (int i=0;i<gl.getRows();i++){
            for(int j=0;j<gl.getColumns();j++){
                grid[i][j]=new JButton();
                grid[i][j].setBorder(new LineBorder(Color.BLACK));
                grid[i][j].setOpaque(true);
                panel.add(grid[i][j]);
               // grid[i][j].addActionListener(new ActionListener (){
     //  public void actionPerformed(ActionEvent e){.......}});
            }
        }
   
    }
    public void buttonListener(ActionListener listen,int i,int j){
        grid[i][j].addActionListener(listen);
    }
}