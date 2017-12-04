package org.model.service;

import org.hibernate.SessionFactory;
import org.model.Util.HbFactory;

public class FactoryService {
	protected SessionFactory factory;

	public FactoryService() {
		super();
		this.factory = HbFactory.get();
	}

	public SessionFactory get() {
		return factory;
	}


}
