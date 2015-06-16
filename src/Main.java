import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner doc=new Scanner(System.in);
		
		Student[] a=new Student[1000];
		Student tg;
		int n;
		
		System.out.println("Input number of stundent: ");
		n=doc.nextInt();
		
		System.out.println("Nhap ten, tuoi , diem cua tung nguoi: ");
		
		for(int i=0; i<n; i++) a[i]=new Student();
		
		for(int i=0; i<n; i++) { 
			doc.nextLine();
			
			a[i].name=doc.next();
			a[i].age=doc.nextInt();
			a[i].point=doc.nextInt();
			
		}
		
		for(int i=0; i<n; i++) System.out.println(a[i].name+" "+a[i].age+" "+a[i].point);
		
		for(int i=0; i<n-1; i++) 
			for(int j=i+1; j<n; j++)
				if (a[i].point>a[j].point) {
					tg=a[i]; a[i]=a[j]; a[j]=tg;
				}
				
		System.out.println("Danh sach theo thu tu diem: ");
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i].name+" "+a[i].age+" "+a[i].point);
		}
				
	}

}
