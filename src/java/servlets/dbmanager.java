/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author Μιχάλης
 */
class dbmanager {

    static void createDonor(Aimodotes donor) {
        System.out.println("Created donor: " + donor.getAm() + "-" + donor.getLastName());
    }

}
