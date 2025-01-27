package code11_18_quiz;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Book b =new Book("Hojoki",1000,"green",100.0,"1111");
		System.out.println("タイトル："+b.getName());
		System.out.println("重量:"+b.getWeight());
		Computer c=new Computer("Vostro",70000,"silver",2000.0,"DELL");
		System.out.println("本体色："+c.getColor());
		System.out.println("重量:"+c.getWeight());
	}

}
