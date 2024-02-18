package dev.rebecamf.models;


    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlanetTest {

    @Test
    public void testConstructor() {
        Planet planet = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 1, PlanetType.TERRESTRIAL, true);
        assertEquals("Earth", planet.getName());
        assertEquals(1, planet.getNumberOfSatellites());
        assertEquals(5.972e24, planet.getMass());
        assertEquals(1.08321e12, planet.getVolume());
        assertEquals(12742, planet.getDiameter());
        assertEquals(1, planet.getDistanceToSun());
        assertEquals(PlanetType.TERRESTRIAL, planet.getPlanetType());
        assertTrue(planet.isObservable());
    }

    @Test
    public void testGetAttributes() {
        Planet planet = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 1, PlanetType.TERRESTRIAL, true);
        String expectedAttributes = "Name: Earth\n" +
                                    "Number of Satellites: 1\n" +
                                    "Mass: 5.972E24 kg\n" +
                                    "Volume: 1.08321E12 cubic km\n" +
                                    "Diameter: 12742 km\n" +
                                    "Distance to Sun: 1 million km\n" +
                                    "Planet Type: TERRESTRIAL\n" +
                                    "Observable: true";
        assertEquals(expectedAttributes, planet.getAttributes());
    }

    @Test
    public void testCalculateDensity() {
        // Create a planet with non-zero mass and volume
        Planet planet1 = new Planet("Planet1", 0, 5.0, 2.0, 0, 0, PlanetType.TERRESTRIAL, true);
        assertEquals(2.5, planet1.calculateDensity());

        // Create a planet with zero volume
        Planet planet2 = new Planet("Planet2", 0, 5.0, 0.0, 0, 0, PlanetType.TERRESTRIAL, true);
        assertEquals(0.0, planet2.calculateDensity());
    }

    @Test
    public void testIsBeyondAsteroidBelt() {
        // Crear un planeta dentro del cinturón de asteroides
        Planet innerPlanet = new Planet("Inner", 0, 0, 0, 0, 2, PlanetType.TERRESTRIAL, true);
        assertFalse(innerPlanet.isBeyondAsteroidBelt());

        // Crear un planeta más allá del cinturón de asteroides
        Planet exteriorPlanet = new Planet("Exterior", 0, 0, 0, 0, 4, PlanetType.TERRESTRIAL, true);
        assertTrue(exteriorPlanet.isBeyondAsteroidBelt());
    }

    @Test
    public void testIsExterior() {
        // Crear un planeta dentro del cinturón de asteroides
        Planet innerPlanet = new Planet("Inner", 0, 0, 0, 0, 2, PlanetType.TERRESTRIAL, true);
        assertFalse(innerPlanet.isExterior());

        Planet exteriorPlanet = new Planet("Exterior", 0, 0, 0, 0, 4, PlanetType.TERRESTRIAL, true);
        assertTrue(exteriorPlanet.isExterior());
    }

    @Test
    public void testIsItExterior() {
        Planet innerPlanet = new Planet("Inner", 0, 0, 0, 0, 2, PlanetType.TERRESTRIAL, true);
        assertFalse(innerPlanet.isItExterior());

        Planet exteriorPlanet = new Planet("Exterior", 0, 0, 0, 0, 4, PlanetType.TERRESTRIAL, true);
        assertTrue(exteriorPlanet.isItExterior());
    }
}


