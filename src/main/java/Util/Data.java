package Util;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Data {

    public Properties readProperties() throws Exception{

        FileReader reader = new FileReader("./src/main/resources/EnvSetup.properties");
        Properties p = new Properties();
        p.load(reader);
        System.out.println(p.getProperty("NodeLocation"));
        System.out.println(p.getProperty("AppiumLocation"));
        return p;
    }


    public void osName(){
        File classPathRoot = new File(System.getProperty("user.dir"));
        String osName = System.getProperty("os.name");
        System.out.println("classPathRoot --> " +classPathRoot);
        System.out.println("osName --> " +osName);

    }
}
