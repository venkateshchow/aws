package com.amazonaws.samples;

	import java.util.UUID;
	import java.util.logging.Logger;

	import com.amazonaws.regions.Region;
	import com.amazonaws.regions.Regions;
	import com.amazonaws.services.s3.AmazonS3;
	import com.amazonaws.services.s3.AmazonS3Client;

	public class RequestClient {

		private static final String bucketName = "my-venkatesh-s3-bucket" + UUID.randomUUID();
		private static final Logger log = Logger.getLogger(S3Sample.class.getName());

		public static AmazonS3 S3() {
			AmazonS3 s3 = new AmazonS3Client();
			Region usEast1 = Region.getRegion(Regions.US_EAST_1);
			s3.setRegion(usEast1);
			return s3;
		}

		public static void createBucket() {
			log.info("Creating bucket " + bucketName + "\n");
			S3().createBucket(bucketName);
		}
	
}
