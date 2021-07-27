public class StockPorfolio {
    double value;
    public static double transferFee = -10;
    double percentage;



    public double getValue(){
        System.out.println(value);
        return value;
    }

    public double transfer(double amount){  //need to work more on logic of transfer
        double transfer = value + transferFee;
        return transfer;

    }

    public double addAmount(double amount){
        double addAmount = amount + value;
        return addAmount;
    }
    public double applyChange(double percentage){
        double applyChange = percentage * value;
        return applyChange;

    }

}

