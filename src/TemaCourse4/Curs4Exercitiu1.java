package TemaCourse4;

public class Curs4Exercitiu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factura = 130;
		
		////varianta cu IF
		if (factura>100) {
			factura = factura * 90/100;
			System.out.println("Aveti de achitat: " + factura);	
		} else {
			factura=factura *95/100;
			System.out.println("Aveti de achitat: " + factura);	
	}
		
		
		System.out.println("------------------------");
		
		///variantac cu operator ternar
		
		int factura2 = 100;
		String result = (factura2>100)?"Aveti de achitat: " + factura2 * 90/100:"Aveti de achitat: " + factura2 *95/100;	
		System.out.println(result);
		

}
}
