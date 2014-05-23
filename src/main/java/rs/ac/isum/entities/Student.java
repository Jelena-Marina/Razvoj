/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.isum.entities;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigInteger;
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
@Table(name = "STUDENT")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")})
public class Student implements Serializable {
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
    @Column(name = "INDEKS")
    private int indeks;
    @Column(name = "SN_INDEX")
    private String snIndex;
    @Column(name = "PROSEK_INFORMATIKA")
    private BigInteger prosekInformatika;
    @Column(name = "PROSEK_MATEMATIKA")
    private BigInteger prosekMatematika;
    @Column(name = "PRVI_RAZRED")
    private Long prviRazred;
    @Column(name = "DRUGI_RAZRED")
    private Long drugiRazred;
    @Column(name = "TRECI_RAZRED")
    private Long treciRazred;
    @Column(name = "CETVRTI_RAZRED")
    private Long cetvrtiRazred;
    @Column(name = "GODINA_ZAVRSETKA")
    private String godinaZavrsetka;
    @Column(name = "IME_DIPLOME")
    private String imeDiplome;
    @Column(name = "OPIS_DIPLOME")
    private String opisDiplome;
    @Column(name = "DATUM_DIPLOME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datumDiplome;
    @Column(name = "ZANIMANJE_RODITELJA")
    private String zanimanjeRoditelja;
    @Column(name = "BELESKE")
    private String beleske;
    @Column(name = "DIPLOMIRAO")
    private boolean diplomirao;
    @JoinColumn(name = "OSO_ID", referencedColumnName = "ID")
    @ManyToOne
    private Osoba osoId;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AbstractEntity abstractEntity;
    @OneToMany(mappedBy = "stuId")
    private List<Zaduzenja> zaduzenjaList;

    public Student() {
    }

    public Student(Long id) {
        this.id = id;
    }

    public Student(Long id, int recordStatus, int indeks) {
        this.id = id;
        this.recordStatus = recordStatus;
        this.indeks = indeks;
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

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public String getSnIndex() {
        return snIndex;
    }

    public void setSnIndex(String snIndex) {
        this.snIndex = snIndex;
    }

    public BigInteger getProsekInformatika() {
        return prosekInformatika;
    }

    public void setProsekInformatika(BigInteger prosekInformatika) {
        this.prosekInformatika = prosekInformatika;
    }

    public BigInteger getProsekMatematika() {
        return prosekMatematika;
    }

    public void setProsekMatematika(BigInteger prosekMatematika) {
        this.prosekMatematika = prosekMatematika;
    }

    public Long getPrviRazred() {
        return prviRazred;
    }

    public void setPrviRazred(Long prviRazred) {
        this.prviRazred = prviRazred;
    }

    public Long getDrugiRazred() {
        return drugiRazred;
    }

    public void setDrugiRazred(Long drugiRazred) {
        this.drugiRazred = drugiRazred;
    }

    public Long getTreciRazred() {
        return treciRazred;
    }

    public void setTreciRazred(Long treciRazred) {
        this.treciRazred = treciRazred;
    }

    public Long getCetvrtiRazred() {
        return cetvrtiRazred;
    }

    public void setCetvrtiRazred(Long cetvrtiRazred) {
        this.cetvrtiRazred = cetvrtiRazred;
    }

    public String getGodinaZavrsetka() {
        return godinaZavrsetka;
    }

    public void setGodinaZavrsetka(String godinaZavrsetka) {
        this.godinaZavrsetka = godinaZavrsetka;
    }

    public String getImeDiplome() {
        return imeDiplome;
    }

    public void setImeDiplome(String imeDiplome) {
        this.imeDiplome = imeDiplome;
    }

    public String getOpisDiplome() {
        return opisDiplome;
    }

    public void setOpisDiplome(String opisDiplome) {
        this.opisDiplome = opisDiplome;
    }

    public Date getDatumDiplome() {
        return datumDiplome;
    }

    public void setDatumDiplome(Date datumDiplome) {
        this.datumDiplome = datumDiplome;
    }

    public String getZanimanjeRoditelja() {
        return zanimanjeRoditelja;
    }

    public void setZanimanjeRoditelja(String zanimanjeRoditelja) {
        this.zanimanjeRoditelja = zanimanjeRoditelja;
    }

    public String getBeleske() {
        return beleske;
    }

    public void setBeleske(String beleske) {
        this.beleske = beleske;
    }

    public boolean getDiplomirao() {
        return diplomirao;
    }

    public void setDiplomirao(boolean diplomirao) {
        this.diplomirao = diplomirao;
    }

    public Osoba getOsoId() {
        return osoId;
    }

    public void setOsoId(Osoba osoId) {
        this.osoId = osoId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rs.ac.isum.entities.Student[ id=" + id + " ]";
    }
    
}
