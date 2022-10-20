package aa;

public class StringPro {
	public static void main(String[] args) {
		
		String str="key=13,count=14|key=12,count=8|key=4,count=7";

		     String s[]=str.split("\\|");

		     int count=0;

		     String s4="";

		     System.out.println("Cnt: " + s.length);

		     for (int i = 0; i < s.length; i++) {

		         String data = s[i];

		         //System.out.println(data);

		         String [] a=data.split("=");
		       System.out.println(s[i]);

		         int g =Integer.parseInt(a[2]);

		         g=g+i+1;

		         String s3=a[0]+"="+a[1]+"="+g;
                 
		         if(i==0) {

		              s4=s3;

		         }else {

		              s4=s4+"|"+s3;

		         }
		     }
		     System.out.println("Output --"
		     		+ ""
		     		+ ""+s4);

		        
		     }

	}


