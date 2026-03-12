package homework1;

public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    protected boolean hasFruit;

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
        this.hasFruit = false;
    }

    @Override
    public void changeSeason() {
        Season[] allSeasons = Season.values();
        int nextOrdinal = (this.season.ordinal() + 1) % allSeasons.length;
        this.season = allSeasons[nextOrdinal];
    }

    @Override
    public String toString() {
        return "Tree. My height is: " + height + " and my color is: " + leavesColor;
    }
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Tree)) {
            return 0;
        }
        Tree other = (Tree) o;

        return ((Integer)this.height).compareTo(other.height);
    }
}

