/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package METIER;

/**
 *
 * @author probook
 */
public class Actualite {
    private int idActualité ;
    private char libellé ;

    public Actualite(int idActualité, char libellé) {
        this.idActualité = idActualité;
        this.libellé = libellé;
    }

    public Actualite() {
    }

    public int getIdActualité() {
        return idActualité;
    }

    public char getLibellé() {
        return libellé;
    }

    public void setIdActualité(int idActualité) {
        this.idActualité = idActualité;
    }

    public void setLibellé(char libellé) {
        this.libellé = libellé;
    }

    

    

}
