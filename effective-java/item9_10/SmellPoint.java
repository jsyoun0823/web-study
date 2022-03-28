public class SmellPoint extends Point{
    private final String smell;

    public SmellPoint(int x, int y, String smell) {
        super(x, y);
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point))
            return false;

        if (!(o instanceof SmellPoint))
            return o.equals(this);

        return super.equals(o) && ((SmellPoint) o).smell == smell;
    }
}