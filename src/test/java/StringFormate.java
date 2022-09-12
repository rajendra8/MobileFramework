import Util.Data;
import org.junit.Test;

public class StringFormate {

    Data data=new Data();
    @Test
    public void formateString()throws Exception{
        String appiumListenerAddress =String.format("http://%s:%s/wd/hub/",data.readProperties().getProperty("ServiceIpAddress"),
                data.readProperties().getProperty("ServicePort"));

        System.out.println("AppiumListerAddress --> "+appiumListenerAddress );
    }
}
