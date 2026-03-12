package homework1;

public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Animal)) {
            return 0;
        }
        Animal other = (Animal) o;

        return ((Integer)this.weight).compareTo(other.weight);
    }

    @Override
    public void changeSeason() {
        Season[] allSeasons = Season.values();
        int nextOrdinal = (this.season.ordinal() + 1) % allSeasons.length;
        this.season = allSeasons[nextOrdinal];
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": My weight is: " + weight +
                " and my color is: " + color;
    }

    protected void setWeight(double newWeight) {
        this.weight = (int) Math.round(newWeight);
    }
}

