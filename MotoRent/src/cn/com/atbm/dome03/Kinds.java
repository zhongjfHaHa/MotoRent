package cn.com.atbm.dome03;

public class Kinds extends  ManKind{
		private int yearsOld;
		
		public void prinAge(){
			System.out.println(yearsOld);
		}
		
		public int getYearOld(){
			return yearsOld;
		}
		
		public void setYearsOld(int yearsOld){
			this.yearsOld= yearsOld;
		}
		
		public static void main(String[] args){
			kids somekid = new kids();
			somekid.setSex(1);
			someKid.setSalary(8000);
			someKid.employeed();
		}
}
