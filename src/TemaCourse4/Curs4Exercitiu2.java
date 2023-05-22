package TemaCourse4;

public class Curs4Exercitiu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int comision;
		int vanzari = 3500;
		comision = (vanzari>2500)?vanzari*5/100:0;
		System.out.println("Comisionul tau este: " + comision);
		
		
		
		System.out.println("------------------------");
		
		int comision2;
		int vanzari2 = 1300;
		if(vanzari2>2500) {
			comision2 = vanzari2*5/100;
		}else {comision2 = 0;
		}
		System.out.println("Comisionul tau este: "+comision2);

	}

}
