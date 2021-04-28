package Rectangel;

import javax.crypto.spec.PSource;

public class Rectangel {
 int width;
 int height;
 public Rectangel(){

 }
 public Rectangel(  int width,int height){
   this.width=width;
   this.height=height;
 }
 public int getArea(){
   return this.width*this.height;
 }
 public int getPerimeter(){
   return (this.width+this.height)*2;
 }
 public String display(){
   return "Hinh chu nhat {" + "chieu dai=" + width + ", chieu rong=" + height + "}";

 }

}

