public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Invoice
        Invoice invoice1 = new Invoice("Product 1", 2, 10);
        Invoice invoice2 = new Invoice("Product 2", 3, 15);

        // Membuat array Invoice untuk karyawan
        Invoice[] invoices = {invoice1, invoice2};

        // Membuat objek Employee
        Employee employee = new Employee(1, "John Doe", 1000, invoices);

        // Menampilkan informasi karyawan
        System.out.println("Registration Number: " + employee.getRegistrationNumber());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary per Month: $" + employee.getSalaryPerMonth());

        // Menampilkan detail belanjaan karyawan
        System.out.println("\nShopping Invoices:");
        for (Invoice invoice : employee.getInvoices()) {
            System.out.println("Product: " + invoice.getProductName());
            System.out.println("Quantity: " + invoice.getQuantity());
            System.out.println("Price per Item: $" + invoice.getPricePerItem());
            System.out.println("Total: $" + invoice.getPayableAmount());
            System.out.println();
        }

        // Menghitung total gaji setelah dipotong hutang belanjaan
        double totalPayableAmount = employee.getPayableAmount();
        System.out.println("Total Payable Amount: $" + totalPayableAmount);
    }
}