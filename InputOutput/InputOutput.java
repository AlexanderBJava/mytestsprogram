package InputOutput;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) {
        InputStream inputStream;
        OutputStream outputStream;

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in=new FileInputStream("src/from.txt");//по умолчанию читает из src
          //  in=new FileInputStream("C:\\Users\\userName\\Downloads\\testFile.txt");

            out=new FileOutputStream("to.txt");
            int c;
            c=in.read();
           while (c!=-1){
                System.out.printf("%c", c);
               out.write(c);
               c=in.read();
           }
           //  System.out.println(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }catch (IOException e){

            System.out.println("IOEx");
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
