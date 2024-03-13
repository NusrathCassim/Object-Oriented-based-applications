
package ClassPackages;

import java.io.BufferedReader;
import java.io.IOException;


public class DepartmentClass  {
    public String Department;
    Filehandling depFile = new Filehandling("Department.txt");

    public DepartmentClass() {
    }
    
    public DepartmentClass(String Department) {
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
    public boolean addDepartment(){
         if(!depFile.createANewFile())
        {
            String record = Department;
           
            return depFile.writeDataToFile(record);
        }

        return false;
    }
    public String showDepartment(){
        String Department, allDep = " ";
        String[] words = null;
      
        BufferedReader bufferedReader = depFile.readAFile();
        
         try {
            while ((Department = bufferedReader.readLine()) != null)
            {     
                words = Department.split(" ");
                allDep = allDep + words[0]+ "\n";
            }
        } catch (IOException e){
            java.lang.System.err.println("Error "+e); 
        }
        
         return allDep; 
    }
}
