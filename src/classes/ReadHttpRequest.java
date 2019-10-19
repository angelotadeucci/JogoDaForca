package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
/**
 * @author angel / Simon (MoopleDEV Ragezone?)
 */
public class ReadHttpRequest {

    public boolean failedAtCrawlPage;

    public ReadHttpRequest() {
        this.failedAtCrawlPage = false;
    }

    public boolean failedAtCrawlPage() {
        return failedAtCrawlPage;
    }
    

    public List<String> crawlPage(String palavra) { //Não criei esse método nem os próximos. Editei para fazer o que eu queria.
        List<String> palavras = new ArrayList<>();
        long timeToTake = System.currentTimeMillis();
        try {
            URL url = new URL("https://www.sinonimos.com.br/" + palavra);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setReadTimeout(10000);
            con.setConnectTimeout(10000);
            con.setDoOutput(true);

            try (BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream(),"iso-8859-1"))) {
                Scanner s = new Scanner(input);
                String temp_data = "";
                while (s.hasNext()) {
                    temp_data += s.nextLine() + "\n";
                }
                s.close();
                while (temp_data.contains("class=\"sinonimo\">")) {
                    String texto = getStringBetween(temp_data, "class=\"sinonimo\">", "</a>");
                    temp_data = trimUntil(temp_data, "</a>");
                    if (!palavras.contains(texto)) {
                        palavras.add(texto);
                    }
                }
            } finally {
                con.disconnect();
            }
        } catch (MalformedURLException mue) {
            System.out.println("Error parsing URL:");
            failedAtCrawlPage = true;
        } catch (IOException ioe) {
            System.out.println("Error reading from URL: " + ioe.getLocalizedMessage());
            failedAtCrawlPage = true;
        }

        System.out.println("Dicas carregadas " + (failedAtCrawlPage ? "sem sucesso" : "com sucesso") + " em " + ((System.currentTimeMillis() - timeToTake) / 1000.0) + " segundos");

        return palavras;
    }

    public String getStringBetween(String line, String start, String end) { //Não editado
        int start_offset = line.indexOf(start) + start.length();
        return line.substring(start_offset, line.substring(start_offset).indexOf(end) + start_offset);
    }

    public String trimUntil(String line, String until) { // Não editado
        int until_pos = line.indexOf(until);
        if (until_pos == -1) {
            return null;
        } else {
            return line.substring(until_pos + until.length());
        }
    }
}
