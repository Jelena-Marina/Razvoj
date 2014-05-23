/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.isum.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jelena
 */
@Entity
@Table(name = "OSOBA")
@NamedQueries({
    @NamedQuery(name = "Osoba.findAll", query = "SELECT o FROM Osoba o")})
public class Osoba extends AbstractEntity  implements Serializable {
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
    @Basic(optional = false)
    @Column(name = "IME")
    private String ime;
    @Basic(optional = false)
    @Column(name = "PREZIME")
    private String prezime;
    @Column(name = "POL")
    private String pol;
    @Column(name = "JMBG")
    private String jmbg;
    @Column(name = "DATUM_RODJENJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datumRodjenja;
    @Column(name = "DRZAVLJANSTVO")
    private String drzavljanstvo;
    @Column(name = "NACIONALNOST")
    private String nacionalnost;
    @Column(name = "SLIKA")
    private String slika;
    @Column(name = "RODITELJ")
    private String roditelj;
    @Column(name = "BRLK")
    private String brlk;
    @OneToMany(mappedBy = "osoId")
    private List<Student> studentList;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AbstractEntity abstractEntity;
    @OneToMany(mappedBy = "osoId")
    private List<Zaposleni> zaposleniList;

    public Osoba() {
    }

    public Osoba(Long id) {
        this.id = id;
    }

    public Osoba(Long id, int recordStatus, String ime, String prezime) {
        this.id = id;
        this.recordStatus = recordStatus;
        this.ime = ime;
        this.prezime = prezime;
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

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getDrzavljanstvo() {
        return drzavljanstvo;
    }

    public void setDrzavljanstvo(String drzavljanstvo) {
        this.drzavljanstvo = drzavljanstvo;
    }

    public String getNacionalnost() {
        return nacionalnost;
    }

    public void setNacionalnost(String nacionalnost) {
        this.nacionalnost = nacionalnost;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getRoditelj() {
        return roditelj;
    }

    public void setRoditelj(String roditelj) {
        this.roditelj = roditelj;
    }

    public String getBrlk() {
        return brlk;
    }

    public void setBrlk(String brlk) {
        this.brlk = brlk;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public AbstractEntity getAbstractEntity() {
        return abstractEntity;
    }

    public void setAbstractEntity(AbstractEntity abstractEntity) {
        this.abstractEntity = abstractEntity;
    }

    public List<Zaposleni> getZaposleniList() {
        return zaposleniList;
    }

    public void setZaposleniList(List<Zaposleni> zaposleniList) {
        this.zaposleniList = zaposleniList;
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
        if (!(object instanceof Osoba)) {
            return false;
        }
        Osoba other = (Osoba) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rs.ac.isum.entities.Osoba[ id=" + id + " ]";
    }
    
}
