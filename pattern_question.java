public class pattern_question {
    public static void main(String[] args) {
        /*
        * * * *
        * * * *
        * * * *
        * * * *
         */
//        for(int i=1;i<=4;i++)
//        {
//             for(int j=1;j<=4;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
        /*
         *
         * *
         * * *
         * * * *
         */
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        /*
         * * * *
         * * *
         * *
         *
         */
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=4;j>=i;j--)
//            {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
        /*
          * * * * *
          *       *
          *       *
          * * * * *
        */
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1||i==4||j==1||j==5)
//                {
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.print("\n");
//        }
        /*
       _ _ _ *
       _ _ * *
       _ * * *
       * * * *
         */
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=4-i;j++)
//            {
//                System.out.print("  ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
//        for (int i=1;i<=5;i++)
//        {
//            int num=1;
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
        /*
             1 2 3 4 5
             1 2 3 4
             1 2 3
             1 2
             1
         */
//        for(int i=1;i<=5;i++)
//        {
//            int num=1;
//            for(int j=5;j>=i;j--)
//            {
//                System.out.print(num +" ");
//                num++;
//            }
//            System.out.println();
//        }
        /*
          1
          2 3
          4 5 6
          7 8 9 10
          11 12 14 15
         */
//        int num=1;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(num+"   ");
//                num++;
//            }
//            System.out.println();
//        }
        /*
          1
          0 1
          1 0 1
          0 1 0 1
          1 0 1 0 1
         */
        int num=1;
        for(int i=1;i<=5;i++)
        {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(num+" ");
                 if(num==1)
                 {
                     num--;
                 }
                 else{
                     num++;
                 }
             }
            System.out.println();
        }
    }
}
