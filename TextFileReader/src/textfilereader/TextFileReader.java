

package textfilereader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 * @title TextFileReader
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 10-Mar-2015 10:14:48 AM
 * @purpose The purpose of this program is to
 */
public class TextFileReader {

    public static void main(String[] args) {
        String path,line;
        int test = 0;

        do {
        path=JOptionPane.showInputDialog("Input the path of the file you want to read. \nEx. 'c:\\myfile.txt'");
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(path));

             while( (line=br.readLine()) != null) {
                    System.out.println(line);  
             }
        } catch (FileNotFoundException ex) {
            test=1;

        }   catch (IOException ex) {
            System.out.println("An error has occured, try again");
            test=1;
        }} while(test==1);

    }

}
