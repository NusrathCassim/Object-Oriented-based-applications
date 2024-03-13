
package ClassPackages;
import java.io.*;
import java.util.ArrayList;
public class Payroll extends EmpClass{
    
    private String Payment;
    Filehandling Payroll = new Filehandling("Payroll.txt");
    public Payroll() {
        // Call the superclass constructor if necessary
        super();
        // Other initialization code for Payroll class
    }
    public Payroll(String designation, int epfNo) {
        // Call the superclass constructor with appropriate arguments
        super(designation, epfNo);
        // Other initialization code for Payroll class
    }

    public Payroll(int EPF, String Designation,String PayAmount ) {
         super(Designation, EPF);
         this.Payment = PayAmount;
    }

    public String getPayment() {
        return Payment;
    }

    public void setPayment(String Payment) {
        this.Payment = Payment;
    }
    
     public boolean UpdatePayment(){
         if(!Payroll.createANewFile())
        {
            String PaymentRecords = EPF + " " + Designation + " " + Payment;
           
            return Payroll.writeDataToFile(PaymentRecords);
        }

        return false;
    }
    
    public String ViewPayData(){
        String Payment, allpayment = " ";
        String[] words = null;
      
        BufferedReader bufferedReader = Payroll.readAFile();
       
         try {
            while ((Payment = bufferedReader.readLine()) != null)
            {     
                words = Payment.split(" ");
                allpayment = allpayment + words[0] + " \t" + words[1] + "\t\t"+ words[2]+ "\n";
            }
        } catch (IOException e){
            java.lang.System.err.println("Error "+e); 
        }
        
         return allpayment; 
    }
    
    public static String[] ReadEpf(int col, String filepath, String delimiter){
        String data[];
        String currentline;
        ArrayList<String> epfData = new ArrayList<String>();
        try{
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            while((currentline = br.readLine()) !=null)
            {
                data = currentline.split(delimiter);
                epfData.add(data[col]);
            }}
            catch(Exception e){
                    java.lang.System.err.println("Error "+e); 
            }
        return epfData.toArray(new String[0]);
                
    }
    
    
}
