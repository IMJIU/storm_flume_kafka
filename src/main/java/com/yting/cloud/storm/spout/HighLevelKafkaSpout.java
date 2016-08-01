package com.yting.cloud.storm.spout;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.yting.cloud.kafa.consumer.MyHighLevelConsumer;
import kafka.javaapi.consumer.ConsumerConnector;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichSpout;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Fields;
/**
 * Storm spout
 * 
 * @Author ����ͥ
 * @Time 2014-07-14
 *
 */
public class HighLevelKafkaSpout implements IRichSpout {
	private static final Log log = LogFactory.getLog(HighLevelKafkaSpout.class);
	private SpoutOutputCollector collector;
	private ConsumerConnector consumer;
	private String topic;
	private int a_numThreads = 1;

	public HighLevelKafkaSpout() {
	}
	
	public HighLevelKafkaSpout(String topic) {
		this.topic = topic;
	}

	@Override
	public void nextTuple() {

	}

	@Override
	public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
		this.collector = collector;
	}

	@Override
	public void ack(Object msgId) {
		log.info("--------->ack");
	}

	@Override
	public void activate() {
		log.info("--------->activate start--------->");
		MyHighLevelConsumer.main(null);
		// ����ľ����������ع�����������collector.emit(new Values("need to emit"));�����Ĵ���Ҳ��ûд�ģ�����˼һ����
		log.info("--------->activate end--------->");
	}

	@Override
	public void close() {
		log.info("--------->close");
	}

	@Override
	public void deactivate() {
		log.info("--------->deactivate");
	}

	@Override
	public void fail(Object msgId) {
		log.info("--------->fail");
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("highLevelKafkaSpout"));
	}

	@Override
	public Map<String, Object> getComponentConfiguration() {
		log.info("--------->getComponentConfiguration");
		return null;
	}

}
id open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
		this.collector = collector;
	}

	@Override
	public void ack(Object msgId) {
		log.info("--------->ack");
	}

	@Override
	public void activate() {
		log.info("--------->activate start--------->");
		MyHighLevelConsumer.main(null);
		// ����ľ����������ع�����������collector.emit(new Values("need to emit"));�����Ĵ���Ҳ��ûд�ģ�����˼һ����
		log.info("--------->activate end--------->");
	}

	@Override
	public void close() {
		log.info("--------->close");
	}

	@Override
	public void deactivate() {
		log.info("--------->deactivate");
	}

	@Override
	public void fail(Object msgId) {
		log.info("--------->fail");
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("highLevelKafkaSpout"));
	}

	@Override
	public Map<String, Object> getComponentConfiguration() {
		log.info("--------->getComponentConfiguration");
		return null;
	}