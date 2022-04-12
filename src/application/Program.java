package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Department department = new Department(2, null);
//      List<Seller> list = sellerDao.findByDepartment(department);

        /*
        System.out.println("\n=== TEST 1: seller findByiD ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller seller : list) {
            System.out.println(seller);


        System.out.println("\n=== TEST 3: seller findAll ===");
        List<Seller> list = sellerDao.findAll();
        for (Seller seller : list) {
        System.out.println(seller);
        */

        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
            }
        }




