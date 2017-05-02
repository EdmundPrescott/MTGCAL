
public class InputPerfecting {

	private boolean isInteger;
	private String UserInput;
	
	public InputPerfecting(){
		
	}
	
	public void checkInteger(String a){
		//if(a instanceof Integer){this.isInteger=true;}else{this.isInteger=false;}
		try {
		        Integer.parseInt(a);
		        this.isInteger=true;
			}
		      
		  catch (NumberFormatException nfe) {
			    this.isInteger=false;
		    }
	}
	
	public boolean getisInteger(){
		return this.isInteger;
	}
	
	public void holdInput(String b){
		this.UserInput=b;
	}
	
	public String getpastInput(){
		return this.UserInput;
	}
	
	public void voidholdInput(){
		this.UserInput=null;
	}
	
}
