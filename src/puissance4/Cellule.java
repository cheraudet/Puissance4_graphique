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
public class Cellule {
    //creation des attributs de la classe cellule 
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule(){ //creation du constructeur qui initialise les attributs 
        jetonCourant = null;
        trouNoir =false;
        desintegrateur = false;
    }
    
    public boolean affecterJeton(Jeton unJeton){ //creation de la methode qui ajoute le jeton en paramètre à la cellule
        if(jetonCourant == null){
            jetonCourant = unJeton;
            return true;
        }
        return false;
    }
    
    public Jeton recupererJeton(){ //creation de la methode qui renvoie une refernce vers le jeton de la cellule
        Jeton jetonRetour = jetonCourant;
        jetonCourant  = null;
        return jetonRetour;
    }
    
    public boolean supprimerJeton(){ //creation de la methode qui supprime un jeton
        if(jetonCourant == null){
            return false;
        }
        jetonCourant = null;
        return true;
    }
    
    public boolean placerTrouNoir(){ //creation de la methode qui permet d'ajouter un trou noir 
        if(trouNoir){
            return false;
        }
        trouNoir = true;
        return true;
    }
    
    public boolean placerDesintegrateur(){ //creation de la methode qui permet d'ajouter un désintegrateur 
       if(desintegrateur){
            return false;
        }
        desintegrateur = true;
        return true;
    }
    
    public boolean presenceTrouNoir() { //creation de la methode qui teste si il y a un trou noir 
        return trouNoir;
    }
    
    public boolean presenceDesintegrateur(){ //creation de la methode qui teste si un désintegrateur est present
        return desintegrateur;
    }
    
    public String  lireCouleurDuJeton(){ //creation de la methode qui permet de lire la couleur d'un jeton 
        if(jetonCourant == null){ //test si un jeton est present dans la cellule 
            return "vide"; //si ce n'est pas le cas, retourne qu'il n'y a pas de jetons
        }
        return jetonCourant.Couleur; //sinon on retourne la couleur du jeton
    }
    
    public boolean recupererDesintegrateur(){ //creation de la methode qui permet de recuperer un desintegrateur 
        if(presenceDesintegrateur()){
            desintegrateur = false;
            return true;
        }
        return false;
    }
    
    public boolean activerTrouNoir(){ //creation de la methode qui permet d'activer un trou noir 
        if(trouNoir){
            jetonCourant = null;
            trouNoir = false;
            System.out.println("Votre pion c'est fait engloutir dans le trou noir !");
            return true;
        }
        return false;
    }
}
