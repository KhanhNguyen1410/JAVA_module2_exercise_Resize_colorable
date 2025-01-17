package comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
        public ComparableCircle(double radius){
            super(radius);
        }
        public ComparableCircle(){

        }
        public ComparableCircle(double radius, String color){
            super(radius,color);
        }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;

    }
}
