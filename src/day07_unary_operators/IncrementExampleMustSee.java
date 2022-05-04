package day07_unary_operators;

public class IncrementExampleMustSee {
    public static void main(String[] args) {
        int i = 5; // 6
        int z = i++; // 5

        /* Before Java reads ++  its giving z value of 5, So Z is 5, then java store +1 for i and waiting untill you use it

        int i = 5; // i = 5
        int z = i++; // here: z = 5 (before incrementing the i),  but i = 6 now (after being incremented)

        System.out.println(i); // i now = 6
        System.out.println(z); // z still = 5 because it equals i before being incremented.
        So even if we use post-increment, it will affect and update "I", because code works from top to the bottom
         */

        /*
        z equals i.

That's all what (z) is.

i is being incremented when we use (i++).

So the new value of (i) after being incremented is 6.

But the value of (z) is still at 5, which is the old value of (i).

(z) is not following the changes that we make to the (i) at a later stage.

All future changes to the (i) do not change the value of (z).

(z) equaled the (i) when the (i) was 5; hence, the (z) took the value of 5.   No more changes are happening to the (z).

The (i) was incremented by the code (i++).  This incremented value "which is now 6" is stored at the new (i).  So the (i) now is 6.

BUT the (z) is still at 5, the old original value of (i).
         */

        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a+1;

        System.out.println(a);
        System.out.println(b);

        int c = ++a; //a=10->10+1=11
        System.out.println(c);
        System.out.println(a);

        int d = 3;
        int e = d++;
        System.out.println(d);
        System.out.println(e); //Before Java reads ++  its giving "e" value of 3, then java store +1 for d and waiting untill you use it

    }
}
