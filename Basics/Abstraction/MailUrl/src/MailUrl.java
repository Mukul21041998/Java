import java.net.MalformedURLException;
import java.net.URL;

public class MailUrl {

    public static void main(String args[]){

        try {
            URL url = new URL("htttp://google.com");
            System.out.println("URL Protocol is :" + url.getProtocol());

        }catch (MalformedURLException e){
            System.out.println(  e );
        }
    }
}
