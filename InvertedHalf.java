// 1.Solid Rectangle
// public class solicRec
// {
//   public static void main(String args[])
//   {
//     for(int i=0; i<5; i++)
//     {
//       for (int j=0; j<10; j++)
//       {
//         System.out.print("* ");
//       }
//       System.out.println("\n");
//     }
//   }
// };

//2.Hollow Rectangle
// class hollowRec
// {
//     public static void main(String agrs[])
// {
//     for(int i=0; i<=4; i++)
//     {
//         for(int j=1; j<=5; j++)
//         {
//             if(i==0 || i==4 || j==1 ||j==5)
//             {
//                 System.out.print("* ");
//             }
//             else
//             {
//                 System.out.print("  ");
//             }
//         }
//         System.out.println("\n");
//     }
// }
// }


//3.Half Payramid
// public class halfPyramid
// {
//   public static void main(String agrs[])
//   {
//     for(int i=0; i<4; i++)
//     {
//       for(int k=0; i>=k; k++)
//       {
//         System.out.print("* ");
//       }
//       System.out.print("\n");
//     }
//   }
// }

//4.Inverted Half Pyramid
// public class Inverted
// {
//   public static void main(String agrs[])
//   {
//     for(int i=4; i>0; i--)
//     {
//       for(int k=0; k<i; k++)
//       {
//         System.out.print("* ");
//       }
//       System.out.print("\n");
//     }
//   }
// }

//5.Inverted Half Rotated by 180 degree
// public class patterns
// {
//   public static void main(String agrs[])
//   {
//     for(int i=0; i<4; i++)
//     {
//       for(int j=3; j>i; j--)
//       {
//         System.out.print("  ");
//       }
//       for(int k=0; k<=i; k++)
//         {
//           System.out.print("* ");
//         }
//       System.out.print("\n");
//     }
//   }
  
// }
//5.Inverted Half Rotated by 180 degree
// public class InvertedHalf
// {
//   public static void main(String agrs[])
//   {
//     for(int i=0; i<4; i++)
//     {
//       for(int j=3; j>i; j--)
//       {
//         System.out.print("  ");
//       }
//       for(int k=0; k<=i; k++)
//         {
//           System.out.print("* ");
//         }
//       System.out.print("\n");
//     }
//   }
  
// }
//6.Half Payramid with numbers
// public class halfPywithNum
// {
//   public static void main(String agrs[])
//   {
//     for(int i=1; i<=5; i++)
//     {
//       for(int j=1; j<=i; j++)
//       {
//         System.out.print(j);
//       }
//       System.out.print("\n");
//     }
//   }
  
// }

//7.Inverted half Pyramid with numbers
// public class IhalfPywithNum
// {
//   public static void main(String agrs[])
//   {
//     for(int i=5; i>=1; i--)
//     {
//       for(int j=1; j<=i; j++)
//       {
//         System.out.print(j);
//       }
//       System.out.print("\n");
//     }
//   }
// }

//8.floyd's Triangle
// public class floyd
// {
//   public static void main(String agrs[])
//   {
//     int num = 1;
//     for(int i=1; i<=5; i++)
//     {
//       for(int k=1; k<=i; k++)
//       {
//         System.out.print(num);
//         System.out.print(" ");
//         num++;
//       }
//       System.out.println("\n");
//     }
//   }
// }

//9. 0-1 Triangle
// public class zero_one
// {
//   public static void main(String agrs[])
//   { 
//     for(int i=1; i<=5; i++)
//     {
//       for(int k=1; k<=i; k++)
//       { 
//         if((i+k)%2==0)
//         {
//           System.out.print("1");
//         }
//         else
//         {
//           System.out.print("0");
//         }
//       }
//       System.out.println("\n");
//     }
//   }
// }

//10.butterfly Pattern
// public class butterfly1
// {
//   public static void main(String agrs[])
//   { 
//     int sub=6;
//     for(int i=1; i<=4; i++)
//     {
//       for(int j=1; j<=i; j++)
//       {
//         System.out.print("* ");
//       }
//       for(int k=1; k<=sub; k++)
//         {
//           System.out.print("  ");
//         }
//         sub=sub-2;
//       for(int l=1; l<=i; l++)
//       {
//         System.out.print("* ");
//       }  
//       System.out.println("\n");
//     }
//      int sub2=0;
//     for(int m=0; m<4; m++)
//     {
//       for(int n=4; n>m; n--)
//       {
//         System.out.print("* ");
//       }
//       for(int p=0; p<sub2; p++)
//       {
//         System.out.print("  ");
//       }
//         sub2=sub2+2;
//       for(int q=4; q>m; q--)
//       {
//         System.out.print("* ");
//       }
//       System.out.println("\n");
//     }
//   }
// }   
