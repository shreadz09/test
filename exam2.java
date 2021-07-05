package exam;

public class exam2 {
	
	exam2(int [] arr) {
		
		int len = arr.length;
		 
        for (int i = 0; i < len-1; i++)
            for (int j = 0; j < len-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

	    double median;
	    
	    if(arr.length%2==0) {
	    	median = (double)(arr[(len - 1) / 2] + arr[len / 2]) / 2;	
	    } else {
	    	median = (double)arr[arr.length / 2];
	    }
	    
	    System.out.print("Median: "+median+ "\nLargest Value: " +arr[len-1] );
	}

}
