package net.yorksolutions.optumfs22teamintegerbe.service;

import net.yorksolutions.optumfs22teamintegerbe.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    //put methods here
}
