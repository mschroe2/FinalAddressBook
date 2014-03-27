package edu.gac.MCS270.AddressBook.server;

import edu.gac.MCS270.AddressBook.client.SubmitEntryService;
import edu.gac.MCS270.AddressBook.shared.EntryData;

public class SubmitEntryServiceImpl extends 
			RemoteServiceServlet implements SubmitEntryService {
	
	@Override
	public String submitEntryToServer(EntryData entry) {
		AddressBookModel.storeEntry(entry);
		return "Entry Submitted";
	}

}
