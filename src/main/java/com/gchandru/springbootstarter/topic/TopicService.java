package com.gchandru.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1","java","Spring"),new Topic("2","java","Something")));
	
	@Autowired
	private TopicRepository repo;
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<>();
		repo.findAll().forEach(topics::add);
		return topics;
		
	}
	
	public Topic getTopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return repo.findOne(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		repo.save(topic);
		
	}
	
	public void updateTopic(Topic topic, String id)
	{
//		for(int i=0;i<topics.size();i++)
//		{
//			Topic t=topics.get(i);
//			if(t.getId().equals(id))
//			{
//				topics.set(i, topic);
//				return;
//			}
//		}
		repo.save(topic);
	}

	public void deleteTopic(String id) {
//		for(int i=0;i<topics.size();i++)
//		{
//			Topic t=topics.get(i);
//			if(t.getId().equals(id))
//			{
//				topics.remove(i);
//				return;
//			}
//		}
		//topics.removeIf(t -> t.getId().equals(id));
		repo.delete(id);
		
	}
}
