package sample;

import static java.lang.Math.abs;

/**
 * Created by sebastian on 21.02.17.
 */
public class Position {
    boolean isSet=false;
    double InitialArea;
    double ActualArea;
    double AreaRatio;
    double Tolerance =10;

    public void setInitial(){
    InitialArea=ActualArea;
    AreaRatio=100;
    isSet=true;}




    public double getInitialArea(){
        return InitialArea;

    }

    public double getActualArea() {
        return ActualArea;
    }

    public void setActualArea(double actualArea) {

        ActualArea = actualArea;
        calculateArea();

    }


    private void calculateArea(){
        double newRatio=InitialArea/ActualArea*100;
        if(abs(AreaRatio-newRatio)>Tolerance){
            AreaRatio=newRatio;
        }
    }

    public double getTolerance() {
        return Tolerance;
    }

    public void setTolerance(double tolerance) {
        Tolerance = tolerance;
    }
}

