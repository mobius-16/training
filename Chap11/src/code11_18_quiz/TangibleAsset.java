package code11_18_quiz;

public abstract class TangibleAsset  extends Asset implements Thing{
	
	String color;
	double weight;
	
	
	public TangibleAsset(String name,int price,String color,double weight) {
														//オーバーライドを反映
		super(name,price);
		this.color = color;
								
		this.weight = weight;	//Thingをオーバーライド

	
	}
		public String getColor() {
			return this.color;
	}

		public double getWeight() {
			return weight;

		}
		public void setWeight(double weight) {this.weight=weight;}
}
