package com;

import java.util.Scanner;

class Regular{
    String ip="(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    String pattern=ip + "\\." + ip + "\\." + ip + "\\." + ip;
}
public class RegularExpression1 {
	public static void main(String[] args) {

		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the valid IP  Address:");
        while(s.hasNext())
        {
            String IpAddress= s.next();
            System.out.println(IpAddress.matches(new Regular().pattern));
        }

}

}
