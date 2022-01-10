package com.microsoft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "microsoftUpdate", schema = "microsoft", uniqueConstraints = {
	@UniqueConstraint(columnNames = { "idMicrosoftUpdate" }, name = "UK_MicrosoftUpdate") })
public class MicrosoftUpdate implements Serializable {

    private static final long serialVersionUID = -3014662922241285303L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_microsoftUpdate")
    @SequenceGenerator(name = "sq_microsoftUpdate", sequenceName = "microsoft.sq_microsoftUpdate", schema = "microsoft", allocationSize = 1)
    private Long id;

    @Column
    private String idMicrosoftUpdate;

    @Column
    private String alias;

    @Column
    private String documentTitle;

    @Column
    private String severity;

    @Column
    private Date initialReleaseDate;

    @Column
    private Date currentReleaseDate;

    @Column
    private String cvrfUrl;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getIdMicrosoftUpdate() {
	return idMicrosoftUpdate;
    }

    public void setIdMicrosoftUpdate(String idMicrosoftUpdate) {
	this.idMicrosoftUpdate = idMicrosoftUpdate;
    }

    public String getAlias() {
	return alias;
    }

    public void setAlias(String alias) {
	this.alias = alias;
    }

    public String getDocumentTitle() {
	return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
	this.documentTitle = documentTitle;
    }

    public String getSeverity() {
	return severity;
    }

    public void setSeverity(String severity) {
	this.severity = severity;
    }

    public Date getInitialReleaseDate() {
	return initialReleaseDate;
    }

    public void setInitialReleaseDate(Date initialReleaseDate) {
	this.initialReleaseDate = initialReleaseDate;
    }

    public Date getCurrentReleaseDate() {
	return currentReleaseDate;
    }

    public void setCurrentReleaseDate(Date currentReleaseDate) {
	this.currentReleaseDate = currentReleaseDate;
    }

    public String getCvrfUrl() {
	return cvrfUrl;
    }

    public void setCvrfUrl(String cvrfUrl) {
	this.cvrfUrl = cvrfUrl;
    }

    @Override
    public int hashCode() {
	return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	MicrosoftUpdate other = (MicrosoftUpdate) obj;
	return Objects.equals(id, other.id);
    }
}