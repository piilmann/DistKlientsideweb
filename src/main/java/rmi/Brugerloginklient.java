/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import data.Bruger;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author christofferpiilmann
 */
public class Brugerloginklient {
    
    	public Bruger static loginJavabog(String Username, String Password) throws NotBoundException, MalformedURLException, RemoteException {
		Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
		Bruger b = ba.hentBruger(Username, Password);
                return b;
	}
}
