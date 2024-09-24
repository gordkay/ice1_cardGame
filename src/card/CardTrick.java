/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
*Modifier: Kayla Gordon
*Student Number: 991659941
*/

package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //insert call to random number generator here
            c.setValue(rand.nextInt(13) + 1);
            //insert call to random number between 0-3 here
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card value (1 to 13): ");
        int userValue = scanner.nextInt();
        System.out.println("Pick a suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();
        //create their card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        // and search magicHand here
        boolean found = false;
        for (Card card : magicHand){
        if (card.getValue() == userCard.getValue() && card.getSuit()
            .equals(userCard.getSuit())){
        found = true;
        break;
        }
        }
        //Then report the result here
        if (found){
        System.out.println("This is your card");
        }
        else
        {
                System.out.println("This is not your card");
                }
    }

    
        // add one luckcard hard code 2,clubs
       Card luckyCard = new Card();
    luckyCard.setValue(7);
luckyCard.setSuit("Diamonds");

 // Search for the lucky card in the magicHand array
        boolean foundLucky = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit()
                .equals(luckyCard.getSuit())) {
                foundLucky = true;
                break;
            }
        }
// Report if the lucky card was found
        if (foundLucky) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose.");
        }
    }
    }
    

