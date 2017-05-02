
public class PopulateDeck {

	private int quantity;
	private String cardName;
	
	public PopulateDeck(){
		
	}
	
	public void setQuantity(int x){
		this.quantity=x;
	}
	
	public void setCard(String y){
		this.cardName=y;
	}
	
	public int getQuantity(){
		
		return this.quantity;
	}
	
	public String getCard(){
		
		return this.cardName;
	}
	
}
