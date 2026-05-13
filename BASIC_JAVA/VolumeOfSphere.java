package BASIC_JAVA;

import static java.lang.Math.pow;

public class VolumeOfSphere {
    static void main() {
        double r = 3.89;
        double volume = (4/3)*3.14*pow(r,3);
        System.out.println("Volume of Sphere : "+volume);
    }
}
