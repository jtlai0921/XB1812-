import java.util.*;

class VectorSample_2{
	public static void main(String args[]) {
		Vector v = new Vector();
		System.out.println("預設的陣列大小："+v.size());
		System.out.println("預設的陣列容量："+v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("增加四個Integer物件後的容量："+v.capacity());

		v.addElement(new Double(5.15));
		System.out.println("再增加一個Double物件後的容量："+v.capacity());

		v.addElement(new Float(9.6));
		v.addElement(new String("Java Program"));
		System.out.println("第一個元素："+(Integer)v.firstElement());
		System.out.println("最後一個元素："+(String)v.lastElement());
		System.out.println("Vector的陣列大小："+v.size());

		if(v.contains(new Float(9.6)))
			System.out.println("Vector有元素的內容是9.6");
		
		System.out.println("\n使用Enumeration列舉類別顯示Vector的元素內容");
		int cnt=0;
		Enumeration vEnum = v.elements();
		System.out.println("Vector各個元素的內容：");
		while(vEnum.hasMoreElements()){
			System.out.println("第:"+cnt+"個元素內容："+ vEnum.nextElement());
			cnt++;
		}

		System.out.println("\n使用get()方法顯示Vector的元素內容");
		for(int i = 0;i < v.size();i++){ 
			System.out.println("第:"+i+"個元素內容："+v.get(i)); 
		}
	}
}
