import java.util.*;
import java.io.*;

public class PropertyMain {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        p.setProperty("Brand", "Apple");
        p.setProperty("OS", "iOS");
        p.setProperty("Processor", "A14 Bionic");
        p.setProperty("Model", "iPhone 13");

        p.store(new FileOutputStream("C:/VSCode/Learn-JAVA-Programming---Beginner-to-Master/Collections/Mobile.txt"), "Mobile");
        p.storeToXML(new FileOutputStream("C:/VSCode/Learn-JAVA-Programming---Beginner-to-Master/Collections/Mobile.xml"), "Mobile");

        p.loadFromXML(new FileInputStream("C:/VSCode/Learn-JAVA-Programming---Beginner-to-Master/Collections/Cola.xml"));
        System.out.println(p.getProperty("Brand"));

        p.load(new FileInputStream("C:/VSCode/Learn-JAVA-Programming---Beginner-to-Master/Collections/Mobile.txt"));
        System.out.println(p.getProperty("Model"));
    }
}
