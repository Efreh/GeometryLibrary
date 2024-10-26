package com.efr.geometric.three_dimensional_figure;

import com.efr.geometric.interfaces.ThreeDimensionalFigureInterface;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Cube implements ThreeDimensionalFigureInterface {
    private final String name = "Куб";
    private double side;

    public double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
