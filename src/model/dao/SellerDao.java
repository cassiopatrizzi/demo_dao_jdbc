package model.dao;

import model.entities.Department;

import java.util.List;

public interface SellerDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Department id);
    Department findById(Integer id);
    List<Department> findAll();
}