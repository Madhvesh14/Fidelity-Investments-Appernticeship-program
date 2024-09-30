import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insurance Number");
        String insuranceNo = sc.next();
        System.out.print("Insurance Name");
        String insuranceName = sc.next();
        System.out.print("Amount Covered:");
        double amountCovered = sc.nextDouble();

        System.out.println("select\n1.LifeInsurance\n2.MotorInsurance");
        int option = sc.nextInt();
        if(option == 1) {
            System.out.print("Policy Term:");
            int policyTerm = sc.nextInt();

            System.out.print("Benefit Percent:");
            float benefitPercent = sc.nextFloat();
            LifeInsurance lifeInsurance= new LifeInsurance();
            lifeInsurance.setInsuranceNo(insuranceNo);
            lifeInsurance.setInsuranceName(insuranceName);
            lifeInsurance.setAmountCovered(amountCovered);
            lifeInsurance.setPolicyTerm(policyTerm);
            lifeInsurance.setBenefitPercent(benefitPercent);

            double premium = InsuranceApplication.addPolicy(lifeInsurance,1);
            System.out.printf("Calculated Premium: %.2f\n", premium);


        }else if(option == 2) {
            System.out.print("Depreciation Percent:");
            float depPercent = sc.nextFloat();

            MotorInsurance motorInsurance = new MotorInsurance();
            motorInsurance.setInsuranceNo(insuranceNo);
            motorInsurance.setInsuranceName(insuranceName);
            motorInsurance.setAmountCovered(amountCovered);
            motorInsurance.setDepPercent(depPercent);

            double premium = InsuranceApplication.addPolicy(motorInsurance,2);
            System.out.printf("Calculated Premium: %.2f\n", premium);
        }


    }
}