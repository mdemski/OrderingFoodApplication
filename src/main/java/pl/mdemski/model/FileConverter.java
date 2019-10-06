package pl.mdemski.model;

import java.io.File;
import java.io.FileInputStream;

public class FileConverter {
    public static byte[] converter(String pathName) {
        File file = new File(pathName);
        byte[] bFile = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //convert file into array of bytes
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bFile;
    }
}
