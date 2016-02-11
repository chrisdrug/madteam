package it.woodchuck;

import it.woodchuck.file.FileReader;

import java.io.FileNotFoundException;

/**
 * Created by Catramos on 09/02/2016.
 */
public class QuiParteTutto {


    public static void main(String [] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader();

        String inputString = fileReader.fileToString(fileReader.chooseFile());

        inputString.split("/n");



    }

}
