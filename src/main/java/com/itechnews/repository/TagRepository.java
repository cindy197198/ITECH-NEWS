package com.itechnews.repository;

import com.itechnews.entity.Tag;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TagRepository
        extends PagingAndSortingRepository<Tag, Integer>,
        JpaSpecificationExecutor<Tag>,
        CrudRepository<Tag, Integer> {

    /*
     * search
     * sort_by
     * direction
     * offset
     * limit
     *
     * where (:q is null or c.name like %:q%)
     * /api/category?q=java
     *
     * if :q == null => where 1
     * https://www.baeldung.com/spring-data-jpa-null-parameters
     * Ignoring null Parameters Using the @Query Annotation
     *
     * if :q != null => where c.name like %:q%
     * */

    //    @Query(
//        value = "select t from Tag t where (:q is null or t.name like %:q%) and (t.status = true)"
//    )
//    Page<Tag> findAllOrFilter(@Param("q") String searchingText, Pageable pageable);
//
    Tag findBySlug(String slug);

    Tag findOneByName(String name);
}
