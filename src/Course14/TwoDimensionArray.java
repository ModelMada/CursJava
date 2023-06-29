package Course14;

import java.util.Arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] array = {1,2,3,4};		//array clasic
		//array[2]; ///=3; index based
		
		int[][] array = {{1,2},{3,4}};
		/*
		 * 			col0			col1
		 * row0		1				2
		 * row1		3				4
		 */
		//System.out.println(array[0][1]);
		
		for(int i=0; i<2; i++) {			//itereaza prin linii doar
			for(int j=0; j<2; j++)	{
				System.out.println(array[i][j]+ " ");
			}
		}
		System.out.println(array.length);
		
		
		//Object[][] --> string row, int col sau boolean
		//T[][]
		//Object[][] array = {{"String", true}, {22.0,"altString"}}
		
		System.out.println("-------------------");
		String [][] textArray = new String[4][3];	
		System.out.println(textArray[0].length);		//returneaza numarul de linii, prima dimensiune
		
		
		System.out.println("--------FOR EACH---------");
		//int[][] array = {{1,2},{3,4}};
		for(int[] row : array) {
			System.out.println("Row: "+Arrays.toString(row));
			for(int col: row) {
				System.out.println("Col: "+ col);
			}
		}
		
		System.out.println("-------------------");
		String[][] textArray2 = new String[2][4];		//2 linii 4 coloane
			//String[][] textArray = {{null,null,null,null} , {null, null, null, null}}
			//prima dimensiune index		0							1
			//a doua dimensiune index	0	1	  2		3	      0		1	 2		3
		textArray2[0][0]="rosu";
		//String[][] textArray = {{rosu,null,null,null} , {null, null, null, null}}
		textArray2[1][3]="alb";
		//String[][] textArray = {{rosu,null,null,null} , {null, null, null, alb}}
		
		System.out.println(textArray2.length);
		System.out.println(textArray2[0].length);
		System.out.println("-------parcurgere arrays---------");
		
		for(String[] row :  textArray2) {
			System.out.println(Arrays.toString(row));
			for(String element : row) {
				System.out.println(element);
			}
			
		}
	}

}
