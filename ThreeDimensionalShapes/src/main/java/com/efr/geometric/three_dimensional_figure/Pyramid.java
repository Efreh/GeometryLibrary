package com.efr.geometric.three_dimensional_figure;

import com.efr.geometric.interfaces.ThreeDimensionalFigureInterface;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pyramid implements ThreeDimensionalFigureInterface {
    private final String name = "Пирамида";
    private double baseLength;
    private double baseWidth;
    private double height;

    public double calculateSurfaceArea() {
        double baseArea = baseLength * baseWidth;
        double slantHeight = Math.sqrt(Math.pow((baseLength / 2), 2) + Math.pow(height, 2));
        double lateralArea = 2 * (baseLength * slantHeight + baseWidth * slantHeight);
        return baseArea + lateralArea;
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * (baseLength * baseWidth) * height;
    }
}
