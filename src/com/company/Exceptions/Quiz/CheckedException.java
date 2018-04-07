package com.company.Exceptions.Quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

        public static void main(String[] args) throws IOException {
            /*
            try {
              */


                FileReader file = new FileReader("/Users/reenamaryputhota/IdeaProjects/untitled/src/com/company/Exceptions/BlewIt.java");
                BufferedReader fileInput = new BufferedReader(file);

                // Print first 3 lines of file "C:\test\a.txt"
                while (fileInput.readLine()!=null)
                    System.out.println(fileInput.readLine());

                fileInput.close();
            /*
            }
          */



            /*
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            /* */

        }

}
