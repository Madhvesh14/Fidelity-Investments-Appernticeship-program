public class InsuranceApplication {
    public static double addPolicy(Insurance ins,int opt){
        if(opt == 1){
            LifeInsurance lifeIns =(LifeInsurance) ins;
            return lifeIns.calculatePremium();
        }else if (opt == 2){
            MotorInsurance motorIns= (MotorInsurance) ins;
            return motorIns.calculatePremium();
        }
        return 0;
    }
}
