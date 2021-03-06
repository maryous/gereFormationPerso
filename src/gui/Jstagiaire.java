/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gereFormation.dao.FormationDao;
import gereFormation.dao.StagiaireDao;
import gereFormation.modele.Formation;
import gereFormation.modele.Stagiaire;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joudar
 */
public class Jstagiaire extends javax.swing.JFrame {

    /**
     * Creates new form Jstagiaire
     */
    public Jstagiaire() {

        initComponents();
        //appeler la liste des formations ds la combobox
        List<Formation> formations = FormationDao.findAll();
        for (Formation formation : formations) {
            cbFormation.addItem(formation);

        }
    }

    //creation d'une methode pour afficher ou actualiser la table
    public void UpdateTable() {
        List<Stagiaire> stagiaires = StagiaireDao.findAll();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[9];
        for (int i = 0; i < stagiaires.size(); i++) {
            row[0] = stagiaires.get(i).getId();
            row[1] = stagiaires.get(i).getName();
            row[2] = stagiaires.get(i).getFirstname();
            row[3] = stagiaires.get(i).getAdresse();
            row[4] = stagiaires.get(i).getCode_postal();
            row[5] = stagiaires.get(i).getVille();
            row[6] = stagiaires.get(i).getEmail();
            row[7] = stagiaires.get(i).getTelephone();
            row[8] = stagiaires.get(i).getDate();
            model.addRow(row);

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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jAfficheTable = new javax.swing.JButton();
        jnomStage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAdresseStage = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbformation = new javax.swing.JLabel();
        modif = new javax.swing.JButton();
        cbFormation = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCodeP = new javax.swing.JTextField();
        jVille = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDateN = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        suppr = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPrenomStage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nom");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jAfficheTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/icons8-Database Backup-50.png"))); // NOI18N
        jAfficheTable.setText("rafraichir");
        jAfficheTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAfficheTableActionPerformed(evt);
            }
        });

        jnomStage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnomStageActionPerformed(evt);
            }
        });
        jnomStage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jnomStageKeyReleased(evt);
            }
        });

        jAdresseStage.setColumns(20);
        jAdresseStage.setRows(5);
        jScrollPane1.setViewportView(jAdresseStage);

        jLabel4.setText("nom");

        jLabel2.setText("Prénom");

        jLabel3.setText("Adresse");

        lbformation.setText("Formation");

        modif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/icons8-Restart-48.png"))); // NOI18N
        modif.setText("Modiffier");
        modif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifMouseClicked(evt);
            }
        });
        modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifActionPerformed(evt);
            }
        });

        cbFormation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFormationActionPerformed(evt);
            }
        });

        jLabel5.setText("code postale");

        jLabel6.setText("ville");

        jLabel7.setText("email");

        jLabel8.setText("Telephone");

        jCodeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodePActionPerformed(evt);
            }
        });

        jVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVilleActionPerformed(evt);
            }
        });

        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });

        jLabel9.setText("Date naissance");

        jDateN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDateNActionPerformed(evt);
            }
        });

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/icons8-Add User Group Man Man-50.png"))); // NOI18N
        save.setText("Creer");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        suppr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressource/icons8-Delete-64.png"))); // NOI18N
        suppr.setText("Supprimer");
        suppr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprMouseClicked(evt);
            }
        });
        suppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "name", "fname", "adresse", "c_postale", "ville", "email", "telephone", "DAte_n"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setFillsViewportHeight(true);
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPrenomStage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrenomStageActionPerformed(evt);
            }
        });

        jId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbformation, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jnomStage, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(348, 348, 348)
                                .addComponent(jAfficheTable))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbFormation, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateN, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCodeP, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jVille, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPrenomStage, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(save)
                        .addGap(22, 22, 22)
                        .addComponent(modif)
                        .addGap(18, 18, 18)
                        .addComponent(suppr)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jnomStage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jAfficheTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jPrenomStage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jCodeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jDateN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFormation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbformation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modif, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save)
                    .addComponent(suppr, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jAfficheTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAfficheTableActionPerformed
        UpdateTable();


    }//GEN-LAST:event_jAfficheTableActionPerformed

    private void jPrenomStageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrenomStageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrenomStageActionPerformed

    private void cbFormationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFormationActionPerformed

    }//GEN-LAST:event_cbFormationActionPerformed

    private void jnomStageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnomStageKeyReleased


    }//GEN-LAST:event_jnomStageKeyReleased

    private void jnomStageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnomStageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnomStageActionPerformed

    private void modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifActionPerformed
        jId.setVisible(false);
        int ligne = jTable1.getSelectedRow();

        
        int id = Integer.valueOf(jTable1.getModel().getValueAt(ligne, 0).toString());
        //String id = jTable1.getModel().getValueAt(ligne, 0).toString();
        String name = jnomStage.getText();
        String firstname = jPrenomStage.getText();
        String adresse = jAdresseStage.getText();
        String ville = jVille.getText();
        String code_postale = jCodeP.getText();
        String email = jemail.getText();
        String telephone = jTel.getText();
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String datenais = jDateN.getText();
        Date date_naissance =null ;
        try {
            date_naissance = df.parse(datenais); 
            
        } catch (ParseException ex) {
            
            
            
            Logger.getLogger(Jstagiaire.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        
        
        

        //ajout de la formation dans la combobox
        Formation selectedFormation = (Formation) cbFormation.getSelectedItem();
        Stagiaire s = new Stagiaire(id, name, firstname, adresse, ville, code_postale, email, telephone, date_naissance, selectedFormation);

        try {
            //int row = jTable1.getSelectedRow();
            // String value = (jTable1.getModel().getValueAt(row, 0).toString());

            StagiaireDao.update(s);
            UpdateTable();
            JOptionPane.showMessageDialog(null, "modification reussi !!");
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
            

        }
       

    }//GEN-LAST:event_modifActionPerformed

    private void modifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modifMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //recupperer une ligne de la table
        int ligne = jTable1.getSelectedRow();//on stoke le numeroe de la ligne ds la variable ligne

        String id = jTable1.getModel().getValueAt(ligne, 0).toString();

        String name = jTable1.getModel().getValueAt(ligne, 1).toString();
        String firstname = jTable1.getModel().getValueAt(ligne, 2).toString();
        String adresse = jTable1.getModel().getValueAt(ligne, 3).toString();
        String code_postale = jTable1.getModel().getValueAt(ligne, 4).toString();
        String ville = jTable1.getModel().getValueAt(ligne, 5).toString();
        String email = jTable1.getModel().getValueAt(ligne, 6).toString();
        String telephone = jTable1.getModel().getValueAt(ligne, 7).toString();

        String date_naissance = jTable1.getModel().getValueAt(ligne, 8).toString();
        jId.setText(id);
        jnomStage.setText(name);
        jPrenomStage.setText(firstname);
        jAdresseStage.setText(adresse);
        jCodeP.setText(code_postale);
        jVille.setText(ville);
        jemail.setText(email);
        jTel.setText(telephone);
        jDateN.setText(date_naissance);
    }//GEN-LAST:event_jTable1MouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        //ajouter un stagiaire avec le boutton save
        String name = jnomStage.getText();
        String firstname = jPrenomStage.getText();
        String adresse = jAdresseStage.getText();
        String ville = jVille.getText();
        String code_postale = jCodeP.getText();
        String email = jemail.getText();
        String telephone = jTel.getText();

        Date date_naissance = null;

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String datenais = jDateN.getText();

        try {
            date_naissance = df.parse(datenais);
        } catch (ParseException ex) {
            Logger.getLogger(Jstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }

        Formation selectedFormation = (Formation) cbFormation.getSelectedItem();
        // java.ut.Date sqlDate = new java.sql.Date(date_naissance.getTime());
        Stagiaire s = new Stagiaire(name, firstname, adresse, ville, code_postale, email, telephone, date_naissance, selectedFormation);

        //ajout de la formation dans la combobox
        try {

            StagiaireDao.save(s);
            UpdateTable();

            //message de diallogue
            JOptionPane.showMessageDialog(null, "stagiaire crée avec succes!!");
        } catch (Exception ex) {
            Logger.getLogger(Jstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMouseClicked

    private void supprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprActionPerformed

        try {
            int ligne = jTable1.getSelectedRow();

            int id = Integer.valueOf(jTable1.getModel().getValueAt(ligne, 0).toString());
            StagiaireDao.delete(id);
            UpdateTable();
            JOptionPane.showMessageDialog(null, "stagiaire supprimer  avec succes!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_supprActionPerformed

    private void supprMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supprMouseClicked

    private void jCodePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodePActionPerformed

    private void jVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVilleActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailActionPerformed

    private void jDateNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDateNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateNActionPerformed

    private void jIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdActionPerformed

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
            java.util.logging.Logger.getLogger(Jstagiaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jstagiaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jstagiaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jstagiaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jstagiaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Formation> cbFormation;
    private javax.swing.JTextArea jAdresseStage;
    private javax.swing.JButton jAfficheTable;
    private javax.swing.JTextField jCodeP;
    private javax.swing.JTextField jDateN;
    private javax.swing.JTextField jId;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jPrenomStage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTel;
    private javax.swing.JTextField jVille;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jnomStage;
    private javax.swing.JLabel lbformation;
    private javax.swing.JButton modif;
    private javax.swing.JButton save;
    private javax.swing.JButton suppr;
    // End of variables declaration//GEN-END:variables
}
