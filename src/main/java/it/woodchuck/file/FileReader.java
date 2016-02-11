package it.woodchuck.file;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Catramos on 09/02/2016.
 */
public class FileReader extends JPanel {


    public  File chooseFile(){
        final JFileChooser fc = new JFileChooser();
        int choosed = fc.showOpenDialog(FileReader.this);
        File f = fc.getSelectedFile();
        return f;
    }


    public  String fileToString(File f) throws FileNotFoundException {
        StringBuffer stringBuffer = new StringBuffer();
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()){
            stringBuffer.append(scanner.next());
        }
        return stringBuffer.toString();
    }

    public void writeToFile(String output){

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("output.txt"), "utf-8"))) {
            writer.write(output);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
