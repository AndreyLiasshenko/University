package Lab1;
import java.util.Scanner;

public class ThreeDimensionalVector {
    private double x;
    private double y;
    private double z;
    private boolean state;

    public void setValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        this.x = scanner.nextInt();
        System.out.println("Enter y");
        this.y = scanner.nextInt();
        System.out.println("Enter z");
        this.z = scanner.nextInt();
        this.state = true;
    }

    public void getValues() {
        if (this.state) System.out.println("x="+this.x + ", y=" + this.y + ", z=" + this.z);
    }

    public double getLengthVector() {
        if (this.state) return Math.sqrt( (x*x) + (y*y) + (z*z) );
        else return 0;
    }

    public ThreeDimensionalVector plus(ThreeDimensionalVector vector) {
        ThreeDimensionalVector result = new ThreeDimensionalVector();
        result.x = this.x + vector.x;
        result.y = this.y + vector.y;
        result.z = this.z + vector.z;
        result.state = true;
        return result;
    }

    public ThreeDimensionalVector minus(ThreeDimensionalVector vector) {
        ThreeDimensionalVector result = new ThreeDimensionalVector();
        result.x = this.x - vector.x;
        result.y = this.y - vector.y;
        result.z = this.z - vector.z;
        result.state = true;
        return result;
    }

    @Override
    public String toString() {
        return "x="+this.x + ", y=" + this.y + ", z=" + this.z;
    }
}


class Run {
    public static void main(String[] args) {
        ThreeDimensionalVector test = new ThreeDimensionalVector();
        ThreeDimensionalVector test2 = new ThreeDimensionalVector();
        test.setValues();
        test.getValues();

        test2.setValues();
        test2.getValues();

        System.out.println(test.plus(test2));
        System.out.println(test.minus(test2));

    }
}
