/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackages;

import java.io.BufferedReader;

public abstract class DataHandler {
    public abstract boolean writeDataToFile(String record);
    public abstract BufferedReader readAFile();
}