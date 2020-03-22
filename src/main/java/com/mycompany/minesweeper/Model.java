
package com.mycompany.minesweeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model {
    
    Random rand=new Random();
   
    private String [][] array=new String[12][12];
    private int clickX,clickY;
    private List bombs=new ArrayList();
    private List<Integer[]> ranger=new ArrayList<Integer[]>();
    
    
    public Model(){
     makeMatrix();
    }
    
  
   public boolean hittedBomb(){
        if(array[clickX][clickY]=="B"){
         //GAMEOVER
         return true;
        }else{
         return false;
       }
   }
    public void clicked(int i,int j){
       clickX=i;
       clickY=j;
     }
    private void buildAreaList(){
        //add to cordinates list clickx click y
      //  do{
            //check list first cordinates area,everytime a block is found without a bomb is added to the list ,than remove the checked cordinates from list ,if cordinates alraydy there dont add thm to list
            //when a box is checked for around bombs this number should be called from controller to be set in view
            
            
      //  }while(cleanAreaList!=null);
    }
   
       //otan girnai 0 tha prepei na epektinete
    private int count9AreaBombs(int x,int y){
        int sum=0;
        for(int i=x-1;i<=x+1;i++){
            for(int j=y-1;j<=y+1;j++){
             if (array[i][j]!="B") sum+=1;
            
            }
        }
        System.out.println(sum);//test
        return sum;
    }
        
   
    public void printMatrix(){
           for (int i=0; i<array.length ; i++){ 
            for (int j=0; j<array.length ; j++){
                System.out.print(array[i][j] + " "); 
            }
            System.out.println(); 
        } 
    }
     private void makeMatrix(){
         for (int i=0;i<11;i++){
            array[0][i]="X";
            
            array[11][i]="X";
            
            for(int j=0;j<11;j++){
             if (rand.nextInt(100)>70){       //mpori na mpi diskolia edo
                 array[i][j]="B";
                 bombs.add(i,j);              //ad sintetagmenes to bomb sintetagmenes list
             }
             else{ 
                 array[i][j]="O";
            }
             array[i][0]="X";
             array[i][11]="X";
           }
        }
      array[11][11]="X";
    }
   }
  

