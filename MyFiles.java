import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFiles{
	
	private final String path = "C:\\Users\\Admin\\eclipse-workspace\\CompanyLocker\\Files\\";
	
	public File create(String file_nm){
		String fl_nm = path + file_nm +".txt";
		File fs = new File(fl_nm);
			try {
				if(fs.createNewFile()){
					System.out.println("Created File in : "+ fs.getAbsolutePath());					
				}
				else
					System.out.println("File already exists");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return fs;
	}
	
	public void add(String file_nm){
	   File fl = create(file_nm);

	}
	
	 void delete(String file_nm){
		 String full_path = path + file_nm;
		 File fs = new File(full_path);
		 File f = new File(path);
		 String fl_nms[] = f.list();
		 boolean flag = false;
		 for(String nm :fl_nms) {
			 if(nm.equals(file_nm)) 
				flag =  fs.delete();
		 }
		 if(flag)
			 System.out.println("Deleted succesfuly");
		 else System.out.println("File not found");
	}
	public void search(String file_nm){
		 File f = new File(path);
		 String fl_nms[] = f.list();
		 boolean flag = false;
		 for(String nm :fl_nms) {
			 if(nm.equals(file_nm)) {
				 flag = true;
			 }
		 }
		 if(flag)
			 System.out.println("File Found succesfuly");
		 else System.out.println("File not Exits");
		
	}
	public void displayList(){
	    File f = new File(path);  
	    String file_nms[]=f.list();  
	    for(String filename:file_nms){  
	        System.out.println(filename);  
	    }
	}
	
	
}
