

  


       
        
        
       
        


package com.LickingHieghts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("                        !RULES!");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|                 Welcome to Hang-Guy                          |");
        System.out.println("|Every time you guess a letter a blank will be filled in       |");
        System.out.println("|if you guess a wrong letter the hang guy will be built        |");
        System.out.println("|you 15 tries if the hang guy is fully built you lose          |");
        System.out.println("|              Have Fun and Good Luck!!!                       |");
        System.out.println("|--------------------------------------------------------------|");


        int SecretWordLength;
        int Misses = 0;
        for (int i = 0; i < 16; i++) {
            hangManImage(i);
            {
                int tries = 0;
                boolean iterated = false;
                String temp = "";
                String holder = "";
                int length;
                String StoredWord;
                char[] censor;
                char[] CRString;

                StringBuilder pastguesses = new StringBuilder();

                Scanner typedword = new Scanner(System.in);
                System.out.println("Enter secret word:");
                StoredWord = typedword.nextLine();
                StoredWord = StoredWord.toLowerCase();
                length = StoredWord.length();

                CRString = StoredWord.toCharArray();

                censor = StoredWord.toCharArray();
                System.out.println("Your secret word is: ");

                for (int index = 0; index < length; index++) {
                    censor[index] = '-';
                }

                while (String.valueOf(censor).equals(StoredWord) == false) {

                    char CRGuess;
                    String TPWord;
                    String TPString;
                    boolean correct = false;
                    int times = 0;
                    boolean repeat = false;


                    for (int a = 0; a < length; a++) {
                        System.out.print(censor[a]);
                    }
                    System.out.println();


                    Scanner guess = new Scanner(System.in);
                    System.out.println("Enter Guess NOW!!!: ");
                    TPWord = guess.next();
                    CRGuess = TPWord.charAt(0);

                    pastguesses.append(CRGuess);
                    TPString = pastguesses.toString();


                    if (TPString.lastIndexOf(CRGuess, TPString.length() - 2) != -1) {
                        System.out.println("What are you doing you already guessed this letter! Guess again. Your previous guesses were: ");
                        pastguesses.deleteCharAt(TPString.length() - 1);
                        System.out.println(TPString.substring(0, TPString.length() - 1));
                        repeat = true;
                    }

                    if (repeat == false) {
                        for (int index = 0; index < length; index++) {

                            if (CRString[index] == Character.toLowerCase(CRGuess)) {

                                censor[index] = Character.toLowerCase(CRGuess);
                                correct = true;
                                times++;
                            }
                        }
                        if (correct == true) {
                            System.out.println("The letter " + CRGuess + " is in the secret word! There are " + times + " " + CRGuess + " 's in the word. Revealing the letter(s): ");
                        } else if (correct == false) {
                            System.out.println("Sorry, this letter is not in your word. Your secret word:  ");

                        }
                            System.out.println();
                        }
                        tries++;
                    }
                    System.out.println("You guessed the entire word " + StoredWord.toLowerCase() + " correctly! It took you " + tries + " attempts!");


                }


            }
        }


 public  static void hangManImage(int tries){
	   String display = "";

	   switch (tries) {
			   
		   case 0: 
		   default:
		                   System.out.println("             HANG GUY");
			               System.out.println("     |-------------------------|");
                           System.out.println("     |            ");
			               System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 0");
			    break;
					      
					    
					      
		   case 1:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 1");
			    break;	      
					
					      
		      case 2:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                          -- --");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 2 ");
			    break;	      
					      
					      
					      
					      
				  case 3:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                    (  - -   ) " );
                           System.out.println("     |                            ");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 3");
			    break;	      	      
					      
					      
					      
				  case 4:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                       (  o o  ) " );
                           System.out.println("     |                           |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 4");
			    break;	      	      	      
				
			   
			   
			   
			   
			     case 5:
                           System.out.println("             HANG GUY");
			               System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                      (   o o   ) " );
                           System.out.println("     |                           |");
                           System.out.println("     |                           |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 5");
			    break;	      	      	      
			   
			   
			   
			        case 6:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                          ");
			               System.out.println("     |                        (  o o   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                           ");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 6");
			    break;	      	      	      
			   
			   
			   
			   
			   
			   
			   
			     case 7:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                        (  o o   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                        |    ");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 7");
			    break;	      	      	      
			   
			   
			   
			   
			    case 8:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                       (   o o   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                        |    ");
                           System.out.println("     |                        |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 8");
			    break;	      	      	      
			   
			   
			   
			    case 9:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                        (  o o  ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                        |    ");
                           System.out.println("     |                        |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 9");
			    break;	      	      	      
			   
			   
			   
			   
			     case 10:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
                           System.out.println("     |                        (  o o   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                        |   |");
                           System.out.println("     |                        |   |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 10");
			    break;	      	      	      
			   
			   
			    case 11:

			               System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                       (   o o  ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---");
                           System.out.println("     |                        |   |");
                           System.out.println("     |                        |   |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 11");
			    break;	      	      	      
			   
			   
			   
			    case 12:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                      (    o o   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---|");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 12" );
			     break;
			   
			   
			      case 13:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			               System.out.println("     |                        (  o o  ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---|");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                            |");
                           System.out.println("     |                           /  ");
                           System.out.println("     |                          |");
                           System.out.println("     |                          |");
			               System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 13");
			     break;
			   
			   
			     case 14:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
                           System.out.println("     |                        $(  o o   )@ " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---|");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                            |");
                           System.out.println("     |                           /  |");
                           System.out.println("     |                          |   |");
                           System.out.println("     |                          |   |");
			               System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 14");
			     break;
			   
			   
			   
			     case 15:
                           System.out.println("             HANG GUY");
		                   System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
                           System.out.println("     |                        $(  o o   )$ " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---|");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                      |_|  _|   |");
                           System.out.println("     |                            |");
                           System.out.println("     |                           /  |");
                           System.out.println("     |                          |   |");
                           System.out.println("     |                        <-|   |->");
                           System.out.println(" ----|----------------------------------------|");
                           System.out.println("Stage 15");
			    break;	      	      	   
			   
			   
			   
			   
			   
			   
			   
					      
					       	
		           
					      
					      
                           
  

    
	   }
















    }
}
   // Scanner keyboard = new Scanner (System.in);
		//	 System.out.println("Enter secret word:");
                  //   String secretword = keyboard.nextLine();
