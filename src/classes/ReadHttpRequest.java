package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author angel
 */
public class ReadHttpRequest {

    public static Object[] crawlPage(String palavra) { //recursive method
        List<String> palavras = new ArrayList<>();
        try {
            URL url = new URL("https://www.sinonimos.com.br/" + palavra);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setReadTimeout(5000);
            con.setConnectTimeout(5000);
            con.setRequestProperty("Content-Language", "pt-BR");
            con.setRequestMethod("GET");
            con.setDoOutput(true);

            StringBuilder content;
            try (BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                Scanner s = new Scanner(input);
                String temp_data = "";
                while (s.hasNext()) {
                    temp_data += s.nextLine() + "\n";
                }
                s.close();
                while (temp_data.contains("class=\"sinonimo\">")) {
                    String texto = getStringBetween(temp_data, "class=\"sinonimo\">", "</a>");
                    temp_data = trimUntil(temp_data, "</a>");
                    palavras.add(texto);
                }
            } finally {
                con.disconnect();
            }

        } catch (MalformedURLException mue) {
            System.out.println("Error parsing URL:");
        } catch (IOException ioe) {
            System.out.println("Error reading from URL: " + ioe.getLocalizedMessage());
        }
        return palavras.toArray();
    }

    public static String getStringBetween(String line, String start, String end) {
        int start_offset = line.indexOf(start) + start.length();
        return line.substring(start_offset, line.substring(start_offset).indexOf(end) + start_offset);
    }

    public static String trimUntil(String line, String until) {
        int until_pos = line.indexOf(until);
        if (until_pos == -1) {
            return null;
        } else {
            return line.substring(until_pos + until.length());
        }
    }
}
