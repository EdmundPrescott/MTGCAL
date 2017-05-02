import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class MtgMain {

	 public static void main(String[] args) {
		 PopulateDeck populateDeck=new PopulateDeck();
		 InputPerfecting inputPerfecting=new InputPerfecting();
		 Mathmatics mathmatics=new Mathmatics();
		 ArrayList<String> deck = new ArrayList<String>();
		 ArrayList<String> reset = new ArrayList<String>();
		 ArrayList<String> hand = new ArrayList<String>();
		 ArrayList<String> setlist = new ArrayList<String>();
		 ArrayList<Integer> stack = new ArrayList<Integer>();//Not in use
		 Scanner command=new Scanner(System.in);
		 Scanner name=new Scanner(System.in);
	   	 String userInput="";
	     String Name="";
	     	
	   	 
	   	 
	   	 
	   	 while(userInput!="quit"){
	   		//Input cycler 
	   		userInput=command.next();
	   		//
	        
	   		     //Command 1
	   			 if(userInput.equals("add")){
	   				 
	   				 System.out.println("Card name please");
	   				 Name=name.nextLine();
	   				 
	   				 populateDeck.setCard(Name); 
	   				 //System.out.println(populateDeck.getCard());
	   				 
	   				 System.out.println("Card quantity please");
	   				 userInput=command.next();
	   				 inputPerfecting.checkInteger(userInput);
	   				 while(inputPerfecting.getisInteger()==false){
	   					 userInput=command.next();
	   					 inputPerfecting.checkInteger(userInput);
	   				 }
	   				 populateDeck.setQuantity(Integer.parseInt(userInput.substring(0)));
	   				 for(int i=0;i<populateDeck.getQuantity();i++){
	   					deck.add(populateDeck.getCard()); 
	   				 }
	   				 
	   				System.out.println("Done");
	   				 }
	   			 
	   			//Command 2
	   			if(userInput.equals("deck")){
	   				setlist.clear();
	   				for(String i:deck){
	   		   		 if(!setlist.contains(i)){
	   		   			 setlist.add(i);
	   		   		 }
	   		   		 }
	   			 	int z=0;
	   	   		   	for(int j=0;j<setlist.size();j++){
	   	   		   		z=0;
	   	   		   		
	   	   			   	for(int i=0;i<deck.size();i++){
	   	   			   		if(setlist.get(j).equals(deck.get(i))){
	   	   			   			z+=1;	
	   	   			   		}
	   	   			   	}
	   	   				   System.out.println(setlist.get(j)+" x"+z);	
	   	   		   	}  
	   			    }
	   			
	   		    //Command 3
	   			if(userInput.equals("testHand")){
	   				if(deck.size()>=7){
	   					
	   					
	   				//(int)(Math.random()*deck.size())
	   				//System.out.println("Pre deck "+deck);
	   				for(int v=0;v<7;v++){
	   					mathmatics.setSize(deck.size());
	   					mathmatics.setRandom();
	   					
	   					hand.add(deck.get(mathmatics.getRandom()));
	   					deck.remove(mathmatics.getRandom());
	   					
	   				}
	   				deck.addAll(hand);
	   				//System.out.println("Post deck "+deck);	
	   				
	   				
	   				
	   				System.out.println("You drew\n"+hand);
	   				hand.clear();
	   				}
	   			}
	   		
	   			//Command 4
	   			if(userInput.equals("remove")){
	   				System.out.println("Which card would you like to remove?");
	   				userInput=command.next();
	   				inputPerfecting.holdInput(userInput);
	   				System.out.println("How many would you like to remove?");
	   				userInput=command.next();
	   			    inputPerfecting.checkInteger(userInput);
	   				while(inputPerfecting.getisInteger()==false){
	   					
	   					 userInput=command.next();
	   					 inputPerfecting.checkInteger(userInput);
	   				 }
	   				
	   				for(int i=0;i<Integer.parseInt(userInput.substring(0));i++)
	   				{deck.remove(inputPerfecting.getpastInput());}
	   				System.out.println("Done");			
	   			}
	   			
	   		    //Command 5
	   			if(userInput.equals("singleChance")){
	   				System.out.println("Get the chances of drawing...");
	   	         userInput=command.next();

	   	         int denominator=deck.size();//Makes denominator
	   		   	 int numerator=0;
	   		   	 
	   		   	 //For loop initializes numerator
	   		   	 for(int i=0;i<deck.size();i++){
	   		   		 if(deck.get(i).equals(userInput)){
	   		   			 numerator+=1;
	   		   		 }
	   		   	 }
	   		   	 
	   		   	 double chance;
	   		   	 chance=(double)numerator/denominator;
	   		   	 System.out.println("The subject is "+userInput);
	   		   	 System.out.println("Chances of getting "+userInput+" "+chance+" or "+numerator+"/"+denominator);
	   			}
	   			
	   			//Command 6
	   			if(userInput.equals("handChance")){
	   				if(deck.size()>=7){
	   				long totalNumerator=1;
	   			    long totalDenominator=1;
	   			    int numerator=0;
	   			    int denominator=deck.size();
	   			    double product=0;
	   			    
	   			    for(int v=0;v<7;v++){//V for loop
	   			    mathmatics.setSize(deck.size());//Needed so that math.random does not roll out of bounds
					mathmatics.setRandom();//Rolls and re-rolls the random number
	   			    
					hand.add(deck.get(mathmatics.getRandom()));//Adds cards to hand
					
					//For loop initializes numerator
	   			    for(int i=0;i<deck.size();i++){
			   		 if(deck.get(i).equals(hand.get(v))){
			   			 numerator+=1;
			   		 }
			   	    }
	   			    
	   			    //System.out.println("Numerator "+numerator);
				    //System.out.println("Denominator "+denominator);
	   			    
	   			    totalNumerator=totalNumerator*numerator;
	   			    totalDenominator=totalDenominator*denominator;
	   			    
	   			    
	   				
	   			 //System.out.println("Total numerator "+totalNumerator);
					//System.out.println("Total denominator "+totalDenominator);
					//System.out.println("Total chance became "+product);
	   			    
	   			    
	   			    deck.remove(mathmatics.getRandom());//Removes card from deck
	   			   // System.out.println("Decklist is\n"+deck);
	   			    denominator=deck.size();
	   			    numerator=0;
	   			    }//End of V for loop
	   			 product=(double)totalNumerator/totalDenominator;
	   			 deck.addAll(hand);//Adds cards back to deck
					//System.out.println("Post deck "+deck);	
					if(product<0.1){
					//product=product/0.01;
					}
					//3.968253968253968E-4
					//0.000396825396825396825052634230956982719362713396549224853515625
					//System.out.println(new BigDecimal(product).toPlainString());
					//System.out.println("Chance of drawing hand (In order) :"+product);
					System.out.println("Chance of drawing hand (In order) :"+new BigDecimal(product).toPlainString()+"\nOr "+totalNumerator+"/"+totalDenominator);
					System.out.println("You drew\n"+hand);
					hand.clear();//Clears hand
	   			    
	   				}
	   			}
	   				
	   			//Command 7
	   			if(userInput.equals("removeAll")){
	   				deck.clear();
	   			}
	   			
	   			
	   			
	   			
	   	 }//End of while loop
		 
		 
	 }//End of main
	
}//End of class
