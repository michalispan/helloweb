/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author michael
 */
public class Prosfora {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PK_P")
    private Integer pkP;
    @Column(name = "BLOOD_BOTTLE")
    private Integer bloodBottle;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "THEIRS_BLOOD")
    private Integer theirsBlood;
    @JoinColumn(name = "AM", referencedColumnName = "AM")
    @ManyToOne
    private Aimodotes am;

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

    public Aimodotes getAm() {
        return am;
    }

    public void setAm(Aimodotes am) {
        this.am = am;
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
