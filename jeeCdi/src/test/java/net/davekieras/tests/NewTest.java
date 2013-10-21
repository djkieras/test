package net.davekieras.tests;

import javax.inject.Inject;

import net.davekieras.model.impl.TestBeanImpl;
import net.davekieras.service.TestService;

import org.jglue.cdiunit.NgCdiRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest extends NgCdiRunner {

	private static Logger LOG = LoggerFactory.getLogger(NewTest.class);
	
	@Inject
	private TestService testService;
	
	@Inject
	private TestBeanImpl testBean;
	
	@Test
	public void test() {
		Assert.assertNotNull(testService.getTestBean());
		testBean.setName("SETVALUE");
		LOG.info(testService.getTestBean().getName());
		LOG.info(testBean.getName());
		Assert.assertNotEquals(testBean.getName(), testService.getTestBean().getName());
	}

}
