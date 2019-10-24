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
 * @author angel
 */
public class JogoDaForca {

    private String palavraNormalizada;
    private Character[] palavra2;
    private int tentativas, erros;
    private List<Character> letrasUsadas;
    private List<String> dicas;
    private ReadHttp httpRequest;
    private String palavraAcentuada;

    public JogoDaForca() throws NullPointerException {
        this.letrasUsadas = new ArrayList<>();
        this.palavraAcentuada = lerPalavras();
        this.palavraNormalizada = Normalizer.normalize(palavraAcentuada, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        this.tentativas = 0;
        this.erros = 0;
        this.palavra2 = setPalavra2();
        this.httpRequest = new ReadHttp();
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
        String resultado = null;
        Random random = new Random();
        int rng = random.nextInt(2396);
        try {
            FileReader fileReader = new FileReader(fileName);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                do {
                    for (int i = 0; i < rng; i++) {
                        resultado = bufferedReader.readLine();
                    }
                    if (resultado == null) {
                        break;
                    }
                    try {
                        resultado = resultado.length() < 5 ? null : resultado;
                    } catch (Exception e) {
                        resultado = null;
                    }
                } while (resultado == null);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não existe '" + fileName + "'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resultado;
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
        boolean resultado = false;
        for (int i = 0; i < palavraNormalizada.length(); i++) {
            if (palavraNormalizada.charAt(i) == x) {
                return true;
            }
        }

        return resultado;
    }

    public String getLetrasUsadas() {
        StringBuilder reString = new StringBuilder();
        for (int i = 0; i < letrasUsadas.size(); i++) {
            reString.append(letrasUsadas.toArray()[i]).append(" - ");
        }
        return reString.toString();
    }

    public Object[] getArrayLetrasUsadas() {
        return letrasUsadas.toArray();
    }

    public boolean addLetrasUsadas(Character letra) {
        if (!letrasUsadas.contains(letra)) {
            letrasUsadas.add(letra);
            return true;
        }
        return false;
    }

    private List<String> createDicas() {
        return httpRequest.failedAtCrawlPage() ? null : httpRequest.crawlPage(palavraNormalizada);
    }

    private Character[] setPalavra2() {
        Character[] arrayDaPalavra2 = new Character[palavraAcentuada.length()];
        for (int i = 0; i < arrayDaPalavra2.length; i++) {
            arrayDaPalavra2[i] = '_';
        }
        return arrayDaPalavra2;
    }
}
