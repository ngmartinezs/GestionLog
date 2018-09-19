package com.gestionLogsPortales.LogEvento.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionLogsPortales.LogEvento.api.DozerMapper;
import com.gestionLogsPortales.LogEvento.dao.LogEventoDetalleRepository;
import com.gestionLogsPortales.LogEvento.dao.LogEventoRepository;
import com.gestionLogsPortales.LogEvento.dto.LogEvento;
import com.gestionLogsPortales.LogEvento.dto.LogEventoDetalle;
import com.gestionLogsPortales.LogEvento.dto.LogEventoDetalleRequest;
import com.gestionLogsPortales.LogEvento.dto.LogEventoRequest;



@Service
public class LogEventoServices 
{
	@Autowired
	LogEventoRepository lLogEventoRepository;
	
	@Autowired
	LogEventoDetalleRepository lLogEventoDetalleRepository;
	
	@Autowired
	DozerMapper lDozerMapper;
	
	private LogEvento registrarLogEvento(LogEvento pLogEvento )throws Exception
	{
		LogEvento lLogEVento = null;
		try
		{
			lLogEVento =lLogEventoRepository.saveAndFlush(pLogEvento);
		}
		catch(Exception pException)
		{
			throw pException;
		}
		
		return lLogEVento;
	}
	
	
	private LogEventoDetalle registrarLogEventoDetalle( LogEventoDetalle pLogEventoDetalle )throws Exception
	{
		LogEventoDetalle lLogEventoDetalle = null;
		try
		{
			lLogEventoDetalle = lLogEventoDetalleRepository.save(pLogEventoDetalle);
		}
		catch(Exception pException)
		{
			pException.printStackTrace();
			throw pException;
		}
		
		return lLogEventoDetalle;
	}
	
	
	public LogEvento registrarEvento( LogEventoRequest pLogEventoRequest )throws Exception
	{
		Calendar lCalendar = Calendar.getInstance();
		LogEventoDetalleRequest lLogEventoDetalleRequest = null;
		
		LogEvento lLogEvento = null;
		LogEvento lLogEventoRetorno = null;
		LogEventoDetalle lLogEVentoDetalle = null;
		Iterator<LogEventoDetalleRequest> lIterator = null;
		
		try 
		{
			System.out.println(" LogEvento registrarEvento 3");
			if( pLogEventoRequest != null )
			{
				lLogEvento = lDozerMapper.beanMapper().map(pLogEventoRequest, LogEvento.class);
				
				
				if( pLogEventoRequest.getFechaEvento() != null )
					lCalendar.setTimeInMillis(Long.parseLong(pLogEventoRequest.getFechaEvento()));
				
				lLogEvento.setFechaEvento(lCalendar.getTime());
				lLogEvento.setFechaCreacion(Calendar.getInstance().getTime());
				lLogEvento.setUsuarioCreacion("LOG_EVENTOS");
				
				System.out.println(" LogEvento registrarEvento 4");
				lLogEventoRetorno = registrarLogEvento(lLogEvento);
				lLogEventoRetorno.setlListaEventoDetalle(new ArrayList<LogEventoDetalle>());
				
				System.out.println(" LogEvento registrarEvento 5");
				
				if( lLogEventoRetorno != null &&
				    pLogEventoRequest.getArrayLogEventoDetalleRequest() != null    &&
					!pLogEventoRequest.getArrayLogEventoDetalleRequest().isEmpty() )
				{
					lIterator = pLogEventoRequest.getArrayLogEventoDetalleRequest().iterator();
					
					while(lIterator.hasNext())
					{
						lCalendar = Calendar.getInstance();
						lLogEventoDetalleRequest = lIterator.next();
						
						if( lLogEventoDetalleRequest != null )
						{	
							lLogEVentoDetalle = lDozerMapper.beanMapper().map(lLogEventoDetalleRequest, LogEventoDetalle.class);
							lLogEVentoDetalle.setLogEventoId(lLogEventoRetorno.getLogEventoId());
							
							
							if( lLogEVentoDetalle.getFechaEvento() != null )
								lCalendar.setTimeInMillis(Long.parseLong(pLogEventoRequest.getFechaEvento()));
							
							
							lLogEVentoDetalle.setFechaEvento(lCalendar.getTime());
							lLogEVentoDetalle.setFechaCreacion(Calendar.getInstance().getTime());
							lLogEVentoDetalle.setUsuarioCreacion("LOG_EVENTOS");	
							
							
							System.out.println(" LogEvento registrarEvento 6");
							/**
							 * Se registra detalle
							 **/
							lLogEVentoDetalle = registrarLogEventoDetalle(lLogEVentoDetalle);
							lLogEventoRetorno.getlListaEventoDetalle().add(lLogEVentoDetalle);
							
							System.out.println(" LogEvento registrarEvento 7");
						}
					}
				}
			}
		}
		catch(Exception pException)
		{
			throw pException;
		}
		
		return lLogEventoRetorno;
	}
}
