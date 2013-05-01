/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package METIER;

/**
 *
 * @author probook
 */
public class Abonne {
     private  int idAbonne  ;
     private int login;
     private char email;
     private char nom;
     private char prenom;
     private char pays ;

    public Abonne(int idAbonne, int login, char email, char nom, char prenom, char pays) {
        this.idAbonne = idAbonne;
        this.login = login;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
    }

    public Abonne() {
    }

    public char getEmail() {
        return email;
    }

    public int getIdAbonne() {
        return idAbonne;
    }

    public int getLogin() {
        return login;
    }

    public char getNom() {
        return nom;
    }

    public char getPays() {
        return pays;
    }

    public char getPrenom() {
        return prenom;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public void setIdAbonne(int idAbonne) {
        this.idAbonne = idAbonne;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void setPays(char pays) {
        this.pays = pays;
    }

    public void setPrenom(char prenom) {
        this.prenom = prenom;
    }





}
