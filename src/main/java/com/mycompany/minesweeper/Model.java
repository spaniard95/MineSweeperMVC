
package com.mycompany.minesweeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Model {
    
    Random rand=new Random();
   
    private String [][] array=new String[12][12];
    private Cordinates click;
    private int clickX,clickY;
    private List bombs=new ArrayList();  //package if the user hits a bomb
    private List<Cordinates> toSearch=new ArrayList<Cordinates>();
    private HashSet<Cordinates> alreadySearched=new HashSet<Cordinates>();       //contains block cordinates that have to be searched
    private HashSet<Cordinates> blocks=new HashSet<Cordinates>();                //goal package that will be sent to controller
    
    
    public Model(){
     makeMatrix();
    }
    
  
   public boolean hittedBomb(){
        if(array[clickX][clickY]=="B"){                                          //GAMEOVER
         return true;
        }else{
         toSearch.add(new Cordinates(clickX,clickY));                              //first item that will be searched
         return false;
       }
   }
    public void clicked(Cordinates xy){
       click=xy;
       clickX=xy.getX();
       clickY=xy.getY();
     }
    public boolean clickable(){
        return alreadySearched.contains(click);
    }
    public void buildPerimeter(){
        
        do{
          count9AreaBombs(toSearch.get(0));                                              //sends cordinates
                                                                                 //remove x,y?
        }while(!toSearch.isEmpty());                                               //when there are no more suspected clean from bombs blocks break the loop 
    }
   
       
    //otan girnai 0 tha prepei na epektinete
    private void count9AreaBombs(Cordinates a){
        toSearch.remove(a);                                                      //removed from toSearch list
        alreadySearched.add(a);                                                  //add to already
        int x=a.getX();
        int y=a.getY();
        int sum=0;
        
        for(int i=x-1;i<=x+1;i++){
            for(int j=y-1;j<=y+1;j++){
             if (array[i][j]!="B") sum+=1;
           }
        }
        System.out.println(sum);//test
        if(sum==0) expandToSearch(x,y);                                                 //EDO THA PROSTHWTI TIN NEA PERIOXI(OXI X) OXI OTI IDI EPSAKSE
        else blocks.add(new Cordinates(x,y,sum)); 
        
    }
    private void expandToSearch(int x,int y){
        for(int i=x-1;i<=x+1;i++){
            for(int j=y-1;j<=y+1;j++){
             if (i!=x && j!=y){
                 if (!alreadySearched.contains(new Cordinates(i,j))&&(array[i][j]!="B"||array[i][j]!="X"))    //if the block hasnt be searched and isnt a border x or a bomb add it to be searched
                    toSearch.add(new Cordinates(i,j));
             } 
           }
        }
    }
        
    private void makeMatrix(){
         for (int i=0;i<11;i++){
            array[0][i]="X";
            
            array[11][i]="X";
            
            for(int j=0;j<11;j++){
             if (rand.nextInt(100)>70){                                          //mpori na mpi diskolia edo
                 array[i][j]="B";
                 bombs.add(i,j);                                                 //ad sintetagmenes to bomb sintetagmenes list
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
     //not necessary
      public void printMatrix(){
           for (int i=0; i<array.length ; i++){ 
            for (int j=0; j<array.length ; j++){
                System.out.print(array[i][j] + " "); 
            }
            System.out.println(); 
        } 
    }
   }
  

