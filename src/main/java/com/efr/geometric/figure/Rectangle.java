package com.efr.geometric.figure;

import com.efr.geometric.interfaces.FigureInterface;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Rectangle implements FigureInterface {
    private final String name = "Прямоугольник";
    private double length;
    private double width;

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateSquare() {
        return length * width;
    }
}
