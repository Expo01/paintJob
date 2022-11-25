package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(2, 2, 3, 1));
        System.out.println(getBucketCount(2,2,3));
        System.out.println(getBucketCount(4,3));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double bucketsNeeded = width * height / areaPerBucket;

        if ((extraBuckets - bucketsNeeded) > 0) {
            return 0;
        } else return (int) (Math.ceil(bucketsNeeded - extraBuckets));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) (Math.ceil(width * height / areaPerBucket));
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) (Math.ceil(area / areaPerBucket));
    }
}
