package com.learnspring.restapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	@Autowired
	private TopicService  topicService;
	
	@GetMapping("/topic")
	public List<Topic> getTopics() {
		
		return topicService.getalltopics();
	}
	
	@GetMapping("/topic/{id}")

	public Topic getTopicId(@PathVariable("id") String id) { 
		return topicService.getTopicId(id);
	}
		
	
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topic/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id) {
		 topicService.updateTopic(topic,id);
	}
	
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable("id") String id) {
		topicService.deleteTopic(id);
	}
	
}


