package net.bmbsolutions.mouincourse.controller;


import net.bmbsolutions.mouincourse.entity.Category;
import net.bmbsolutions.mouincourse.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.save(category);
    }

    @GetMapping
    public List<Category> getCategories(){
        return categoryService.findAll();
    }

    @PutMapping({"id"})
    public Category updateCategory(@RequestBody Long id,@RequestBody Category category){
        category.setId(id);
        return categoryService.save(category);




    }


}
