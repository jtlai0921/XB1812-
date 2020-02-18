import java.util.*;
public class StringSort{
  public static void main(String args[]){
    //1. �Ʀr��ƪ��Ƨ�
    int[] intData = { 4, 1, 3, -23 };
    Arrays.sort(intData); //���G�G [-23, 1, 3, 4]
    System.out.print("\n1. �w�]�Ƨ� intData�}�C�����e:");
    for(int i=0; i<intData.length; i++)
      System.out.print("\t"+intData[i]);

    //2. �r���ƱƧǡйw�]:�Ϥ��j�p�g�A�̦r�����Ǳ�
    String[] strData = { "m", "a", "C","Z" };
    Arrays.sort(strData); //���G�G [C, Z, a, m]
    System.out.print("\n2. �w�]�Ƨ� strData�}�C�����e:");
    for(int i=0; i<strData.length; i++)
      System.out.print("\t"+strData[i]);

    //3. �r���ƱƧǡФ����j�p�g�A�̦r�����Ǳ�
    Arrays.sort(strData, String.CASE_INSENSITIVE_ORDER); //���G�G [a, C, m, Z]
    System.out.print("\n3. �����j�p�g�B���V�ƧǪ����G:");
    for(int i=0; i<strData.length; i++)
      System.out.print("\t"+strData[i]);

    //4. �r���ƱƧǡаϤ��j�p�g�A�̦r���ϦV���Ǳ�
    Arrays.sort(strData, Collections.reverseOrder()); //���G�G[m, a, Z, C]
    
    System.out.print("\n4. �Ϥ��j�p�g�B�ϦV�ƧǪ����G:");
    for(int i=0; i<strData.length; i++)
      System.out.print("\t"+strData[i]);

    //5. �r���ƱƧǡФ����j�p�g�A�̦r���ϦV���Ǳ�
    Arrays.sort(strData, String.CASE_INSENSITIVE_ORDER);
    Collections.reverse(Arrays.asList(strData)); //���G�G [Z, m, C, a]
    System.out.print("\n5. �����j�p�g�B�ϦV�ƧǪ����G:");
    for(int i=0; i<strData.length; i++)
      System.out.print("\t"+strData[i]);
  }
}
