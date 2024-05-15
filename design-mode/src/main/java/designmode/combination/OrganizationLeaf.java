package designmode.combination;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:43
 */
public class OrganizationLeaf extends Organization{


    public OrganizationLeaf(String name) {
        super(name);
    }

    @Override
    public Organization getChild(String name) {
        return this.getName().equals(name) ? this : null;
    }

    @Override
    public void addOrganization(Organization organization) {
        System.out.println("不能添加子组织架构");
    }
}
