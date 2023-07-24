package com.example.vaccination.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="userdetails")
public class User {
    
    @Id
    private Long id;
    private String idtype;
    private String name;
    private String contactnum;
    private String vaccinename;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdtype() {
        return idtype;
    }
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactnum() {
        return contactnum;
    }
    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }
    public String getVaccinename() {
        return vaccinename;
    }
    public void setVaccinename(String vaccinename) {
        this.vaccinename = vaccinename;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", idtype=" + idtype + ", name=" + name + ", contactnum=" + contactnum
                + ", vaccinename=" + vaccinename + "]";
    }

   

    
}
