package model.dao;

import model.entities.Seller;

public interface SellerDao {

    Seller findById(Integer id);
}
