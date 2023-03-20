package org.example;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Connection conn = Jsoup.connect("https://www.unah.edu.hn/");
        Document doc = conn.get();
        //System.out.println(doc.body());
        var h5 = doc.getElementsByTag("h5");

        System.out.println("h5..");
        System.out.println(h5);
    }
}