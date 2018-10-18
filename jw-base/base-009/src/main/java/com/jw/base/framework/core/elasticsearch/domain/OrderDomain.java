package com.jw.base.framework.core.elasticsearch.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

//indexName:文档存储的地方。
//ES将数据存储于一个或多个索引中，索引是具有类似特性的文档的集合。类比传统的关系型数据库领域来说，索引相当于SQL中的一个数据库，或者一个数据存储方案(schema)。
//索引由其名称(必须为全小写字符)进行标识，并通过引用此名称完成文档的创建、搜索、更新及删除操作。一个ES集群中可以按需创建任意数目的索引。

//type:文档代表的对象的类
//类型是索引内部的逻辑分区(category/partition)，然而其意义完全取决于用户需求。因此，一个索引内部可定义一个或多个类型(type)。一般来说，类型就是为那些拥有相同的域的文档做的预定义。
//例如，在索引中，可以定义一个用于存储用户数据的类型，一个存储日志数据的类型，以及一个存储评论数据的类型。类比传统的关系型数据库领域来说，类型相当于“表”。

//Document:文档是Lucene索引和搜索的原子单位，它是包含了一个或多个域的容器，基于JSON格式进行表示。
//文档由一个或多个域组成，每个域拥有一个名字及一个或多个值，有多个值的域通常称为“多值域”。每个文档可以存储不同的域集，但同一类型下的文档至应该有某种程度上的相似之处。

//Mapping:ES中，所有的文档在存储之前都要首先进行分析。用户可根据需要定义如何将文本分割成token、哪些token应该被过滤掉，以及哪些文本需要进行额外处理等等。
//另外，ES还提供了额外功能，例如将域中的内容按需排序。事实上，ES也能自动根据其值确定域的类型。

//shards:一个索引中含有的主分片(Primary Shard)的数量，默认值是5。在索引创建后这个值是不能被更改的。
//ES的“分片(shard)”机制可将一个索引内部的数据分布地存储于多个节点，它通过将一个索引切分为多个底层物理的Lucene索引完成索引数据的分割存储功能，这每一个物理的Lucene索引称为一个分片(shard)。
//每个分片其内部都是一个全功能且独立的索引，因此可由集群中的任何主机存储。创建索引时，用户可指定其分片的数量，默认数量为5个。

//Shard有两种类型：primary和replica，即主shard及副本shard。
//Primary shard用于文档存储，每个新的索引会自动创建5个Primary shard，当然此数量可在索引创建之前通过配置自行定义，不过，一旦创建完成，其Primary shard的数量将不可更改。

//replicas:每一个主分片关联的副本分片(Replica Shard)的数量，默认值是1。这个设置在任何时候都可以被修改。
//Replica shard是Primary Shard的副本，用于冗余数据及提高搜索性能。
//每个Primary shard默认配置了一个Replica shard，但也可以配置多个，且其数量可动态更改。ES会根据需要自动增加或减少这些Replica shard的数量。

//简而言之，分片实现了集群的分布式存储，而副本实现了其分布式处理及冗余功能。

//indexStoreType存储类型
//simplefs类型是一个简单的实现随机访问文件的文件存储系统（映射到Lucene SimpleFsDirectory的）。该实现的并发性能较差（多线程是个瓶颈）。
//niofs类型是通过NIO将分片索引文件写到文件系统上（映射到Lucene NIOFSDirectory）。它允许多线程同时读取文件。
//mmapfs类型存储分片索引到文件系统上（映射到Lucene MMapDirectory）通过映射文件到内存中（MMAP）。内存映射的过程中将划分出与被映射文件大小一样的虚拟内存空间。使用这个类之前，请确保您有足够的虚拟地址空间。

//http://192.168.18.200:9200/es_test/es_order/1
//{"_index":"es_order_index","_type":"es_order_type","_id":"1","_version":1,"found":true,"_source":{"id":1,"userName":"userName1","skuName":"skuName1","memo":"测试1"}}
@Document(indexName="es_test", type="es_order", shards=1, replicas=1 )
public class OrderDomain {
	@Id
	@Field(type=FieldType.Long,index=FieldIndex.not_analyzed, store=true)
	private Long id;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)  
	private String userName;
	
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)  
	private String skuName;
	
	
	//type，字段的类型为string，只有string类型才涉及到分词，像是数字之类的是不需要分词的。
	//store，定义字段的存储方式，no代表不单独存储，查询的时候会从_source中解析。当你频繁的针对某个字段查询时，可以考虑设置成true。
	//term_vector，定义了词的存储方式，with_position_offsets，意思是存储词语的偏移位置，在结果高亮的时候有用。
	//analyzer，定义了索引时的分词方法
	//search_analyzer，定义了搜索时的分词方法
	//include_in_all，定义了是否包含在_all字段中
	//boost，是跟计算分值相关的。
	
	//ik默认ik_max_word
//	@Field(type = FieldType.String, analyzer="ik", searchAnalyzer="ik", store = true)
//	@Field(type = FieldType.String, analyzer="ik_max_word", searchAnalyzer="ik_max_word", store = true)
	@Field(type = FieldType.String,  analyzer="ik_smart", searchAnalyzer="ik_smart", store = true)
	private String memo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "Order{" + "id=" + id + ", userName='" + userName + '\'' + ", skuName='" + skuName + '\'' + '}';
	}
}
