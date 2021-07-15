package javastudy.ch6;


class Point {
    int x;
    int y;

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends Point {
    int z;

    String getLocation() {
        return "x :" + x + ", y :" + y + ", z : " + z;
    }
}

public class PointEx {

}
