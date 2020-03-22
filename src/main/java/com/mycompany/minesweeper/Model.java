
package com.mycompany.minesweeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model {
    
    Random rand=new Random();
    private String [][] array=new String[11][11];
    private int clickX,clickY;
    private List bombs=new ArrayList();
    
    public Model(){
     makeMatrix();
    }
    
    private void makeMatrix(){
         for (int i=0;i<10;i++){
            array[0][i]="X";
            
            array[10][i]="X";
            
            for(int j=0;j<10;j++){
             if (rand.nextInt(100)>70){       //mpori na mpi diskolia edo
                 array[i][j]="B";
                 bombs.add(i,j);             //ad sintetagmenes to bomb sintetagmenes list
             }
             else{ 
                 array[i][j]="O";
            }
             array[i][0]="X";
             array[i][10]="X";
           }
        }
      array[10][10]="X";
    }
   
    public boolean clicked(int i,int j){
        if(array[i][j]=="B"){
         //GAMEOVER
         return false;
        }else{
         return true;
       }
     }
   
    //otan girnai 0 tha prepei na epektinete
    public int count9AreaBombs(int x,int y){
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
   }
  

