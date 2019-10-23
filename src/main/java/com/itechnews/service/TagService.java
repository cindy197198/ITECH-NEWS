package com.itechnews.service;

import com.itechnews.entity.Tag;
import org.springframework.data.domain.Page;

public interface TagService {
    Page<Tag> findAll(Integer pageNumber);
    Page<Tag> findAllByNameContains(String searchingName, Integer pageNumber);
    Tag findOneById(Integer id);
    void deleteById(Integer id);
    Tag save(Tag tag);
}