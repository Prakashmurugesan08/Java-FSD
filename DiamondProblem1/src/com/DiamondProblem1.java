package com;

interface Car{
	default void Lenova() {
		System.out.println("This is Car interface");
	}
	
}
interface Bike{
	default void Pulsar() {
		System.out.println("This is Bike interface");
	}
}
public class DiamondProblem1 implements Car,Bike{
    public void display() {
		Car.super.Lenova();
		Bike.super.Pulsar();

	}
    public static void main(String[] args) {
		DiamondProblem1 dp=new DiamondProblem1();
		dp.display();
	}


}
