package mathDemo;

public class Triangle {
    public static int calculateAreaByTwoSideAndAngle(int a,int b, double angle){
        int result = 0;

        return (int) (0.5 * a * b * Math.sin(Math.toRadians(angle)));
    }
}
