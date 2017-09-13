package com.gchandru.springbootstarter.topic;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends MongoRepository<Topic, String> {

}
