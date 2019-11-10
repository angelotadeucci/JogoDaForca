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

    private String palavraAcentuada;
    private String palavraNormalizada;
    private Character[] palavraCodificada;
    private int tentativas, erros;
    private List<Character> letrasUsadas;
    private List<String> dicas;
    private List<Palavra> palavra = new ArrayList<>();
    private List<String> palavras = new ArrayList<>();
    private Random rng = new Random();
    private String dica;
    private List<String> palavrasUsadas = new ArrayList<>();

    public JogoDaForca() {
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

    public Character[] getPalavraCodificada() {
        return palavraCodificada;
    }

    public void addLetraNaPalavraCodificada(int pos, char letra) {
        palavraCodificada[pos] = letra;
    }

    private void lerPalavras() {
        String fileName = "palavras.txt";
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

    private List<String> criarDicas() {
        ReadHttp.crawlPage(palavraNormalizada);
        return ReadHttp.failedAtCrawlPage() ? null : ReadHttp.getPalavras();
    }

    private Character[] setPalavraCodificada() {
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
    

    public void iniciarJogoCom2000Palavras() {
        if (palavras.isEmpty()) {
            lerPalavras();
        }
        int x = rng.nextInt(palavras.size());
        while (palavrasUsadas.contains(palavras.get(x))) {
            if (palavrasUsadas.containsAll(palavras)) {

                break;
            }
            x = rng.nextInt(palavras.size());
        }

        this.letrasUsadas = new ArrayList<>();
        this.palavraAcentuada = palavras.get(x);
        palavrasUsadas.add(palavraAcentuada);
        this.palavraNormalizada = Normalizer.normalize(palavraAcentuada, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        this.tentativas = 0;
        this.erros = 0;
        this.palavraCodificada = setPalavraCodificada();
        NewThread myThread = new NewThread();
        myThread.start();
    }

    public void iniciarJogoCom10Palavras() {
        if (palavra.isEmpty()) {
            criarListDePalavra();
        }
        int x = rng.nextInt(palavra.size());
        while (palavrasUsadas.contains(palavra.get(x).getPalavra())) {
            if (palavrasUsadas.containsAll(palavra)) {
                palavrasUsadas.clear();
                break;
            }
            x = rng.nextInt(palavra.size());
        }
        this.letrasUsadas = new ArrayList<>();
        this.palavraAcentuada = palavra.get(x).getPalavra();
        palavrasUsadas.add(palavraAcentuada);
        this.palavraNormalizada = Normalizer.normalize(palavraAcentuada, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        this.tentativas = 0;
        this.erros = 0;
        this.palavraCodificada = setPalavraCodificada();
        this.dica = palavra.get(x).getDica();
    }

    public String getDica() {
        return dica;
    }

    private List<String> palavrasStrings = new ArrayList<String>() {
        {
            add("Catástrofe");
            add("Declarar");
            add("Xadrez");
            add("Enferrujado");
            add("Chocalho");
            add("Silenciador");
            add("Aritmética");
            add("Caracol");
            add("Converter");
            add("Cabana");
        }
    };
    private List<String> dicasStrings = new ArrayList<String>() {
        {
            add("acontecimento desastroso.");
            add("tornar público.");
            add("é um esporte.");
            add("oxidação do ferro.");
            add("produz som ao sacudir-se.");
            add("supressor de ruído.");
            add("Um ramo da matemática.");
            add("molusco gastrópode.");
            add("Transformar.");
            add("Moradia artesanal.");
        }
    };

    private void criarListDePalavra() {
        for (int i = 0; i < palavrasStrings.size(); i++) {
            palavra.add(new Palavra(palavrasStrings.get(i).toLowerCase(), dicasStrings.get(i).toLowerCase()));
        }
    }

    private boolean containsAllWords() {
        return palavrasUsadas.containsAll(palavrasStrings);
    }

    public class NewThread extends Thread {

        @Override
        public void run() {
            System.out.println("Criando dicas");
            dicas = criarDicas();
            stop();
            interrupt();
        }
    }
}
