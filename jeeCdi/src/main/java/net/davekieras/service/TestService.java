package net.davekieras.service;

import javax.inject.Inject;

import net.davekieras.model.TestBean;
import net.davekieras.qualifiers.TestQualifier;

public class TestService {

	@Inject
	private TestBean testBean;

	public TestBean getTestBean() {
		return testBean;
	}

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
	
}
