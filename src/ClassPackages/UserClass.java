
package ClassPackages;
import java.io.BufferedReader;
import java.io.IOException;

public class UserClass {
    Filehandling file = new Filehandling("loginDetail.txt");
        

    
    private String UserId; 
    private String Password; 
    private String UserType;
    private int userCount;

    public UserClass() {
    }
    public UserClass(String UserId, String Password, String UserType) {
        this.UserId = UserId;
        this.Password = Password;
        this.UserType = UserType;
    }
    public UserClass(String UserId, String Password) {
        this.UserId = UserId;
        this.Password = Password;
       
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }
    
    public boolean addNewUser() {
        if(!file.createANewFile()){
            String record = UserId + " " + Password+ " " + UserType ;
            
            return file.writeDataToFile(record);
        }

        return false;
    }
    public boolean validateLogin() {
        try {
            String[] words = null;
            
            BufferedReader users = file.readAFile();
            String user;

            while ((user = users.readLine()) != null) //admin 1234 Admin
            {              
                words = user.split(" "); // [0]=admin [1]=1234 [2]=Admin

                if (words[0].equals(UserId) && words[1].equals(Password)&&words[2].equals(UserType)){
                    this.setUserId(words[0]);
                    this.setPassword(words[1]);
                    this.setUserType(words[2]);
                    return true;
                }
                
            }
        } catch (IOException e)
        {
            java.lang.System.err.println("Error validating Login");
        }
        
        return false;
    }
    public String viewAllUsers () 
        {
        String User, allUsers = " ";
        String[] words = null;
        int count = 0;

        BufferedReader bufferedReader = file.readAFile();

        try {
            while ((User = bufferedReader.readLine()) != null) {    
                words = User.split(" ");
                allUsers = allUsers + words[0] +  "\t" +  words[2] + "\n";
                count++;
            }
        } catch (IOException e)
        {
            java.lang.System.err.println("Error Viewing all Users"+e);
        }
        
        setUserCount(count);
        return allUsers;
        }
    
    
}
