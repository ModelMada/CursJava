package Curs9;

public class Laptop extends Product{

	private int buyingPrice;
	private int vat;	
	private int adaos;
	
	public Laptop(int buyingPrice, int vat, int adaos) {
		setBuyingPrice(buyingPrice); /// este acelasi lucru cu this.buyigPrice=buyigPrice;
		setVat(vat);
		setAdaos(adaos);
	}//oprim atribuirea directa
	
	public int getBuyingPrice() {
		return buyingPrice;
	}

	private void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public int getVat() {
		return vat;
	}

	private void setVat(int vat) {
		this.vat = vat;
	}

	public int getAdaos() {
		return adaos;
	}

	private void setAdaos(int adaos) {
		this.adaos = adaos;
	}


	
	@Override
	public int calculatePrice() {
		return buyingPrice + vat+adaos;
	}



}
