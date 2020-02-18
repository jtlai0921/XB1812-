public class StringScore{
	public static void main(String[] args){
		float sum=0, avg=0;
		for (int i=0; i<args.length; i++)
			sum+=Float.parseFloat(args[i]);

		avg=sum/args.length;
		System.out.println("Á`¤À="+sum);
		System.out.println("¥­§¡="+avg);
	}
}
