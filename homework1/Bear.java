package homework1;

public class Bear extends Animal {

    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }
    @Override
    public String toString() {
        if (getCurrentSeason() == Season.WINTER) {
            return "Bear. I am sleeping. My weight is: " + weight + " and my color is: " + color;
        }

        return "Bear. My weight is: " + weight + " and my color is: " + color;
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        color = Color.BROWN;

        if (getCurrentSeason() == Season.WINTER) {
            setWeight(weight * 0.8);
        } else if (getCurrentSeason() == Season.SPRING) {
            setWeight(weight * 0.75);
        } else if (getCurrentSeason() == Season.SUMMER) {
            setWeight(weight * (4.0 / 3.0));
        } else if (getCurrentSeason() == Season.FALL) {
            setWeight(weight * 1.25);
        }
    }
}

