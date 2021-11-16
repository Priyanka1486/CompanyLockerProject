import java.util.*;
public class UserInteraction {
	
	public void basicOperation(MyFiles fl_obj) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		try {
			do {
				System.out.println("Please enter the operation what you want to do?");
				System.out.println("1. Add a File");
				System.out.println("2. Delete a File");
				System.out.println("3. Search a File");
				System.out.println("4. Back to main Menu");
				int option = scan.nextInt();
				String file_nm;
				if((option<0)||(option >= 5)) {
					System.out.println("Please choose valid Operation");	
				}			
				switch(option) {
				case 1:
					System.out.println("Enter the File Name to Add");
					file_nm = scan.next();
					if((file_nm.indexOf('/')==-1)&&(file_nm.indexOf('\\')==-1)){
						fl_obj.add(file_nm);
					}
					else {
						System.out.println("Enter file name correctly.");
					}
					break;
				case 2:
					System.out.println("Enter the File Name to Delete.");
					file_nm = scan.next();
					fl_obj.delete(file_nm);
					break;
				case 3:
					System.out.println("Enter the File Name to Search.");
					file_nm = scan.next();	
					fl_obj.search(file_nm);
					break;
				case 4 :
					mainMenu(fl_obj);
					flag  = false;
					break;							
				}
			}while(flag);			
		}catch(InputMismatchException e) {
			System.out.println("Its an Exception Please choose valid Operation");				 
		}				
	}
	
	public void mainMenu(MyFiles fl_obj){
		Scanner scan = new Scanner(System.in);		
		boolean exit_flag = false;		
		try {
			do {			
				System.out.println("Please enter the Option : ");
				System.out.println("1. Retrive Files");
				System.out.println("2. Perform buisness Operations");
				System.out.println("3. Close Application");
					int option = scan.nextInt();			
					if((option<0)||(option >= 4)) {
						System.out.println("Please choose valid Option.");							
					}			
					switch(option) {
						case 1: 
							System.out.println("Files in directory are : ");
							fl_obj.displayList();	
							break;
						case 2:
							basicOperation(fl_obj);
							exit_flag = true; 
							break;
						case 3:
							System.out.println("Application is closed");
							exit_flag = true;			
							break;		
					}
			}while(!exit_flag);
		}catch(InputMismatchException e) {
			System.out.println("Its an Exception Please choose valid Option.");				 
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		System.out.println("Applciation Name: Company Locker ");
		System.out.println("Developer Details : Priyanka Pandit");
		MyFiles fl_obj = new MyFiles();
		UserInteraction obj = new UserInteraction();
		obj.mainMenu(fl_obj);
	}
}
