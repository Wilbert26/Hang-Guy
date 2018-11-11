

  


       
        
        
       
        


package com.LickingHieghts;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Welcome To the Hang Guy game");
        System.out.println("Rules:this - represents a letter for every - their is one letter");
        System.out.println("Every time you guess the wrong letter the hang guy will be built ");
        System.out.println("Once you guess the letter correctly one of spaces will be filled in with that letter");
        System.out.println("Good Luck!");

	int numberOfMisses = 0;
	 for (int i = 0; i < 15; i ++){
		 hangManImage(i);
		 {
	 int tries = 0;
			 boolean iterated = false;
			 String temp = "";
			 String holder = "";
			 
			 Scanner keyboard = new Scanner (System.in);
			 System.out.println("Enter secret word:");
			 String word = keyboard.nextLine();
	    
		 
	 }
			 
	    
    }
}

   pulbic static void hangManImage(int tries){
	   String display = "";
	   switch (tries) {
			   
		   case 0: 
		   default:
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
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;
					      
					    
					      
		   case 1:			      
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
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      
					
					      
		      case 2:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                           -- --");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      
					      
					      
					      
					      
				  case 3:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                      (  - -   ) " );
                           System.out.println("     |                            ");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      
					      
					      
					      
				  case 4:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                        (  - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
				
			   
			   
			   
			   
			     case 5:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                       (   - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                            |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			   
			        case 6:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                          ");
			   System.out.println("     |                        (  - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                           ");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			   
			   
			   
			   
			   
			     case 7:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                        (  - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                        |    ");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			   
			   
			    case 8:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                       (   - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                        |    ");
                           System.out.println("     |                        |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			   
			    case 9:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                        (  - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                        |    ");
                           System.out.println("     |                        |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			   
			   
			     case 10:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                        (  - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|");
                           System.out.println("     |                        |   |");
                           System.out.println("     |                        |   |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			    case 11:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                       (   - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---");
                           System.out.println("     |                        |    |");
                           System.out.println("     |                        |    |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			   
			   case 12:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                      (    - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---|");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("     |");
                           System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			     case 13:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                        (  - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---|");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                            |");
                           System.out.println("     |                            /  ");
                           System.out.println("     |                           /");
                           System.out.println("     |                          /");
			   System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	      
			   
			   
			    case 14:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                        (  - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---|");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                            |");
                           System.out.println("     |                            /  |");
                           System.out.println("     |                           /   |");
                           System.out.println("     |                          /    |");
			   System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	   
			   
			   
			   
			       case 15:		
		           System.out.println("     |-------------------------|");
                           System.out.println("     |                         |");
			   System.out.println("     |                        (  - -   ) " );
                           System.out.println("     |                            |");
                           System.out.println("     |                        |---|---|");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                        |   |   |");
                           System.out.println("     |                            |");
                           System.out.println("     |                            /  |");
                           System.out.println("     |                           /   |");
                           System.out.println("     |                        --/    |--");
			   System.out.println("----|----------------------------------------|");
                           System.out.println("");
			    break;	      	      	   
			   
			   
			   
			   
			   
			   
			   
					      
					       	
		           
					      
					      
                           
  

    
	   }
















    }
}
