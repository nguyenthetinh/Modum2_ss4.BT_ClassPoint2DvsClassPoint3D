package com.classPoint2DvsclassPoint3D;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(){}

    public Point3D(float x, float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y,float z){
        super.getX();
        super.getY();
        this.z=z;
    }

    public float[] getXYZ(){
        float Array[]={getX(),getY(),z};
        return Array;
    }

    @Override
    public String toString() {
        return super.toString()+" , z= "+getZ();
    }
}
