package org.efr.utils;

import com.efr.geometric.interfaces.FigureInterface;

public class FigureEquals {
    //Какие - то изменения, довольно важные, причём
    /**
     * Сравнивает площади двух фигур.
     * @param figure1 Первая фигура
     * @param figure2 Вторая фигура
     * @return true, если площади равны, иначе false
     */
    public static boolean isAreaEqual(FigureInterface figure1, FigureInterface figure2) {
        return Double.compare(figure1.calculateSquare(), figure2.calculateSquare()) == 0;
    }

    /**
     * Сравнивает периметры двух фигур.
     * @param figure1 Первая фигура
     * @param figure2 Вторая фигура
     * @return true, если периметры равны, иначе false
     */
    public static boolean isPerimeterEqual(FigureInterface figure1, FigureInterface figure2) {
        return Double.compare(figure1.calculatePerimeter(), figure2.calculatePerimeter()) == 0;
    }

    /**
     * Проверяет полное равенство двух фигур по имени, площади и периметру.
     * @param figure1 Первая фигура
     * @param figure2 Вторая фигура
     * @return true, если фигуры идентичны, иначе false
     */
    public static boolean isFigureEqual(FigureInterface figure1, FigureInterface figure2) {
        return figure1.getClass().equals(figure2.getClass()) &&
                Double.compare(figure1.calculateSquare(), figure2.calculateSquare()) == 0 &&
                Double.compare(figure1.calculatePerimeter(), figure2.calculatePerimeter()) == 0;
    }
}
