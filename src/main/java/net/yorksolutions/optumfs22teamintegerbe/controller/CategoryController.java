package net.yorksolutions.optumfs22teamintegerbe.controller;

import net.yorksolutions.optumfs22teamintegerbe.entity.Category;
import net.yorksolutions.optumfs22teamintegerbe.service.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
@CrossOrigin
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) { this.categoryService = categoryService; }

    @PostMapping
    public Category createCategory(@RequestBody Category category) { return this.categoryService.create(category);}

    @PutMapping
    public Category updateCategory(@RequestBody Category category) { return this.categoryService.update(category);}

    @GetMapping
    public Iterable<Category> getAllCategoriesList() { return this.categoryService.getAllCategoies();}

}
