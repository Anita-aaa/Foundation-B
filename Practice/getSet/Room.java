package getSet;

class Room {
  // Private instance variables
  private int roomNumber;
  private String roomType;
  private double pricePerNight;
  // Constructor
  public Room(int roomNumber, String roomType, double pricePerNight) {
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.pricePerNight = pricePerNight;
  }
  // Getter and setter methods for roomNumber and pricePerNight
  public int getRoomNumber() {
    return this.roomNumber;
  }
  public void setRoomNumber(int roomNumber) {
    if (roomNumber >= 1 && roomNumber <= 100) {
      this.roomNumber = roomNumber;
    } else {
      throw new IllegalArgumentException("Invalid room number. Please enter a number between 1 and 100.");
    }
  }
  public double getPricePerNight() {
    return this.pricePerNight;
  }
  public void setPricePerNight(double pricePerNight) {
    if (pricePerNight >= 50 && pricePerNight <= 500) {
      this.pricePerNight = pricePerNight;
    } else {
      throw new IllegalArgumentException("Invalid price per night. Please enter a number between 50 and 500.");
    }
  }
  // Public method to check the availability of the room
  public boolean isAvailable(int numOfNights) {
    // Check if the room is available for the given number of nights
    
    return numOfNights <= 3;
  }
  // Public method to book the room for a specific date range
  public boolean book(int numOfNights, int checkInDay, int checkOutDay) {
    
    if (!isAvailable(numOfNights)) {
      return false;
    }
   
    if (checkInDay < 1 || checkInDay > 31 || checkOutDay < 1 || checkOutDay > 31) {
      return false;
    }
    return false;
    }    
}