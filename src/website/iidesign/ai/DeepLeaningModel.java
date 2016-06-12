package website.iidesign.ai;

public class DeepLeaningModel {
	private final int N=3;
	private final int L=10;
	private Node[][] n;
	//入力値
	private int[][] x={
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,0,0,1,0},
			{0,0,0,0,0,0,0,0,1,1},
	};
	private double[][] y={
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,0,0,1,0},
			{0,0,0,0,0,0,0,0,1,1},
	};
	//教師値
	private int[] T={
			0,
			1,
			2,
			3
	};

	public DeepLeaningModel() {
		double[] _w=new double[L];
		for(int i=0;i<L;i++)
			_w[i]=0;
		
		n=new Node[][]{
				{new Node(0),new Node(0),new Node(0),new Node(0),new Node(0),new Node(0),new Node(0),new Node(0),new Node(0),new Node(0)},
				{new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w)},
				{new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w),new Node(_w)},
				};
		
	}
	private void hoge(){
		for(int i=0;i<n[0].length;i++){
			y[0][i]=n[0][i].getSig(x[0][i]);
		}
		
		for(int i=1;i<n.length;i++){
			for(int j=0;j<n[i].length;j++){
				double[] _nextY=new double[y[0].length];
				for(int k=0;k<n.length;k++){
					_nextY[k]=y[i-1][k];
				}
				y[i][j]=n[0][j].getSig(_nextY);
			}
		}

		
	}

}
