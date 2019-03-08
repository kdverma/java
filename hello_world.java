/*
Array, Array of objects, ArrayList, 
Strings (length,CharAt,Replace,endsWith,indexOf,compareTo, immutable string, contains, replaceAll, toLowerCase, toUpperCase,
Interger.parseInt, Integer.valueOf),
HashMap(put,get,remove,containsKey,keyset,values,isEmpty),
*/
import java.util.ArrayList;
import java.util.HashMap;

class A
{
	int number;
	void setNumber(int n)
	{
		number = n;
	}
	
	int getNumber()
	{
		return number;
	}
}


class ExecuterClass
{
	public static void main(String arg[])
	{
        //ARRAY
        int arr[] = new int[5];
        arr[0] = 11;
        arr[4] = 44;
        for(int a = 0;a<5;a++)
        {
            System.out.println("\nvalue arr[" + a + "] is " + arr[a]);
        }
		System.out.println("HELLLOOOOOOOOO");
        
        
        //ARRAY OF OBJECT
        A arrayOfObj[] = new A[5];      
        for (int a = 0;a < 5;a++)
        {
            /*this is very much required, otherwise we will get Null pointer exception*/
            arrayOfObj[a] = new A();
        }
        arrayOfObj[0].setNumber(11);
        arrayOfObj[4].setNumber(44);     
        for(int b = 0; b < 5; b++)
        {
            System.out.println("\narray of obj = " + arrayOfObj[b].getNumber());
            //arrayOfObj[0]
        }
        
        //ARRAYLIST        
        ArrayList<Integer> arrlist = new ArrayList<Integer>(); //can not use in build data types with array lists
        arrlist.add(3453);
        arrlist.add(56756);
        System.out.println("\ncontents of list are : " + arrlist);
        
        //STRINGS
        String strA = "Learning Java";
        System.out.println("\nString is : " + strA);
        System.out.println("char at 0 :" + strA.charAt(0));
        System.out.println("string len :" + strA.length());
        System.out.println("index of j :" + strA.indexOf("J"));
        System.out.println("endswith va:" + strA.endsWith("va"));
        System.out.println("replace :" + strA.replace("v","M"));
        System.out.println("String after replace : " + strA);
        System.out.println("toUpper :" + strA.toUpperCase());
        System.out.println("compareto : " + strA.compareTo("Learning Javaa"));
        
        //STRING TO INT
        String strB = "100";
        Integer intB = Integer.parseInt(strB);
        System.out.println("\nstring to int, should be 102 : "  + (intB + 2));
        
        //HASHMAP
        HashMap<String,String> hmap = new HashMap<String,String>();
        hmap.put("kapil","S2");
        hmap.put("sandeep","S4");
        System.out.println("\ncontent of hashmap is : " + hmap);
        
        for(String strLoop:hmap.keySet())
        {
            System.out.println("\n" + strLoop + " is having designation : " + hmap.get(strLoop));
        }
        
		A obj = new A();
		obj.setNumber(5);
		System.out.println("\nnumber is : " + obj.getNumber());
	}
    
}