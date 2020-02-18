import java.util.*;
class VectorSample {
       public static void main(String args[]) {
            Vector v = new Vector();
            v.add(new Integer(90));		//第一元素放入整數
            v.addElement(new Float(5.5f));	//第二元素放入浮點數
            v.add(new String("Hello"));		//第三元素放入字串
            v.addElement(new Date());		//第四元素放入日期物件
            
            for (int i = 0 ; i < v.size() ; i++){
                 Object obj = v.elementAt(i);
                 System.out.println(obj);
            }
      }
}
