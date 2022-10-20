package aa;

import java.util.Scanner;

public class StringKeyCount {
	  static int v=0;
	    static String s4="";
	          public static void main(String[] args) {
	        	  String str="key=13,count=14|key=12,count=8|key=4,count=7";
	        	 String []cv=str.split("[=,,,|]");
	        	 Scanner s=new Scanner(System.in);
	        	 String rv=s.next();
	        	 for (int i = 0; i < cv.length; i++) {
					if(rv.equals(cv[i])) {
						if("count".equals(cv[2])) {
							String s1=cv[3];
							 v=Integer.parseInt(s1);
							v=v+1;
						System.out.println(v);
						}
						
					}
				
				}
	        	 
			}
}
