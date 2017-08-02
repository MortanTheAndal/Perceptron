package Main;
import java.util.List;

public class Perceptron {
	private List<Integer> inputs; 
	private List<Integer> weights; 
	private int bias;
	
	public Perceptron(){
		
	}
	
	public void setInput(List<Integer> in){
		inputs= in; 
	}
	
	public void setWeights(List<Integer> we){
		weights= we; 
	}
	
	public void setBias(int b){
		bias=b; 
	}
	
	
	public int output(){
		int sum = 0;
		for (int j=0; j<inputs.size(); j++){
			sum+= inputs.get(j)*weights.get(j);
		}
		return (sum+bias>0)?1:0; 
	}
}
