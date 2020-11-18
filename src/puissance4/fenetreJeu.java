/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puissance4;
import java.util.Random;
/**
 *
 * @author cheraude
 */
public class fenetreJeu extends javax.swing.JFrame {

    Joueur ListeJoueurs [] = new Joueur [2];
    Grille grilleJeu = new Grille();
    Joueur joueurCourant;
    
    /** Creates new form fenetreJeu */
    public fenetreJeu() {
        initComponents();
        panneau_infos_joueurs.setVisible(false);
        panneau_info_partie.setVisible(false);
        
        for(int i=5; i>=0; i--){
            for(int j=0; j<7; j++){
                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.cellules[i][j]);
                panneau_grille.add(cellGraph);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_infos_joueurs = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_j2_name = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_j1_name1 = new javax.swing.JLabel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        btn_col_6 = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(102, 102, 102));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 672, 574));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 255));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom joueur 1 : ");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setText("Nom joueur 2 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        nom_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur2ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, -1));

        btn_start.setText("Démarrer partie ");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 290, 130));

        panneau_infos_joueurs.setBackground(new java.awt.Color(204, 255, 255));
        panneau_infos_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Couleur : ");
        panneau_infos_joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel6.setText("Désintégrateurs : ");
        panneau_infos_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lbl_j1_couleur.setText("couleurjoueur1");
        panneau_infos_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        lbl_j1_desint.setText("nbdesintjoueur1");
        panneau_infos_joueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));
        panneau_infos_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 10));

        jLabel7.setText("Joueur 2 :");
        panneau_infos_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel8.setText("Couleur : ");
        panneau_infos_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel9.setText("Désintégrateurs : ");
        panneau_infos_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        lbl_j2_name.setText("nomjoueur2");
        panneau_infos_joueurs.add(lbl_j2_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        lbl_j2_couleur.setText("couleurjoueur2");
        panneau_infos_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        lbl_j2_desint.setText("nbdesintjoueur2");
        panneau_infos_joueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Infos Joueurs ");
        panneau_infos_joueurs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel11.setText("Joueur 1 :");
        panneau_infos_joueurs.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lbl_j1_name1.setText("nomjoueur1");
        panneau_infos_joueurs.add(lbl_j1_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        getContentPane().add(panneau_infos_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 290, 280));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 255));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Infos Jeu ");
        panneau_info_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel4.setText("Joueur courant :");
        panneau_info_partie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lbl_jcourant.setText("lbl_jcourant");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, 70));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 290, 160));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 40, -1, -1));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 40, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 40, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 40, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 40, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        setBounds(0, 0, 1044, 702);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_infos_joueurs.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    private void nom_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur2ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(0);
        if(grilleJeu.colonne_remplie(0) == true) btn_col_0.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(1);
        if(grilleJeu.colonne_remplie(1) == true) btn_col_1.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(2);
        if(grilleJeu.colonne_remplie(2) == true) btn_col_2.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(3);
        if(grilleJeu.colonne_remplie(3) == true) btn_col_3.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(4);
        if(grilleJeu.colonne_remplie(4) == true) btn_col_4.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(5);
        if(grilleJeu.colonne_remplie(5) == true) btn_col_5.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(6);
        if(grilleJeu.colonne_remplie(6) == true) btn_col_6.setEnabled(false);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed
    
    public boolean jouerDansColonne(int indice_colonne){
        boolean resultatAction;
        resultatAction = grilleJeu.ajouterJetonDansColonne(joueurCourant, indice_colonne);
        panneau_grille.repaint();
        
        lbl_j1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs+"");
        lbl_j2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs+"");
        
        boolean vict_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]);
        boolean vict_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]);
        if (vict_j1 && !vict_j2) message.setText("Victoire de "+ListeJoueurs[0].Nom);
        if (vict_j2 && !vict_j1) message.setText("Victoire de "+ListeJoueurs[1].Nom);
        if (vict_j1 && vict_j2){
            if (joueurCourant == ListeJoueurs[0]) message.setText("Victoire de "+ListeJoueurs[1].Nom+ " (faute de jeu de l'autre joueur)");
            else message.setText("Victoire de "+ListeJoueurs[0].Nom+ " (faute de jeu de l'autre joueur)");
        }
        if(resultatAction == true) return true;
        else return true;
    }
    
    public void joueurSuivant(){
        if (joueurCourant == ListeJoueurs[0]){
            joueurCourant = ListeJoueurs[1];
        }
        else joueurCourant = ListeJoueurs[0];
        lbl_jcourant.setText(joueurCourant.Nom) ;   
    }
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
       //     public void run() {
       //         new fenetreJeu().setVisible(true);
      //      }
      //  });
    //}

    public void initialiserPartie(){ //creation de la methode qui initialise chaque partie 
      grilleJeu.viderGrille(); //on commence par vider la grille 
      
      String nomJoueur1 = nom_joueur1.getText();
      Joueur joueur1 = new Joueur(nomJoueur1);
      String nomJoueur2 = nom_joueur2.getText();
      Joueur joueur2 = new Joueur(nomJoueur2);
      
      ListeJoueurs[0] = joueur1; 
      ListeJoueurs[1] = joueur2;
      
      attribuerCouleursAuxJoueurs(); //on appelle la methode qui attribue une couleru a chaque joueur
      System.out.println(joueur1.Nom + " a la couleur "+joueur1.Couleur); //on annonce la couleur du joueur 1
      System.out.println(joueur2.Nom + " a la couleur "+joueur2.Couleur); //on annonce la couleur du joueur 2 
      
      lbl_j1_name1.setText(nomJoueur1);
      lbl_j2_name.setText(nomJoueur2);
      lbl_j1_couleur.setText(joueur1.Couleur);
      lbl_j2_couleur.setText(joueur2.Couleur);
      lbl_j1_desint.setText(joueur1.nombreDesintegrateurs+"");
      lbl_j2_desint.setText(joueur2.nombreDesintegrateurs+"");
      
      
      //on attribue la couleur des jetons en fonction de celle du joueur 
      for (int i = 0; i < 21; i++) {
            Jeton J = new Jeton(ListeJoueurs[0].Couleur);
            joueur1.ajouterJeton(J);
            joueur2.ajouterJeton(new Jeton(joueur2.Couleur));
        }
      
      //tirage au sort du joueur qui commencera la partie 
      Random r = new Random();
      boolean premierJoueur = r.nextBoolean();
      if (premierJoueur==true){
          joueurCourant = ListeJoueurs[0];
      }else{
          joueurCourant = ListeJoueurs[1];
      }
      lbl_jcourant.setText(joueurCourant.Nom);
      
      //positionnement aléatoire des 5 trous noirs aléatoires
      int compteur = 0;
        for (int i = 0; i < 5; i++) {
            int ligne_trou_noir = r.nextInt(6);
            int colonne_trou_noir = r.nextInt(7);
            if (compteur < 2) {
                if (!grilleJeu.placerDesintegrateur(ligne_trou_noir, colonne_trou_noir)) {
                    compteur--;
                }
                compteur = compteur + 1;
            }
            if (!grilleJeu.placerTrouNoir(ligne_trou_noir, colonne_trou_noir)) {
                i--;
            }
        }
      
      //positionnement aleatoire des 3 désintégrateurs seuls
      for (int i = 0; i < 3; i++) {
            int ligne_désin = r.nextInt(6);
            int colonne_désin = r.nextInt(7);
            if (!grilleJeu.placerDesintegrateur(ligne_désin, colonne_désin) || grilleJeu.cellules[ligne_désin][colonne_désin].presenceTrouNoir()) {
                i--;
            }
        }
      
    }
    
    public void attribuerCouleursAuxJoueurs(){ //creation de la methode qui attribue une couleur aléatoire aux joueurs
        Random r = new Random();
        boolean couleurJoueurs = r.nextBoolean();
        if(couleurJoueurs){
            ListeJoueurs[0].Couleur = "Rouge";
            ListeJoueurs[1].Couleur = "Jaune";
        }else{
            ListeJoueurs[1].Couleur = "Rouge";
            ListeJoueurs[0].Couleur = "Jaune";
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_name1;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_name;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JPanel panneau_infos_joueurs;
    // End of variables declaration//GEN-END:variables

}
