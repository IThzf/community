package com.nowcoder.community;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.dao.AlphaDaoHibernateImpl;
import com.nowcoder.community.dao.AlphaDaoHibernateImpl2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {

	private ApplicationContext applicationContext;



	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Test
	public void testApplicatoinContext() {
		System.out.println(applicationContext);

		AlphaDao alphaDao = applicationContext.getBean(AlphaDao.class);
		alphaDao.select();

		AlphaDao alphaDao2 = applicationContext.getBean(AlphaDao.class);
		alphaDao.select();

	}
}
