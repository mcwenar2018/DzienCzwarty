package pl.edu.wszib.bledy;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionExample {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionExample cee = new CheckedExceptionExample();
        cee.urlTesterByTryCatch("hxttp://wszib.edu.pl");

        cee.urlTesterByThrows("http://wszib.edu.pl");

    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protokol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("++++++++++++++++++++++");
            e.printStackTrace();
        }
    }

    public void urlTesterByThrows(String urlStr)throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protokol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }


}


