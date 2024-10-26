package com.efr.geometric.figure;

import com.efr.geometric.interfaces.FigureInterface;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Circle implements FigureInterface {
    private final String name = "Круг";
    private double radius;

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * Math.pow(radius,2);
    }
}
