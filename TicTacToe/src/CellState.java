/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Humeyra
 */
public enum CellState {
    
    COMPUTER("X"), USER("O"),EMPTY("-");
    
    private CellState(String text){
    this.text=text;
    
    }
    private final String text;
    
    @Override
    public String toString(){
    return this.text;
    }
    
}
