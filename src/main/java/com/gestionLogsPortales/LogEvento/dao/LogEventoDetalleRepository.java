package com.gestionLogsPortales.LogEvento.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionLogsPortales.LogEvento.dto.LogEventoDetalle;

public interface LogEventoDetalleRepository extends JpaRepository<LogEventoDetalle, Long> 
{

}
