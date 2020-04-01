
package com.mycompany.minesweeper;


public class MineSweeper {

    public static void main(String[]args){
     Model mod=new Model();
     Program view=new Program();
     new Controller(view,mod);
     view.setVisible(true);
     
   }    
}
