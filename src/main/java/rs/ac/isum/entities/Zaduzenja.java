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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ZADUZENJA")
@NamedQueries({
    @NamedQuery(name = "Zaduzenja.findAll", query = "SELECT z FROM Zaduzenja z")})
public class Zaduzenja implements Serializable {
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
    @Column(name = "BZ_DATUM_ZADUZENJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bzDatumZaduzenja;
    @Column(name = "BZ_DATUM_VRACANO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bzDatumVracano;
    @Column(name = "BZ_VRACENO")
    private int bzVraceno;
    @JoinColumn(name = "ZAP_ID2", referencedColumnName = "ID")
    @ManyToOne
    private ZaposleniBibliotekar zapId2;
    @JoinColumn(name = "ZAP_ID", referencedColumnName = "ID")
    @ManyToOne
    private Zaposleni zapId;
    @JoinColumn(name = "STU_ID", referencedColumnName = "ID")
    @ManyToOne
    private Student stuId;
    @JoinColumn(name = "KNJ_ID", referencedColumnName = "ID")
    @ManyToOne
    private Knjiga knjId;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AbstractEntity abstractEntity;

    public Zaduzenja() {
    }

    public Zaduzenja(Long id) {
        this.id = id;
    }

    public Zaduzenja(Long id, int recordStatus) {
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

    public Date getBzDatumZaduzenja() {
        return bzDatumZaduzenja;
    }

    public void setBzDatumZaduzenja(Date bzDatumZaduzenja) {
        this.bzDatumZaduzenja = bzDatumZaduzenja;
    }

    public Date getBzDatumVracano() {
        return bzDatumVracano;
    }

    public void setBzDatumVracano(Date bzDatumVracano) {
        this.bzDatumVracano = bzDatumVracano;
    }

    public int getBzVraceno() {
        return bzVraceno;
    }

    public void setBzVraceno(int bzVraceno) {
        this.bzVraceno = bzVraceno;
    }

    public ZaposleniBibliotekar getZapId2() {
        return zapId2;
    }

    public void setZapId2(ZaposleniBibliotekar zapId2) {
        this.zapId2 = zapId2;
    }

    public Zaposleni getZapId() {
        return zapId;
    }

    public void setZapId(Zaposleni zapId) {
        this.zapId = zapId;
    }

    public Student getStuId() {
        return stuId;
    }

    public void setStuId(Student stuId) {
        this.stuId = stuId;
    }

    public Knjiga getKnjId() {
        return knjId;
    }

    public void setKnjId(Knjiga knjId) {
        this.knjId = knjId;
    }

    public AbstractEntity getAbstractEntity() {
        return abstractEntity;
    }

    public void setAbstractEntity(AbstractEntity abstractEntity) {
        this.abstractEntity = abstractEntity;
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
        if (!(object instanceof Zaduzenja)) {
            return false;
        }
        Zaduzenja other = (Zaduzenja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rs.ac.isum.entities.Zaduzenja[ id=" + id + " ]";
    }
    
}
