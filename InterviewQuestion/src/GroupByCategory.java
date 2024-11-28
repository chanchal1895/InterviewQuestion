import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class GroupByCategory {
	
	public static void main(String args[]) {
		
		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product("vegetables","ladyfinger"));
		productList.add(new Product("vegetables","pumpkin"));
		productList.add(new Product("vegetables","patato"));
		productList.add(new Product("fruits","papaya"));
		productList.add(new Product("fruits","banana"));
		
		Set<String> categorySet = new HashSet();
		
		Map<String, List<String>> categoryGroup = new HashMap();
		
		for(Product product:productList) {
			
			categorySet.add(product.getCategory());
		}
		
			
			String d = "";
			for(String c:categorySet) {
				List<String> categoryVaule = new ArrayList();
				for(Product product:productList) {
				d=c;
				if(c.equals(product.getCategory())) {
					categoryVaule.add(product.getName());
				}
			}
			categoryGroup.put(d,categoryVaule);
		}
		System.out.println(categoryGroup);		
		System.out.println(productList.stream().collect(Collectors.groupingBy(Product::getCategory)));
	}

}


class Product{
	String category;
	String name;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [category=" + category + ", name=" + name + "]";
	}
	public Product(String category, String name) {
		super();
		this.category = category;
		this.name = name;
	}
	public Product() {
	}
	
}