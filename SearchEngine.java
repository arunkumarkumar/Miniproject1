package aa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.Stack;

public class SearchEngine {
	
	static String search1="";
	static Stack seareng=new Stack();
	static String s;
	public static void main(String[] args) {
		try {
		System.out.println("Welcome to A SEARCH-ENGINE");
		Scanner sc=new Scanner(System.in);
		String search="";
		
		boolean yu=true;
		while(yu) {
			System.out.println("if you want searching click YES otherwise click NO");
			 search=sc.next();
			 if(search.equalsIgnoreCase("yes")) {
				 System.out.println("SEARCH OR TYPE ANY URL");
				 search1=sc.next();
				 seareng.push(search1);
				 if(search1.equalsIgnoreCase("java")) {
					 System.err.println("Java is a high-level, class-based, object-oriented programming language"+"\n"+"that is designed to have as few implementation dependencies as possible.");
				 }
				 else if(search1.equalsIgnoreCase("mysql")) {
					 System.err.println("SQL is a domain-specific language used in programming and designed for managing data held in a relational database management system,or"+"\n"+"for stream processing in a relational data stream management system.");
				 }
				 else if(search1.equalsIgnoreCase("google")) {
					 System.err.println("Google LLC is an American multinational technology company that focuses on search engine technology, online advertising,"+"\n"+" cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics.");
				 }
				 else if(search1.equalsIgnoreCase("c")) {
					 System.err.println("C is a general-purpose computer programming language. It was created in the 1970s by Dennis Ritchie,"+"\n"+" and remains very widely used and influential. By design, C's features cleanly reflect the capabilities of the targeted CPUs.");
				 }
				 else if(search1.equalsIgnoreCase("fb")) {
					 System.err.println("Facebook is an online social media and social networking service owned by American company Meta Platforms.");
				 }
				 else if(search1.equalsIgnoreCase("insta")) {
					 System.err.println("Instagram is a photo and video sharing social networking service owned by American company Meta Platforms. The app allows users to upload media that can be edited with filters and organized by hashtags and geographical tagging."+"\n"+"Posts can be shared publicly or with preapproved followers.");
				 }
				 else if(search1.equalsIgnoreCase("twitter")) {
					 System.err.println("Twitter, Inc. is an American communications company based in San Francisco, California. The company operates the microblogging and social networking service Twitter."+"\n"+" It previously operated the Vine short video app and Periscope livestreaming service.");
				 }
				 System.out.println(seareng);
			 }
			 else {
				 System.out.println("Thank you for using our Service");
				 yu=false;
			 }
		}
		for(int i = 0;i<seareng.size();i++) {
			for(int j=i+1;j<seareng.size();j++) {
			if(seareng.get(i).equals(seareng.get(j))) {
			seareng.remove(i);
			if (i>0) {
				i=-1;
			}
			}
			}    	
		}
		System.out.println(seareng);
	
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con= DriverManager.getConnection("jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022","sa","P@ssw0rd");
			PreparedStatement stmt= con.prepareStatement("insert into searacti values(?,?)");
			stmt.setString(1,  search1);
			s=(String) seareng.pop();
			stmt.setString(2,s);
			System.out.println();
			int s1=stmt.executeUpdate();
			System.out.println(s1);
			} catch (Exception e) {
			e.printStackTrace();
	}

		System.err.println("RECENT SERACH ACTIVITIES ----->"+" "+s);
}
}