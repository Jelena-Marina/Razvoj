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
import javax.persistence.ManyToOne;
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
@Table(name = "KNJIGA")
@NamedQueries({
    @NamedQuery(name = "Knjiga.findAll", query = "SELECT k FROM Knjiga k")})
public class Knjiga implements Serializable {
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
    @Column(name = "BK_ISBN")
    private String bkIsbn;
    @Column(name = "BK_GL_NASLOV")
    private String bkGlNaslov;
    @Column(name = "BK_UP_NASLOV")
    private String bkUpNaslov;
    @Column(name = "BK_PD_NASLOV")
    private String bkPdNaslov;
    @Column(name = "BK_OPIS_KRATAK")
    private String bkOpisKratak;
    @Column(name = "BK_IZDANJE")
    private String bkIzdanje;
    @Column(name = "BK_LINK")
    private String bkLink;
    @Column(name = "BK_NAPOMENA")
    private String bkNapomena;
    @Column(name = "BK_GODINA_IZDANJA")
    private String bkGodinaIzdanja;
    @Column(name = "BK_SIGNATURA")
    private String bkSignatura;
    @Column(name = "BK_UKUPNO")
    private int bkUkupno;
    @Column(name = "BK_UDK")
    private String bkUdk;
    @JoinColumn(name = "PUB_ID", referencedColumnName = "ID")
    @ManyToOne
    private Publikacija pubId;
    @JoinColumn(name = "OBL_ID", referencedColumnName = "ID")
    @ManyToOne
    private Oblast oblId;
    @JoinColumn(name = "JEZ_ID", referencedColumnName = "ID")
    @ManyToOne
    private Jezik jezId;
    @JoinColumn(name = "IZD_ID", referencedColumnName = "ID")
    @ManyToOne
    private Izdavac izdId;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AbstractEntity abstractEntity;
    @OneToMany(mappedBy = "knjId")
    private List<Zaduzenja> zaduzenjaList;
    @OneToMany(mappedBy = "knjId")
    private List<AutoriLista> autoriListaList;

    public Knjiga() {
    }

    public Knjiga(Long id) {
        this.id = id;
    }

    public Knjiga(Long id, int recordStatus) {
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

    public String getBkIsbn() {
        return bkIsbn;
    }

    public void setBkIsbn(String bkIsbn) {
        this.bkIsbn = bkIsbn;
    }

    public String getBkGlNaslov() {
        return bkGlNaslov;
    }

    public void setBkGlNaslov(String bkGlNaslov) {
        this.bkGlNaslov = bkGlNaslov;
    }

    public String getBkUpNaslov() {
        return bkUpNaslov;
    }

    public void setBkUpNaslov(String bkUpNaslov) {
        this.bkUpNaslov = bkUpNaslov;
    }

    public String getBkPdNaslov() {
        return bkPdNaslov;
    }

    public void setBkPdNaslov(String bkPdNaslov) {
        this.bkPdNaslov = bkPdNaslov;
    }

    public String getBkOpisKratak() {
        return bkOpisKratak;
    }

    public void setBkOpisKratak(String bkOpisKratak) {
        this.bkOpisKratak = bkOpisKratak;
    }

    public String getBkIzdanje() {
        return bkIzdanje;
    }

    public void setBkIzdanje(String bkIzdanje) {
        this.bkIzdanje = bkIzdanje;
    }

    public String getBkLink() {
        return bkLink;
    }

    public void setBkLink(String bkLink) {
        this.bkLink = bkLink;
    }

    public String getBkNapomena() {
        return bkNapomena;
    }

    public void setBkNapomena(String bkNapomena) {
        this.bkNapomena = bkNapomena;
    }

    public String getBkGodinaIzdanja() {
        return bkGodinaIzdanja;
    }

    public void setBkGodinaIzdanja(String bkGodinaIzdanja) {
        this.bkGodinaIzdanja = bkGodinaIzdanja;
    }

    public String getBkSignatura() {
        return bkSignatura;
    }

    public void setBkSignatura(String bkSignatura) {
        this.bkSignatura = bkSignatura;
    }

    public int getBkUkupno() {
        return bkUkupno;
    }

    public void setBkUkupno(int bkUkupno) {
        this.bkUkupno = bkUkupno;
    }

    public String getBkUdk() {
        return bkUdk;
    }

    public void setBkUdk(String bkUdk) {
        this.bkUdk = bkUdk;
    }

    public Publikacija getPubId() {
        return pubId;
    }

    public void setPubId(Publikacija pubId) {
        this.pubId = pubId;
    }

    public Oblast getOblId() {
        return oblId;
    }

    public void setOblId(Oblast oblId) {
        this.oblId = oblId;
    }

    public Jezik getJezId() {
        return jezId;
    }

    public void setJezId(Jezik jezId) {
        this.jezId = jezId;
    }

    public Izdavac getIzdId() {
        return izdId;
    }

    public void setIzdId(Izdavac izdId) {
        this.izdId = izdId;
    }

    public AbstractEntity getAbstractEntity() {
        return abstractEntity;
    }

    public void setAbstractEntity(AbstractEntity abstractEntity) {
        this.abstractEntity = abstractEntity;
    }

    public List<Zaduzenja> getZaduzenjaList() {
        return zaduzenjaList;
    }

    public void setZaduzenjaList(List<Zaduzenja> zaduzenjaList) {
        this.zaduzenjaList = zaduzenjaList;
    }

    public List<AutoriLista> getAutoriListaList() {
        return autoriListaList;
    }

    public void setAutoriListaList(List<AutoriLista> autoriListaList) {
        this.autoriListaList = autoriListaList;
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
        if (!(object instanceof Knjiga)) {
            return false;
        }
        Knjiga other = (Knjiga) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rs.ac.isum.entities.Knjiga[ id=" + id + " ]";
    }
    
}
