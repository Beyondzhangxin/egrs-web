package com.aiidc.env.ergs.common;

import java.io.Serializable;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

public class IdGenerator implements Configurable,IdentifierGenerator {

	@Override
	public void configure(Type arg0, Properties arg1, ServiceRegistry arg2) throws MappingException {
		
	}

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {

		return null;
	}

	
}
