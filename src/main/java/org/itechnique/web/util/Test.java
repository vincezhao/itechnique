package org.itechnique.web.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream reader = new FileInputStream("D:\\industry.txt");
        InputStreamReader isr = new InputStreamReader(reader,"GBK");
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        int i = 1;
        //Writer fw = new FileWriter(new File("D:\\out.txt"));
        while((str=br.readLine()) != null){
            String temp = "industry."+ i++ +"="+ str;
            //fw.write(temp);
            //fw.flush();
            System.out.println(temp);
        }
        //fw.close();
        reader.close();
        br.close();
    }
}
