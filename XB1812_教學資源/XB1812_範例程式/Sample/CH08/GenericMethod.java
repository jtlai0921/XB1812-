class GenericMethod{
	public static<E> void printArray( E[] data )   {
		// ��X�}�C����            
		for (int i=0; i<data.length; i++){        
			System.out.println( data[i] );
		}
		//System.out.println();
	}
 
	public static void main(String args[]){
		// �إߤ��P���A���}�C�G Integer�BDouble�MString
		Integer iArray[]= { 1, 2, 3, 4, 5 };
		Double dArray[]	= { 1.1, 2.2, 3.3, 4.4 };
		String sArray[]	= {"this","is","my","school"};
 
		System.out.println( "��ư}�C���������e�G" );
		printArray( iArray  ); 
 
		System.out.println( "�B�I�}�C���������e�G" );
		printArray( dArray );
 
		System.out.println( "�r��}�C���������e�G" );
		printArray( sArray );
	} 
}
