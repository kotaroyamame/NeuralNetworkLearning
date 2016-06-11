package website.iidesign.ai;



public class Main {
	private static Node[] n;
	//入力値
	static int[][] x={
			{0,0},
			{0,1},
			{1,0},
			{1,1},
	};
	//教師値
	static int[] y={
			0,
			0,
			0,
			1
	};
	public static void main(String[] args) {
		double[] newW;
		//学習係数
		double eta=0.4;

		n=new Node[1];
		for(int i=0;i<n.length;i++){
			n[i]=new Node(0,0);
		}
		n[0].setWeight(0,0);
		
		//学習回数
		for(int l=0;l<6;l++)
		for(int i=0;i<x.length;i++){
			System.out.println("net="+n[0].hog(x[i][0],x[i][1])+"y="+y[i]);
		if(n[0].hog(x[i][0],x[i][1])==y[i]){
			System.out.println("W値修正必要なし");
		}else{
			System.out.println("W値修正必要あり");
			if(n[0].hog(x[i][0],x[i][1])-y[i]>0)
				newW=new double[]{(n[0].getWeight()[0]-(1+x[i][0]*eta)),(n[0].getWeight()[1]-(1+x[i][1]*eta))};
			else
				newW=new double[]{(n[0].getWeight()[0]+(1+x[i][0]*eta)),(n[0].getWeight()[1]+(1+x[i][1]*eta))};
			n[0].setWeight(newW[0],newW[1]);
		}
		System.out.println("net="+n[0].hog(x[i][0],x[i][1])+"y="+y[i]);
		}
		for(int j=0;j<n[0].getWeight().length;j++)
			System.out.println("w="+n[0].getWeight()[j]);
		
		System.out.println("net="+n[0].hog(0,0)+" 0,0");
		System.out.println("net="+n[0].hog(0,1)+" 0,1");
		System.out.println("net="+n[0].hog(1,0)+" 1,0");
		System.out.println("net="+n[0].hog(1,1)+" 1,1");
		
		
	}

}
