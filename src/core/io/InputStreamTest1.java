package core.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class InputStreamTest1 {


    public static void main(String[] args) {
        try (FileInputStream fin=new FileInputStream("D:\\trainings\\Batch_20240404\\file\\testout.txt");
             BufferedInputStream bin = new BufferedInputStream(fin);) {

            int i=0;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
