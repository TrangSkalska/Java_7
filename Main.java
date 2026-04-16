public class Main {
    public static void main(String[] args) {
        // 2 companies
        Company blueSoft = new Company("BlueSoft", 40000, 22000, 5000, 3000);
        Company techCorp = new Company("TechCorp", 60000, 35000, 7000, 4000);
        
        FinancialReport.printReport(blueSoft);     
        FinancialReport.printReport(techCorp);     
        
        // Compare profits
        System.out.println("Profit comparison:");
        System.out.println(blueSoft.getName() + ": " + blueSoft.calculateProfit());
        System.out.println(techCorp.getName() + ": " + techCorp.calculateProfit());
    }
}