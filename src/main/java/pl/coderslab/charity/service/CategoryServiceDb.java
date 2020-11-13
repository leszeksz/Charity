package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.repository.CategoryRepository;

import java.util.List;

@Service
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
