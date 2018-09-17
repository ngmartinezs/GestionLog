package com.gestionLogsPortales.LogEvento.api;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerMapper {

	
		public Mapper beanMapper()
		{
			return new DozerBeanMapper();
		}
}
