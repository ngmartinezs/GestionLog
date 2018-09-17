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

@Entity(name="REG_EVENTOS_ZTA.LOG_EVENTO_DETALLES")
@SequenceGenerator(name="LOG_EVENTO_DETALLE_ID_SEQ", initialValue=1, allocationSize=100)
public class LogEventoDetalle implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_EVENTO_DETALLE_ID_SEQ" )
	@Column(name ="LOG_EVENTO_ID")
	private Long logEventoId;
	
	@Column(name ="LOG_EVENTO_DETALLE_ID")
	private Long logEventoDetalleId;
	
	
	@Column(name ="SERVICIO_CONSUMIDO")
	private String servicioConsumido;
	
	@Column(name ="PARAMETROS_CONSUMO")
	private String parametrosConsumo;
	
	@Column(name ="PARAMETROS_SALIDA")
	private String parametrosSalida;
	
	@Column(name ="CODIGO_RETORNO")
	private String codigoRetorno;
	
	@Column(name ="MENSAJE_RETORNO")
	private String mensajeRetorno;
	
	@Column(name ="TRAZA_ERROR")
	private String trazaError;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="FECHA_CREACION")
	private Date   fechaCreacion;
	
	@Column(name ="USUARIO_CREACION")
	private String usuarioCreacion;
	
	@Column(name ="FECHA_EVENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEvento;
	
	
	public LogEventoDetalle() 
	{}
	
	public LogEventoDetalle(Long logEventoId,
							Long logEventoDetalleId,
							String servicioConsumido,
							String parametrosConsumo,
							String parametrosSalida) 
	{
		this.logEventoId = logEventoId;
		this.logEventoDetalleId = logEventoDetalleId;
		this.servicioConsumido = servicioConsumido;
		this.parametrosConsumo = parametrosConsumo;
		this.parametrosSalida = parametrosSalida;
	}
	
	public Long getlogEventoId() {
		return logEventoId;
	}
	public void setlogEventoId(Long logEventoId) {
		this.logEventoId = logEventoId;
	}
	
	public Long getlogEventoDetalleId() {
		return logEventoDetalleId;
	}
	public void setlogEventoDetalleId(Long logEventoDetalleId) {
		this.logEventoDetalleId = logEventoDetalleId;
	}
	public String getServicioConsumido() {
		return servicioConsumido;
	}
	public void setServicioConsumido(String servicioConsumido) {
		this.servicioConsumido = servicioConsumido;
	}
	public String getParametrosConsumo() {
		return parametrosConsumo;
	}
	public void setParametrosConsumo(String parametrosConsumo) {
		this.parametrosConsumo = parametrosConsumo;
	}
	public String getParametrosSalida() {
		return parametrosSalida;
	}
	public void setParametrosSalida(String parametrosSalida) {
		this.parametrosSalida = parametrosSalida;
	}

	public Long getLogEventoId() {
		return logEventoId;
	}

	public void setLogEventoId(Long logEventoId) {
		this.logEventoId = logEventoId;
	}

	public Long getLogEventoDetalleId() {
		return logEventoDetalleId;
	}

	public void setLogEventoDetalleId(Long logEventoDetalleId) {
		this.logEventoDetalleId = logEventoDetalleId;
	}

	public String getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getMensajeRetorno() {
		return mensajeRetorno;
	}

	public void setMensajeRetorno(String mensajeRetorno) {
		this.mensajeRetorno = mensajeRetorno;
	}

	public String getTrazaError() {
		return trazaError;
	}

	public void setTrazaError(String trazaError) {
		this.trazaError = trazaError;
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
		builder.append("LogEventoDetalle [logEventoId=");
		builder.append(logEventoId);
		builder.append(", logEventoDetalleId=");
		builder.append(logEventoDetalleId);
		builder.append(", servicioConsumido=");
		builder.append(servicioConsumido);
		builder.append(", parametrosConsumo=");
		builder.append(parametrosConsumo);
		builder.append(", parametrosSalida=");
		builder.append(parametrosSalida);
		builder.append(", codigoRetorno=");
		builder.append(codigoRetorno);
		builder.append(", mensajeRetorno=");
		builder.append(mensajeRetorno);
		builder.append(", trazaError=");
		builder.append(trazaError);
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
