
public class Main {

	public static void main(String[] args) {
	        Product product = new Product();
	        product.name = "Laptop";
	        //System.out.println(product.name);
	        product.description = "Asus Laptop";
	        product.id = 20011582;
	        product.price = 15000;
	        product.stockAmount = 1000;

	        ProductManager productManager = new ProductManager();
	        productManager.add(product);

	        }

	}


