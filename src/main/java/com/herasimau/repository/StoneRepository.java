package com.herasimau.repository;

import com.herasimau.dto.stones.Stone;
import com.herasimau.dto.stones.StoneType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by herasimau on 29/01/17.
 */
@RepositoryRestResource(collectionResourceRel = "swarovski", path = "swarovski")
public interface StoneRepository extends CrudRepository<Stone, Long> {
    List<Stone> findByType(@Param("type")StoneType type);

}
