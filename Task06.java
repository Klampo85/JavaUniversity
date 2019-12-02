import java.util.Arrays;
import java.lang.Iterable;

public class Task06{//start of class

	public static void main(String[] args){//start of main
	
		//3D array 
		int[][][] opers = {
            { {100, -50, 25}, {150,-300}, {300,-90,100} },
            { {90, -60, 250}, {300,20,-100} },
            { {20, 50}, {300}, {20,-20,40}, {100,-200} }
		};

		int[] sum = new int[opers.length];

		for(int i = 0; i < opers.length; ++i){//start of 1st "for"
			for(int j = 0; j < opers[i].length; ++j){//start of 2nd "for"
				for(int k = 0; k < opers[i][j].length; ++k){//start of 3rd "for"
					sum[i] += opers[i][j][k];
					
				}//end of 3rd "for"

			}//end of 2nd "for"

		}//end of 1st "for"
			System.out.println(Arrays.toString(sum));

	}//end of main

		

}//end of class