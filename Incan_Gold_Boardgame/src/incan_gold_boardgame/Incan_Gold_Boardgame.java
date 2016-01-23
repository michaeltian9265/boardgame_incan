/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incan_gold_boardgame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Michael
 */
public class Incan_Gold_Boardgame {
    
    
    ArrayList<Player> myPlayers = new ArrayList<>();
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable to store all players in this session
        ArrayList<Player> myPlayers = new ArrayList<>();
        //Scanning for next user input
        Scanner playerScanner = new Scanner(System.in);
        Deck myPlayingDeck = new Deck();
        myPlayingDeck.initializeDeck();
        
        int numOfPlayers;
        //Initialzing players depending on user input
        System.out.println("Welcome to Incan Gold,  How many players will be participating in this game?");
        numOfPlayers = playerScanner.nextInt();
        for (int i = 0; i < numOfPlayers; i++){
            System.out.println("Please enter the name for player " + (i + 1));
            String playerName = playerScanner.next();
            Player myNewPlayer = new Player();
            myNewPlayer.setPlayerName(playerName);
            myPlayers.add(myNewPlayer);
        }
        
        
        
    }
    
}
