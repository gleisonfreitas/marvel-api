package com.api.marvel.domain.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.api.marvel.model.enums.StrengthLevelEnum;

@Entity
public class Characther implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=30, nullable=false)
	private String name;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private StrengthLevelEnum strengthLevel;
	
	@Column(length=4)
	private Integer speed;
	
	@Column(length=3)
	private String intellect;
	
	@Column(length=50)
	private String skill;
	
	@Column(length=30)
	private String weapon;
	
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="characther", orphanRemoval=true, cascade = CascadeType.MERGE)
	@Fetch(FetchMode.SUBSELECT)
	private List<Comic> comics;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="characther", orphanRemoval=true, cascade = CascadeType.MERGE)
	@Fetch(FetchMode.SUBSELECT)
	private List<Event> events;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="characther", orphanRemoval=true, cascade = CascadeType.MERGE)
	@Fetch(FetchMode.SUBSELECT)
	private List<Serie> series;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="characther", orphanRemoval=true, cascade = CascadeType.MERGE)
	@Fetch(FetchMode.SUBSELECT)
	private List<Story> stories;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StrengthLevelEnum getStrengthLevel() {
		return strengthLevel;
	}

	public void setStrengthLevel(StrengthLevelEnum strengthLevel) {
		this.strengthLevel = strengthLevel;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public String getIntellect() {
		return intellect;
	}

	public void setIntellect(String intellect) {
		this.intellect = intellect;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	/**
	 * @return the comics
	 */
	public List<Comic> getComics() {
		return comics;
	}

	/**
	 * @param comics the comics to set
	 */
	public void setComics(List<Comic> comics) {
		this.comics = comics;
	}
	
	/**
	 * @return the events
	 */
	public List<Event> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 */
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	/**
	 * @return the series
	 */
	public List<Serie> getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(List<Serie> series) {
		this.series = series;
	}
	
	/**
	 * @return the stories
	 */
	public List<Story> getStories() {
		return stories;
	}

	/**
	 * @param stories the stories to set
	 */
	public void setStories(List<Story> stories) {
		this.stories = stories;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Characther)) {
			return false;
		}
		Characther other = (Characther) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
