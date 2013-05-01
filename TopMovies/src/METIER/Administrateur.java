/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package METIER;

/**
 *
 * @author probook
 */
public class Administrateur {
    private int idAdmin ;
    private int login;

    public Administrateur() {
    }

    public Administrateur(int idAdmin, int login) {
        this.idAdmin = idAdmin;
        this.login = login;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }
    

}
