/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.util.List;

/**
 *
 * @author michael
 */
public class Aimodotes {

    private Integer am;
    private String lastName;
    private String name;
    private String address;
    private String phone;
    private String bloodType;
    private List<Prosfora> prosforaList;

    public Aimodotes() {
    }

    public Aimodotes(Integer am) {
        this.am = am;
    }

    public Integer getAm() {
        return am;
    }

    public void setAm(Integer am) {
        this.am = am;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public List<Prosfora> getProsforaList() {
        return prosforaList;
    }

    public void setProsforaList(List<Prosfora> prosforaList) {
        this.prosforaList = prosforaList;
    }

    public int hashCode() {
        int hash = 0;
        hash += (am != null ? am.hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aimodotes)) {
            return false;
        }
        Aimodotes other = (Aimodotes) object;
        if ((this.am == null && other.am != null) || (this.am != null && !this.am.equals(other.am))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "servlets.Aimodotes[ am=" + am + " ]";
    }
    
}
