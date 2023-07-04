package com.example.dashbrd;

public class DataClass {
    private String clgName;
    private String medianSalary;
    private String highestSalary;
    private String batchPlaced;
    private String accrNAAC;
    private String rankNIRF;
    private String clgImage;


    public String getClgName() {
        return clgName;
    }

    public String getMedianSalary() {
        return medianSalary;
    }

    public String getHighestSalary() {
        return highestSalary;
    }

    public String getBatchPlaced() {
        return batchPlaced;
    }

    public String getAccrNAAC() {
        return accrNAAC;
    }

    public String getRankNIRF() {
        return rankNIRF;
    }

    public String getClgImage() {
        return clgImage;
    }

    public DataClass(String clgName, String medianSalary, String highestSalary, String batchPlaced, String accrNAAC, String rankNIRF, String clgImage) {
        this.clgName = clgName;
        this.medianSalary = medianSalary;
        this.highestSalary = highestSalary;
        this.batchPlaced = batchPlaced;
        this.accrNAAC = accrNAAC;
        this.rankNIRF = rankNIRF;
        this.clgImage = clgImage;
    }
    public DataClass(){

    }
}
