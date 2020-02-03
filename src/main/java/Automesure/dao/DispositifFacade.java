/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automesure.dao;

import com.mycompany.automesure1.Dispositif;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Justin
 */
public class DispositifFacade extends AbstractFacade<Dispositif> {
    
	@PersistenceContext(unitName = "comptoirs")
	private EntityManager em;

	protected EntityManager getEntityManager() {
		return em;
	}

	public DispositifFacade() {
		super(Dispositif.class);
	}
	
}

