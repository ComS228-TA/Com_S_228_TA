package BigOh;

/**
 * @authors Brandon Maxwell, Jesse Frush
 */

public class BigOh
{
	//copy this into another class file and delete the comments!
	
	
	
	
	// O( 1 )
	public boolean method0( String[] strings )
	{
		if( strings[0] == null ) { return true; }
		return false;
	}

	
	
	
	
	// O( n^2 )
	public boolean method1( String[] strings )
	{
		for( int i = 0; i < strings.length; i++ )
		{
			for( int j = 0; j < strings.length; j++ )
			{
				if( i == j ) // Don't compare with self
				{
					continue;
				}

				if( strings[i] == strings[j] ) { return true; }
			}
		}
		return false;
	}

	

	
	// O( log( n ) )
	public void method2( int n )
	{
		int x = 2;
		while( x < n )
		{
			x *= 2;
		}
	}
	
	
	
	
	// O( log( n ) )
	public boolean method3( int[] arr, int v )
	{
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while( left <= right )
		{
			int mid = ( left + right ) / 2;
			if( arr[mid] == v ) return true;
			if( v < arr[mid] ) left = mid - 1;
			else
				right = mid + 1;
		}
		return false;
	}

	
	
	// O( n )
	public boolean method4( String[] strings, String value )
	{
		for( int i = 0; i < strings.length; i++ )
		{
			if( strings[i] == value ) { return true; }
		}
		return false;
	}

	
	
	// O( log( n ) )
	public void method5( int n )
	{
		while( n > 1 )
		{
			n = n / 2;
		}
	}

	
	
	// O( n * log( n ) )
	public void method6( int n )
	{
		for( int i = 0; i < n; ++i )
		{
			//log( n )
			method2( n );
		}
	}
	
	
	
	
	// O( n^2 * [ n + log( n ) ] )   ==   O( n^3 + [ n^2 * log( n ) ]
	//since n^3 dominates [ n^2 *log(n) ], this is simplified to O( n^3 )
	public void method7( int n )
	{
		for( int i = 0; i < n; ++i )
		{
			for( int j = 0; j < n; ++j )
			{
				//log n
				method5( n );

				//n
				method4( new String[] { "Hello" }, "lkajsdf" );
			}
		}
	}
	
	
	
	
	// O( n^2 * [ 4n + log( n ) ] )
	// still the same as m7, because constants have no effect.
	// so O( n^3 )
	public void method8( int n )
	{
		for( int i = 0; i < n; ++i )
		{
			for( int j = 0; j < n; ++j )
			{
				//log n
				method5( n );

				//n
				method4( new String[] { "Hello" }, "lkajsdf" );

				//n
				method4( new String[] { "Hello", "World" }, "rookie" );

				//n
				method4( new String[] { "Hello", "Clarice" }, "lambs" );

				//n
				method4( new String[] { "Happy", "Birthday", "Mr. President" }, "monroe" );
			}
		}
	}
}
