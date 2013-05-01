/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import TECHNIQUE.Singleton;
import java.sql.Connection;

/**
 *
 * @author probook
 */
public abstract class DAOabstraite<T> {
   public Connection connect(){
        return Singleton.getInstance().getConnection();

}
   public abstract void create();
public abstract  T insert(T obj);
public abstract void delete(T obj);
public abstract  T update(T obj);
public abstract T find(int id);


}

