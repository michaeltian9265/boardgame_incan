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
    //Create card object
    public Card(String type, int value, String name){
        this.type = type;
        this.value = value;
        this.name = name;
        
    }
    
    //getters for card object
    public String getCardType()
    {
        return this.type;
    }
    
    public int getCardValue()
    {
        return this.value;
    }
    
    public String getCardName()
    {
        return this.name;
    }
    
     @Override
    public String toString()
    {
        return "The card is a" + this.type + ". " + this.name + "with value " + this.value;
    }
    
}
