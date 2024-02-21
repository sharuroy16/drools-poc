package com.drools.droolspoc.Model;

public class RateRequest {
    
    private String loanType;
    private Integer durationInYear;
    private Integer age;
    private Integer interestRate;

    public RateRequest(String loanType, Integer durationInYear, Integer age) {
		super();
		this.loanType = loanType;
		this.durationInYear = durationInYear;
		this.age = age;
	}

    public String getLoanType() {
        return this.loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Integer getDurationInYear() {
        return this.durationInYear;
    }

    public void setDurationInYear(Integer durationInYear) {
        this.durationInYear = durationInYear;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(Integer interestRate) {
		this.interestRate = interestRate;
	}

    @Override
    public String toString() {
        return "{" +
            " loanType='" + getLoanType() + "'" +
            ", durationInYear='" + getDurationInYear() + "'" +
            ", age='" + getAge() + "'" +
            ", interestRate='" + getInterestRate() + "'" +
            "}";
    }
}