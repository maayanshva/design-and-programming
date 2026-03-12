package homework1;

public class FigTree extends Tree {
    private boolean hasLeaves;

    FigTree(int height, Season season) {
        super(height, season, Color.GREEN);
        updateFieldsBySeason();
    }

    private void updateFieldsBySeason() {
        switch (getCurrentSeason()) {
            case WINTER:
                hasLeaves = false;
                hasFruit = false;
                break;

            case SPRING:
                hasLeaves = true;
                hasFruit = false;
                leavesColor = Color.GREEN;
                break;

            case SUMMER:
                hasLeaves = true;
                hasFruit = true;
                leavesColor = Color.GREEN;
                break;

            case FALL:
                hasLeaves = true;
                hasFruit = false;
                leavesColor = Color.YELLOW;
                break;
        }
    }

    @Override
    public String toString() {
        if (!hasLeaves) {
            return "Fig tree. My height is: " + height + " and I have no leaves";
        }

        if (hasFruit) {
            return "Fig tree. I give fruit. My height is: " + height + " and my color is: " + leavesColor;
        }

        return "Fig tree. My height is: " + height + " and my color is: " + leavesColor;
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (getCurrentSeason()) {
            case WINTER:
                height += 20;
                break;

            case SPRING:
                height += 30;
                break;

            case SUMMER:
                height += 30;
                break;

            case FALL:
                height += 20;
                break;
        }

        updateFieldsBySeason();
    }
}