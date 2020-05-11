public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
    
            for ( int n=1; n <= 3; n++ )
            {
                for ( char c='A'; c <= 'E'; c++ )
                {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            // * You will add a line of code here.
            System.out.println();
        }

        System.out.println("\n");

    }
}

// QUESTION 1
// inner loop changes faster because it is controlled by the inner loop

// QUESTION 2
// with N on the outer loop and C on the inner loop - letter A-E is excuted faster because it's on the inside now while 1-3 is excuted slower

//QUESTION 3
// println prints each answer onto a new line so not they aren't side by side

//QUESTION 4
//  a new line is printed after b is excuted, total of 3 lines because it started at 1 and is less than or equal to 3 

