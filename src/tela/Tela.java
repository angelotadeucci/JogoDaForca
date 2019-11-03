package tela;

import classes.JogoDaForca;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 * @author angel
 */
public class Tela extends javax.swing.JFrame {

    private JogoDaForca forca = new JogoDaForca();
    private boolean dificuldade2000Palavras;
    private boolean jogoTerminado = false;

    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Jogo da Forca");
        jLDica.setVisible(false);
        jLDicaString.setVisible(false);
        jLDicaString.setText(null);
        jLErros.setText(null);
        jLLetrasUsadas.setText(null);
        jLPalpite.setText(null);
        jLPalavra.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDDica = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBDicaSim = new javax.swing.JButton();
        jBDicaNao = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDDificuldade = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jB2000Palavras = new javax.swing.JButton();
        jB10Palavras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLImagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLogotipo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLPalavra = new javax.swing.JLabel();
        jLLetrasUsadas = new javax.swing.JLabel();
        jLPalpite = new javax.swing.JLabel();
        jLErros = new javax.swing.JLabel();
        jLDica = new javax.swing.JLabel();
        jLDicaString = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMJogo = new javax.swing.JMenu();
        jMINovoJogo = new javax.swing.JMenuItem();
        jMISair = new javax.swing.JMenuItem();
        jMAjuda = new javax.swing.JMenu();
        JMIAjuda = new javax.swing.JMenuItem();

        jLabel1.setText("Confirmar ajuda?");

        jLabel6.setText("Você não poderá pedir ajuda novamente"); // NOI18N

        jBDicaSim.setText("Sim");
        jBDicaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDicaSimActionPerformed(evt);
            }
        });

        jBDicaNao.setText("Não");
        jBDicaNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDicaNaoActionPerformed(evt);
            }
        });

        jLabel7.setText("pelas próximas duas tentativas.");

        javax.swing.GroupLayout jDDicaLayout = new javax.swing.GroupLayout(jDDica.getContentPane());
        jDDica.getContentPane().setLayout(jDDicaLayout);
        jDDicaLayout.setHorizontalGroup(
            jDDicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDDicaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDDicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDDicaLayout.createSequentialGroup()
                        .addGroup(jDDicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(66, 66, 66))
                    .addGroup(jDDicaLayout.createSequentialGroup()
                        .addComponent(jBDicaSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBDicaNao)
                        .addGap(83, 83, 83))))
        );
        jDDicaLayout.setVerticalGroup(
            jDDicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDDicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDDicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDicaSim)
                    .addComponent(jBDicaNao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("10 palavras e dicas fáceis.");

        jLabel9.setText("Com quantas palavras você quer jogar?");

        jLabel10.setText("2000+ palavras e dicas em forma de sinônimos ou"); // NOI18N

        jB2000Palavras.setText("2000+ Palavras");
        jB2000Palavras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2000PalavrasActionPerformed(evt);
            }
        });

        jB10Palavras.setText("10 Palavras");
        jB10Palavras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10PalavrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDDificuldadeLayout = new javax.swing.GroupLayout(jDDificuldade.getContentPane());
        jDDificuldade.getContentPane().setLayout(jDDificuldadeLayout);
        jDDificuldadeLayout.setHorizontalGroup(
            jDDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDDificuldadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addGroup(jDDificuldadeLayout.createSequentialGroup()
                        .addComponent(jB2000Palavras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB10Palavras)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDDificuldadeLayout.setVerticalGroup(
            jDDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDDificuldadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB2000Palavras)
                    .addComponent(jB10Palavras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/forca.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logotipo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLogotipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLogotipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setText("Palavra:");

        jLabel3.setText("Letras usadas:");

        jLabel4.setText("Último palpite:");

        jLabel5.setText("Erros restantes:");

        jLPalavra.setText("jLabel6");

        jLLetrasUsadas.setText("jLabel6");

        jLPalpite.setText("jLabel6");

        jLErros.setText("jLabel6");

        jLDica.setText("Dica:");

        jLDicaString.setText("jLabel7");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLDica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLDicaString, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLLetrasUsadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLErros)
                            .addComponent(jLPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLPalavra)
                    .addComponent(jLDica)
                    .addComponent(jLDicaString))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLLetrasUsadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLPalpite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLErros))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jToggleButton1.setText("Q");
        jToggleButton1.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("A");
        jToggleButton2.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Z");
        jToggleButton3.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("S");
        jToggleButton4.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("X");
        jToggleButton5.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("W");
        jToggleButton6.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton7.setText("V");
        jToggleButton7.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton8.setText("C");
        jToggleButton8.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton9.setText("D");
        jToggleButton9.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton10.setText("F");
        jToggleButton10.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton11.setText("R");
        jToggleButton11.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton12.setText("E");
        jToggleButton12.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton14.setText("M");
        jToggleButton14.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton15.setText("J");
        jToggleButton15.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton16.setText("K");
        jToggleButton16.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton17.setText("I");
        jToggleButton17.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton18.setText("U");
        jToggleButton18.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton19.setText("Y");
        jToggleButton19.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton20.setText("H");
        jToggleButton20.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton21.setText("N");
        jToggleButton21.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton22.setText("B");
        jToggleButton22.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton23.setText("G");
        jToggleButton23.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton24.setText("T");
        jToggleButton24.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton25.setText("L");
        jToggleButton25.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton26.setText("O");
        jToggleButton26.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton27.setText("P");
        jToggleButton27.setPreferredSize(new java.awt.Dimension(43, 32));
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jMJogo.setText("Jogo");

        jMINovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMINovoJogo.setText("Novo jogo");
        jMINovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMINovoJogoActionPerformed(evt);
            }
        });
        jMJogo.add(jMINovoJogo);

        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMJogo.add(jMISair);

        jMenuBar1.add(jMJogo);

        jMAjuda.setText("Ajuda");

        JMIAjuda.setText("Solicitar ajuda");
        JMIAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAjudaActionPerformed(evt);
            }
        });
        jMAjuda.add(JMIAjuda);

        jMenuBar1.add(jMAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMINovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINovoJogoActionPerformed
        escolherDificuldade();
    }//GEN-LAST:event_jMINovoJogoActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISairActionPerformed

    private void JMIAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAjudaActionPerformed
        jDDica.setResizable(false);
        jDDica.setTitle("Dica");
        jDDica.setSize(220, 130);
        jDDica.setLocationRelativeTo(null);
        jDDica.setVisible(true);
    }//GEN-LAST:event_JMIAjudaActionPerformed

    private void jBDicaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDicaSimActionPerformed
        jLDica.setVisible(true);
        jLDicaString.setVisible(true);
        Random rng = new Random();
        List<String> dicas = forca.getDicas();
        if (dicas.isEmpty()) {
            String dica = forca.getPalavraNormalizada();
            for (int i = 0; i < forca.getPalavraNormalizada().length(); i++) {
                if (dica.charAt(i) != forca.getPalavraCodificada()[i]) {
                    jLDicaString.setText("próxima letra: " + dica.charAt(i));
                }
            }
        } else {
            int x = rng.nextInt(dicas.size());
            for (int i = 0; i < dicas.size(); i++) {
                if (i == x) {
                    jLDicaString.setText(dicas.get(i));
                }
            }
        }
        forca.setTentativa(0);
        JMIAjuda.setEnabled(false);
        jDDica.setVisible(false);
    }//GEN-LAST:event_jBDicaSimActionPerformed

    private void jBDicaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDicaNaoActionPerformed
        jDDica.setVisible(false);
    }//GEN-LAST:event_jBDicaNaoActionPerformed

    private void jB2000PalavrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2000PalavrasActionPerformed
        dificuldade2000Palavras = true;
        jDDificuldade.setVisible(false);
        novoJogo();
    }//GEN-LAST:event_jB2000PalavrasActionPerformed

    private void jB10PalavrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB10PalavrasActionPerformed
        dificuldade2000Palavras = false;
        jDDificuldade.setVisible(false);
        novoJogo();
    }//GEN-LAST:event_jB10PalavrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        escolherDificuldade();
    }//GEN-LAST:event_formWindowOpened

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Character letra = evt.getActionCommand().toLowerCase().charAt(0);
        JToggleButton button = (JToggleButton) evt.getSource();
        if (jogoTerminado) {
            button.setSelected(false);
            return;
        }
        forca.addLetrasUsadas(letra);
        jLLetrasUsadas.setText(forca.getLetrasUsadas());
        button.setEnabled(false);
        if (forca.letraExisteNaPalavra(letra)) {
            for (int i = 0; i < forca.getPalavraNormalizada().length(); i++) {
                if (forca.getPalavraNormalizada().charAt(i) == letra) {
                    forca.addLetraNaPalavraCodificada(i, letra);
                }
            }
            String temp = imprimePalavra();
            jLPalavra.setText(temp);
            jLPalpite.setText(letra + " (Correto)");
            if (tirarEspacos(temp).matches(forca.getPalavraNormalizada())) {
                jLPalavra.setText(forca.getPalavraAcentuada());
                JOptionPane.showMessageDialog(this, "Acertou a palavra!", "Winner Winner Chicken Dinner", 0);
                jogoTerminado = true;
            }
        } else {
            forca.addErro();
            Icon icon = new ImageIcon(getClass().getClassLoader().getResource("imagens/forca" + (forca.getErros() + 1) + ".jpg"));
            jLImagem.setIcon(icon);
            jLPalpite.setText(letra + " (Errado)");
        }
        jLErros.setText("" + (-forca.getErros() + 6));
        forca.addTentativa();
        if (dificuldade2000Palavras) {
            if (forca.getTentativas() >= 2) {
                jMAjuda.setVisible(true);
                JMIAjuda.setVisible(true);
                JMIAjuda.setEnabled(true);
            }
        } else {
            if (forca.getErros() == 3) {
                jLDica.setVisible(true);
                jLDicaString.setVisible(true);
                jLDicaString.setText(forca.getDica());
            }
        }

        if (forca.getErros() == 6) {
            jMAjuda.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Você perdeu!\nA palavra era: " + forca.getPalavraAcentuada(), "Game over", 0);
            jogoTerminado = true;
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
        /*
            java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                new Tela().setVisible(true);
            }
        });
         */
    }

    //<editor-fold defaultstate="collapsed" desc="Variables">

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMIAjuda;
    private javax.swing.JButton jB10Palavras;
    private javax.swing.JButton jB2000Palavras;
    private javax.swing.JButton jBDicaNao;
    private javax.swing.JButton jBDicaSim;
    private javax.swing.JDialog jDDica;
    private javax.swing.JDialog jDDificuldade;
    private javax.swing.JLabel jLDica;
    private javax.swing.JLabel jLDicaString;
    private javax.swing.JLabel jLErros;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLLetrasUsadas;
    private javax.swing.JLabel jLPalavra;
    private javax.swing.JLabel jLPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLogotipo;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenuItem jMINovoJogo;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenu jMJogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables

    //</editor-fold>
    private void novoJogo() {
        Icon icon = new ImageIcon(getClass().getClassLoader().getResource("imagens/forca.jpg"));
        jLImagem.setIcon(icon);
        if (dificuldade2000Palavras) {
            forca.iniciarJogoCom2000Palavras();
            jMAjuda.setVisible(true);
            JMIAjuda.setVisible(true);
            JMIAjuda.setEnabled(false);
        } else {
            forca.iniciarJogoCom10Palavras();
            jMAjuda.setVisible(false);
            JMIAjuda.setVisible(false);
        }
        jLDica.setVisible(false);
        jLDicaString.setVisible(false);
        jLDicaString.setText(null);
        jLErros.setText(null);
        jLLetrasUsadas.setText(null);
        jLPalpite.setText(null);
        jLPalavra.setText(null);
        jLErros.setText("" + (-forca.getErros() + 6));
        jLPalavra.setText(imprimePalavra());
        deselecionarBotoes();
        jogoTerminado = false;
    }

    private String imprimePalavra() {
        Character[] arrayDaPalavra2 = forca.getPalavraCodificada();
        String temp2 = "";
        for (Character arrayDaPalavra21 : arrayDaPalavra2) {
            temp2 += arrayDaPalavra21 + " ";
        }
        return temp2;
    }

    private String tirarEspacos(String palavra) {
        String temp = "";
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != ' ') {
                temp += palavra.charAt(i);
            }
        }
        return temp;
    }

    private void escolherDificuldade() {
        jDDificuldade.setResizable(false);
        jDDificuldade.setTitle("Tipo de jogo");
        jDDificuldade.setSize(260, 130);
        jDDificuldade.setLocationRelativeTo(null);
        jDDificuldade.setDefaultCloseOperation(0);
        jDDificuldade.setModal(true);
        jDDificuldade.setVisible(true);
    }

    private void deselecionarBotoes() {
        jToggleButton1.setEnabled(true);
        jToggleButton10.setEnabled(true);
        jToggleButton11.setEnabled(true);
        jToggleButton12.setEnabled(true);
        jToggleButton14.setEnabled(true);
        jToggleButton15.setEnabled(true);
        jToggleButton16.setEnabled(true);
        jToggleButton17.setEnabled(true);
        jToggleButton18.setEnabled(true);
        jToggleButton19.setEnabled(true);
        jToggleButton2.setEnabled(true);
        jToggleButton20.setEnabled(true);
        jToggleButton21.setEnabled(true);
        jToggleButton22.setEnabled(true);
        jToggleButton23.setEnabled(true);
        jToggleButton24.setEnabled(true);
        jToggleButton25.setEnabled(true);
        jToggleButton26.setEnabled(true);
        jToggleButton27.setEnabled(true);
        jToggleButton3.setEnabled(true);
        jToggleButton4.setEnabled(true);
        jToggleButton5.setEnabled(true);
        jToggleButton6.setEnabled(true);
        jToggleButton7.setEnabled(true);
        jToggleButton8.setEnabled(true);
        jToggleButton9.setEnabled(true);
        
        
        jToggleButton1.setSelected(false);
        jToggleButton10.setSelected(false);
        jToggleButton11.setSelected(false);
        jToggleButton12.setSelected(false);
        jToggleButton14.setSelected(false);
        jToggleButton15.setSelected(false);
        jToggleButton16.setSelected(false);
        jToggleButton17.setSelected(false);
        jToggleButton18.setSelected(false);
        jToggleButton19.setSelected(false);
        jToggleButton2.setSelected(false);
        jToggleButton20.setSelected(false);
        jToggleButton21.setSelected(false);
        jToggleButton22.setSelected(false);
        jToggleButton23.setSelected(false);
        jToggleButton24.setSelected(false);
        jToggleButton25.setSelected(false);
        jToggleButton26.setSelected(false);
        jToggleButton27.setSelected(false);
        jToggleButton3.setSelected(false);
        jToggleButton4.setSelected(false);
        jToggleButton5.setSelected(false);
        jToggleButton6.setSelected(false);
        jToggleButton7.setSelected(false);
        jToggleButton8.setSelected(false);
        jToggleButton9.setSelected(false);
    }
}
