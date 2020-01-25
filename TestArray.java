public class TestArray
{
         public static void main(final String[] args)
        {
            //printing the array list
            final double[] myList = { 1.2,3.2,4.5,4.5};
            for (int i =0; i < myList.length; i++)
            {
                 System.out.println(myList[i]+ "");
            }
            //total of the array listings
            double total = 0;
            for (int i= 0; i < myList.length; i++)
            {
                total = total + myList[i];
            }
                 System.out.println("total is" + total);
             //finding the largest element.
            Double max = myList[0];
            for (int i=1; i < myList.length; i++)
            {
                if(myList[i] > max)
                max = myList[i];
            }
                 System.out.println("largest element is "+ max);
        
        }

