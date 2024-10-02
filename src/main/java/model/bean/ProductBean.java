package model.bean;

public class ProductBean {
	private String id;
	private String name;
	private String category;
	private int qty;
	private double price;
	private String image;
	
	public ProductBean() {
	}

	public ProductBean(String id, String name, String category, int qty, double price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.qty = qty;
		this.price = price;
		this.image = image;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
