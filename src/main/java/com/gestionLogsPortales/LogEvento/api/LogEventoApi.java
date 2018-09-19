package com.gestionLogsPortales.LogEvento.api;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionLogsPortales.LogEvento.dto.LogEvento;
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
		LogEvento lLogEvento = null;
		RespuestaGestionLog lRespuestaGestionLog = new RespuestaGestionLog();
		lRespuestaGestionLog.setCodigoError("0");
		lRespuestaGestionLog.setMensajeError("OK");
		
		System.out.println(" RespuestaGestionLog registrarEventoLog 1");
		
		try
		{
			/**
			 * Se realiza el registro sobre la tabla de LogEvento
			 **/
			lLogEvento = lLogEventoServices.registrarEvento(pLogEventoRequest);
			
			System.out.println(" RespuestaGestionLog registrarEventoLog 2");
			
			if(lLogEvento != null && lLogEvento.getlogEventoId() > 0)
			{
				lRespuestaGestionLog.setMensajeError("Registrado lLogEvento =>"+lLogEvento.toString());
			}
			else
			{
				lRespuestaGestionLog.setCodigoError("998");
				lRespuestaGestionLog.setMensajeError("No se logro registrar la informacion del log del evento.");
			}
				
		}
		catch(Exception pException)
		{
			lRespuestaGestionLog.setCodigoError("999");
			lRespuestaGestionLog.setMensajeError("Error al registrar Evento => "+pException.getMessage());
		}
		
		return lRespuestaGestionLog;  
	}
	
	
}
