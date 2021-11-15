/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofishgame;


import java.util.ArrayList;

/**
 *
 * @author Lily Jennings
 */
public class Player {
    
    //Private Variables
    private ArrayList<Card> hand = new ArrayList<Card>();   //An ArrayList that represents a player's hand of cards. 
    private int pairs;                                      //Number of pairs a player has.
    
    
    //Constructor
    public Player()
    {
        //Need to populate the ArrayList with 7 cards that are dealt from the deck.
        pairs = 0;
    }
    
    
}
