import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.transform.stax.StAXResult;

import java.lang.StringBuilder;

public class l2FourthTask {
    
    public Stringbuilder generateString(){
        Stringbuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++ ){
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public void writer() throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("I:\\study IT\\2 quarter\\Java\\lesson2\\file.txt");
        fos.write(generateString().toString().getBytes());
        fos.close();
    }

    // public void writer() {
    //     FileOutputStream fos = null;
    //     try {
    //             fos = new FileOutputStream("I:\\study IT\\2 quarter\\Java\\lesson2\\file.txt");
    // } catch (FileNotFoundException e){
    //     e.printStackTrace();
    }
    //     fos.write(generateString().toString().getBytes());
    //     fos.close();
    // }

}


// Антон (преподаватель): Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.