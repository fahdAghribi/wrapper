package com.ohmbc.vc.model;

public class Consultation {
	private String professionalNif;
	private String initialPlanificationDate;
	private String finalPlanificationDate;
	private String locator;
	private String specialtyId;
	private String specialtyDescription;
	private String applicationType;
	private String communicationType;
	private String consultationType;
	
	public Consultation(String professionalNif, String initialPlanificationDate, String finalPlanificationDate,
			String locator, String specialtyId, String specialtyDescription, String applicationType,
			String communicationType, String consultationType) {
		
		this.professionalNif = professionalNif;
		this.initialPlanificationDate = initialPlanificationDate;
		this.finalPlanificationDate = finalPlanificationDate;
		this.locator = locator;
		this.specialtyId = specialtyId;
		this.specialtyDescription = specialtyDescription;
		this.applicationType = applicationType;
		this.communicationType = communicationType;
		this.consultationType = consultationType;
	}

	
	public String getProfessionalNif() {
		return professionalNif;
	}

	public void setProfessionalNif(String professionalNif) {
		this.professionalNif = professionalNif;
	}

	public String getInitialPlanificationDate() {
		return initialPlanificationDate;
	}

	public void setInitialPlanificationDate(String initialPlanificationDate) {
		this.initialPlanificationDate = initialPlanificationDate;
	}

	public String getFinalPlanificationDate() {
		return finalPlanificationDate;
	}

	public void setFinalPlanificationDate(String finalPlanificationDate) {
		this.finalPlanificationDate = finalPlanificationDate;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public String getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(String specialtyId) {
		this.specialtyId = specialtyId;
	}

	public String getSpecialtyDescription() {
		return specialtyDescription;
	}

	public void setSpecialtyDescription(String specialtyDescription) {
		this.specialtyDescription = specialtyDescription;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}

	public String getConsultationType() {
		return consultationType;
	}

	public void setConsultationType(String consultationType) {
		this.consultationType = consultationType;
	}
	
}
