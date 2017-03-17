/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Μιχάλης
 */
public class dbmanager {

    public dbmanager() {
    }

    public void createDonor(Aimodotes donor) {
        System.out.println("Created donor: " + donor.getAm() + "-" + donor.getLastName());
    }

    public List<Aimodotes> getDonors() {
        List<Aimodotes> list = new ArrayList<>();

        Aimodotes a = new Aimodotes();
        a.setAm(1);
        a.setLastName("Panagiotidis");
        a.setName("Vasilis");
        a.setBloodType("0+");
        a.setAddress("Kazantzaki 4B");
        a.setPhone("2310545781");
        a.setProsforaList(new ArrayList<>());
        list.add(a);

        a = new Aimodotes();
        a.setAm(2);
        a.setLastName("Pelkas");
        a.setName("Dimitris");
        a.setBloodType("ΑΒ+");
        a.setAddress("Γλυνου 56");
        a.setPhone("2313027727");
        a.setProsforaList(new ArrayList<>());
        list.add(a);
        return list;
    }

    Aimodotes getDonor(int am) {
        Aimodotes a = new Aimodotes();
        a.setAm(1);
        a.setLastName("Panagiotidis");
        a.setName("Vasilis");
        a.setBloodType("0+");
        a.setAddress("Kazantzaki 4B");
        a.setPhone("2310545781");
        
        List<Prosfora> list = new ArrayList<>();
        
        Prosfora p = new Prosfora();
        p.setPkP(1);
        p.setAm(a.getAm());
        p.setBloodBottle(1);
        p.setTheirsBlood(0);
        p.setDate(new Date());
        p.setSxolia("ΑΙΜΟΔΟΣΙΑ ΣΤΟ ΠΑΠΑΝΙΚΟΛΑΟΥ");
        list.add(p);
        
        p = new Prosfora();
        p.setPkP(2);
        p.setAm(a.getAm());
        p.setBloodBottle(1);
        p.setTheirsBlood(0);
        p.setDate(new Date());
        p.setSxolia("ΑΙΜΟΔΟΣΙΑ ΣΤΟ ΓΕΝΝΗΜΑΤΑ");
        list.add(p);
        
        p = new Prosfora();
        p.setPkP(3);
        p.setAm(a.getAm());
        p.setBloodBottle(0);
        p.setTheirsBlood(1);
        p.setDate(new Date());
        p.setSxolia("ΧΡΗΣΗ ΦΙΑΛΗΣ ΓΙΑ ΑΣΘΕΝΕΙΑ");
        list.add(p);
        
        a.setProsforaList(list);
        
        return a;
    }

    void updateDonor(Aimodotes donor) {
        System.out.println("Updated donor: " + donor.getAm() + "-" + donor.getLastName());
    }

    void createMovement(Prosfora dorea) {
        System.out.println("Created Movement: " + dorea.getAm() + "-" + dorea.getBloodBottle());
    }
    

}
 