package dev.rebecamf;

import dev.rebecamf.models.Planet;
import dev.rebecamf.models.PlanetType;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        //Two planets
        Planet planet1 = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 1, PlanetType.TERRESTRIAL, true);
        Planet planet2 = new Planet("Jupiter", 79, 1.898e27, 1.43128e15, 139822, 5, PlanetType.GAS_GIANT, false);

        // Attributes of the first planet
        System.out.println("Planet 1 Attributes:");
        System.out.println(planet1.getAttributes());
        System.out.println("Density: " + planet1.calculateDensity() + " kg/km^3");
        System.out.println("Is exterior: " + planet1.isExterior());

        System.out.println();

        // Attributes of the second planet
        System.out.println("Planet 2 Attributes:");
        System.out.println(planet2.getAttributes());
        System.out.println("Density: " + planet2.calculateDensity() + " kg/km^3");
        System.out.println("Is exterior: " + planet2.isExterior());
    }
    }

