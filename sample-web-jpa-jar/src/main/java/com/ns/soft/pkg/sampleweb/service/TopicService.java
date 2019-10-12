package com.ns.soft.pkg.sampleweb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ns.soft.pkg.sampleweb.model.Topic;
import com.ns.soft.pkg.sampleweb.repositry.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("Spring", "Spring FrameWork", "Spring FrameWork Description"),
					new Topic("Java", "Java FrameWork", "Java FrameWork Description"),
					new Topic("Javascript", "Javascript FrameWork", "Javascript FrameWork Description")));

	public List<Topic> getAllTopics() {
		return (List<Topic>) topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
