import java.util.ArrayList;
import java.util.Scanner;

public class TestMtg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> setlist = new ArrayList<String>();
		ArrayList<String> stack = new ArrayList<String>();//Not in use
		ArrayList<String> check = new ArrayList<String>();
		ArrayList<String> deck = new ArrayList<String>();
		deck.add("A");
		deck.add("A");
		deck.add("A");
		deck.add("B");
		deck.add("B");
		for(int z=0;z<9;z++){
			deck.add("C");
		}
		
		
		Scanner console=new Scanner(System.in);
	   	String userInput=console.nextLine();
	   	
	   	if(userInput.equals("selectHand")){
	   	    System.out.println(deck);
	   		System.out.println("Please select your cards");
	   		
	   	while(check.size()<7){
	   		userInput=console.next();
	   		if(deck.contains(userInput)){
	   			
	   			check.add(userInput);
	   			
	   		}
	   		
	   		System.out.println("You have selected "+check.size()+" cards");
	   		System.out.println(check);	
	   	}//End of While loop
	   	//Check has been completed
	   	stack=deck;
	    int denominator;//Creates d in n/d 
	   	int numerator=0;//Is n in n/d 
	   	int totalNumerator = 1;
	   	int totalDenominator = 1;
	    double product;
	   	
	   for(int y=0;y<check.size();y++){	
	   	
		   numerator=0;
		   
	   	for(int i=0;i<deck.size();i++){
	   		 if(deck.get(i).equals(check.get(y))){
	   			 numerator+=1;
	   		 }
	   	    }
	   	
	   	denominator=stack.size()-y;
	   	
	   	totalNumerator=totalNumerator*numerator;
	   	totalDenominator=totalDenominator*denominator;
	   	
	   	stack.remove(y);
	   	}
	    product=(double)totalNumerator/totalDenominator;
	   
		
	   	}//End of userInput 
		
	   	if(userInput.equals("active")){
	   		
	   	}
	 
	   	
	   	
	}

}
/*


try{	
		   			   	System.out.print(setlist.get(j));
		   			   	System.out.println(" x"+z);} catch (java.lang.ArrayIndexOutOfBoundsException
		   			   			ArrayIndexOutOfBoundsException){
		   			   		
		   			   	}













System.out.println(new BigDecimal(myvalue).toPlainString());
        System.out.println();



if(userInput.equals("handChance")){
	   				double handChance=0;//Not in use
					for(int v=0;v<7;v++){/////Cycles seven times
						mathmatics.setSize(deck.size());//Needed so that math.random does not roll out of bounds
						mathmatics.setRandom();//Rolls and re-rolls the random number
						
						hand.add(deck.get(mathmatics.getRandom()));//Adds cards to hand
						
						 int denominator=deck.size();//Creates d in n/d 
					   	 int numerator=0;//Is n in n/d 
					   	 int totalNumerator = 0;
					   	 int totalDenominator = 0;
					   	 
					   	 for(int i=0;i<deck.size();i++){////Creates n in n/d 
					   		 if(deck.get(i).equals(hand.get(v))){
					   			 numerator+=1;
					   		 }
					   	 }////
					   	 
					   	 double chance;//Is the chance of the card being drawn
					   	
					   	 //System.out.println("The subject is "+userInput);
					   	 //System.out.println("Chances of getting "+userInput+" "+chance+" or "+numerator+"/"+denominator);
						
					   //System.out.println("Card drawn was "+chance);	 
					   //System.out.println("chance is "+chance+" or "+numerator+"/"+denominator);
					   	System.out.println("Numerator "+numerator);
					    System.out.println("Denominator "+denominator);
						if(v==0){
							totalNumerator=numerator;
							totalDenominator=denominator;
						}else{
							System.out.println("1 "+totalNumerator*numerator);
						System.out.println("2 "+totalDenominator*denominator);
						totalNumerator*=numerator;
						totalDenominator*=denominator;
						}
						
						handChance=(double)totalNumerator/totalDenominator;
						
						System.out.println("Total numerator "+totalNumerator);
						System.out.println("Total denominator "+totalDenominator);
						System.out.println("Total chance became "+handChance);
						
						deck.remove(mathmatics.getRandom());//Removes card from deck
						
					}
					deck.addAll(hand);//Adds cards back to deck
					//System.out.println("Post deck "+deck);	
					//if(handChance<0.1){
					//handChance=handChance/0.01;
					//}
					System.out.println("Chance of drawing hand (In order) :"+handChance);
					System.out.println("You drew\n"+hand);
					hand.clear();//Clears hand
	   			}














		Mathmatics mathmatics=new Mathmatics();
		ArrayList<String> hand = new ArrayList<String>();
		ArrayList<String> deck = new ArrayList<String>();
		ArrayList<String> items = new ArrayList<String>();
	   	 items.add("Map");
	   	 items.add("Old key");
	   	 items.add("Pixy Dust");
	   	 items.add("Food");
	   	 items.add("Rusty Dagger");
	   	 items.add("Pixy Dust");
	   	 items.add("Pixy Dust");
	   	 items.add("Empty Rum Bottle");
	   	 items.add("Map");
		
	   	 //Scanner console=new Scanner(System.in);
	   	 //String userInput=console.nextLine();
	   	 
	   	
				
				
				//(int)(Math.random()*deck.size())
				//tempDeck=deck;
				//System.out.println("Pre deck "+deck);
	   	
	   	 		double handChance=0;//Not in use
				for(int v=0;v<7;v++){/////Cycles seven times
					mathmatics.setSize(items.size());//Needed so that math.random does not roll out of bounds
					mathmatics.setRandom();//Rolls and re-rolls the random number
					
					hand.add(items.get(mathmatics.getRandom()));//Adds cards to hand
					
					 int denominator=items.size();//Creates d in n/d 
				   	 int numerator=0;//Is n in n/d 
				   	 
				   	 
				   	 for(int i=0;i<items.size();i++){////Creates n in n/d 
				   		 if(items.get(i).equals(hand.get(v))){
				   			 numerator+=1;
				   		 }
				   	 }////
				   	 
				   	 double chance;//Is the chance of the card being drawn
				   	 chance=(double)numerator/denominator;
				   	 //System.out.println("The subject is "+userInput);
				   	 //System.out.println("Chances of getting "+userInput+" "+chance+" or "+numerator+"/"+denominator);
					
				   //System.out.println("Card drawn was "+chance);	 
				   System.out.println("chance is "+chance+" or "+numerator+"/"+denominator);
					if(v==0){
						handChance=chance;
					}else{handChance=handChance*chance;}
					
					
					
					
					items.remove(mathmatics.getRandom());//Removes card from deck
					
					
					
					
					
				}
				deck.addAll(hand);//Adds cards back to deck
				//System.out.println("Post deck "+deck);	
				
				handChance=handChance/0.01;
				System.out.println("Chance of drawing hand (In order) :"+handChance);
				System.out.println("You drew\n"+hand);
				hand.clear();//Clears hand
				
	
	   	 
				for(int i=0;i<20;i++){
					double randoM;
					randoM = Math.random() * 50 + 1;
					int Random;
					Random = (int )(Math.random() * 50 + 1);
					System.out.println("Double math.random "+randoM);
					System.out.println("int math.random "+Random);
				}







         System.out.println("Get the chances of drawing...");//Not needed
         userInput=console.next();//Not needed

         int denominator=items.size();
	   	 int numerator=0;
	   	 double handChance;
	   	 
	   	 for(int i=0;i<deck.size();i++){
	   		 if(deck.get(i).equals(userInput)){
	   			 numerator+=1;
	   		 }
	   	 }
	   	 
	   	 double chance;
	   	 chance=(double)numerator/denominator;
	   	 System.out.println("The subject is "+userInput);
	   	 System.out.println("Chances of getting "+userInput+" "+chance+" or "+numerator+"/"+denominator);
	   	








    ArrayList<String> setlist = new ArrayList<String>();
		ArrayList<Integer> stack = new ArrayList<Integer>();
		ArrayList<String> items = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
	   	 items.add("Map");
	   	 items.add("Old key");
	   	 items.add("Pixy Dust");
	   	 items.add("Old key");
	   	 items.add("Rusty Dagger");//1
	   	 items.add("Pixy Dust");
	   	 items.add("Empty Rum Bottle");
	   	 items.add("Pixy Dust");
	   	 items.add("Pixy Dust");
	   	 items.add("Pixy Dust");
	   	 items.add("Pixy Dust");
	   	 items.add("Pixy Dust");
	   	 items.add("Pixy Dust");
	   	
		for(int i=0;i<100;i++){
			//Goes from 0 to the number that is being multiplied by mth.rnd minus 1
			int random=(int) (Math.random()*20);
			System.out.print("Round "+i+":");
			System.out.println(random);
		}


    //Goes from 0 to the number that is being multiplied by mth.rnd minus 1
			int random=(int) (Math.random()*20);


 	for(String i:items){
	   		 if(!setlist.contains(i)){
	   			 setlist.add(i);
	   		 }
	   	 }

	   	 //System.out.println(setlist);
		
	   	int z=0;
	   	for(int j=0;j<setlist.size();j++){
	   		System.out.println();
	   		z=0;
		   	for(int i=0;i<items.size();i++){
		   		if(setlist.get(j).equals(items.get(i))){
		   			
		   			z+=1;
		   			
		   			
		   		}
		   	}
		   	System.out.print(setlist.get(j));
		   	System.out.print("x"+z);
		   	}



items.add(1, "Butt");



if(userInput.equals("add")||userInput.equals("a")){
	   				 
	   				 System.out.println("Card name please");
	   				 userInput=console.next();
	   				 populateDeck.setCard(userInput);
	   				 
	   				 
	   				 System.out.println("Card quantity please");
	   				 console.next();
	   				 if(console.hasNextInt()){
	   				 place=console.nextInt();
	   				 populateDeck.setQuantity(console);
	   				 }
	   				 
	   				 for(int i=0;i<populateDeck.getQuantity();i++){///*
	   					 deck.add(populateDeck.getCard());
	   				 }///*
	   			 }
	   			 
	   			 
	   			 
	   			 	 System.out.println("Card quantity please");
	   				 console.next();
	   				 while(check=false){
	   					place=console.nextInt();
	   					System.out.println("Works");
	   					if(place>-1){
	   					populateDeck.setQuantity(place);
	   					check=true;
	   					}
	   				 }
	   			 
	   			 
	   			 
	   			 while(!userInput.contains(".")){
	   				 if(cardName==null){
	   					cardName=userInput; 
	   				 }else{cardName=cardName+" "+userInput;}
	   				 userInput=console.next();
	   				 }
	   				 
	   				 
	   				 
	   			 
	   			 if(userInput.equals("deck")||userInput.equals("d")){
	   				 System.out.println(deck);
	   			 }
	   			 
	   			 
	   			 
	   			 cardName=null;
	   		 console.next();
	   		 userInput=console.next();
	   				 
	   				 
*/