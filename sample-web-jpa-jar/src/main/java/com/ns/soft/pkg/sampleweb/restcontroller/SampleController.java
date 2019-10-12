package com.ns.soft.pkg.sampleweb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ns.soft.pkg.sampleweb.exception.TopicNotFoundException;
import com.ns.soft.pkg.sampleweb.model.Topic;
import com.ns.soft.pkg.sampleweb.service.TopicService;

@RestController
public class SampleController {

	@Autowired
	private TopicService topicService;

	@RequestMapping(value = "/sampleController", method = RequestMethod.GET)
	public String sampleController() {
		return "Hello Sankar Welcome to Spring Boot World";
	}

	@RequestMapping(value = "/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(value = "/topics/{pathvariable}")
	public Topic getTopicWithPathVariabl(@PathVariable(name = "pathvariable") String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(String id, @RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

	@RequestMapping(value = "/")
	public String name() {
		return "demo";
	}
	@RequestMapping(value = "/updateTopic/{id}", method = RequestMethod.PUT)
	public void updateTopicThrowException(String id, @RequestBody Topic topic) {
		throw new TopicNotFoundException();
	}
}
