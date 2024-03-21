
package ClassPackages;

import java.io.BufferedReader;
import java.io.IOException;

public class EmpClass extends DepartmentClass{
    private String  EmployeeId;
    public int EPF;
    private String  EmployeeName;
    private int Age;
    private String  Address;
    private String Email;
    public String Designation;
    private int EmployeeCount;
    
    public Filehandling EmpFile = new Filehandling("EmployeeDetails.txt");

    public EmpClass() {
         super("");
    }
    public EmpClass(String designation, int EPF) {
         this.Designation = designation;
         this.EPF = EPF;
    }
   

    public EmpClass(String EmployeeId, String EmployeeName, int Age, String Address, String Email,String Department, String Designation, int EPF) {
        super(Department);
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.Age = Age;
        this.Address = Address;
        this.Email = Email;
        this.Designation = Designation;
        this.EPF = EPF;
    }
    

    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    
    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
//
//    public String getDepartment() {
//        return Department;
//    }
//
//    public void setDepartment(String Department) {
//        this.Department = Department;
//    }

    public int getEmployeeCount() {
        return EmployeeCount;
    }

    public void setEmployeeCount(int EmployeeCount) {
        this.EmployeeCount = EmployeeCount;
    }

    public int getEPF() {
        return EPF;
    }

    public void setEPF(int EPF) {
        this.EPF = EPF;
    }
    
    
    public boolean addEmployee() {
        
        if(!EmpFile.createANewFile())
        {
            String record = EmployeeId +","+ EPF+","+ EmployeeName + "," + Age + ","+Email+","+ Address+","+ Department +","+ Designation;
           
            return EmpFile.writeDataToFile(record);
        }

        return false;
    }
    
    public boolean searchEmployee ( int EPF, String Designation, String Department) 
   {
    boolean isFound = false;
    try {
        String[] words = null;
        BufferedReader bufferedReader = EmpFile.readAFile();
        String employee;
        outerloop:
        while ((employee = bufferedReader.readLine()) != null) {
            words = employee.split(",");
            int empf = Integer.parseInt(words[1]);
            if (empf == EPF) {
                isFound = true;
                this.setEmployeeId(words[0]);
                this.setEPF(empf);
                this.setEmployeeName(words[2]);
                this.setAge(Integer.parseInt(words[3]));
                this.setEmail(words[4]);
                this.setAddress(words[5]);
                this.setDepartment(words[6]);
                this.setDesignation(words[7]);
                break outerloop;
            }
        }
    } catch (IOException ex) {
        java.lang.System.out.println("Error searchEmployee " + ex);
    }
    return isFound;
}
    
        public boolean searchEmployee ( String name, int empID) 
   {
    boolean isFound = false;
    try {
        String[] words = null;
        BufferedReader bufferedReader = EmpFile.readAFile();
        String employee;
        outerloop:
        while ((employee = bufferedReader.readLine()) != null) {
            words = employee.split(",");
            int empf = Integer.parseInt(words[1]);
            if (empf == EPF) {
                isFound = true;
                this.setEmployeeId(words[0]);
                this.setEPF(empf);
                this.setEmployeeName(words[2]);
                this.setAge(Integer.parseInt(words[3]));
                this.setEmail(words[4]);
                this.setAddress(words[5]);
                this.setDepartment(words[6]);
                this.setDesignation(words[7]);
                break outerloop;
            }
        }
    } catch (IOException ex) {
        java.lang.System.out.println("Error searchEmployee " + ex);
    }
    return isFound;
}
    
    public String viewAllEmployees(){
        String Employee, allEmployee = " ";
        String[] words = null;
        int count = 0;
        BufferedReader bufferedReader = EmpFile.readAFile();
        try {
            while ((Employee = bufferedReader.readLine()) != null)
            {     
                words = Employee.split(",");
                allEmployee = allEmployee + words[0] + "\t" + words[1] + "\t" + words[2] + "\t" + words[3] +
                "\t"+words[4]+"\t"+ words[5] +"\t\t"+ words[6] + "\t"+ words[7] +"\n";             
                count++;               
            }
        } catch (IOException e){
            java.lang.System.err.println("Error "+e); 
        }

        setEmployeeCount(count);
        return allEmployee;
    }
    
}
