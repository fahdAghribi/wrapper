package com.ohmbc.vc.model;

import java.util.ArrayList;
import java.util.List;

public class AccesConsultation {
	
	
	private List<ContactUserInformation> contact;
	private List<Consultation> consultation;
	
	public AccesConsultation() {
		contact = new ArrayList();
		consultation = new ArrayList();
	}

	public List<ContactUserInformation> getContact() {
		return contact;
	}

	public void setContact(List<ContactUserInformation> contact) {
		this.contact = contact;
	}

	public List<Consultation> getConsultation() {
		return consultation;
	}

	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}
	


	}
	
	

