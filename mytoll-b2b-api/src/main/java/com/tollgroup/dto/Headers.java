
package com.tollgroup.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "callId", "channel", "x-mytoll-identity" })
public class Headers {

	@JsonProperty("callId")
	private String callId;
	@JsonProperty("channel")
	private String channel;
	@JsonProperty("x-mytoll-identity")
	private String xMytollIdentity;

	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getXMytollIdentity() {
		return xMytollIdentity;
	}

	public void setXMytollIdentity(String xMytollIdentity) {
		this.xMytollIdentity = xMytollIdentity;
	}

	@Override
	public String toString() {
		return "Headers [callId=" + callId + ", channel=" + channel + ", xMytollIdentity=" + xMytollIdentity + "]";
	}

}