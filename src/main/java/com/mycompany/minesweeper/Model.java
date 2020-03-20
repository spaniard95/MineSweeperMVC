
package com.mycompany.minesweeper;

import java.util.Arrays;
import java.util.Random;

public class Model {
    Random rand=new Random();
    private String [][] array=new String[11][11];
    int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
    
    public Model(){
      for (int i=0;i<10;i++){
            array[0][i]="X";
            
            array[10][i]="X";
            
            for(int j=0;j<10;j++){
             if (rand.nextInt(100)>70){       //mpori na mpi diskolia edo
                 array[i][j]="B";
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
        public void printMatrix(){
           for (int i=0; i<array.length ; i++){ 
            for (int j=0; j<array.length ; j++){
                System.out.print(array[i][j] + " "); 
            }
            System.out.println(); 
        } 
    } 
   }
  

