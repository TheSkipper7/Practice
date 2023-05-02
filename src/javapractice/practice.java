package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@FunctionalInterface
interface drawable{
	public void draw();
}


public class practice {
	
	public static void drawing() {
		System.out.println("Drawing....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        //List<Float> productPriceList = new ArrayList<Float>();  
        
        //Product product = 
        		Map<Integer, String> collect = productsList.stream()
        		//.map(product->product)
        		.collect(Collectors.toMap(product -> product.id , product->product.name));	
        		//.forEach(System.out::println);
        
        System.out.println(collect);
     

	}

}
