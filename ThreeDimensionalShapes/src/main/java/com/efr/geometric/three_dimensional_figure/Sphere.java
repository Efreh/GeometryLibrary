package com.efr.geometric.three_dimensional_figure;

import com.efr.geometric.interfaces.ThreeDimensionalFigureInterface;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Sphere implements ThreeDimensionalFigureInterface {
    private final String name = "Сфера";
    private double radius;

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
