
public class Batman extends SuperHeroes {

    private String DetectiveSkills;

    public Batman(String name, String gender, String aggression, String wisdom, String beauty,String DetectiveSkills) {
        super(name, gender, aggression, wisdom, beauty);
        setDetectiveSkills(DetectiveSkills);

    }

    public String getDetectiveSkills() {
        return DetectiveSkills;
    }

    public void setDetectiveSkills(String detectiveSkills) {
        DetectiveSkills = detectiveSkills;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca "+getName()+" dedektif becerileri ile" +
                " saldırabilir ve düşmanlarını planlayarak alt edebilir. ");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println("Batman,dedektif becerilerine sahiptir ve bu yeteneğiyle" +
                " suçluları yakalamada ustalaşmıştır");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Özel Güç");
        System.out.println("-------------------");
        System.out.println("Dedektif Becerileri =  "+DetectiveSkills);
    }
}
