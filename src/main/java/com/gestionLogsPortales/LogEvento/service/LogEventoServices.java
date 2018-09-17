package com.gestionLogsPortales.LogEvento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionLogsPortales.LogEvento.dao.LogEventoRepository;
import com.gestionLogsPortales.LogEvento.dto.LogEvento;

@Service
public class LogEventoServices 
{
	@Autowired
	LogEventoRepository lLogEventoRepository;
	
	public LogEvento registrar(LogEvento pLogEvento )
	{
		System.out.println("Entro registrar");
		LogEvento lLogEVento = null;
		lLogEVento =lLogEventoRepository.saveAndFlush(pLogEvento);
		System.out.println(lLogEVento);
		
		return lLogEVento;
	}
}
