/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package METIER;

/**
 *
 * @author probook
 */
public class EMail {
    private char adresseSource ;
    private char adresseDestination ;

    public EMail(char adresseSource, char adresseDestination) {
        this.adresseSource = adresseSource;
        this.adresseDestination = adresseDestination;
    }

    public EMail() {
    }

    public char getAdresseDestination() {
        return adresseDestination;
    }

    public void setAdresseDestination(char adresseDestination) {
        this.adresseDestination = adresseDestination;
    }

    public char getAdresseSource() {
        return adresseSource;
    }

    public void setAdresseSource(char adresseSource) {
        this.adresseSource = adresseSource;
    }
    

}
