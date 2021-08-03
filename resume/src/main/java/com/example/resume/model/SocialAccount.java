package com.example.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "social_accounts")
public class SocialAccount {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	private long id;
	
//	@Column(name = "social_account_name")
	private String name;
	
//	@Column(name = "social_account_link")
	private String accountLink;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountLink() {
		return accountLink;
	}

	public void setAccountLink(String accountLink) {
		this.accountLink = accountLink;
	}

	public SocialAccount(long id, String name, String accountLink) {
		super();
		this.id = id;
		this.name = name;
		this.accountLink = accountLink;
	}

	@Override
	public String toString() {
		return "SocialAccount [id=" + id + ", name=" + name + ", accountLink=" + accountLink + "]";
	}

	public SocialAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
