package org.example.n3exercici1;

public class FormulaNews extends News{

    private String racingTeam;

    public FormulaNews(String title, String racingTeam) {
        super(title);
        this.racingTeam = racingTeam;
    }

    public String getRacingTeam() {
        return this.racingTeam;
    }

    public void setRacingTeam(String racingTeam) {
        this.racingTeam = racingTeam;
    }

    @Override
    public double calculateNewsPrice() {
        super.setPrice(100);
        double totalPrice = super.getPrice();

        if(this.racingTeam.equalsIgnoreCase("Ferrari")
                || this.racingTeam.equalsIgnoreCase("Mercedes")
        ){
            totalPrice += 50;
        }

        return totalPrice;
    }

    @Override
    public double calculateNewsRate() {
        super.setRate(4);
        double totalRate = super.getRate();

        if(this.racingTeam.equalsIgnoreCase("Ferrari")
                || this.racingTeam.equalsIgnoreCase("Mercedes")){
            totalRate += 2;
        }

        return totalRate;
    }

    @Override
    public String toString() {
        return "FormulaNews{" +
                "title = '" + super.getTitle() + '\'' +
                ", text = '" + super.getText() + '\'' +
                ", rate = '" + super.getRate() + '\'' +
                ", price = '" + super.getPrice() + '\'' +
                ", racingTeam = '" + this.racingTeam + '\'' +
                '}';
    }
}
