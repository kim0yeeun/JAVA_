package package01;

public class Product {
	String proName;
	int price;
	String kind;
	int qry;
	public Product() {}
	public Product(String proName, int price, String kind, int qry) {
		super();
		this.proName = proName;
		this.price = price;
		this.kind = kind;
		this.qry = qry;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getQry() {
		return qry;
	}
	public void setQry(int qry) {
		this.qry = qry;
	}
	
	
	

}
