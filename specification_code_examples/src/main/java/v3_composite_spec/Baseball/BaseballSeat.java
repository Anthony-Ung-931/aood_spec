package v3_composite_spec.Baseball;

public class BaseballSeat {
    private double cost;

    private int section;
    private int row;
    private int seatNumber;

    private boolean isAccessible;

    public BaseballSeat(double cost, int section, int row, int seatNumber, boolean accessible) {
        this.cost = cost;
        this.section = section;
        this.row = row;
        this.seatNumber = seatNumber;
        this.isAccessible = accessible;
    }

    public double getCost() {
        return cost;
    }

    public int getSection() {
        return section;
    }

    public int getRow() {
        return row;
    }

    public int get_seatNumber() {
        return seatNumber;
    }

    public boolean get_isAccessible() {
        return isAccessible;
    }

    @Override
    public String toString() {
        return "Section " + section + "\tRow " + row + "\tSeat " + seatNumber + "\tCost: $" + cost + "\tAccessible: " + isAccessible;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        
        BaseballSeat that = (BaseballSeat) o;
        return (section == that.section &&
               row == that.row &&
               seatNumber == that.seatNumber);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(section, row, seatNumber);
    }


}
