import java.util.*;
class VectorSample {
       public static void main(String args[]) {
            Vector v = new Vector();
            v.add(new Integer(90));		//�Ĥ@������J���
            v.addElement(new Float(5.5f));	//�ĤG������J�B�I��
            v.add(new String("Hello"));		//�ĤT������J�r��
            v.addElement(new Date());		//�ĥ|������J�������
            
            for (int i = 0 ; i < v.size() ; i++){
                 Object obj = v.elementAt(i);
                 System.out.println(obj);
            }
      }
}
