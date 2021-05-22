package CodeChef;

import java.util.Scanner;


class PointOfImpact {
    public static void main(String args[]) throws java.lang.Exception{
        {
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// int N=Integer.parseInt(br.readLine());  
            Scanner sc= new Scanner(System.in);
            int N =sc.nextInt();
            
            while(N--!=0)
            {
                // code-here
                      
                // int s=Integer.parseInt(br.readLine());  //matrix size
                // int k=Integer.parseInt(br.readLine());  //collision number
                // int xi=Integer.parseInt(br.readLine()); //x initial
                // int yi=Integer.parseInt(br.readLine()); //y initial 

                int s =sc.nextInt();
                int k =sc.nextInt();
                int xi =sc.nextInt();
                int yi =sc.nextInt();
                
                if(xi==yi) System.out.println(s+" "+s); //diagonal cond.
                else if((xi==0 && yi==s) || (xi==s && yi==0)) System.out.println(xi+" "+yi);// cornor cond. 
                
                else if(xi>yi)  //lower half
                {
                    k%=4;
                    if(k==0) System.out.println( (xi-yi) +" "+0);               // fourth collison
                    else if (k==1) System.out.println(s+" "+ (yi+(s-xi)) );     //first collison
                    else if (k==2) System.out.println( (yi+(s-xi)) +" "+s);     //second collison
                    else if (k==3) System.out.println(0+" "+ (xi-yi) );        //third collison

                }
                else //upper
                {
                    k%=4;
                    if(k==0) System.out.println(0 +" "+ (yi-xi) );         //fourth collison
                    else if (k==1) System.out.println((s-yi+xi)+" "+ s );     //first collison
                    else if (k==2) System.out.println( s +" "+(s-yi+xi));      //second collison
                    else if (k==3) System.out.println( yi-xi +" "+0);       //third collison

                }
            }
        sc.close();
        }
    } 
}       