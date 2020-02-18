class GenericData<T> {
  private T data;  //���data�����A��T�M�w
  public void setData(T data){
    this.data = data;
  }
  public T getData(){
    return data;
  }
}

class UseGeneric {
  public static void main(String args[]){
    GenericData<Boolean>	data1 = new GenericData<Boolean>();
    GenericData<Integer>	data2 = new GenericData<Integer>();
    GenericData<String> 	data3 = new GenericData<String>();
 
    data1.setData(new Boolean(true));
    data2.setData(new Integer(20));
    data3.setData("�o�O�x�O���O������");
		
    System.out.println("data1:"+data1.getData() );
    System.out.println("data2:"+data2.getData() );
    System.out.println("data2:"+data3.getData() );
  }
}
