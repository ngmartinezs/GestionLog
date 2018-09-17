package com.gestionLogsPortales.LogEvento.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="LOG_EVENTO")
@SequenceGenerator(name="LOG_EVENTO_ID_SEQ", schema="REG_EVENTOS_ZTA",sequenceName="LOG_EVENTO_ID_SEQ", allocationSize=1)
public class LogEvento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_EVENTO_ID_SEQ" )
	@Column(name ="LOG_EVENTO_ID")
	private Long logEventoId;
	
	@Column(name ="USUARIO_IP")
	private String ipUsuario;
	
	@Column(name ="USUARIO_ID")
	private String usuarioId;
	
	@Column(name ="NOMBRE_PAGINA")
	private String nombrePagina;
	
	@Column(name ="URL_PAGINA")
	private String urlPagina;
	
	@Column(name ="COMPONENTE")
	private String componente;
	
	@Column(name ="SESSION_ID")
	private String sessionId;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="FECHA_CREACION")
	private Date   fechaCreacion;
	
	@Column(name ="USUARIO_CREACION")
	private String usuarioCreacion;
	
	@Column(name ="FECHA_EVENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEvento;
	
	
	

	public LogEvento()
	{
		
	}
	
	public LogEvento( Long logEventoId,
					  String ipUsuario,
					  String usuarioId,
					  String nombrePagina)
	{
		this.logEventoId =logEventoId;
		this.ipUsuario = ipUsuario;
		this.usuarioId = usuarioId;
		this.nombrePagina = nombrePagina;
	}
	
	public Long getlogEventoId() {
		return logEventoId;
	}
	public void setlogEventoId(Long logEventoId) {
		this.logEventoId = logEventoId;
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

	

	public Long getLogEventoId() {
		return logEventoId;
	}

	public void setLogEventoId(Long logEventoId) {
		this.logEventoId = logEventoId;
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

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LogEvento [logEventoId=");
		builder.append(logEventoId);
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
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaEvento=");
		builder.append(fechaEvento);
		builder.append("]");
		return builder.toString();
	}
	

}
