/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;

/**
 *
 * @author José Eduardo kaufmann e Leonardo Montiel
 */
public class Frm extends javax.swing.JFrame {

    /**
     * Creates new form Frm
     */
    public Frm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void LexicalAnalyzer() throws IOException{
        int cont = 1;
        
        String expr = (String) txtResult.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String result = "LINHA " + cont + "\t\t\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalyzerLex.setText(result);
                return;
            }
            switch (token) {
                case Line:
                    cont++;
                    result += "LINHA " + cont + "\n";
                    break;
                case Int:
                    result += "  <Reservada int>\t\t" + lexer.lexeme + "\n";
                    break;
                case Float:
                    result += "  <Reservada float>\t\t" + lexer.lexeme + "\n";
                    break;
                case Char:
                    result += "  <Reservada char>\t\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    result += "  <Reservada if>\t\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    result += "  <Reservada else>\t\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    result += "  <Reservada while>\t\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    result += "  <Reservada for>\t\t" + lexer.lexeme + "\n";
                    break;
                case Switch:
                    result += "  <Reservada switch>\t\t" + lexer.lexeme + "\n";
                    break;
                case Case:
                    result += "  <Reservada case>\t\t" + lexer.lexeme + "\n";
                    break;
                case Default:
                    result += "  <Reservada default>\t\t" + lexer.lexeme + "\n";
                    break;
                case Break:
                    result += "  <Reservada break>\t\t" + lexer.lexeme + "\n";
                    break;
                case Equal:
                    result += "  <Operador igual>\t\t" + lexer.lexeme + "\n";
                    break;
                case Op_mathematic:
                    result += "  <Operador matemático>\t\t" + lexer.lexeme + "\n";
                    break;
                case Op_increase:
                    result += "  <Operador incremento>\t\t" + lexer.lexeme + "\n";
                    break;
                case Op_relational:
                    result += "  <Operador relacional>\t\t" + lexer.lexeme + "\n";
                    break;
                case Parentheses_o:
                    result += "  <Parentêses de abertura>\t\t" + lexer.lexeme + "\n";
                    break;
                case Parentheses_c:
                    result += "  <Parentêses de fechamento>\t\t" + lexer.lexeme + "\n";
                    break;
                case Braces_o:
                    result += "  <Chave de abertura>\t\t" + lexer.lexeme + "\n";
                    break;
                case Braces_c:
                    result += "  <Chave de fechamento>\t\t" + lexer.lexeme + "\n";
                    break;
                case Brackets_o:
                    result += "  <Colchete de abertura>\t\t" + lexer.lexeme + "\n";
                    break;
                case Brackets_c:
                    result += "  <Colchete de fechamento>\t\t" + lexer.lexeme + "\n";
                    break;
                case Semicolon:
                    result += "  <Ponto e vírgula>\t\t" + lexer.lexeme + "\n";
                    break;
                case Literal:
                    result += "  <Identificador Literal>\t\t" + lexer.lexeme + "\n";
                    break;
                case Colon:
                    result += "  <Dois Pontos>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Identifier:
                    result += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Number:
                    result += "  <Número>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    result += "  <Simbolo não definido>\n";
                    break;
                default:
                    result += "  <" + lexer.lexeme + ">\n";
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalyzerLex = new javax.swing.JTextArea();
        btnAnalyzerLex = new javax.swing.JButton();
        btnClearLex = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalyzerSin = new javax.swing.JTextArea();
        btnAnalyzerSin = new javax.swing.JButton();
        btnClearSin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analisador Léxico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 36))); // NOI18N

        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        txtAnalyzerLex.setEditable(false);
        txtAnalyzerLex.setColumns(20);
        txtAnalyzerLex.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtAnalyzerLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalyzerLex);

        btnAnalyzerLex.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnAnalyzerLex.setText("Analisar");
        btnAnalyzerLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzerLexActionPerformed(evt);
            }
        });

        btnClearLex.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnClearLex.setText("Limpar");
        btnClearLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearLexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnalyzerLex)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearLex)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnalyzerLex)
                            .addComponent(btnClearLex)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analisador Sintático", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 36))); // NOI18N

        txtAnalyzerSin.setEditable(false);
        txtAnalyzerSin.setColumns(20);
        txtAnalyzerSin.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtAnalyzerSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalyzerSin);

        btnAnalyzerSin.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnAnalyzerSin.setText("Analisar");
        btnAnalyzerSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzerSinActionPerformed(evt);
            }
        });

        btnClearSin.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnClearSin.setText("Limpar");
        btnClearSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnAnalyzerSin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearSin)
                .addGap(133, 133, 133))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalyzerSin)
                    .addComponent(btnClearSin))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearLexActionPerformed
        // TODO add your handling code here:
        txtAnalyzerLex.setText(null);
    }//GEN-LAST:event_btnClearLexActionPerformed

    private void btnClearSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSinActionPerformed
        // TODO add your handling code here:
        txtAnalyzerSin.setText(null);
    }//GEN-LAST:event_btnClearSinActionPerformed

    private void btnAnalyzerLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzerLexActionPerformed
        try {
            LexicalAnalyzer();
        } catch (IOException ex) {
            Logger.getLogger(Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalyzerLexActionPerformed

    private void btnAnalyzerSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzerSinActionPerformed
        // TODO add your handling code here:
        String ST = txtResult.getText();
        Syntax s = new Syntax(new code.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            txtAnalyzerSin.setText("Analise realizada corretamente");
            txtAnalyzerSin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalyzerSin.setText("Erro de sintaxe. LINHA: " + (sym.right + 1) + " Coluna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalyzerSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAnalyzerSinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyzerLex;
    private javax.swing.JButton btnAnalyzerSin;
    private javax.swing.JButton btnClearLex;
    private javax.swing.JButton btnClearSin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalyzerLex;
    private javax.swing.JTextArea txtAnalyzerSin;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}
