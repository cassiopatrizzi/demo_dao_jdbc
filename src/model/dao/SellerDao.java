package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLException;
import java.util.List;

public interface SellerDao {

    void insert(Seller seller) throws SQLException;

    void update(Seller seller) throws SQLException;

    void deleteById(Integer id) throws SQLException;

    Seller findById(Integer id) throws SQLException;

    List<Seller> findAll() throws SQLException;

    List<Seller> findByDepartment(Department department) throws SQLException;
}
