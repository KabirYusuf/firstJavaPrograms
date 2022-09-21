package classExercise.salesPerson;

public class Item {

    private double valueSold;



    public Item(){}

    public Item(double value){
        valueSold = value;
    }

    public double getValueSold() {
        return valueSold;
    }

    public void setValueSold(double valueSold) {
        this.valueSold = valueSold;
    }

    public String toString(){
        return String.format("%.2f",valueSold);
    }
}
