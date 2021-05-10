package pointmoveablePoint;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MovablePointTest {
  public static void main(String[] args) {
    MovablePoint movablePoint = new MovablePoint();
    System.out.println(movablePoint);
    movablePoint=new MovablePoint(2,5);
    System.out.println(movablePoint);
    movablePoint=new MovablePoint(2,4,6,8);
    System.out.println(movablePoint);
  }
}
