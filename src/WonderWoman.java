
public class WonderWoman extends SuperHeroes{

    private String lassoOfTruthAbility;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty,String lassoOfTruthAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setLassoOfTruthAbility(lassoOfTruthAbility);
    }

    public String getLassoOfTruthAbility() {
        return lassoOfTruthAbility;
    }

    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca "+getName()+" Golden Lasso-güçlü Truth" +
                " Lasso ile saldırabilir ve düşmanlarını, doğruluğunu söylemeye zorlayabilir. ");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println("Wonder Woman, doğruluğu söylemeye zorlayan Truth Lasso'ya sahiptir");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Özel Güç");
        System.out.println("-------------------");
        System.out.println("Truth Lasso Yeteneği = Golden Lasso "+lassoOfTruthAbility);
    }
}
