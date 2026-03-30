package basic.exercism.salarycalculator;


public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * this.bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        final double salaryAvg = salaryMultiplier(daysSkipped) * 1000.00 + bonusForProductsSold(productsSold);
        return salaryAvg > 2000.00 ? 2000.00 : salaryAvg;
    } 
}
