import java.util.Scanner;

public class GetInputFromKeyboard {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanln=new Scanner(System.in);
		
		String name="";
		int age = 0;
		
		System.out.println("Nhap Ten va Tuoi cua ban");
		
		try {
			name=scanln.nextLine();
			age=scanln.nextInt();
		}
				
        catch( Exception e ) {
			System.out.println("Error!");
		}
		
		System.out.println("Name is "+name+"!");
		System.out.println("Age is "+age+"!");
	}
}
