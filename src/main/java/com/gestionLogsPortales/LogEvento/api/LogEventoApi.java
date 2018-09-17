package com.gestionLogsPortales.LogEvento.api;



import java.util.Calendar;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionLogsPortales.LogEvento.dto.LogEvento;
import com.gestionLogsPortales.LogEvento.dto.LogEventoDetalle;
import com.gestionLogsPortales.LogEvento.dto.LogEventoDetalleRequest;
import com.gestionLogsPortales.LogEvento.dto.LogEventoRequest;
import com.gestionLogsPortales.LogEvento.dto.RespuestaGestionLog;
import com.gestionLogsPortales.LogEvento.service.LogEventoServices;

@RestController
public class LogEventoApi 
{
	@Autowired
	LogEventoServices lLogEventoServices;
	
	@Autowired
	DozerMapper lDozerMapper;
	
	@RequestMapping(value="/evento", method =RequestMethod.POST)
	public RespuestaGestionLog registrarEventoLog( @RequestBody @Valid LogEventoRequest pLogEventoRequest )
	{
		Calendar lCalendar = null;
		LogEvento lLogEvento = null;
		LogEventoDetalle lLogEventoDetalle= new LogEventoDetalle();
		LogEventoDetalleRequest lLogEventoDetalleRequest= null ;
		RespuestaGestionLog lRespuestaGestionLog = new RespuestaGestionLog();
		lRespuestaGestionLog.setCodigoError("0");
		lRespuestaGestionLog.setMensajeError("OK");
		
		
		try
		{
			lLogEvento = lDozerMapper.beanMapper().map(pLogEventoRequest, LogEvento.class);
			lCalendar = Calendar.getInstance();
			lCalendar.setTimeInMillis(Long.parseLong(pLogEventoRequest.getFechaEvento()));
			lLogEvento.setFechaEvento(lCalendar.getTime());
			
			if( pLogEventoRequest != null && pLogEventoRequest.getArrayLogEventoDetalleRequest() != null && pLogEventoRequest.getArrayLogEventoDetalleRequest().size() > 0 )
			{
				lLogEventoDetalleRequest = pLogEventoRequest.getArrayLogEventoDetalleRequest().get(0);
				lLogEventoDetalle = lDozerMapper.beanMapper().map(lLogEventoDetalleRequest, LogEventoDetalle.class);
			}
			
			lLogEvento.setFechaCreacion(Calendar.getInstance().getTime());
			lLogEvento.setUsuarioCreacion("DS_LOG");
			
			lLogEvento = lLogEventoServices.registrar(lLogEvento);
			lRespuestaGestionLog.setMensajeError("Registrado lLogEvento =>"+lLogEvento.toString()+" lLogEventoDetalle "+lLogEventoDetalle.toString());
		}
		catch(Exception pException)
		{
			lRespuestaGestionLog.setCodigoError("999");
			lRespuestaGestionLog.setMensajeError("Error al registrar Evento => "+pException.getMessage());
		}
		
		return lRespuestaGestionLog;  
	}
	
	
}
