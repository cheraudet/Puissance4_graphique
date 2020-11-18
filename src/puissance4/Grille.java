/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance4;

/**
 *
 * @author rfougero
 */
public class Grille { 
    //creation des attributs de la classe grille 
    Cellule cellules [][] = new Cellule [6][7];
    
    
    public Grille(){
        for (int i=0; i<6 ; i++ ){
            for (int j=0; j<7; j++){
                cellules[i][j]=new Cellule();
            }
        }
        
    }
    public static void main (String [] a) {
                  new fenetreJeu().setVisible(true);
    
    }
    public boolean ajouterJetonDansColonne(Joueur joueurCourant, int indColonne){ //creation de la methode qui ajoute un jeton dans la colonne voulue 
      if (colonne_remplie(indColonne)){ //si la colonne est pleine, on ne peut pas ajouter de jeton
        return false; //donc on retourne faux 
      }
      else{ //si ce n'est pas le cas :
     
        int i=0;
        while(cellules[i][indColonne].jetonCourant != null){ //on teste tant que la cellule n'est pas vide 
            i++; //on passe à la cellule du dessus 
        }
        Jeton unJeton = joueurCourant.retirerJeton(); //on definit et initialise la variable jeton
        cellules[i][indColonne].jetonCourant = unJeton;
        
        if(cellules[i][indColonne].presenceTrouNoir()){ //test si un trou noir est présent 
            cellules[i][indColonne].activerTrouNoir(); //si c'est le cas, on l'active
            joueurCourant.nombreJetonsRestants --; //et on decremente le nb de jetons du joueur
        }
        if(cellules[i][indColonne].presenceDesintegrateur()){ //test si un desintegrateur est present 
            cellules[i][indColonne].recupererDesintegrateur(); //si c'est le cas, on le recupere 
            joueurCourant.nombreDesintegrateurs ++; //on incrémente le nb de desintegrateurs du joueur 
            joueurCourant.nombreJetonsRestants --; //et on decremente le nb de jetons du joueur
        }
        return true; //on retourne vrai
      }
    } 
    
    public boolean colonne_remplie(int ind_colonne) {
    // methode ajoutée par rapport à l'énoncé
    // retourne vrai si la colonne d'indice ind_colonne estremplie
    // retourne faux sinon
        return (cellules[5][ind_colonne].recupererJeton() != null);
    }
    
    public void activer_trounoir(int colonne) { // ressort vrai si il y a un desing
        int i = 5;
        while (cellules[i][colonne].jetonCourant == null) {
            i--;
            if (i == 0) {
                break;
            }
        }
        if (i >= 0 && i < 6) {
            cellules[i][colonne].activerTrouNoir();
        }
    }
    
    public boolean etreRemplie(){ //creation de la methode qui teste si la grille est pleine
        int compteur = 0;
        int i=0; 
        while (i!=6 && colonne_remplie(i)) { i++;}
        return (i==6); // si i=6 on a toutes les colonens de remplies
    }
    
    public void viderGrille(){ //creation de la methode qui permet de vider la grille 
        for (int i=0; i<6; i++){ //boucle pour parcourir les lignes 
            for(int j=0; j<7; j++){ //boucle pour parcourir les colonnes 
                cellules[i][j].jetonCourant = null;
                cellules[i][j].trouNoir = false;
                cellules[i][j].desintegrateur = false;
            }
        }
        
    }
    
    public void afficherGrilleSurConsole(){ //creation de la methode qui affiche la grille sur la console 
        for(int i=5; i>=0; i--){ //boucle pour parcourir les lignes
            for(int j=0; j<7; j++){ //boucle pour parcourir les colonnes
               if(cellules[i][j] == null){ //si la cellule est vide 
                   System.out.print("V"); //alors on affiche V pour vide 
               }
               else if(cellules[i][j].jetonCourant != null){ // sinon si la cellule possede un jeton 
                   if(cellules[i][j].jetonCourant.Couleur == "Rouge"){ //si le jeton est rouge 
                       System.out.print("R"); //on afiche R pour rouge 
                   }
                   else if(cellules[i][j].jetonCourant.Couleur == "Jaune"){ //sinon si le jeton est jaune 
                       System.out.print("J"); //on affiche J pour jaune 
                   }
                }
               else if(cellules[i][j].placerTrouNoir() && cellules[i][j].presenceDesintegrateur()){ //sinon si la cellule possede un desintegrateur et un trou noir 
                   System.out.print("T"); //on affiche T pour trou noir, les desintegrateurs sont donc invisibles 
               }
               else if(cellules[i][j].presenceDesintegrateur() && cellules[i][j].placerTrouNoir()==false){ //sinon si la cellule possede un desintegrateur 
                   System.out.print("D"); //on affiche D pour desintegrateur 
               }
               else if(cellules[i][j].presenceTrouNoir() && cellules[i][j].presenceDesintegrateur()==false){ //sinon si la cellule possede un trou noir 
                   System.out.print("T"); //on affiche T pour trou noir 
               }
               System.out.print(" ");//affiche un espace entre chaque colonne
            }
            System.out.println(" ");//affiche un espace entre chaque ligne 
        }
    }
    
    public boolean celluleOccupee(int indLigne, int indColonne){ //creation de la methode qui permet de savoir si la cellule est occupée 
        if (cellules[indLigne][indColonne].jetonCourant != null){ //test si la cellule possede un jeton 
            return true; //on retourne vrai 
        } 
        return false;
    }
    
    public String lireCouleurDuJeton(int indLigne, int indColonne){ //creation de la methode qui permet de lre la couleur du jeton
        return cellules[indLigne][indColonne].jetonCourant.Couleur; //retourne la couleur du jeton courant 
    }
    
    public boolean etreGagnantePourJoueur(Joueur joueurCourant){ //creation de la methode qui teste si un joueur gagne
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (cellules[i][j] != null && cellules[i][j].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i][j + 1] != null && cellules[i][j + 1].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i][j + 2] != null && cellules[i][j + 2].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i][j + 3] != null && cellules[i][j + 3].lireCouleurDuJeton().equals(joueurCourant.Couleur)) {
                    return true;
                }

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (cellules[i][j] != null && cellules[i][j].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i + 1][j] != null && cellules[i + 1][j].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i + 2][j] != null && cellules[i + 2][j].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i + 3][j] != null && cellules[i + 3][j].lireCouleurDuJeton().equals(joueurCourant.Couleur)) {
                    return true;
                }

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (cellules[i][j] != null && cellules[i][j].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i + 1][j + 1] != null && cellules[i + 1][j + 1].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i + 2][j + 2] != null && cellules[i + 2][j + 2].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i + 3][j + 3] != null && cellules[i + 3][j + 3].lireCouleurDuJeton().equals(joueurCourant.Couleur)) {
                    return true;
                }

            }
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (cellules[i][j] != null && cellules[i][j].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i - 1][j + 1] != null && cellules[i - 1][j + 1].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i - 2][j + 2] != null && cellules[i - 2][j + 2].lireCouleurDuJeton().equals(joueurCourant.Couleur)
                        && cellules[i - 3][j + 3] != null && cellules[i - 3][j + 3].lireCouleurDuJeton().equals(joueurCourant.Couleur)) {
                    return true;
                }

            }
        }

        return false;
    }
    
    public boolean placerTrouNoir(int indLigne, int indColonne){ //creation de la methode qui permet d'ajouter un trou noir 
        if(cellules[indLigne][indColonne].trouNoir==false){ //test la presence d'un trou noir 
            cellules[indLigne][indColonne].trouNoir = true; //si il n'y en a pas, on en ajoute un
            return true; //renvoie vrai si trou noir bien ajouté
        } 
        return false;
    }
    
    public boolean supprimerJeton(int indLigne, int indColonne){ //creation de la methode qui permet de supprimer un jeton
        if(cellules[indLigne][indColonne].jetonCourant != null){ //test la presence du jeton
            cellules[indLigne][indColonne].jetonCourant = null; //si u jeton est présent, on le supprime 
            return true; //renvoie vrai si jeton bien supprimé 
        } 
        return false;
    }
    
    public void tasserGrille() {
        for (int i = 0; i < 7; i++) {
           tasserColonne(i);
        }
    }
    
    
    public void tasserColonne(int colonne) {
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                cellules[i][colonne].jetonCourant = null;
            } else {
                if (cellules[i][colonne].jetonCourant  == null) {
                  cellules[i][colonne].jetonCourant = cellules[i + 1][colonne].jetonCourant;
                  cellules[i + 1][colonne].jetonCourant=null;
                }
            }
        }
    }
       
    public Jeton recupererJeton(int indLigne, int indColonne){ //creation de la methode qui permet de recuperer un jeton
        if(cellules[indLigne][indColonne].jetonCourant != null){ //test la presence du jeton dans la cellule 
            cellules[indLigne][indColonne].jetonCourant = null; //si jeton present, on le supprime 
        }
        return cellules[indLigne][indColonne].jetonCourant; //renvoie reference vers jeton 
    }
    
    public boolean placerDesintegrateur(int ligne, int colonne) {
        if (!cellules[ligne][colonne].desintegrateur) {
            cellules[ligne][colonne].desintegrateur = true;
            return true;
        }
        return false;
    }
}

