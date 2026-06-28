class Box {
    int length;
    int breadth;

    Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    int height;

    Box3D(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    int volume() {
        return length * breadth * height;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box3D b = new Box3D(5, 4, 3);

        System.out.println("Area = " + b.area());
        System.out.println("Volume = " + b.volume());
    }
}