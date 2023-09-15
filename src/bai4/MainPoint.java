package bai4;

import java.util.Scanner;

public class MainPoint {
    public static void main(String[] args) {
        MyPoint[] points = nhapDiem();
        MaxDistance(points);
    }
    public static double MaxDistance(MyPoint[] points){

        double maxDistance = Double.MIN_VALUE;
        int maxIndex1 = -1;
        int maxIndex2 = -1;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = points[i].distance(points[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    maxIndex1 = i;
                    maxIndex2 = j;
                }
            }
        }

        System.out.printf("Hai điểm có khoảng cách lớn nhất là điểm thứ %d và điểm thứ %d .\n",
                maxIndex1 + 1, points[maxIndex1].getX(), points[maxIndex1].getY(),
                maxIndex2 + 1, points[maxIndex2].getX(), points[maxIndex2].getY());
        System.out.printf("Khoảng cách giữa hai điểm này là %.2f.\n", maxDistance);
        return maxDistance;
    }


    public static MyPoint[] nhapDiem(){
        System.out.print("Nhập số lượng điểm: ");
        int n = new Scanner(System.in).nextInt();
        MyPoint[] points = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập tọa độ của điểm thứ %d:\n", i + 1);
            System.out.print("x: ");
            double x = new Scanner(System.in).nextDouble();
            System.out.print("y: ");
            double y = new Scanner(System.in).nextDouble();
            points[i] = new MyPoint(x, y);
        }
        return points;
    }

}
