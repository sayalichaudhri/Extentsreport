package StringPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class duplicate {

	public static void main(String arg[])
    {
        int []num={0,1,3,2,1,4};
        
        
        ArrayList<Integer> array=new ArrayList<Integer>();
        
        array.add(1);
        array.add(3);
        array.add(2);
        array.add(1);
        array.add(4);
        System.out.println(array);
        
        HashSet<Integer> sh=new HashSet<Integer>(array); 
        System.out.println(sh);
    }
	
	
}
