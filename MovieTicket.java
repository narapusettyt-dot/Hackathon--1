import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

        public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

        public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

        public double calculateDiscount() {
        double total = calculateTotal();
        if (numberOfTickets >= 5) {
            return total * 0.10;
        }
        return 0.0;
    }

        public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

        public void displayBill() {
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount: %.2f\n", calculateTotal());
        System.out.printf("Discount: %.2f\n", calculateDiscount());
        System.out.printf("Final Amount: %.2f\n", calculateFinalAmount());
    }
}

public void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String movieName = sc.nextLine();
    double ticketPrice = sc.nextDouble();
    int numberOfTickets = sc.nextInt();

    MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);
    ticket.displayBill();

    sc.close();
}