package com.zyaml.nai.repository;

import com.zyaml.nai.entry.node.Tags;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Author: 994
 * @Date: 2020-03-15 15:40
 */
public interface TimeCql extends Neo4jRepository<Tags,Long> {

}
