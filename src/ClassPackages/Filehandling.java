
package ClassPackages;
import java.io.*;

public class Filehandling extends DataHandler{
    private static String FILE_PATH = "C:\\Users\\nusra\\OneDrive\\Documents\\NetBeansProjects\\System\\src\\";

    File file;
    private String fileName; 
    
    
     public Filehandling(String fileName) {
        this.fileName = fileName;
        
        createANewFile();
    }
          
    public boolean createANewFile() {
        try {
            file = new File(FILE_PATH + fileName);
            if (file.createNewFile()){
                java.lang.System.out.println("File Created: " + file.getName());
                return true;
            }
            
            java.lang.System.out.println("File Already Exisit !");
            return false;
        } catch(IOException e) {
            java.lang.System.out.println("Something went wrong with creating file" + e);
            return false;
        }
      }
     
     @Override
    public boolean writeDataToFile(String record) {
        try {
            file.createNewFile();
            FileWriter newWriter = new FileWriter(file, true);
            BufferedWriter newBuffer = new BufferedWriter(newWriter);

            newBuffer.write(record);
            newBuffer.newLine();
            newBuffer.close();
            newWriter.close();

            return true;
        } 
        
        catch (IOException e) {
            java.lang.System.out.println("Something went wrong with writing" + e);
            return false;
        }
    }
    @Override
    public BufferedReader readAFile() {
        if(!createANewFile()){
            try {
                FileReader reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);

                return buffer;
            } 
            
            catch (IOException e) {
                java.lang.System.out.println("Something went wrong with Reading the file" + e);
            }
        }
        
        return null;
    }
     
       public boolean removeDataFromAFile(String recordToRemove) {
        if (!file.exists()) {
            java.lang.System.out.println("File does not exist. Please create a new file.");
            return false;
        }

        File tempFile = new File(FILE_PATH + "temp_" + fileName);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.contains(recordToRemove)) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            if (file.delete()) {
                if (tempFile.renameTo(file)) {
                    java.lang.System.out.println("File updated successfully.");
                    return true;
                } else {
                    java.lang.System.out.println("Failed to update file.");
                }
            } else {
               java.lang. System.out.println("Failed to delete file.");
            }

        } catch (IOException e) {
            java.lang.System.out.println("Something went wrong with deleting data from the file" + e);
        }

        return false;
    }
     
}
