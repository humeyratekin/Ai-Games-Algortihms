/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Humeyra
 */
public class Cell {

    private int x;
    private int y;
    private int minimaxValue;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "("+this.x+","+this.y+")";
    }

    
    public int getMinimaxValue() {
        return minimaxValue;
    }

    public void setMinimaxValue(int minimaxValue) {
        this.minimaxValue = minimaxValue;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
