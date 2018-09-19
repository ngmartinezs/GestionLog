package com.gestionLogsPortales.LogEvento.dto;

import java.io.Serializable;
import java.util.Date;


public class LogEventoDetalleRequest implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long logEventoDetalleId;
	private Long logEventoId;
	private String servicioConsumido;
	private String parametrosConsumo;
	private String parametrosSalida;
	private String codigoRetorno;
	private String mensajeRetorno;
	private String trazaError;
	private Date fechaEvento;
	
	public LogEventoDetalleRequest() 
	{}
	
	public LogEventoDetalleRequest(Long idLogEvento,
									Long idLogEventoDetalle,
									String servicioConsumido,
									String parametrosConsumo,
									String parametrosSalida) 
	{
		this.logEventoId = idLogEvento;
		this.logEventoDetalleId = idLogEventoDetalle;
		this.servicioConsumido = servicioConsumido;
		this.parametrosConsumo = parametrosConsumo;
		this.parametrosSalida = parametrosSalida;
	}

	public Long getLogEventoDetalleId() {
		return logEventoDetalleId;
	}

	public void setLogEventoDetalleId(Long logEventoDetalleId) {
		this.logEventoDetalleId = logEventoDetalleId;
	}

	public Long getLogEventoId() {
		return logEventoId;
	}

	public void setLogEventoId(Long logEventoId) {
		this.logEventoId = logEventoId;
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

	public String getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getTrazaError() {
		return trazaError;
	}

	public void setTrazaError(String trazaError) {
		this.trazaError = trazaError;
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
		builder.append("LogEventoDetalleRequest [logEventoDetalleId=");
		builder.append(logEventoDetalleId);
		builder.append(", logEventoId=");
		builder.append(logEventoId);
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
		builder.append(", fechaEvento=");
		builder.append(fechaEvento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
