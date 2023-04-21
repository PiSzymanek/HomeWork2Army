package pl.Szymanek;

public enum Rank {
    OR01("0R-01"),OR02("0R-01"),OR03("0R-01"),OR04("0R-01"),OR05("0R-01"),OR06("0R-01"),OR07("0R-01"),OR08("0R-01"),OR09("0R-01"),OR10("0R-01"),PRESIDENT("President"),CIVILIAN("civilian");
    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}

