package com.ohmbc.vc.model;

public class ProfessionalAcces {

	private String nif;
	private String appType;
	private String providerCenterId;
	

	public ProfessionalAcces(String nif, String appType, String providerCenterId) {
		this.nif = nif;
		this.appType = appType;
		this.providerCenterId = providerCenterId;
		}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getProviderCenterId() {
		return providerCenterId;
	}

	public void setProviderCenterId(String providerCenterId) {
		this.providerCenterId = providerCenterId;
	}

}
