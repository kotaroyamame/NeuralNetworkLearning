package website.iidesign.ai;



public class Main {
	private static Node[] n;
	//“ü—Í’l
	static int[][] x={
			{0,0},
			{0,1},
			{1,0},
			{1,1},
	};
	//‹³Žt’l
	static int[] y={
			0,
			1,
			1,
			1
	};
	public static void main(String[] args) {
		int[] newW;

		n=new Node[1];
		for(int i=0;i<n.length;i++){
			n[i]=new Node(0,0);
		}
		n[0].setWeight(0,0);
		for(int i=0;i<x.length;i++){
			System.out.println("y="+y[i]);
		if(n[0].hog(x[i][0],x[i][1])==y[i]){
			System.out.println("W’lC³‚È‚µ");
		}else{
			System.out.println("W’lC³‚ ‚è");
			if(n[0].hog(x[i][0],x[i][1])-y[i]>0)
				newW=new int[]{(int) (n[0].getWeight()[0]-x[i][0]),(int) (n[0].getWeight()[1]-x[i][1])};
			else
				newW=new int[]{(int) (n[0].getWeight()[0]+x[i][0]),(int) (n[0].getWeight()[1]+x[i][1])};
			n[0].setWeight(newW[0],newW[1]);
		}
		System.out.println("y="+y[i]);
		}
		for(int j=0;j<n[0].getWeight().length;j++)
			System.out.println("w="+n[0].getWeight()[j]);
	}

}
