/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH4.BAI2;

/**
 *
 * @author HP
 */
public class Diem {
    double x , y ; 

    public Diem() {
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
 
    public void inTTDiem(){
        System.out.println(" điểm có tọa độ x,y= "+getX()+",  "+getY());
    }
    public double inKC(Diem d){
        double KC=0 ;
        KC=(this.x-d.x)*(this.x-d.x)+(this.y-d.y)*(this.y-d.y);
        return KC ;
        
    }
    
            
}
