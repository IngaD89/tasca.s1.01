package org.example.n3exercici1;

public class BasketNews extends News{

    private String competition;
    private String club;


    public BasketNews(String title, String competition, String club) {
        super(title);
        this.competition = competition;
        this.club = club;
    }

    public String getCompetition() {
        return this.competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public double calculateNewsPrice() {
        super.setPrice(250);
        double totalPrice = super.getPrice();

        if(this.competition.equalsIgnoreCase("Eurolliga")){
            totalPrice += 75;
        }
        if(this.club.equalsIgnoreCase("Barça")
                || this.club.equalsIgnoreCase("Madrid")
        ){
            totalPrice += 75;
        }

        return totalPrice;
    }

    public double calculateNewsRate(){
        super.setRate(4);
        double totalRate = super.getRate();

        if(this.competition.equalsIgnoreCase("Eurolliga")){
            totalRate += 3;
        }

        if(this.competition.equalsIgnoreCase("ACB")){
            totalRate += 2;
        }

        if(this.club.equalsIgnoreCase("Madrid") || this.club.equalsIgnoreCase("Barça")){
            totalRate += 1;
        }

        return totalRate;
    }

    @Override
    public String toString() {
        return "BasketNews{" +
                "title = '" + super.getTitle() + '\'' +
                ", text = '" + super.getText() + '\'' +
                ", rate = '" + super.getRate() + '\'' +
                ", price = '" + super.getPrice() + '\'' +
                ", competition='" + this.competition + '\'' +
                ", club='" + this.club + '\'' +
                '}';
    }
}
