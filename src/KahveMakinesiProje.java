import java.util.Scanner;

public class KahveMakinesiProje {
    public static void main(String[] args) {

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        String hangiKahve = "";
        String input = "";
        //Hangi Kahveyi İstersiniz?
        //        1.Türk kahvesi
        //        2.Filtre Kahve
        //        3.Espresso

        System.out.println("Hangi kahveyi istersiniz?");
        System.out.println("1. Türk Kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");

        while (hangiKahve.isEmpty()) {
            System.out.print("Kahve adı girin: ");
            input = scannerStr.nextLine();

            if (input.equalsIgnoreCase("türk kahvesi")) {
                hangiKahve = "Türk Kahvesi";
            } else if (input.equalsIgnoreCase("filtre kahve")) {
                hangiKahve = "Filtre Kahve";
            } else if (input.equalsIgnoreCase("espresso")) {
                hangiKahve = "Espresso";
            } else {
                System.out.println("Hatalı tuşlama yaptınız");
            }
        }



        System.out.println(hangiKahve + " hazırlanıyor...");
        String sut = "";

        while(sut.isEmpty()) { //true yani break gorene kadar donsun.

            System.out.print("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
            input = scannerStr.nextLine();

            if (input.equalsIgnoreCase("evet")) {
                System.out.println("Süt ekleniyor...");

                break;
            }
            else if(input.equalsIgnoreCase("hayır")){

                System.out.println("Süt eklenmiyor...");

                break;
            }


            else {
                System.out.println("Hatali giris yaptiniz !");

            }

        }


        String seker = "";

        while(seker.isEmpty()) {

            System.out.print("Şeker ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
            input = scannerStr.nextLine();

            if (input.equalsIgnoreCase("evet")) {
                System.out.print("Kaç şeker olsun:");
                int kacSeker = scannerInt.nextInt();
                System.out.println(kacSeker + " şeker ekleniyor...");
                break;
            } else if (input.equalsIgnoreCase("hayır")) {

                System.out.println(" şeker eklenmiyor...");
                break;

            } else {
                System.out.println("Hatali giris yaptiniz !");

            }
        }




        String kahveBoyut = "";

        while(kahveBoyut.isEmpty()) {
            System.out.println("(Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) : ");
            String boyut = scannerStr.nextLine();

            if (boyut.equalsIgnoreCase("Büyük boy")) {

               kahveBoyut=boyut;


            }

            else if (boyut.equalsIgnoreCase("orta boy")) {

                kahveBoyut=boyut;
            }
            else if (boyut.equalsIgnoreCase("Küçük boy")) {

                kahveBoyut=boyut;
            }

            else
                System.out.println("Hatali giris yaptiniz!");

        }

        System.out.println("Kahveniz "+kahveBoyut +" hazirlaniyor...");
        System.out.println();
        System.out.println(hangiKahve + " " + kahveBoyut +" hazirdir. Afiyet olsun !");
    }
}





