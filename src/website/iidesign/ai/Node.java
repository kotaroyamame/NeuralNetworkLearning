package website.iidesign.ai;
public class Node {
	private double[] w;
	private int theta=2;

	public Node(double... w) {
		this.w=new double[w.length];
		for(int i=0;i<w.length;i++)
			this.w[i]=w[i];
	}
	
	public void setWeight(double... w) {
		this.w=new double[w.length];
		for(int i=0;i<w.length;i++)
			this.w[i]=w[i];
	}
	
	public double[] getWeight() {
		return w;
	}
	
	public int hog(double... p){
		
		int res=0;
		int wp=0;
		for(int i=0;i<p.length;i++){
			wp+=(p[i]+1)*w[i];
		}
		if(wp>=theta){
			res=1;
		}else{
			res=0;
		}
		return res; 
	}

}