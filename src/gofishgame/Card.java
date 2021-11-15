/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofishgame;

/**
 *
 * @author Lily Jennings
 */
public class Card {
    
    //Private variables
    private int suit; //Club = 0, Spade = 1, Heart = 2, Diamond = 3.
    private int rank; //Ace = 1, Two = 2, ... , King = 13.
    private String cardIMG; //Filename for the card image.
    
    //Constructor
    public Card(int s, int r) //s = suit, r = rank
    {
        suit = s;
        rank = r;
        setCardIMG(s, r);
    }
    
    
    //Sets card IMG based on card suit and rank.
    private void setCardIMG(int s, int r)
    {
        if(s == 0){
            cardIMG = r + "Clubs.png";
        }
        if(s == 1){
            cardIMG = r + "Spades.png";
        }
        if(s == 2){
            cardIMG = r + "Heart.png";
        }
        if(s == 3){
            cardIMG = r + "Diamond.png";
        }
    }
    
    //Returns the value of the suit of the card.
    public int getSuit(){
        return suit;
    }
    
    //Returns the value of the rank of the card.
    public int getRank(){
        return rank;
    }
    
    //Returns the filename of the card image.
    public String getCardIMG(){
        return cardIMG;
    }
    
}
