package com.gestionLogsPortales.LogEvento.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionLogsPortales.LogEvento.dto.LogEvento;

public interface LogEventoRepository extends JpaRepository<LogEvento, Long>
{

}
