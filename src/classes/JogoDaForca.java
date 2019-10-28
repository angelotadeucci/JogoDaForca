package classes;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author angel https://github.com/angelotadeucci/JogoDaForca
 */
public class JogoDaForca {

    private String palavraNormalizada;
    private Character[] palavra2;
    private int tentativas, erros;
    private List<Character> letrasUsadas;
    private List<String> dicas;
    private String palavraAcentuada;

    public JogoDaForca() throws NullPointerException {
        this.letrasUsadas = new ArrayList<>();
        this.palavraAcentuada = lerPalavras();
        this.palavraNormalizada = Normalizer.normalize(palavraAcentuada, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        this.tentativas = 0;
        this.erros = 0;
        this.palavra2 = setPalavra2();
        this.dicas = createDicas();
    }

    public String getPalavraNormalizada() {
        return palavraNormalizada;
    }

    public String getPalavraAcentuada() {
        return palavraAcentuada;
    }

    public List<String> getDicas() {
        return dicas;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public void addErro() {
        this.erros += 1;
    }

    public Character[] getPalavra2() {
        return palavra2;
    }

    public void addPalavra2(int pos, char letra) {
        palavra2[pos] = letra;
    }

    private String lerPalavras() throws NullPointerException {
        String fileName = "palavras.txt";
        List<String> palavras = new ArrayList<>();
        Random random = new Random();
        int rng = random.nextInt(2396);
        try {
            FileReader fileReader = new FileReader(fileName);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    palavras.add(line);
                }
                bufferedReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não existe '" + fileName + "'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return palavras.get(rng);
    }

    public int getTentativas() {
        return tentativas;
    }

    public void addTentativa() {
        this.tentativas += 1;
    }

    public void setTentativa(int x) {
        this.tentativas = x;
    }

    public boolean letraExisteNaPalavra(char x) {
        for (int i = 0; i < palavraNormalizada.length(); i++) {
            if (palavraNormalizada.charAt(i) == x) {
                return true;
            }
        }
        return false;
    }

    public String getLetrasUsadas() {
        StringBuilder reString = new StringBuilder();
        for (int i = 0; i < letrasUsadas.size(); i++) {
            reString.append(letrasUsadas.get(i)).append(" - ");
        }
        return reString.toString();
    }

    public boolean addLetrasUsadas(Character letra) {
        if (!letrasUsadas.contains(letra)) {
            letrasUsadas.add(letra);
            return true;
        }
        return false;
    }

    private List<String> createDicas() {
        return ReadHttp.failedAtCrawlPage() ? null : ReadHttp.crawlPage(palavraNormalizada);
    }

    private Character[] setPalavra2() {
        Character[] arrayDaPalavra2 = new Character[palavraAcentuada.length()];
        for (int i = 0; i < arrayDaPalavra2.length; i++) {
            if (palavraNormalizada.charAt(i) == '-') {
                arrayDaPalavra2[i] = '-';
            } else {
                arrayDaPalavra2[i] = '_';
            }
        }
        return arrayDaPalavra2;
    }
}
