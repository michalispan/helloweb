/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author michael
 */
public class Aimodotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AM")
    private Integer am;
    @Size(max = 20)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Size(max = 20)
    @Column(name = "NAME")
    private String name;
    @Size(max = 20)
    @Column(name = "ADDRESS")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 15)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 20)
    @Column(name = "BLOOD_TYPE")
    private String bloodType;
    @OneToMany(mappedBy = "am")
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
