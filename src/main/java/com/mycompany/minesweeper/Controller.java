
package com.mycompany.minesweeper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller {
    private Program view;
    private Model mod;
         
    public Controller(Program view,Model mod){
        this.mod=mod;
        this.view=view;
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                Cordinates click=new Cordinates(i,j);
                this.view.buttonListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                     //view.setButtonText(click.getX(),click.getY(),5);
                     mod.clicked(click);
                     System.out.println(""+click.getX()+""+click.getY()+"clicked");
                     // if (mod.clickable()){                   //if the user can press tha button play game else just dont do anything
                         if(mod.hittedBomb()==true){
                             System.out.println("bomb");
                         //endgame send bombs send bomb list 
                         //pop up game over
                         }else{
                           System.out.println("no bomb");
                         //start DrawBombBorders
                         //end goal send perikiklomeni area to view 
                         //button.setEnabled( false );
                         mod.buildPerimeter();
                         unpack(mod.getBlocks());
                         }
                     }
                     //else setUnclickable?
                   // }
                    private void unpack(List<Cordinates> pack){
                     do{
                         Cordinates xy=pack.get(0);
                         view.setButtonText(xy.getX(),xy.getY(),xy.getBombs());
                         pack.remove(0);
                     }while(!pack.isEmpty());
                     }
                    
                },i,j);
            }
        }
        
    }
     
       
}
