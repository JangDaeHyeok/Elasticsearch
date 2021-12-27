package jdh.elk.test.elasticSearch;

import javax.annotation.Resource;

import org.junit.Test;

public class ElasticSearchOperation {
	// private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	PdEsRepository pdEsRepository;

	@Test
	public void test(){
		shopProduct shpd = new shopProduct();
		shpd.setId("2");
		shpd.setTitle("제목입니다.");
		pdEsRepository.save(shpd);
	}
}
