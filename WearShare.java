/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
/**
 *
 * @author Admin
 */

import java.util.*;

public class WearShare {

    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        int Hi = 77;
//        System.out.println("Hi after effect " + Hi);

        User userHead = new User();
        Donor donorHead = new Donor();
        logIn(donorHead, "asdasd", "adas");
        
     Beneficiary reqBenf = new Beneficiary();
        Association headAss = new Association();
           requestBenf(reqBenf, headAss, Hi);
        Beneficiary beneHead = new Beneficiary();
        Store storeHead = new Store();
//        Donor donorHead = new Donor();
        Association assHead = new Association();

  

        // test
//        System.out.println(donorHead.getRewards());
//        System.out.println(beneHead.getID());
//
//        Beneficiary aadonorHead = new Beneficiary();
//        System.out.println(aadonorHead.getheadClothes());
        

    }

    public static boolean logIn(User check   ,  String userName, String password) {
        
        if ( check.login(check, userName, password) ) {
            System.out.println(" welcome    "+ userName );
        }else   {
            System.out.println(" please check you name or you password ");
        }
        
        return false;
    }

    public static String generalList() {
        // Imp
        return "";
    }

    public static String clothesList() {

        return "";
    }

    public static String storesList() {
        // Imp
        return "";
    }

    public static boolean requestBenf(Beneficiary reqBenf, Association headAss, int clotheID) {

        if (headAss.getHeadClothes().searchByID(clotheID) != null) {

            reqBenf.getheadClothes().addFirst(headAss.getHeadClothes().searchByID(clotheID));

            headAss.getHeadClothes().removeItem(headAss.getHeadClothes().searchByID(clotheID));
            System.out.println("saaaaa");
            return true;
        }else{
            
            
            System.out.println(" you have problem with you request  ");
        }

        return false;
    }

    public static boolean requestDonor(Donor reqDonor, Association headAss) {
       
        




// Imp
        return false;
    }

    // public static int ML(BufferedImage image)
    public static int ML(int num) {
        // Imp
        return 0;
    }

    public static boolean useReward(Beneficiary reqBenf, Store headStore, int storeID) {
        // Imp
        return false;
    }

    // HIIII
}
