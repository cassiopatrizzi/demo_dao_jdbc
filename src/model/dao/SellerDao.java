package model.dao;

import db.DbException;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    Seller findById(Integer id);

    List<Seller> findAll();

    List<Seller> findByDepartment(Department department) throws DbException;
}
