package com.company;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Double lenght() {
        Double length = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
        return length;
    }

    public Vector sum(Vector other) {
        double x = this.getX() + other.getX();
        double y = this.getY() + other.getY();
        double z = this.getZ() + other.getZ();
        return new Vector(x, y, z);
    }

    public Vector sub(Vector other) {
        double x = this.getX() - other.getX();
        double y = this.getY() - other.getY();
        double z = this.getZ() - other.getZ();
        return new Vector(x, y, z);
    }

    public Vector multiplyNumber(double number) {
        double x = this.getX() * number;
        double y = this.getY() * number;
        double z = this.getZ() * number;
        return new Vector(x, y, z);
    }

    public Vector multiplyVector(Vector other) {
        double x = this.getY() * other.getZ() - this.getZ() * other.getY();
        double y = this.getZ() * other.getX() - this.getX() * other.getZ();
        double z = this.getX() * other.getY() - this.getY() * other.getX();
        return new Vector(x, y, z);
    }


    @Override
    public String toString() {
        return "Vector: " + " X: " + getX() + " Y: " + getY() + " Z: " + getZ();
    }
}