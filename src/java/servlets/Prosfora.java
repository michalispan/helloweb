/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.util.Date;

/**
 *
 * @author michael
 */
public class Prosfora {

    private Integer pkP;
    private Integer bloodBottle;
    private Date date;
    private String sxolia;
    private Integer theirsBlood;
    private Integer am;

    public Prosfora() {
    }

    public Prosfora(Integer pkP) {
        this.pkP = pkP;
    }

    public Integer getPkP() {
        return pkP;
    }

    public void setPkP(Integer pkP) {
        this.pkP = pkP;
    }

    public Integer getBloodBottle() {
        return bloodBottle;
    }

    public void setBloodBottle(Integer bloodBottle) {
        this.bloodBottle = bloodBottle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTheirsBlood() {
        return theirsBlood;
    }

    public void setTheirsBlood(Integer theirsBlood) {
        this.theirsBlood = theirsBlood;
    }

    public Integer getAm() {
        return am;
    }

    public void setAm(Integer am) {
        this.am = am;
    }

    public String getSxolia() {
        return sxolia;
    }

    public void setSxolia(String sxolia) {
        this.sxolia = sxolia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkP != null ? pkP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prosfora)) {
            return false;
        }
        Prosfora other = (Prosfora) object;
        if ((this.pkP == null && other.pkP != null) || (this.pkP != null && !this.pkP.equals(other.pkP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "servlets.Prosfora[ pkP=" + pkP + " ]";
    }
    
}
