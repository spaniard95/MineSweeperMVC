
package com.mycompany.minesweeper;

class Cordinates {
    
    private int x,y,bombs;
    
    
    public Cordinates(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public Cordinates(int x,int y,int bombs){
        this.x=x;
        this.y=y;
        this.bombs=bombs;
    }

    
    public int getBombs() {
        return bombs;
    }

    public void setBombs(int bombs) {
        this.bombs = bombs;
    }
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
