public class earthVol {
    public static void main(String[] args) {
        int radius=6378;// radius of earth
        double pie=3.14; // pie default value
         double volumeInKM=4/3*radius*radius*radius;// volume in km
         double volumeInMiles=volumeInKM*1.6;// volume in miles
         System.out.println("The volume of earth in cubic km is"+volumeInKM+" "+"and cubic miles is"+volumeInMiles);//output
        


    }
    
}

