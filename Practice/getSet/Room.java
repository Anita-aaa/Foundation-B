package getSet;
// // 6The Room class should have private instance variables for the room number, room type, and price per night. 
// import java.util.Date;

// public class Room {
//     private int roomNumber;
//     private String roomType;
//     private double pricePerNight;
//     private boolean isBooked;

//     public Room(int roomNumber, String roomType, double pricePerNight) {
//         this.roomNumber = roomNumber;
//         this.roomType = roomType;
//         this.pricePerNight = pricePerNight;
//         this.isBooked = false;
//     }

//     // Getter methods
//     public int getRoomNumber() {
//         return roomNumber;
//     }

//     public String getRoomType() {
//         return roomType;
//     }

//     public double getPricePerNight() {
//         return pricePerNight;
//     }

//     // Setter methods with validation
//     public void setRoomNumber(int roomNumber) {
//         if (roomNumber >= 1 && roomNumber <= 100) {
//             this.roomNumber = roomNumber;
//         } else {
//             System.out.println("Invalid room number. Room number should be between 1 and 100.");
//         }
//     }

//     public void setPricePerNight(double pricePerNight) {
//         if (pricePerNight >= 50 && pricePerNight <= 500) {
//             this.pricePerNight = pricePerNight;
//         } else {
//             System.out.println("Invalid price per night. Price should be between 50 and 500.");
//         }
//     }

//     // Method to check availability of the room
//     public boolean isAvailable() {
//         return !isBooked;
//     }

//     // Method to book the room for a specific date range
//     public boolean bookRoom(Date checkInDate, Date checkOutDate) {
//         if (isAvailable()) {
//             // Logic to check availability for the specific date range
//             // You can implement your own logic here
//             // For example, check against reservations, etc.

//             // If room is available, mark it as booked
//             isBooked = true;
//             return true;
//         }
//         return false; // Room is not available
//     }

//     @Override
//     public String toString() {
//         return "Room Number: " + roomNumber + ", Type: " + roomType + ", Price/Night: " + pricePerNight
//                 + ", Booked: " + isBooked;
//     }

//     public static void main(String[] args) {
//         // Create a Room object
//         Room room = new Room(101, "Single", 150.0);

//         // Using getter methods
//         System.out.println("Room Number: " + room.getRoomNumber());
//         System.out.println("Room Type: " + room.getRoomType());
//         System.out.println("Price/Night: " + room.getPricePerNight());

//         // Using setter methods
//         room.setRoomNumber(102);
//         room.setPricePerNight(180.0);

//         System.out.println("\nUpdated Room Information:");
//         System.out.println("Room Number: " + room.getRoomNumber());
//         System.out.println("Room Type: " + room.getRoomType());
//         System.out.println("Price/Night: " + room.getPricePerNight());
//     }
// }
// // output
// // Room Number: 101
// // Room Type: Single
// // Price/Night: 150.0
// // Invalid room number. Room number should be between 1 and 100.

// // Updated Room Information:
// // Room Number: 101
// // Room Type: Single
// // Price/Night: 180.0


// // 7 The Employee class should have private instance variables for the employee's name, employee ID, and salary.
// class Employee {
//     double basicSalary;

//     // Constructor for Employee class
//     Employee(double basicSalary) {
//         this.basicSalary = basicSalary;
//     }

//     // Method to calculate the salary of an employee
//     double calculateSalary() {
//         return basicSalary;
//     }
// }

// class Manager extends Employee {
//     double bonusPercentage;

//     // Constructor for Manager class
//     Manager(double basicSalary, double bonusPercentage) {
//         super(basicSalary); // Call the constructor of the superclass (Employee)
//         this.bonusPercentage = bonusPercentage;
//     }

//     // Method to override the calculateSalary method and include bonus calculation
//     @Override
//     double calculateSalary() {
//         double bonus = basicSalary * (bonusPercentage / 100);
//         return basicSalary + bonus;
//     }
// }

// public class Room{//PayrollSystem {
//     public static void main(String[] args) {
//         // Create an object of the Manager class with a basic salary and bonus percentage
//         Manager manager = new Manager(100, 5);

//         // Call the calculateSalary method for the manager to calculate the salary including the bonus
//         double managerSalary = manager.calculateSalary();

//         // Display the calculated salary of the manager on the console
//         System.out.println("Manager's Salary: $" + managerSalary);
//     }
// }
// // output
// // Manager's Salary: $105.0



// // 8.The Ticket class should have private instance variables for the movie name, showtime, seat number, and ticket price.
// public class Room{// Ticket {
//     private String movieName;
//     private String showtime;
//     private int seatNumber;
//     private double ticketPrice;

//     public Room(String movieName, String showtime, int seatNumber, double ticketPrice) {
//         this.movieName = movieName;
//         this.showtime = showtime;
//         this.setSeatNumber(seatNumber); // Use the setter method to ensure valid seat number
//         this.ticketPrice = ticketPrice;
//     }

//     public String getMovieName() {
//         return movieName;
//     }

//     public String getShowtime() {
//         return showtime;
//     }

//     public int getSeatNumber() {
//         return seatNumber;
//     }

//     public void setMovieName(String movieName) {
//         this.movieName = movieName;
//     }

//     public void setShowtime(String showtime) {
//         this.showtime = showtime;
//     }

//     public void setSeatNumber(int seatNumber) {
//         // Assuming the cinema has a maximum of 100 seats (seat numbers from 1 to 100)
//         if (seatNumber >= 1 && seatNumber <= 100) {
//             this.seatNumber = seatNumber;
//         } else {
//             System.out.println("Invalid seat number! Seat number should be between 1 and 100.");
//         }
//     }

//     public double getTicketPrice() {
//         return ticketPrice;
//     }

//     public void setTicketPrice(double ticketPrice) {
//         this.ticketPrice = ticketPrice;
//     }

//     public void displayTicketDetails() {
//         System.out.println("Movie: " + movieName);
//         System.out.println("Showtime: " + showtime);
//         System.out.println("Seat Number: " + seatNumber);
//         System.out.println("Ticket Price: $" + ticketPrice);
//     }

//     public double calculateGroupBookingPrice(int numTickets) {
//         // Calculate total ticket price for a group booking (numTickets * ticketPrice)
//         return numTickets * ticketPrice;
//     }

//     public static void main(String[] args) {
//         // Create a sample ticket and display its details
//         Room ticket1 = new Room("Avengers: Endgame", "20:00", 30, 15.0);
//         ticket1.displayTicketDetails();

//         // Calculate and display the total ticket price for a group booking of 5 tickets
//         int numTickets = 5;
//         double groupBookingPrice = ticket1.calculateGroupBookingPrice(numTickets);
//         System.out.println("Total Price for " + numTickets + " tickets: $" + groupBookingPrice);
//     }
// }
// // output
// // Movie: Avengers: Endgame
// // Showtime: 20:00
// // Seat Number: 30
// // Ticket Price: $15.0
// // Total Price for 5 tickets: $75.0
