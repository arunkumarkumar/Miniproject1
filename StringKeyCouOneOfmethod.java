package aa;

public class StringKeyCouOneOfmethod {
	public static void main(String[] args) {
		int a[]= {1,20,2,15,3,5};
		int app = 0;
		int app1=0;
		int app2=0;
		for (int i = 0; i <a.length; i++) {
			if(i==1) {
				app=a[i]+1;
				System.out.println(app);
			}
			
				if(i==3) {
					app1=a[i]+2;
					System.out.println(app1);
				
				}
				
				if(i==5) {
					app2=a[i]+3;
					System.out.println(app2);
				}
				
			}
		
			
		}
		
	}
	

	


