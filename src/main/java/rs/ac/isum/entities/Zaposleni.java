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
import javax.persistence.CascadeType;
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
@Table(name = "ZAPOSLENI")
@NamedQueries({
    @NamedQuery(name = "Zaposleni.findAll", query = "SELECT z FROM Zaposleni z")})
public class Zaposleni extends AbstractEntity implements Serializable {
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
    @Column(name = "NAPOMENA")
    private String napomena;
    @Column(name = "POCETAK_RADNOG_ODNOSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pocetakRadnogOdnosa;
    @Column(name = "ZAVRSETAK_RADNOG_ODNOSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zavrsetakRadnogOdnosa;
    @Basic(optional = false)
    @Column(name = "RADNO_MESTO")
    private String radnoMesto;
    @Column(name = "PROCENAT_ANGAZOVANJA")
    private String procenatAngazovanja;
    @Column(name = "BROJ_SATI")
    private String brojSati;
    @Column(name = "BANKA")
    private String banka;
    @Column(name = "RACUN_BANKE")
    private String racunBanke;
    @Column(name = "NASTAVNO_ZVANJE")
    private String nastavnoZvanje;
    @Column(name = "NAUCNO_ZVANJE")
    private String naucnoZvanje;
    @Column(name = "DATUM_IZBORA_UZV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datumIzboraUzv;
    @Column(name = "DATUM_ISTEKA_UZV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datumIstekaUzv;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "zaposleni")
    private ZaposleniBibliotekar zaposleniBibliotekar;
    @OneToMany(mappedBy = "zapId")
    private List<Zaduzenja> zaduzenjaList;
    @JoinColumn(name = "OSO_ID", referencedColumnName = "ID")
    @ManyToOne
    private Osoba osoId;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AbstractEntity abstractEntity;

    public Zaposleni() {
    }

    public Zaposleni(Long id) {
        this.id = id;
    }

    public Zaposleni(Long id, int recordStatus, String radnoMesto) {
        this.id = id;
        this.recordStatus = recordStatus;
        this.radnoMesto = radnoMesto;
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

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Date getPocetakRadnogOdnosa() {
        return pocetakRadnogOdnosa;
    }

    public void setPocetakRadnogOdnosa(Date pocetakRadnogOdnosa) {
        this.pocetakRadnogOdnosa = pocetakRadnogOdnosa;
    }

    public Date getZavrsetakRadnogOdnosa() {
        return zavrsetakRadnogOdnosa;
    }

    public void setZavrsetakRadnogOdnosa(Date zavrsetakRadnogOdnosa) {
        this.zavrsetakRadnogOdnosa = zavrsetakRadnogOdnosa;
    }

    public String getRadnoMesto() {
        return radnoMesto;
    }

    public void setRadnoMesto(String radnoMesto) {
        this.radnoMesto = radnoMesto;
    }

    public String getProcenatAngazovanja() {
        return procenatAngazovanja;
    }

    public void setProcenatAngazovanja(String procenatAngazovanja) {
        this.procenatAngazovanja = procenatAngazovanja;
    }

    public String getBrojSati() {
        return brojSati;
    }

    public void setBrojSati(String brojSati) {
        this.brojSati = brojSati;
    }

    public String getBanka() {
        return banka;
    }

    public void setBanka(String banka) {
        this.banka = banka;
    }

    public String getRacunBanke() {
        return racunBanke;
    }

    public void setRacunBanke(String racunBanke) {
        this.racunBanke = racunBanke;
    }

    public String getNastavnoZvanje() {
        return nastavnoZvanje;
    }

    public void setNastavnoZvanje(String nastavnoZvanje) {
        this.nastavnoZvanje = nastavnoZvanje;
    }

    public String getNaucnoZvanje() {
        return naucnoZvanje;
    }

    public void setNaucnoZvanje(String naucnoZvanje) {
        this.naucnoZvanje = naucnoZvanje;
    }

    public Date getDatumIzboraUzv() {
        return datumIzboraUzv;
    }

    public void setDatumIzboraUzv(Date datumIzboraUzv) {
        this.datumIzboraUzv = datumIzboraUzv;
    }

    public Date getDatumIstekaUzv() {
        return datumIstekaUzv;
    }

    public void setDatumIstekaUzv(Date datumIstekaUzv) {
        this.datumIstekaUzv = datumIstekaUzv;
    }

    public ZaposleniBibliotekar getZaposleniBibliotekar() {
        return zaposleniBibliotekar;
    }

    public void setZaposleniBibliotekar(ZaposleniBibliotekar zaposleniBibliotekar) {
        this.zaposleniBibliotekar = zaposleniBibliotekar;
    }

    public List<Zaduzenja> getZaduzenjaList() {
        return zaduzenjaList;
    }

    public void setZaduzenjaList(List<Zaduzenja> zaduzenjaList) {
        this.zaduzenjaList = zaduzenjaList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zaposleni)) {
            return false;
        }
        Zaposleni other = (Zaposleni) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rs.ac.isum.entities.Zaposleni[ id=" + id + " ]";
    }
    
}
