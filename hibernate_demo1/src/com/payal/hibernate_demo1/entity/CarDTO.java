package com.payal.hibernate_demo1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class CarDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;

	private String cname;
	@OneToOne(cascade = CascadeType.ALL)
	private EngineDTO engDTO;

	public EngineDTO getEngDTO() {
		return engDTO;
	}

	public void setEngDTO(EngineDTO engDTO) {
		this.engDTO = engDTO;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	
		
		
	}
