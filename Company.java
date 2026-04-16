public class Company {
    private String name;
    private double revenue;
    private double salaries;
    private double rent;
    private double tools;

    public Company(String name, double revenue, double salaries, double rent, double tools) {
        this.name = name;
        this.revenue = revenue;
        this.salaries = salaries;
        this.rent = rent;
        this.tools = tools;
    }

    public double calculateTotalCost() {
        return salaries + rent + tools;
    }

    public double calculateProfit() {
        return revenue - calculateTotalCost();
    }

    public boolean isProfitable() {
        return calculateProfit() > 0;
    }

    public boolean canOperate() {
        return revenue > calculateTotalCost();
    }

    public String getName() {
        return name;
    }

    public double getRevenue() {
        return revenue;
    }
}