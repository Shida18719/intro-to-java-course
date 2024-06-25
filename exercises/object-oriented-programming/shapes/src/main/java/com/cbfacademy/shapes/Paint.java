package com.cbfacademy.shapes;

public class Paint {

    protected double coverage;
    protected double shape;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double getAmount(Shape shape) {
        return shape.getArea() / this.coverage;
    }

    // public double getArea() {
    //     return this.coverage * this.shape;
    // }

}
