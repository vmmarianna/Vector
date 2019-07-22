package com.company;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x,double y, double z)
    {
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


    public Double lenght()
    {
        Double length = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
        return length;
    }


    public Vector sum(Vector other) {
        double x = this.x + other.x;
        double y = this.y + other.y;
        double z = this.z + other.z;
        return new Vector(x, y, z);
    }

    public Vector sub(Vector other) {
        double x = this.x - other.x;
        double y = this.y - other.y;
        double z = this.z - other.z;
        return new Vector(x, y, z);
    }


}
