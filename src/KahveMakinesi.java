import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {

        System.out.println("Hangi Kahveyi Istersiniz?");
        System.out.println("1.Turk kahvesi\n2.Filtre Kahve\n3.Espresso");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kahve seciniz seciniz=");
        String hangiKahve;
        hangiKahve = scan.nextLine().toLowerCase();


        switch (hangiKahve.toLowerCase()) {
            case "turk kahvesi":
                System.out.println("Turk Kahvesi sectiniz");
                break;
            case "filtre kahve":
                System.out.println("Filtre Kahve sectiniz");
                break;
            case "espresso":
                System.out.println("Espresso sectiniz");
                break;

            default:
                System.out.println("Lutfen bir kahve seciniz!");

                break;

        }


        if (hangiKahve.equalsIgnoreCase("turk kahvesi")) {

            System.out.println(hangiKahve + " " + "hazirlaniyor...");

        } else if (hangiKahve.equalsIgnoreCase("filtre kahve")) {

            System.out.println(hangiKahve + " " + "hazirlaniyor...");

        } else if (hangiKahve.equalsIgnoreCase("espresso")) {

            System.out.println(hangiKahve + " " + "hazirlaniyor...");
        }

        else {
            System.out.println("Hatali tuslama yaptiniz");
            System.out.println("Lutfen bir kahve seciniz!");

            hangiKahve = scan.nextLine().toLowerCase();


            switch (hangiKahve.toLowerCase()) {
                case "turk kahvesi":
                    System.out.println("Turk Kahvesi sectiniz.");
                    break;
                case "filtre kahve":
                    System.out.println("Filtre Kahve sectiniz.");
                    break;
                case "espresso":
                    System.out.println("Espresso sectiniz.");
                    break;

                default:
                    System.out.println("Lutfen bir kahve seciniz!");

                    break;

            }

            if (hangiKahve.equalsIgnoreCase("turk kahvesi")) {

                System.out.println(hangiKahve + " " + "hazirlaniyor...");

            } else if (hangiKahve.equalsIgnoreCase("filtre kahve")) {

                System.out.println(hangiKahve + " " + "hazirlaniyor...");

            } else if (hangiKahve.equalsIgnoreCase("espresso")) {

                System.out.println(hangiKahve + " " + "hazirlaniyor...");
            }

        }
        System.out.println();

        System.out.print("Seker eklememizi ister misiniz ? (Evet veya Hayir olarak cevaplayiniz) : ");
        String seker = scan.nextLine().toLowerCase();
        Scanner sc = new Scanner(System.in);


        if(seker.equalsIgnoreCase("evet")){
            System.out.println( "Kac seker olsun ?");
            System.out.print("Seker sayisini giriniz=");
            int kacSeker = sc.nextInt();

            System.out.println(kacSeker +" "+"seker ekleniyor...");


        }
        else
            System.out.println( "Seker eklenmiyor ...");

        System.out.println("Lutfen entera basiniz.");
        String bosKod = scan.nextLine(); //dummy kod






        System.out.print("Hangi boyutta olsun? : Büyük boy - orta boy - küçük boy olarak giriniz=");
        String boyut =scan.nextLine();
        System.out.println();

        if(boyut.equalsIgnoreCase("Büyük boy")){

            System.out.println("Kahveniz" +" " + boyut +" " + "hazirlaniyor..");
        }
       else if(boyut.equalsIgnoreCase("orta boy")){

            System.out.println("Kahveniz" +" " +boyut +" " + "hazirlaniyor..");
        }
       else
            System.out.println("Kahveniz"+" " + boyut +" " + "hazirlaniyor..");

        System.out.println();

        System.out.println(hangiKahve.toUpperCase() +" " +boyut+ " " + "hazirdir. Afiyet olsun !!!");




        //ALGORITMA :
        //






















    }
}
