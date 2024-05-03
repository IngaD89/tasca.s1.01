package org.example.n3exercici1;

public class TennisNews extends News {
    private String competition;
    private String player;

    public TennisNews(String title, String competition, String player) {
        super(title);
        this.competition = competition;
        this.player = player;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public double calculateNewsPrice() {
        super.setPrice(150);
        double totalPrice = super.getPrice();

        if(this.player.equalsIgnoreCase("Federer")
                || this.player.equalsIgnoreCase("Nadal")
                || this.player.equalsIgnoreCase("Djokovic")

        ){
            totalPrice += 100;
        }

        return totalPrice;
    }

    @Override
    public double calculateNewsRate() {
        super.setRate(4);
        double totalRate = super.getRate();

        if(this.player.equalsIgnoreCase("Federer")
                || this.player.equalsIgnoreCase("Nadal")
                || this.player.equalsIgnoreCase("Djokovich")){
            totalRate += 3;
        }

        return totalRate;
    }

    @Override
    public String toString() {
        return "TennisNews{" +
                "title = '" + super.getTitle() + '\'' +
                ", text = '" + super.getText() + '\'' +
                ", rate = '" + super.getRate() + '\'' +
                ", price = '" + super.getPrice() + '\'' +
                ", competition = '" + this.competition + '\'' +
                ", player = '" + this.player + '\'' +
                '}';
    }
}
