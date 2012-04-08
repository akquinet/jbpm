package org.jbpm.persistence;

import javax.persistence.EntityManager;

import org.drools.persistence.jpa.JpaPersistenceContextManager;
import org.drools.runtime.Environment;
import org.drools.runtime.EnvironmentName;

public class JpaProcessPersistenceContextManager extends
		JpaPersistenceContextManager implements
		ProcessPersistenceContextManager {

	private Environment env;
	
	public JpaProcessPersistenceContextManager(Environment env) {
		super(env);
		this.env = env;
	}

	public ProcessPersistenceContext getProcessPersistenceContext() {
		cmdScopedEntityManager = (EntityManager) env.get( EnvironmentName.CMD_SCOPED_ENTITY_MANAGER );
		return new JpaProcessPersistenceContext(cmdScopedEntityManager);
	}

}
