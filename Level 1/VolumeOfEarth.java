public class VolumeOfEarth {
    public static void main(String[] args){
        double radiusKm = 6378;
        double volume = (4.0/3) * Math.PI * Math.pow(radiusKm, 3);

        double radiusMiles = radiusKm * 0.621371; //0.621371 is conversion factor for Km to miles conversion
        double volumeMiles = (4.0/3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.printf("The volume of earth in cubic kilometers is %.3f  and cubic miles is %.3f" , volume, volumeMiles); //rounding of the values upto three decimal places.
        
    }    
}
