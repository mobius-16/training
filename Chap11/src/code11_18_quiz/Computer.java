package code11_18_quiz;

public class Computer extends  TangibleAsset{
	
	String makerName;

		public Computer(String name,int price,String color,double weight,String makerName){
			super(name,price,color,weight);
			this.makerName=makerName;
		}

		public String getMakerName() {
			return makerName;
		}
		public void setMakerName(String makerName) {
			this.makerName = makerName;
		}
}
