package cn.com.atbm.dome11;

public class PM {
	private int age;
	private char sex;
	private String name;
	private String address;
	
	private int exp;
	
	public PM(){
		super();
	}
	public PM(int age,char sex,String name,String address,int exp){
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.address = address;
		this.exp = exp;
	}
	public String toString(){
		return "PM [age="+age+",sex="+sex+"name="+name+"address="+address+"exp="+exp+"]";
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public char getsex(){
		return sex;
	}
	public void setsex(char sex){
		this.sex = sex;
	}
	public String getName(){
		return name;
	}
	public void setname(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public int getExp(){
		return exp;
	}
	public void setExp(int exp){
		this.exp =  exp;
	}
	
	//public String setName(String name){
	//	this.name = name;
	//}
	
}
