package jdh.elk.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class ElkTestInitializer implements ApplicationRunner {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.error("[프로젝트 기동]");
	}
}
