package jdh.elk.test.elasticSearch;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(indexName="shpd")
public class shopProduct {
	private String id;
	private String title;
}
