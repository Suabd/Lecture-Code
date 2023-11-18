package week7_objects;

public class Pool {

    // instance variables
    private String name; // field, or a variable
    private double length; // another field
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > 1000) {
            return;
        }
        this.length = length;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    private double maxDepth;
    // Every Pool will have a name and a length
    // Add a constructor , it is method that has same name as the class
    // instance method -- instance is another word for an object
    // an instance of a class
    // A Pool object is an instance of the Pool class
    Pool(String name, double length) {
        this.name = name;
        this.length = length;
    }
    public double distanceForLaps(int laps) {
        // 10 laps of pool of length 50, that's 500 meters.
        double total = laps * this.length;
        return  total;
    }

    @Override
    public  String toString() {
        String description = this.name + " pool is " + length + " meters long.";
        return description;
    }
}
