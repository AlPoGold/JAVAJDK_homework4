public class Worker {
    private int personalId;
    private String name;
    private String phone;
    private int seniority;

    public Worker(int personalId, String name, String phone, int seniority) {
        this.personalId = personalId;
        this.name = name;
        this.phone = phone;
        this.seniority = seniority;
    }

    public int getPersonalId() {
        return personalId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getSeniority() {
        return seniority;
    }



    @Override
    public String toString() {
        return String.format("%d: %s, %s, %s years", personalId, name, phone, seniority);
    }
}
