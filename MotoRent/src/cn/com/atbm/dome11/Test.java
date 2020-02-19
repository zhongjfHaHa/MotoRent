package cn.com.atbm.dome11;

public class Test {
	public static  void main(String[] args){
		SE se= new SE(19,'ÄÐ',"Jack","±±¾©ÊÐ",90);
		String info  = se.toString();
		System.out.println(info);
		
		//new PM(23,'ÄÐ',"¸Ç´Ä","»ªÊ¢¶Ù",30);
		 PM pm = new PM(23,'ÄÐ',"¸Ç´Ä","»ªÊ¢¶Ù",5);
		 String pm = pm.toString();
		
		
		
	}
}
