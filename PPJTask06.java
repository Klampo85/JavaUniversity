import java.util.Arrays;

public class PPJTask06{

	public static void main(String[] args){
	
		int[][][] opers = {
	            { {100, -50, 25}, {150,-300}, {300,-90,100} },
	            { {90, -60, 250}, {300,20,-100} },
	            { {20, 50}, {300}, {20,-20,40}, {100,-200} }
			};
		
		for(int[][] a : opers)
			System.out.print(Arrays.deepToString(a));
		
	}

	
	
	
}