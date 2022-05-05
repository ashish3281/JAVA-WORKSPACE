                //             1 
                //         2 1   1 2 
                //     3 2 1       1 2 3 
                // 4 3 2 1           1 2 3 4 
                //     3 2 1       1 2 3 
                //         2 1   1 2 
                //             1 

                import java.util.*;
                public class Main {
                    public static void main(String args[]) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int row=1;
                    int nsp1=n-1;
                    int nsp2=-1;
                    int nst=1;
                    int val1=row;
                    int val2=1;
                    while(row<=n){
                        int csp1=0;
                        while(csp1<nsp1){
                            System.out.print("  ");
                            csp1+=1;
                        }
                        int cst=1;
                        while(cst<=nst){
                            System.out.print(val1+" ");
                            val1-=1;
                            cst+=1;
                        }
                        int csp2=1;
                        while(csp2<=nsp2){
                            System.out.print("  ");
                            csp2+=1;
                        }
                        cst=1;
                        if(row==1||row==n){
                            cst=2;
                        }
                        while(cst<=nst){
                            System.out.print(val2+" ");
                            val2+=1;
                            cst+=1;
                        }
                        if(row<=n/2){
                            nst+=1;
                            nsp1-=2;
                            nsp2+=2;
                            val1=row+1;
                            val2=1;
                        }
                        else{
                            nst-=1;
                            nsp1+=2;
                            nsp2-=2;
                            val1=n-row;
                            val2=1;
                        }
                        System.out.println();
                        row+=1;
                        
                    }
                    }
                }