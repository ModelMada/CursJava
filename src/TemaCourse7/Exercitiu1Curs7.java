

package TemaCourse7;


public class Exercitiu1Curs7 {
	
	static int [] sir = {3,5,7,9};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rezolvareCuFor();
		rezolvareCuWhile();
	}
	
	public static void rezolvareCuFor() {

		int [] sirInversat = new int[4];
		int z = 0;
		for(int i = sir.length-1;i>=0;i--) {
			sirInversat[z]=sir[i];
			z++;				
			}
		for(int j=0;j<sirInversat.length;j++) {
			System.out.println("Elementul de pe pozitia "+ j + " este "+ sirInversat[j]);
		}
		}
	
	public static void rezolvareCuWhile() {
		int [] sirInversat2 = new int[4];
		int x = 0;
		int y = sir.length-1;
		while(y>=0) {
			sirInversat2[x]=sir[y];
			x++;
			y--;
		}
		for(int j=0;j<sirInversat2.length;j++) {
			System.out.println("Elementul de pe pozitia "+ j + " este "+ sirInversat2[j]);
		}
	}
	}

