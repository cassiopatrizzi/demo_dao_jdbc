package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        Seller seller = null;

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}




