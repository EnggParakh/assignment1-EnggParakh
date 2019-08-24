/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;
import java.util.*;
public class Gravity {
	public static void main(String[] args) {
		System.out.println("Please Enter the Time");
		Scanner scanner=new Scanner(System.in);
		double time=scanner.nextDouble();
		double Gravity=9.8;
		double Speed=0.5*Gravity*time*time;
		System.out.println("Speed of the object at " + time + " seconds after its release is " + Gravity*time + " and the distance has travelled in the " + time + " seconds after the release is " + Speed);
	}
}
