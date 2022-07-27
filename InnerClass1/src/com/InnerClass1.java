package com;

abstract class AnonymousInner1 {
	public abstract void display();
}
public class InnerClass1 {
	private String s1="Welcome";
	class Inner{
		void display()
		{
		System.out.println(s1 +" to java From Inner class");
		}		
	}
	void method()
	{
		class InnerMeth{
			void disp(){
			System.out.println(s1 + " to java From Inner class inside  Method");
			}
		}
		InnerMeth i=new InnerMeth();
		i.disp();
	}
	public static void main(String[] args) {
		InnerClass1 in1=new InnerClass1();
		InnerClass1.Inner n2 = in1.new Inner();
		AnonymousInner1 ai=new AnonymousInner1(){
			public void display()
			{
				System.out.println("From Anonymous Inner Class");
			}
		};
		n2.display();
		in1.method();
		ai.display();
	}


}
