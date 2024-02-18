package dev.rebecamf.models;

public class Planet {
    private String name = null;
    private int numberOfSatellites = 0;
    private double mass = 0;
    private double volume = 0;
    private int diameter = 0;
    private int distanceToSun = 0; 
    private PlanetType planetType;
    private boolean observable = false;


public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter, int distanceToSun, PlanetType planetType, boolean observable) {
    this.name = name;
    this.numberOfSatellites = numberOfSatellites;
    this.mass = mass;
    this.volume = volume;
    this.diameter = diameter;
    this.distanceToSun = distanceToSun;
    this.planetType = planetType;
    this.observable = observable;
}
public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public int getNumberOfSatellites() {
    return numberOfSatellites;
}


public void setNumberOfSatellites(int numberOfSatellites) {
    this.numberOfSatellites = numberOfSatellites;
}


public double getMass() {
    return mass;
}


public void setMass(double mass) {
    this.mass = mass;
}


public double getVolume() {
    return volume;
}


public void setVolume(double volume) {
    this.volume = volume;
}


public int getDiameter() {
    return diameter;
}


public void setDiameter(int diameter) {
    this.diameter = diameter;
}


public int getDistanceToSun() {
    return distanceToSun;
}


public void setDistanceToSun(int distanceToSun) {
    this.distanceToSun = distanceToSun;
}


public PlanetType getPlanetType() {
    return planetType;
}


public void setPlanetType(PlanetType planetType) {
    this.planetType = planetType;
}


public boolean isObservable() {
    return observable;
}


public void setObservable(boolean observable) {
    this.observable = observable;
}

    // Method to return the values of the attributes

public String getAttributes() {
    return "Name: " + name + "\n" +
            "Number of Satellites: " + numberOfSatellites + "\n" +
            "Mass: " + mass + " kg\n" +
            "Volume: " + volume + " cubic km\n" +
            "Diameter: " + diameter + " km\n" +
            "Distance to Sun: " + distanceToSun + " million km\n" +
            "Planet Type: " + planetType + "\n" +
            "Observable: " + observable; 
    }

    public double calculateDensity() {
        if (volume != 0) {
            return mass / volume;
        } else {
            return 0.0;
        }
    }

    public boolean isBeyondAsteroidBelt() {
        // Distancia al Sol en UA
        double distanceToSunInUA = distanceToSun / 149597870.0;

        // Verificar si el planeta está más allá del cinturón de asteroides
        return distanceToSunInUA > 2.1 && distanceToSunInUA < 3.4;
    }

    public boolean isExterior() {
        double distanceToSunInMillions = distanceToSun * 149.597870;

        return distanceToSunInMillions < 210  || distanceToSunInMillions < 340;
    }
    
    

    public boolean isItExterior() {
        double distanceToSunInKm = distanceToSun * 149597870;

        return distanceToSunInKm > 2.1 * 149597870 && distanceToSunInKm < 3.4 * 149597870;
    }




}