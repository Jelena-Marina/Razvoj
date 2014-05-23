/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.isum.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jelena
 */
@Entity
@Table(name = "ABSTRACT_ENTITY")
@NamedQueries({
    @NamedQuery(name = "AbstractEntity.findAll", query = "SELECT a FROM AbstractEntity a")})
public class AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "RECORD_STATUS")
    private int recordStatus;
    @Column(name = "LAST_MODIFICATION_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModificationTime;
    @Column(name = "LAST_MODIFIED_BY_USER")
    private String lastModifiedByUser;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Knjiga knjiga;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Autor autor;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Oblast oblast;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Jezik jezik;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Student student;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Zaduzenja zaduzenja;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Osoba osoba;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private AutoriLista autoriLista;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Publikacija publikacija;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Zaposleni zaposleni;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "abstractEntity")
    private Izdavac izdavac;

    public AbstractEntity() {
    }

    public AbstractEntity(Long id) {
        this.id = id;
    }

    public AbstractEntity(Long id, int recordStatus) {
        this.id = id;
        this.recordStatus = recordStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(int recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Date getLastModificationTime() {
        return lastModificationTime;
    }

    public void setLastModificationTime(Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    public String getLastModifiedByUser() {
        return lastModifiedByUser;
    }

    public void setLastModifiedByUser(String lastModifiedByUser) {
        this.lastModifiedByUser = lastModifiedByUser;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Oblast getOblast() {
        return oblast;
    }

    public void setOblast(Oblast oblast) {
        this.oblast = oblast;
    }

    public Jezik getJezik() {
        return jezik;
    }

    public void setJezik(Jezik jezik) {
        this.jezik = jezik;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Zaduzenja getZaduzenja() {
        return zaduzenja;
    }

    public void setZaduzenja(Zaduzenja zaduzenja) {
        this.zaduzenja = zaduzenja;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public AutoriLista getAutoriLista() {
        return autoriLista;
    }

    public void setAutoriLista(AutoriLista autoriLista) {
        this.autoriLista = autoriLista;
    }

    public Publikacija getPublikacija() {
        return publikacija;
    }

    public void setPublikacija(Publikacija publikacija) {
        this.publikacija = publikacija;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Izdavac getIzdavac() {
        return izdavac;
    }

    public void setIzdavac(Izdavac izdavac) {
        this.izdavac = izdavac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AbstractEntity)) {
            return false;
        }
        AbstractEntity other = (AbstractEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rs.ac.isum.entities.AbstractEntity[ id=" + id + " ]";
    }
    
}
