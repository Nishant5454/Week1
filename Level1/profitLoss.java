public class profitLoss {
    public static void main(String[] args) {
        int costPrice=121;// cost price 
        int sellingPrice=191; // selling price of object
        int profit=sellingPrice-costPrice; 
        System.out.println("The Cost Price is INR"+" "+costPrice+" "+"and Selling Price is INR"+" "+sellingPrice);
        double profitPercentage=((double)profit/(double)costPrice)*100;//calculating the percentage of the value
        System.out.println(
            "The profit is INR" +" "+profit+" "+"and the Profit Percentage is "+profitPercentage
        );



        
    }
    
}

