class universityFee{
    public static void main(String[]args){
            int fee=125000;// total fee
            int discountPercentage=10;//total discount given
            int discount=fee/discountPercentage;// total discount value
            int totalfeetoPay=fee-discount;// totalfee have to pay
            System.out.println("The discount amount is"+" "+discount+" "+"and the final fee have to pay is"+" "+
                            totalfeetoPay);
    }
}                                                                                                                                                                    
