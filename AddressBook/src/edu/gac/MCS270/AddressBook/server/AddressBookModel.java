package edu.gac.MCS270.AddressBook.server;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import edu.gac.MCS270.AddressBook.shared.EntryData;

public class AddressBookModel {
	static final PersistenceManagerFactory pmf = PMF.get();

	// stores entries in the database 
	public static void storeEntry(EntryData entry) {
		PersistenceManager pm = pmf.getPersistenceManager();
		try {
			pm.currentTransaction().begin();
			pm.makePersistent(entry);
			pm.currentTransaction().commit();
		}
		finally {
			if (pm.currentTransaction().isActive())
				pm.currentTransaction().rollback();
			if (!pm.isClosed())
				pm.close();
		}
	}
	
}