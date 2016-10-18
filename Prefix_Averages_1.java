
public class Prefix_Averages_1 {
	public static double [] PrefixAvg1 (double [] inputArray){
		double [] outputArray = new double [inputArray.length]; 
		for (int i=0;i<=inputArray.length-1;i++){
			double s = inputArray[0];
				for (int j=1;j<=inputArray.length-1;j++){
					if (j <= i){
						s = s + inputArray[j];
					}
				}
		outputArray[i] = s/(i+1);
		}
		return outputArray; 
	}
	public static double[] size (){
		double [] random = new double [100];
		for (int i=0;i<random.length;i++){			
			double x = Math.random() * 1000;
			random[i] = x;		
		}
	return random;
	}	
	public static void firstAlgorythm(){
		long initial = System.currentTimeMillis();
		double [] result = PrefixAvg1(size());
		for (int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		System.out.println("the calculation took"+" "+((System.currentTimeMillis() - initial))+"milliseconds");
	}
	public static void seccondAlgorythm(){
		long initial = System.currentTimeMillis();
		double [] result2 = PrefixAvg2(size());	
		for (int i=0;i<result2.length;i++){
			System.out.println(result2[i]);
		}
		System.out.println("the calculation took"+" "+((System.currentTimeMillis() - initial))+"milliseconds");
	}
	public static double [] PrefixAvg2 (double [] inputArray){
		double [] outputArray = new double [inputArray.length]; 
		double s = 0;
		for (int i=0;i<=inputArray.length-1;i++){
			s = s + inputArray[i];
			outputArray[i] = s/(i+1);
		}
		return outputArray;
	}
	
}
