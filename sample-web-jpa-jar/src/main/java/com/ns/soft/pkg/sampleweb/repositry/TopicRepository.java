package com.ns.soft.pkg.sampleweb.repositry;

import org.springframework.data.repository.CrudRepository;

import com.ns.soft.pkg.sampleweb.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
