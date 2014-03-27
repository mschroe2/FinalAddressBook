package edu.gac.MCS270.AddressBook.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.gac.MCS270.AddressBook.shared.EntryData;

public class SubmitEntryService {
	
	@RemoteServiceRelativePath("submitentry") 
	public interface SubmitEntryService extends RemoteService {
		public String submitEntryToServer(EntryData entry);
	}
}