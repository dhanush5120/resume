package com.example.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "skill")
public class Skill {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "skill_id")
	private long id;
	
//	@Column(name = "skill_name")
	private String skillName;
	
//	@Column(name= "skill_profiency")
	private int skillProficiency;

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", skillName=" + skillName + ", skillProficiency=" + skillProficiency + "]";
	}

	public Skill(long id, String skillName, int skillProficiency) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.skillProficiency = skillProficiency;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getSkillProficiency() {
		return skillProficiency;
	}

	public void setSkillProficiency(int skillProficiency) {
		this.skillProficiency = skillProficiency;
	}
	
}
