package edu.gac.MCS270.AddressBook.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.gac.MCS270.AddressBook.shared.EntryData;
import edu.gac.MCS270.AddressBook.client.AddressBookView;

public class AddressBook implements EntryPoint {

	private final AddressBookView abView = new AddressBookView();
	private final 
	
	public void onModuleLoad() {
		abView.viewMainPage();
	}

	public void SubmitEntryToServer(EntryData entryData) {
		// TODO Auto-generated method stub
		
	}
	//adds contact to address book
	public void addAddressHandler(EntryData entries){
		//Service Line of code goes here
		new AsyncCallback<String>(){
			public void onFailure(Throwable caught){
				return;
			}

			@Override
			public void onSuccess(String result) {
				abView.sendSuccessfulAddMessage();
			}
		};
	}
	
	//client view to delete a contact
	public void deleteContactInfo(EntryData entry) {
		//Service Line of code goes here
				new AsyncCallback<List<EntryData>>(){
			public void onFailure(Throwable caught){
				return;
			}					
				public void onSuccess(List<EntryData> entries){
					abView.sendSuccessfulDeleteMessage();
					abView.viewAddressBookEntries(entries);
			}
		};
		
	}
}
