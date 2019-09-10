/**
 * 
 */

/**
 * @author Haadi
 *
 */
public class Item {
	
	//Defining the attributes
	
	private String item_id;
	private String name ;
	private String description ;
	private String category;
	private String supplier_name;
	private int contact;
	private double price;
	private int quantity;
	static int totalItems = 0 ;
	
	//Default constructor
	
	public Item() {
		
		this.item_id = item_id;
		this.name = name;
		this.description = description;	
		this.category = category;
		this.supplier_name = supplier_name;
		this.contact = contact;
		this.price = price;
		this.quantity = quantity;
		totalItems++;
		
		
		// Getters and setters
	}

	public String getItem_id() {
		return item_id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public int getContact() {
		return contact;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public static int getTotalItems() {
		return totalItems;
	}
	
  
	

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void setTotalItems(int totalItems) {
		Item.totalItems = totalItems;
		
	}
	
	 //Class methods
	public void()
	
	
	

}
