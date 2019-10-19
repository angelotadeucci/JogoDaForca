package tela;

import classes.JogoDaForca;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author angel
 */
public class Tela extends javax.swing.JFrame {

    private JogoDaForca forca;

    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Jogo da Forca");
        novoJogo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMJogo = new javax.swing.JMenu();
        jMINovoJogo = new javax.swing.JMenuItem();
        jMISair = new javax.swing.JMenuItem();
        jMAjuda = new javax.swing.JMenu();
        JMIAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLogotipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLogotipoMouseClicked(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLogotipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogotipoMouseClicked
        if (!jLogotipo.isEnabled()) {
            return;
        }
        String input = JOptionPane.showInputDialog(this, "Digite uma letra", "Letra", 1);
        if (input == null) {
            return;
        }
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite alguma letra!", "Aviso", 1);
            return;
        }
        if (input.length() > 1) {
            JOptionPane.showMessageDialog(this, "Digite somente uma letra!", "Aviso", 1);
            return;
        }
        Character letra = input.charAt(0);
        Object[] arraysDeLetras = forca.getArrayLetrasUsadas();
        for (int i = 0; i < arraysDeLetras.length; i++) {
            if (arraysDeLetras[i] == letra) {
                JOptionPane.showMessageDialog(this, "Esta letra já foi usada!", "Erro", 0);
                return;
            }
        }
        forca.addLetrasUsadas(letra);
        jLLetrasUsadas.setText(forca.getLetrasUsadas());
        if (forca.letraExisteNaPalavra(letra)) {
            for (int i = 0; i < forca.getPalavra().length(); i++) {
                if (forca.getPalavra().charAt(i) == letra) {
                    forca.addPalavra2(i, letra);
                }
            }
            String temp2 = imprimePalavra();
            jLPalavra.setText(temp2);
            jLPalpite.setText(letra + " (Correto)");
            if (temp2.matches(forca.getPalavra())) {
                jLogotipo.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Acertou a palavra!", "Winner winner chicken dinner", 0);
            }
        } else {
            forca.addErro();
            Icon icon = new ImageIcon(getClass().getClassLoader().getResource("imagens/forca" + (forca.getErros() + 1) + ".jpg"));
            jLImagem.setIcon(icon);
            jLPalpite.setText(letra + " (Errado)");
        }
        jLErros.setText("" + (-forca.getErros() + 6));
        forca.addTentativa();
        if (forca.getTentativas() >= 2) {
            JMIAjuda.setEnabled(true);
        }
        if (forca.getErros() == 6) {
            jLogotipo.setEnabled(false);
            jMAjuda.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Você perdeu!\nA palavra era: " + forca.getPalavra(), "Game over", 0);
        }
    }//GEN-LAST:event_jLogotipoMouseClicked

    private void jMINovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINovoJogoActionPerformed
        novoJogo();
    }//GEN-LAST:event_jMINovoJogoActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISairActionPerformed

    private void JMIAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAjudaActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Confirmar ajuda?\nVocê não poderá pedir ajuda novamente pelas próximas duas tentantivas.", "Ajuda ", 1);
        if (input > 1) {
            return;
        }
        jLDica.setVisible(true);
        jLDicaString.setVisible(true);
        Random rng = new Random();
        List<String> dicas = forca.getDicas();
        if (dicas.isEmpty()) {
            jLDicaString.setText("Falha ao prover dicas.");
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
    }//GEN-LAST:event_JMIAjudaActionPerformed

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
    private javax.swing.JLabel jLDica;
    private javax.swing.JLabel jLDicaString;
    private javax.swing.JLabel jLErros;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLLetrasUsadas;
    private javax.swing.JLabel jLPalavra;
    private javax.swing.JLabel jLPalpite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLogotipo;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenuItem jMINovoJogo;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenu jMJogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    //</editor-fold>
    private void novoJogo() {
        Icon icon = new ImageIcon(getClass().getClassLoader().getResource("imagens/forca.jpg"));
        for (int i = 0; i < 10;) {
            try {
                forca = new JogoDaForca();
                break;
            } catch (NullPointerException ex) {
                i++;
            }
        }
        jLDica.setVisible(false);
        jLDicaString.setVisible(false);
        jLErros.setText("" + (-forca.getErros() + 6));
        jLLetrasUsadas.setText(null);
        jLPalpite.setText(null);
        jLImagem.setIcon(icon);
        jLogotipo.setEnabled(true);
        jLPalavra.setText(imprimePalavra());
        JMIAjuda.setEnabled(false);
    }

    private String imprimePalavra() {
        Character[] arrayDaPalavra2 = forca.getPalavra2();
        String temp2 = "";
        for (int i = 0; i < arrayDaPalavra2.length; i++) {
            if (arrayDaPalavra2[i] == null) {
                temp2 += "_ ";
            } else if (arrayDaPalavra2[i].toString() == " ") {
                temp2 += "  ";
            } else if (arrayDaPalavra2[i].toString() == "-") {
                temp2 += "- ";
            } else {
                temp2 += arrayDaPalavra2[i];
            }
        }
        return temp2;
    }
}
