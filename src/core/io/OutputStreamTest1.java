package core.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class OutputStreamTest1 {

    public static void main(String[] args) {
        try(FileOutputStream fout=new FileOutputStream("D:\\trainings\\Batch_20240404\\file\\testout.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);) {

            String s = "welcome to output stream";
            byte b[] = s.getBytes();//converting string into byte array
            bout.write(b);
            bout.flush();
            System.out.println("success...");
        } catch(Exception e){
            System.out.println(e);
        }

    }
}
