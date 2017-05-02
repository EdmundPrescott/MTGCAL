
public class Mathmatics {

	private int random;
	private int size;
	
	public Mathmatics(){
		
	}
	
	public void setSize(int a){
		this.size=a;
	}
	
	public void setRandom(){
		this.random=(int) (Math.random()*this.size);
	}
	
	public int getRandom(){
		return this.random;
	}
	
}
