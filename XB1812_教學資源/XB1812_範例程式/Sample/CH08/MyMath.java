package exercise.unit;

public class MyMath{ 
     public float getAvg(float[] dimNum){
     	  float sum=getSummary(dimNum);
        return sum/dimNum.length;
     }
     public float getSummary(float[] dimNum){
        float sum=0;
        for (int i=0; i<dimNum.length; i++)
     	    sum+=dimNum[i]; 
     	  return sum;
     }
     public float getStdDev(float[] dimNum){ 
		  float avg = getAvg(dimNum);
		  float deviation=0;
		  for (int i=0; i<dimNum.length; i++)  //�p�����t����
		      deviation+=Math.pow(dimNum[i]-avg,2);
		  float variance=deviation/dimNum.length;  //�ܲ���
		  return (float)Math.sqrt(variance);  //�зǮt
     } 
}
