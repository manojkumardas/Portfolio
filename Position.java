package com.portfolio.entity;

import java.util.Date;

public class Position {
	
	private int fund;
	private Date startDate;
	private Date endDate;
	private String cusip;
	
	
	public Position(int fund, Date startDate, Date endDate, String cusip) {
		super();
		this.fund = fund;
		this.startDate = startDate;
		this.endDate = endDate;
		this.cusip = cusip;
	}


	public int getFund() {
		return fund;
	}


	public void setFund(int fund) {
		this.fund = fund;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getCusip() {
		return cusip;
	}


	public void setCusip(String cusip) {
		this.cusip = cusip;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cusip == null) ? 0 : cusip.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + fund;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (cusip == null) {
			if (other.cusip != null)
				return false;
		} else if (!cusip.equals(other.cusip))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (fund != other.fund)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Position [fund=" + fund + ", startDate=" + startDate + ", endDate=" + endDate + ", cusip=" + cusip
				+ "]";
	}
	
	
	

}
