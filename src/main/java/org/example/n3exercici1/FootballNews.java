package org.example.n3exercici1;

public class FootballNews extends News {

    private String competition;
    private String club;
    private String player;


    public FootballNews(
            String title,
            String competition,
            String club,
            String player

    ) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
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

    public String getPlayer() {
        return this.player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public double calculateNewsPrice() {
        super.setPrice(300);
        double totalPrice = super.getPrice();

        if(this.competition.equalsIgnoreCase("LLiga de campions")){
            totalPrice += 100;
        }
        if (this.club.equalsIgnoreCase("Barça")
              || this.club.equalsIgnoreCase("Madrid")
        ){
            totalPrice += 100;
        }

        if(this.player.equalsIgnoreCase("Ferran Torres")
            || this.player.equalsIgnoreCase("Benzema")
        ){
            totalPrice += 50;
        }

        return totalPrice;
    }

    public double calculateNewsRate(){
        super.setRate(5);
        double totalRate = super.getRate();

        if(this.competition.equalsIgnoreCase("LLiga de Campions")){
            totalRate += 3;
        }

        if(this.competition.equalsIgnoreCase("Lliga")){
            totalRate += 2;
        }

        if(this.club.equalsIgnoreCase("Madrid") || this.club.equalsIgnoreCase("Barça")){
            totalRate += 1;
        }

        if(this.player.equalsIgnoreCase("Ferran Torres")
                || this.player.equalsIgnoreCase("Benzema")){
            totalRate += 1;
        }

        return totalRate;
    }

    @Override
    public String toString() {
        return "FootballNews{" +
                "title = '" + super.getTitle() + '\'' +
                ", text = '" + super.getText() + '\'' +
                ", rate = '" + super.getRate() + '\'' +
                ", price = '" + super.getPrice() + '\'' +
                ", competition = '" + this.competition + '\'' +
                ", club = '" + this.club + '\'' +
                ", player = '" + this.player + '\'' +
                '}';
    }
}
