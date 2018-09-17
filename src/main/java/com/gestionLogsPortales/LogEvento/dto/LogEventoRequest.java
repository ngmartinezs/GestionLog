package com.gestionLogsPortales.LogEvento.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogEventoRequest implements Serializable
{

	private static final long serialVersionUID = 1L;
	private Long idLogEvento;
	
	@NotNull(message="Ip usuario es requerido")
	@Size(min=5,max=30,message="Ip Usuario presenta informacion errada")
	private String ipUsuario;
	
	@NotNull(message ="Id de usuario es requerido")
	@Size(min=10, max=30, message="El tamano de la informacion de id de usuario es muy corta")
	private String usuarioId;
	
	
	private String nombrePagina;
	private String urlPagina;
	private String componente;
	private String sessionId;
	private String fechaEvento;
	
	
	
	
	
	@JsonProperty(value="logEventoDetalles")
	private List<LogEventoDetalleRequest> arrayLogEventoDetalleRequest;
	
	public LogEventoRequest()
	{
		arrayLogEventoDetalleRequest = new  ArrayList<LogEventoDetalleRequest>();
	}
	
	public LogEventoRequest(  Long idLogEvento,
							  String ipUsuario,
							  String usuarioId,
							  String nombrePagina,
							  List<LogEventoDetalleRequest> pArrayLogEventoDetalleRequest)
	{
		this.idLogEvento =idLogEvento;
		this.ipUsuario = ipUsuario;
		this.usuarioId = usuarioId;
		this.nombrePagina = nombrePagina;
		this.arrayLogEventoDetalleRequest = new  ArrayList<LogEventoDetalleRequest>();
		this.arrayLogEventoDetalleRequest = pArrayLogEventoDetalleRequest;
	}
	
	public Long getIdLogEvento() {
		return idLogEvento;
	}
	public void setIdLogEvento(Long idLogEvento) {
		this.idLogEvento = idLogEvento;
	}
	public String getIpUsuario() {
		return ipUsuario;
	}
	public void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}
	public String getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getNombrePagina() {
		return nombrePagina;
	}
	public void setNombrePagina(String nombrePagina) {
		this.nombrePagina = nombrePagina;
	}

	public List<LogEventoDetalleRequest> getArrayLogEventoDetalleRequest() {
		return arrayLogEventoDetalleRequest;
	}

	public void setArrayLogEventoDetalleRequest(List<LogEventoDetalleRequest> arrayLogEventoDetalleRequest) {
		this.arrayLogEventoDetalleRequest = arrayLogEventoDetalleRequest;
	}

	public String getUrlPagina() {
		return urlPagina;
	}

	public void setUrlPagina(String urlPagina) {
		this.urlPagina = urlPagina;
	}

	public String getComponente() {
		return componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	
	public String getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(String fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LogEventoRequest [idLogEvento=");
		builder.append(idLogEvento);
		builder.append(", ipUsuario=");
		builder.append(ipUsuario);
		builder.append(", usuarioId=");
		builder.append(usuarioId);
		builder.append(", nombrePagina=");
		builder.append(nombrePagina);
		builder.append(", urlPagina=");
		builder.append(urlPagina);
		builder.append(", componente=");
		builder.append(componente);
		builder.append(", sessionId=");
		builder.append(sessionId);
		builder.append(", fechaEvento=");
		builder.append(fechaEvento);
		builder.append(", arrayLogEventoDetalleRequest=");
		builder.append(arrayLogEventoDetalleRequest);
		builder.append("]");
		return builder.toString();
	}


}
