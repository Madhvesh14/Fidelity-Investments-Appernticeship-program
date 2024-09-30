public class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;
    public double getIdv(){
        return idv;
    }
    public float getDepPercent(){
        return depPercent;
    }
    public void setDepPercent(float depPercent){
        this.depPercent = depPercent;
    }
    public double calculatePremium(){
        double idvValue = getAmountCovered()*((100-depPercent)/100);
        return idvValue*0.03;
    }
}
