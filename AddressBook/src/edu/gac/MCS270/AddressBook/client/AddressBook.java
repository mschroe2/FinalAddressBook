package edu.gac.MCS270.AddressBook.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class AddressBook implements EntryPoint {

	private final AddressBookView abView = new AddressBookView();
	private final SubmitEntryServiceAsync submitEntryService = 
			GWT.create(SubmitEntryService.class);
	
	
	public void onModuleLoad() {
		abView.setController(this);
		abView.viewMainPage();
	}
	
	public void handleEntrySubmit(EntryData entry) {
		submitEntryService.submitEntryToServer(entry, new AsyncCallBack<String>() {
			public void onFailure(Throwable caught) {
				return;
				
			}
			// @Override
			public void onSuccess(String result) {
				abView.sendSuccessfulMessage();
			}
		});
	}

}
