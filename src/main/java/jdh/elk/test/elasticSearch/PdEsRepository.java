package jdh.elk.test.elasticSearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PdEsRepository extends ElasticsearchRepository<shopProduct, String> {

}
