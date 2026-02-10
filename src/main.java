public class main {
    public static void main(String[] args) {
        double springMaintenance = 307.50;
        double summerMaintnenace = 210.32;
        double fallMaintenance = 487.72;
        double winterMaintenance = 101.11;
        double totalYearlyMaintenance = 0;

        totalYearlyMaintenance = springMaintenance + summerMaintnenace + fallMaintenance + winterMaintenance;

        System.out.println("Spring Maintenance is $" + springMaintenance);
        System.out.println("Summer Maintenance is $" + summerMaintnenace);
        System.out.println("Fall Maintenance is $" + fallMaintenance);
        System.out.println("Winter Maintenance is $" + winterMaintenance);
        System.out.println("Total Yearly Maintenance is $" + totalYearlyMaintenance);

    }
}
