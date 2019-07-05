public class PaintJob {
//
//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
//        int extraBucketsNeeded = 0;
//        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
//            return -1;
//        } else {
//            extraBucketsNeeded = (int) Math.ceil((((width * height) / areaPerBucket) - extraBuckets));
//            return extraBucketsNeeded;
//        }
//    }

    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBucket){
        if(width<=0||height<=0||areaPerBucket<=0||extraBucket<0) return -1;
            double area=width*height;
            double neddedBucket=area/areaPerBucket;
            int  haveToBuyBucket=(int)Math.ceil((neddedBucket-extraBucket));
            return haveToBuyBucket ;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0) return -1;
        double area=width*height;
        double neddedBucket=area/areaPerBucket;
        int  haveToBuyBucket=(int)Math.ceil((neddedBucket));
        return haveToBuyBucket ;
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0||areaPerBucket<=0) return -1;
        int haveToBuyBucket=(int)Math.ceil(area/areaPerBucket);
        return haveToBuyBucket;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(34.56,45.6,1.5,1));
    }

}
