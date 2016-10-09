/**
 * Created by Luke on 10/9/2016.
 */
public abstract class Chapter {

    public static void main(String[] args)
    {
        for(int i = 1; i<=100; i++)
        {
            if (i % 5 == 0 && i % 3 == 0)
            {
                System.out.println("foobar");
            }
            else if(i % 5 == 0)
            {
                System.out.println("foo");
            }
            else if(i % 3 == 0)
            {
                System.out.println("bar");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

}
