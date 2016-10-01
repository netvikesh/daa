package net.vikesh.io;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author vikesh
 */
public class EncodedWriter {
    public static void main(String[] args) {
        InputStream resourceAsStream = EncodedWriter.class.getClassLoader().getResourceAsStream("chinese.txt");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(resourceAsStream))) {
            StringBuilder text = new StringBuilder();
            String temp = null;
            while ((temp = reader.readLine()) != null) {
                text.append(temp);
            }
            //Here we need to write whatever we read in a specific encoding.
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf-8-out.txt"), Charset.forName("UTF-32"));
            Writer writer = new BufferedWriter(osw);
            writer.write(text.toString());
            writer.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
