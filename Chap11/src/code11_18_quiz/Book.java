package code11_18_quiz;

public class Book extends TangibleAsset {

	String isbn;
		public Book(String name,int price,String color,double weight,String isbn) {
			super(name,price,color,weight);
			this.isbn=isbn;
		}
		public String getIsbn() {
			return isbn;
		}
}
