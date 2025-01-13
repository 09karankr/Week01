public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius of Earth in kilometers
        double radiusMiles = radiusKm / 1.6; // Convert radius to miles
        double pi = Math.PI;

        // Volume of sphere formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                " and in cubic miles is " + volumeMiles3);
    }
}
