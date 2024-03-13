
package ClassPackages;

import java.io.BufferedReader;
import java.io.IOException;

public class DesignationClass {
    private String Designation;
    Filehandling DesigFile = new Filehandling("Designation.txt");

    public DesignationClass() {
    }

    
    
    public DesignationClass(String Designation) {
        this.Designation = Designation;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
    
    public boolean addDesignation(){
         if(!DesigFile.createANewFile())
        {
            String record = Designation;
           
            return DesigFile.writeDataToFile(record);
        }

        return false;
    }
   
    public String showDesignation(){
        String Designation, allDesignation = " ";
        String[] words = null;
      
        BufferedReader bufferedReader = DesigFile.readAFile();
        
         try {
            while ((Designation = bufferedReader.readLine()) != null)
            {     
                words = Designation.split(" ");
                allDesignation = allDesignation + words[0] + "\n";
            }
        } catch (IOException e){
            java.lang.System.err.println("Error "+e); 
        }
        
         return allDesignation; 
    }
}
