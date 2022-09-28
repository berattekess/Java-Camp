
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(5,"asus","asus laptopp",50000,14000);
		/*
		 * product.setName(" Laptop"); product.setDescription("asus laptop");
		 * product.setId(2000124); product.setPrice(50000);
		 * product.setStockAmount(1400);
		 */

        ProductManager productManager = new ProductManager();
        productManager.add(product);
	}

}
