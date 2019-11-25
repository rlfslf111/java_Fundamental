package java_20191121;

public class TwodimensionDemo {
	public static void main(String[] args) {
		int[][] a=new int[3][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		for(int i=0; i<a.length;i++){
			for(int j=0; j<a[i].length; j++){
				int temp;
				temp=a[i][j];
				System.out.printf("a[%d][%d]의 수는:%d\n",i,j,temp);
			}
		}
		
		int[][] c= {{1},{2,3},{4,5,6}};
		int[][] d= new int[3][];
		d[0]=new int[1];
		d[1]=new int[2];
		d[2]=new int[3];
		d[0][0]=1;
		d[1][0]=2;
		d[1][1]=3;
		d[2][0]=4;
		d[2][1]=5;
		d[2][2]=8;
		
		for(int i=0; i<d.length;i++){
			for(int j=0; j<d[i].length; j++){
				System.out.println(d[i][j]);
			}
		}
		
		int[] h={1,2,3,4,5,6,7};
		int[] f=new int[4];
		System.arraycopy(h, 4, f, 0, 3);
		for(int i=0; i<f.length; i++){
			System.out.println(f[i]);
		}
		
	}
}
