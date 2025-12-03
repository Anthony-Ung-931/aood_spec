package v1_hard_coded_spec;

public class BaseballSeat {
    private double cost;

    private int section;
    private int row;
    private int seatNumber;

    public BaseballSeat(double cost, int section, int row, int seatNumber) {
        this.cost = cost;
        this.section = section;
        this.row = row;
        this.seatNumber = seatNumber;
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

    @Override
    public String toString() {
        return "Section " + section + " Row " + row + " Seat " + seatNumber + " Cost: $" + cost;
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
