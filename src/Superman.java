

public class Superman extends SuperHeroes {
    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...

    private String flyingAblity;
    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String flyingAblity) {
        super(name, gender, aggression, wisdom, beauty);
        setFlyingAblity(flyingAblity);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca "+getName()+" uçarken Supersonic Flight-güçlü saldırılar gerçekleştirebilir.");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println("Superman SuperSonic Fligght hızında uçma yeteneğine sahiptir");
    }

    public String getFlyingAblity() {
        return flyingAblity;
    }

    public void setFlyingAblity(String flyingAblity) {
        this.flyingAblity = flyingAblity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Özel Güç");
        System.out.println("-------------------");
        System.out.println("Süpersonik uçuş= " + flyingAblity);
    }
}
