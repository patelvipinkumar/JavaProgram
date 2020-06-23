package prototype.design.pattern;


public class Demo {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs=new BookShop();
		bs.setShopName("axz");
		bs.loadData();
	
		
		BookShop bs1=bs.clone();
		bs1.setShopName("abc");
		bs.getBooks().remove(2);
		

		System.out.println(bs);
		System.out.println(bs1);
	}

}
