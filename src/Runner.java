
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();

////////////////////////////////////////////////////////////////////////////////////
        // TODO: Tüm Süper Kahramanları allHeros listesine ekleyin.
        allHeroes.add("Batman");
        allHeroes.add("SpiderMan");
        allHeroes.add("Superman");
        allHeroes.add("Wolverine");
        allHeroes.add("WonderWoman");


        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullanıcıya mevcut tüm süper kahramanları göstererek, asagidaki menuyu olusturun
        //      "Süper Kahramanlar gösterisine hoş geldiniz..."
        //      "Mevcut Süper Kahramanlar: " + allHeroes
        //       "Çıkmak için q'ya basın..."
        Scanner scanner = new Scanner(System.in);
        String choice;
        HeroFactory heroFactory = new HeroFactory();
        do {
            System.out.println("Süper Kahramanlar gösterisine hoş geldiniz..." +
                    "\nMevcut Süper Kahramanlar: " + allHeroes +
                    "\nÇıkmak için q'ya basın...");
            System.out.println("Hangi süper kahramanı eklemek istiyorsunuz?");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Çıkış yaptınız. Görüşmek üzere...");
                break;
            } else if (allHeroes.contains(choice) && !activeHeroes.contains(choice)) {
                heroFactory.produceSuperHero(choice).printInfo();
                heroFactory.produceSuperHero(choice).attack();
                heroFactory.produceSuperHero(choice).exposeSecretPower();
                activeHeroes.add(choice);
                System.out.println(choice + " başarıyla eklendi!");
            } else if (activeHeroes.contains(choice)) {
                System.out.println(choice + " zaten oyunda aktif!");
            } else if (!allHeroes.contains(choice)) {
                System.out.println("Lütfen geçerli bir kahraman giriniz.");
            }

            System.out.println("Oyunda aktif kahramanlar" + activeHeroes);
            System.out.println("Henüz eklenmemiş kahramanlar: " + getRemainingHeroes(allHeroes, activeHeroes));

        } while (!choice.equalsIgnoreCase("q"));


        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullaniciya "Hangi süper kahramanı eklemek istiyorsunuz? " sorusunu sorarak tercihini alin

        //TODO: Eğer girilen isim allHeros listesinde var da, activeHeroes listesinde yoksa : "... oyuna başarıyla eklendi." yazın;
        // oyunda aktif olan ve oyuna girmemiş tüm kahramanları yazdırın...

        //TODO: Eğer girilen isim activeHeroes listesinde varsa "... zaten oyunda aktif!" yazın;

        //TODO: Eğer girilen isim allHeros listesinde de activeHeroes listesinde de yoksa : "... Lütfen geçerli bir süper kahraman girin..." yazın;

        //NOT: getRemainingHeroes(){} metodunu oyuna girmemiş kahramanlar için kullanabilirsiniz...
    }


    // TODO Bu methodda bir degisiklik yapmayiniz
    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
