package com.portfolio.entity;

public class Portfolio {
	
	private String portfolioName;
	private int portfolioCode;
	private String fullName;
	private String portfolioType;
	private Position position;
	public Portfolio(String portfolioName, int portfolioCode, String fullName, String portfolioType,
			Position position) {
		super();
		this.portfolioName = portfolioName;
		this.portfolioCode = portfolioCode;
		this.fullName = fullName;
		this.portfolioType = portfolioType;
		this.position = position;
	}
	public String getPortfolioName() {
		return portfolioName;
	}
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	public int getPortfolioCode() {
		return portfolioCode;
	}
	public void setPortfolioCode(int portfolioCode) {
		this.portfolioCode = portfolioCode;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPortfolioType() {
		return portfolioType;
	}
	public void setPortfolioType(String portfolioType) {
		this.portfolioType = portfolioType;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + portfolioCode;
		result = prime * result + ((portfolioName == null) ? 0 : portfolioName.hashCode());
		result = prime * result + ((portfolioType == null) ? 0 : portfolioType.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
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
		Portfolio other = (Portfolio) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (portfolioCode != other.portfolioCode)
			return false;
		if (portfolioName == null) {
			if (other.portfolioName != null)
				return false;
		} else if (!portfolioName.equals(other.portfolioName))
			return false;
		if (portfolioType == null) {
			if (other.portfolioType != null)
				return false;
		} else if (!portfolioType.equals(other.portfolioType))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Portfolio [portfolioName=" + portfolioName + ", portfolioCode=" + portfolioCode + ", fullName="
				+ fullName + ", portfolioType=" + portfolioType + ", position=" + position + "]";
	}
	
	

}
