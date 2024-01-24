package java8features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product[id=" + id + ",name=" + name + ",price=" + price + "]";
	}
}

public class LambdaWithCompartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		{
			list.add(new Product(101, "Notebook", 1200));
			list.add(new Product(102, "Pensil Box", 200));
			list.add(new Product(103, "KeyBoard", 2000));
			list.add(new Product(104, "Mouse", 1500));
			list.add(new Product(105, "Monitor", 18000));
			Collections.sort(list, (p1, p2) -> {
				return p1.name.compareTo(p2.name);
			});
			/*
			 * for(Product product:list){ system.out.println(product);
			 */
			// foreach method
			list.forEach(p -> System.out.println(p));
		}
	}

}
