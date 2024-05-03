package org.example.n3exercici1;

public class MotoNews extends News {

    private String team;

    public MotoNews(String title, String team) {
        super(title);
        this.team = team;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public double calculateNewsPrice() {
        super.setPrice(100);
        double totalPrice = super.getPrice();

        if(this.team.equalsIgnoreCase("Honda")
                || this.team.equalsIgnoreCase("Yamaha")
        ){
            totalPrice += 50;
        }

        return totalPrice;
    }

    @Override
    public double calculateNewsRate() {
        super.setRate(3);
        double totalRate = super.getRate();

        if(this.team.equalsIgnoreCase("Honda")
                || this.team.equalsIgnoreCase("Yamaha")){
            totalRate += 3;
        }

        return totalRate;
    }

    @Override
    public String toString() {
        return "MotoNews{" +
                "title = '" + super.getTitle() + '\'' +
                ", text = '" + super.getText() + '\'' +
                ", rate = '" + super.getRate() + '\'' +
                ", price = '" + super.getPrice() + '\'' +
                ", team = '" + team + '\'' +
                '}';
    }
}
