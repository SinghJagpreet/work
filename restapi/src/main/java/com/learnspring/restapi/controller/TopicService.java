package com.learnspring.restapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	


	private Topic newVar = new Topic("4","JJ", "JJ Rocks!");
	private  Topic[] arr = {
			new Topic("CS","Spring","CS101"),
			new Topic("IT","Spring","IT101"),
			new Topic("EC","Spring","EC101 "),
			newVar
			};
	
	List<Topic> topic = new ArrayList<>(Arrays.asList(arr));

	
	
	public  List<Topic> getalltopics() {
		
		return  topic;
	}

	
	
	
	public Topic getTopicId(String id) {

		return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}



	public void addTopic(Topic newVar) {

		topic.add(newVar);

	}




	public void updateTopic(Topic topic, String id) { 
		System.out.println("Topic :"+ topic + "id : "+ id +"size: "+ this.topic.size());
		
		int size = this.topic.size();
		
		for(int i=0; i <  size;i++) {
			Topic t = this.topic.get(i);
			if(t.getId().equals(id)) {
				this.topic.set(i, topic);
				return; 
			}
		}
 		
	}



	public void deleteTopic(String id) {
		 topic.removeIf(t ->t.getId().equals(id));
		
	}

}
