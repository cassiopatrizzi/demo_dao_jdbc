package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        /*
        System.out.println("\n=== TEST 1: seller findByiD ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller seller : list) {
            System.out.println(seller);
        */

        System.out.println("\n=== TEST 3: seller findAll ===");
        List<Seller> list = sellerDao.findAll();
        for (Seller seller : list) {
        System.out.println(seller);
            }
        }
    }




