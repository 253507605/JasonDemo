package designmode.combination;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:39
 */
public abstract class Organization {

    private String name;

    public Organization(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Organization getChild(String name);

    public abstract void addOrganization(Organization organization);
}
