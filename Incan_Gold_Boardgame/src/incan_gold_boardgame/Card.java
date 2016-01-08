/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incan_gold_boardgame;

/**
 *
 * @author Michael
 */
public class Card {
    
    String type;
    int value;
    String name;
    
    public Card(){
        
    }
    
    public void createCard(String type, int value, String name){
        this.type = type;
        this.value = value;
        this.name = name;
        
    }
    
}
