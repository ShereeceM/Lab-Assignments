package lab2Homework;

public class House {
	protected int id;
	protected float price;
	protected String location;
	protected String advertiser;
	protected static Photo image;
	
	
	public House() {
		this(0,0.0f,"","",image);
	}
	
	
	public House(int a, float b, String c, String d, Photo e) {
		super();
		id = a;
		price = b;
		location = c;
		advertiser = d;
		image = e;
	}


	public int getId() {
		return id;
	}


	public void setId(int a) {
		id = a;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float b) {
		price = b;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String c) {
		location = c;
	}


	public String getAdvertiser() {
		return advertiser;
	}


	public void setAdvertiser(String d) {
		advertiser = d;
	}


	public Photo getImage() {
		return image;
	}


	public void setImage(Photo e) {
		image = e;
	}
	
	
	
	
}
