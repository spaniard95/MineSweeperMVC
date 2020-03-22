
package com.mycompany.minesweeper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Program view;
    private Model mod;
         
    public Controller(Program view,Model mod){
        this.mod=mod;
        this.view=view;
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                final int k=i;
                final int m=j;
                this.view.buttonListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                     if(mod.clicked(k,m)==false){
                         //endgame send bombs send bomb list 
                         //pop up game over
                     }else{
                         //start DrawBombBorders
                         //end goal send perikiklomeni area to view
                     }
        }
    },i,j);
            }
        }
        
    }
     
       
}
