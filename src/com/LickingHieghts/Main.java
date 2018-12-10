

  


       
        
        
       
        


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

        String UserSecretWord; // this if for the nextline thing so the user can type the secret for the second player

        Scanner keyboard = new Scanner(System.in);
         System.out.println("|---------------------------------|");
         System.out.println("|Enter secret word:               |");
        UserSecretWord = keyboard.nextLine();
        System.out.println("|----------------------------------|");

        int SecretWordLength; // THe length of the secret word kinda like the dashes
        String GuessDashes; // this for when the secret word is entered then it will the amount of letters like this ---
        int Misses = 0; // The amount of times that the person has guessed wrong


        for (int i = 0; i < 16; i++) {
            hangManImage(i);
            {

                int tries = 0; //this will be the grand total of tries counting the correct ones at the end
                boolean iterated = false;
                String temp = "";
                String holder = "";
                int length; // basically the same as the SecretWordLength i'm not sure on which to use

            }

   }
}





                public static void hangManImage ( int tries) {
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
                        System.out.println("     |                        - -");
                        System.out.println("     |");
                        System.out.println("     |");
                        System.out.println("     |");
                        System.out.println("     |");
                        System.out.println("     |");
                        System.out.println("     |");
                        System.out.println("     |");
                        System.out.println(" ----|----------------------------------------|");
                        System.out.println("Stage 1 ");
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
                        System.out.println("     |                    (  - -   ) ");
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
                        System.out.println("     |                       (  o o  ) ");
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
                        System.out.println("     |                      (   o o   ) ");
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
                        System.out.println("     |                        (  o o   ) ");
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
                        System.out.println("     |                        (  o o   ) ");
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
                        System.out.println("     |                       (   o o   ) ");
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
                        System.out.println("     |                        (  o o  ) ");
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
                        System.out.println("     |                        (  o o   ) ");
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
                        System.out.println("     |                       (   o o  ) ");
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
                        System.out.println("     |                      (    o o   ) ");
                        System.out.println("     |                            |");
                        System.out.println("     |                        |---|---|");
                        System.out.println("     |                        |   |   |");
                        System.out.println("     |                        |   |   |");
                        System.out.println("     |");
                        System.out.println("     |");
                        System.out.println("     |");
                        System.out.println(" ----|----------------------------------------|");
                        System.out.println("Stage 12");
                        break;


                    case 13:
                        System.out.println("             HANG GUY");
                        System.out.println("     |-------------------------|");
                        System.out.println("     |                         |");
                        System.out.println("     |                        (  o o  ) ");
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
                        System.out.println("     |                        $(  o o   )@ ");
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
                        System.out.println("     |                        $(  o o   )$ ");
                        System.out.println("     |                            |");
                        System.out.println("     |                        |---|---|");
                        System.out.println("     |                        |   |   |");
                        System.out.println("     |                      |_|   |   |");
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


