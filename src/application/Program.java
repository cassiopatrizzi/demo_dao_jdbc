package application;

import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = new SellerDaoJDBC();

        /*
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);


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


        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());


        System.out.println("\n=== TEST 5: seller update ===");
        Seller seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        seller.setBaseSalary(3500.0);
        sellerDao.update(seller);
        System.out.println("Update completed");
    }
*/

        System.out.println("\n=== TEST 6: seller deleteById ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();
    }
}





