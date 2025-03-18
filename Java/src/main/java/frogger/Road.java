package frogger;

public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean isOccupied(int position) {
        return position >= 0 && position < occupied.length && occupied[position];
    }

    public boolean isValid(int position) {
        return position >= 0 && position < occupied.length;
    }
}
