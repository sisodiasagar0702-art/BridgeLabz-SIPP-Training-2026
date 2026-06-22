public class EarthVolume {
    public static void main(String[] args) {
        double radiusInKm = 6378;
        double volumeInKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKm, 3);
        double volumeInMiles = volumeInKm / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm
                + " and cubic miles is " + volumeInMiles);
    }
}
