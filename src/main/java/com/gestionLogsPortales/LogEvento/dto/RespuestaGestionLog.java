package com.gestionLogsPortales.LogEvento.dto;

public class RespuestaGestionLog 
{
	private String codigoError;
	private String mensajeError;
	public String getCodigoError() {
		return codigoError;
	}
	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}
	public String getMensajeError() {
		return mensajeError;
	}
	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RespuestaGestionLog [codigoError=");
		builder.append(codigoError);
		builder.append(", mensajeError=");
		builder.append(mensajeError);
		builder.append("]");
		return builder.toString();
	}
	
	
}
