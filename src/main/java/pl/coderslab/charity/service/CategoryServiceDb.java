package pl.coderslab.charity.service;

import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.repository.CategoryRepository;

import java.util.List;

public class CategoryServiceDb implements CategoryService{

    CategoryRepository categoryRepository;

    public CategoryServiceDb(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @Override
    public List<Category> findAll() {

        return categoryRepository.findAll();
    }
}
