package com.efr.geometric.figure;

import com.efr.geometric.interfaces.FigureInterface;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Triangle implements FigureInterface {
    private final String name = "Треугольник";
    private double sideA;
    private double sideB;
    private double sideC;

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateSquare() {
        double semiP = calculatePerimeter() / 2;
        return Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
    }
}
