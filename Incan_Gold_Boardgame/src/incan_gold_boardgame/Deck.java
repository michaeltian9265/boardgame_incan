/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incan_gold_boardgame;

import java.util.Collections;
import java.util.LinkedList;
/**
 *
 * @author Michael
 */
public class Deck {
    //Variable to store deck
    LinkedList<Card> myDeck = new LinkedList<>();
    //Variable to store discard pile which will be combined back later with
    //the deck
    LinkedList<Card> myDiscardPile = new LinkedList<>();
    
    //Create the 35 unique playing cards in Incan gold
    Card card1 = new Card("Hazard", 1, "Snake");
    Card card2 = new Card("Hazard", 2, "Snake");
    Card card3 = new Card("Hazard", 3, "Snake");
    Card card4 = new Card("Hazard", 1, "Spider");
    Card card5 = new Card("Hazard", 2, "Spider");
    Card card6 = new Card("Hazard", 3, "Spider");
    Card card7 = new Card("Hazard", 1, "Lava");
    Card card8 = new Card("Hazard", 2, "Lava");
    Card card9 = new Card("Hazard", 3, "Lava");
    Card card10 = new Card("Hazard", 1, "Zombie");
    Card card11 = new Card("Hazard", 2, "Zombie");
    Card card12 = new Card("Hazard", 3, "Zombie");
    Card card13 = new Card("Hazard", 1, "Rockslide");
    Card card14 = new Card("Hazard", 2, "Rockslide");
    Card card15 = new Card("Hazard", 3, "Rockslide");
    Card card16 = new Card("Treasure", 1, "TreasureRoom1");
    Card card17 = new Card("Treasure", 2, "TreasureRoom2");
    Card card18 = new Card("Treasure", 3, "TreasureRoom3");
    Card card19 = new Card("Treasure", 4, "TreasureRoom4");
    Card card20 = new Card("Treasure", 5, "TreasureRoom5");
    Card card21 = new Card("Treasure", 6, "TreasureRoom6");
    Card card22 = new Card("Treasure", 7, "TreasureRoom7");
    Card card23 = new Card("Treasure", 9, "TreasureRoom9");
    Card card24 = new Card("Treasure", 10, "TreasureRoom10");
    Card card25 = new Card("Treasure", 11, "TreasureRoom11");
    Card card26 = new Card("Treasure", 12, "TreasureRoom12");
    Card card27 = new Card("Treasure", 13, "TreasureRoom13");
    Card card28 = new Card("Treasure", 14, "TreasureRoom14");
    Card card29 = new Card("Treasure", 15, "TreasureRoom15");
    Card card30 = new Card("Treasure", 17, "TreasureRoom17");
    Card card31 = new Card("Artifact", 5, "GoldenStatue5");
    Card card32 = new Card("Artifact", 5, "GoldenRelic5");
    Card card33 = new Card("Artifact", 5, "GoldenFigure5");
    Card card34 = new Card("Artifact", 10, "GoldNecklass10");
    Card card35 = new Card("Artifact", 10, "GoldenCylinder10");
    
    
    
    //Insert the 30 regular playing cards into the deck
    public void initializeDeck(){
        
        myDeck.add(card1);
        myDeck.add(card2);
        myDeck.add(card3);
        myDeck.add(card4);
        myDeck.add(card5);
        myDeck.add(card6);
        myDeck.add(card7);
        myDeck.add(card8);
        myDeck.add(card9);
        myDeck.add(card10);
        myDeck.add(card11);
        myDeck.add(card12);
        myDeck.add(card13);
        myDeck.add(card14);
        myDeck.add(card15);
        myDeck.add(card16);
        myDeck.add(card17);
        myDeck.add(card18);
        myDeck.add(card19);
        myDeck.add(card20);
        myDeck.add(card21);
        myDeck.add(card22);
        myDeck.add(card23);
        myDeck.add(card24);
        myDeck.add(card25);
        myDeck.add(card26);
        myDeck.add(card27);
        myDeck.add(card28);
        myDeck.add(card29);
        myDeck.add(card30);
        
              
        
        
    }
    
    public void shuffleDeck(){
        Collections.shuffle(myDeck);
    }
    
    public Card revealTopCard()
    {
        return myDeck.getFirst();
    }
    
    public void cardToDiscardPile()
    {
        myDiscardPile.add(myDeck.getFirst());
        myDeck.pop();
        
    }
    
    public void iniTempleOne()
    {
        myDeck.add(card31);
    }
    
    public void iniTempleTwo()
    {
        myDeck.add(card32);
    }
    
    public void iniTempleThree()
    {
        myDeck.add(card33);
    }
    
    public void iniTempleFour()
    {
        myDeck.add(card34);
    }
    
    public void iniTempleFive()
    {
        myDeck.add(card35);
    }
    
    
}
