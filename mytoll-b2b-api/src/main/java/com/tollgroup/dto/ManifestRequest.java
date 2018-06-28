package com.tollgroup.dto;

public class ManifestRequest {
	private String methodType;
	private Headers headers;
	private ManifestDto manifestDto;

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public Headers getHeaders() {
		return headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public ManifestDto getManifestDto() {
		return manifestDto;
	}

	public void setManifestDto(ManifestDto manifestDto) {
		this.manifestDto = manifestDto;
	}
}
