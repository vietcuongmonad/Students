import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Scanner doc=new Scanner(System.in);
		
		String[] a= new String[1000];
		int[] b=new int[1000];
		int[] c=new int[1000];
		String tg="";
		int n,temp;
		
		System.out.println("Input number of stundent: ");
		n=doc.nextInt();
		
		System.out.println("Nhap ten, tuoi , diem cua tung nguoi: ");
		
		for(int i=0; i<n; i++) {
			doc.nextLine();
			
			a[i]=doc.next();	
			b[i]=doc.nextInt();
			c[i]=doc.nextInt();
		}
		
		for(int i=0; i<n-1; i++) 
			for(int j=i+1; j<n; j++)
				if (c[i]>c[j]) {
					tg=a[i]; a[i]=a[j]; a[j]=tg;
					temp=b[i]; b[i]=b[j]; b[j]=temp;
					temp=c[i]; c[i]=c[j]; c[j]=temp;
				}
				
		System.out.println("Danh sach theo thu tu diem: ");
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i]+" "+b[i]+" "+c[i]);
		}
				
	}

}
