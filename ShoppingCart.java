
public class ShoppingCart {

	Product prods[];
	int cindex;
	
	
	
	ShoppingCart(){
		prods=new Product[5];		
	}
	
	
	Product addProduct(Product prod) {
		prods[cindex]=prod;
		cindex++;	
		System.out.println("Added product with id "+prod.id);
		return prod;
	}
	
	
	void listProducts() {
		for(int i=0;i<cindex;i++) {
			prods[i].display();
		}	
	}
	
	
	void emptyCart(){
		prods = new Product[5];
		cindex=0;
		System.out.println("Deleted all items from cart");
		System.out.println("Cart is empty");
	}
	
	
	void checkout() {
		double totalAmount=0.0;
		System.out.println("Checkout - Product List");
		for(int i=0;i<cindex;i++) {
			prods[i].display();
			totalAmount+=prods[i].price;
		}
		System.out.println("Total Amount: "+totalAmount);
		emptyCart(); 
	}
	
	public static void main(String[] args) {	
		ShoppingCart scart= new ShoppingCart();
		
		Product p1=new Product(100, "Mobile", 15000.0);
		scart.addProduct(p1);
		Product p2=new Product(200, "Clothing",799.9);
		scart.addProduct(p2);
		scart.listProducts();
		scart.checkout();
		scart.listProducts(); 		
	}
}

class Product {
	int id;
	String name;
	double price;
	
	
	Product(){
		id=0;
		name="";
		price=0.0;
	}
	
	Product(int pid,String pname,double pprice){
		id=pid;
		name=pname;
		price=pprice;
	}

	void display() {
		System.out.println("id="+id+" name="+name+" Price="+price);
	}
	

}
