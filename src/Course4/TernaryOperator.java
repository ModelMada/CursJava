package Course4;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//operator ternar foloseste 2 caractere ? :
//x = conditie ? expresie (va fi atribuit in x daca conditie == true) : expresie2
		int a =130;
		int b = 60;
		
		int x;
		
		x=a>b?a:b; // daca a>b este true, se atribuie prima valoare dupa ?, adica a, daca coditia a>b este falsa. se atribuie a dua valoare dupa ?, adica b
				
		if(a>b) {
			x=a;
		}else {
			x=b;
		}
		
		System.out.println(x);
		
		int num1 = 5;
		int num2=10;
		int num3=8;
		
		int y= (num1>num2)?num1:num2;
		y = (num1>num2)?num1:(num2<num3?num2:num3);
		
		if (num1>num2) {
			y=num1;
		}else if(num2>num3) {
			y = num2;
		}else {
			y=num3;
		}
				
	}

}
