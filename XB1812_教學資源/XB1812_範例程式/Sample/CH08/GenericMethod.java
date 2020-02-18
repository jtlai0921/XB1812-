class GenericMethod{
	public static<E> void printArray( E[] data )   {
		// 輸出陣列元素            
		for (int i=0; i<data.length; i++){        
			System.out.println( data[i] );
		}
		//System.out.println();
	}
 
	public static void main(String args[]){
		// 建立不同型態的陣列： Integer、Double和String
		Integer iArray[]= { 1, 2, 3, 4, 5 };
		Double dArray[]	= { 1.1, 2.2, 3.3, 4.4 };
		String sArray[]	= {"this","is","my","school"};
 
		System.out.println( "整數陣列的元素內容：" );
		printArray( iArray  ); 
 
		System.out.println( "浮點陣列的元素內容：" );
		printArray( dArray );
 
		System.out.println( "字串陣列的元素內容：" );
		printArray( sArray );
	} 
}
