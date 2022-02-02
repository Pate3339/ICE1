/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("diamonds", 9);
        nineClubs.setSuit("diamonds");
            Card king = new Card("clubs", 9);
        king.setSuit("clubs");
            Card queen = new Card("Spades", 9);
        queen.setSuit("Spades");
            Card black = new Card("hearts", 9);
        black.setSuit("hearts");
    }
}
