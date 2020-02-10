import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class snazzyautosmain {
    public static float a=535000,b=495000 ,c = 625000, d = 45000, e = 5500, f = 10090, g = 350, h = 1000,price,total,sum,cashback;
    public static float l,m;
    public static void main(String[] args) {
        //int a = 535000;
        System.out.println("types of cars are as follows:");
        System.out.println("hatchback:enter 1\n" + "saloon: enter 2\n" + "estate: enter 3\n");
        Scanner sc = new Scanner(System.in);
        int car = sc.nextInt();
        switch (car) {
            case 1:
                hatchback();
                break;
            case 2:
                saloon();
                break;

            case 3:
                estate();
                break;

            default:
                System.out.println("invalid input");

        }

    }

    private static void hatchback() {
        int a = 535000;
        int b = 495000;
        int c = 625000, d = 45000, e = 5500, f = 10000, g = 350, h = 1000;
        int option=8;
        System.out.println("price : 535000");
            while(option==8) {
                optionalextras();
                Scanner sc = new Scanner(System.in);
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        a = a + d;
                        System.out.println("total amount:" + a);
                        break;
                    case 2:
                        a = a + e;
                        System.out.println("total amount:" + a);
                        break;
                    case 3:
                        a = a + f;
                        System.out.println("total amount:" + a);
                        break;
                    case 4:
                        a = a + g;
                        System.out.println("total amount:" + a);
                        break;
                    case 5:
                        a = a + h;
                        System.out.println("total amount:" + a);
                        break;
                    default:
                        System.out.println("invalid input");

                }
                System.out.println("If you want additional optional extras enter 8 or else enter 0");
                Scanner in=new Scanner(System.in);
                option=in.nextInt();
            }
        System.out.println(a);
            price=a;
            trade();
            payment();
            a=535000;
            if(cashback<price) {
                l = (float) (price - a);
                System.out.println("best optional value:" + l);
            }
            else
            {
                System.out.println("Best offer is to get optional extras free which costs "+ l);
                System.out.println("Cashback is "+cashback);
            }
            System.out.println("Do you wish to get cashback or optionals extras free?");
            System.out.println("Enter 1 for cashback or 2 for optionals extras free");
            Scanner scan=new Scanner(System.in);
            int x=scan.nextInt();
            if(x==1)
            {
             price=price-m;
             System.out.println("Yow will receive a cashback of "+ m);
             System.out.println("Final price of the car will be "+price);
         }
            else
         {
             System.out.println("Final price of the car will be "+(price-l));
         }
    }

        private static void saloon() {
            int a = 535000;
            int b = 495000;
            int c = 625000, d = 45000, e = 5500, f = 10000, g = 350, h = 1000;
            int option = 8;
            System.out.println("price :495000");

            while (option == 8) {
                optionalextras();
                Scanner sc = new Scanner(System.in);
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        b = b + d;
                        System.out.println("total amount:" + b);
                        break;
                    case 2:
                        b = b + e;
                        System.out.println("total amount:" + b);
                        break;

                    case 3:
                        b = b + f;
                        System.out.println("total amount:" + b);
                        break;

                    case 4:
                        b = b + g;
                        System.out.println("total amount:" + b);
                        break;

                    case 5:
                        b = b + h;
                        System.out.println("total amount:" + b);
                        break;

                    default:
                        System.out.println("invalid input");
                }
                System.out.println("If you want additional optional extras enter 8 or else enter 0");
                Scanner in = new Scanner(System.in);
                option = in.nextInt();
            }
            System.out.println(b);
            price = b;
            trade();
            payment();
            b = 495000;
            if (cashback < price) {
                l = (float) (price - b);
                System.out.println("best optional value:" + l);
            }
            else
            {
                System.out.println("Best offer is to get optional extras free which costs "+ l);
                System.out.println("Cashback is "+cashback);
            }
            System.out.println("Do you wish to get cashback or optionals extras free?");
            System.out.println("Enter 1 for cashback or 2 for optionals extras free");
            Scanner scan=new Scanner(System.in);
            int x=scan.nextInt();
            if(x==1)
            {
                price=price-m;
                System.out.println("Yow will receive a cashback of "+ m);
                System.out.println("Final price of the car will be "+price);
            }
            else
            {
                System.out.println("Final price of the car will be "+(price-l));
            }
        }


        private static void estate () {
            int a = 535000;
            int b = 495000;
            int c = 625000, d = 45000, e = 5500, f = 10000, g = 350, h = 1000;
            int option=8;
            System.out.println("price:625000");
            while(option==8) {
                optionalextras();
                Scanner sc = new Scanner(System.in);
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        c = c + d;
                        System.out.println("total amount:" + c);
                        break;
                    case 2:
                        c = c + e;
                        System.out.println("total amount:" + c);
                        break;

                    case 3:
                        c = c + f;
                        System.out.println("total amount:" + c);
                        break;

                    case 4:
                        c = c + g;
                        System.out.println("total amount:" + c);
                        break;

                    case 5:
                        c = c + h;
                        System.out.println("total amount:" + c);
                        break;

                    default:
                        System.out.println("invalid input");
                }
                System.out.println("If you want additional optional extras enter 8 or else enter 0");
                Scanner in = new Scanner(System.in);
                option = in.nextInt();
            }
            System.out.println(c);
            price=c;
            trade();
            payment();
            c = 625000;
            if(cashback<price) {
                    l = (float) (price - a);
                    System.out.println("best optional value:" + l);
                }
            else
            {
                System.out.println("Best offer is to get optional extras free which costs "+ l);
                System.out.println("Cashback is "+cashback);
            }
            System.out.println("Do you wish to get cashback or optionals extras free?");
            System.out.println("Enter 1 for cashback or 2 for optionals extras free");
            Scanner scan=new Scanner(System.in);
            int x=scan.nextInt();
            if(x==1)
            {
                price=price-m;
                System.out.println("Yow will receive a cashback of "+ m);
                System.out.println("Final price of the car will be "+price);
            }
            else
            {
                System.out.println("Final price of the car will be "+(price-l));
            }
        }


        private static void optionalextras() {

            System.out.println("optional extras are:");
            System.out.println("Enter 1.set of luxury seats:Rs 45000\n" + "2.satellite navigation:Rs 5500\n" + "3.Parking sensors: Rs 10000\n" +
                    "4.Bluetooth connectivity: Rs 350\n" + "5.Sound system: Rs 1000\n");

        }

        private static void trade(){
            float sum,l;
            float total;
            System.out.println("enter 1 if you have old car to be trade in");
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            if(n==1)
            {
                System.out.println("enter the price offered by snazzy autos:");
                Scanner sc = new Scanner(System.in);
                int h = sc.nextInt();
                System.out.println("price offered by snazzy autos is:"+ h);
                sum=price-h;
                System.out.println("total amount:" + sum);
                price=sum;

                }

            }


        private static void payment(){
            float p;
            float cashback;
            System.out.println("enter 1 to pay full amount else enter 0");
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            System.out.println("you will receive 1% of cashback on total price or the choosen optional extras free");
            if(n==1){
                cashback = (float)(price*0.01);
                System.out.println("cashback:"+cashback);
                m=cashback;
                p=price-cashback;
                System.out.println("total amount:"+p);
                }
            else{
                System.out.println("enter 1 if you pay amount in four years else enter 2 if you pay amount ion 7 years");
                int o=in.nextInt();
                if(o==1) {
                    System.out.println("equal monthly payments are made over four years with no extra charges");
                }
                else{
                    System.out.println("total price is increased by 5%");
                    p=(float)(price*1.05)/84;
                    System.out.println("monthly payment:"+ p);
                }

            }return;

        }
}

