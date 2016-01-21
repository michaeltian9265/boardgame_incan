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
public class Player {
    
    String playerName;
    int playerScore;
    
    public Player()
    {
        this.playerScore = 0;
    }
    
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
    
    public void addPoints(int points)
    {
        this.playerScore += points;
    }
    
    public int getPlayerScore()
    {
        return this.playerScore;
    }
    
    public String getPlayerName()
    {
        return this.playerName;
    }
    
}
