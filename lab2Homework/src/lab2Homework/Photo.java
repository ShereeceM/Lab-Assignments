package lab2Homework;

public class Photo {
	protected String size;
	protected int numOfPhoto;
	
	
	public Photo(String pSize, int amtOfPhoto) {
		super();
		size = pSize;
		numOfPhoto = amtOfPhoto;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String pSize) {
		size = pSize;
	}


	public int getNumOfPhoto() {
		return numOfPhoto;
	}


	public void setNumOfPhoto(int amtOfPhoto) {
		numOfPhoto = amtOfPhoto;
	}


	@Override
	public String toString() {
		return "Photo [size=" + size + ", numOfPhoto=" + numOfPhoto + "]";
	}
	
	
	
	
}

