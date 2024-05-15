package designmode.combination;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:48
 */
public class Test {

    public static void main(String[] args) {
        Organization organization = new OrganizationSite("盖雅");
        Organization organization1 = new OrganizationSite("技术部门");
        Organization organization2 = new OrganizationLeaf("HPT1");
        Organization organization3 = new OrganizationLeaf("HPT2");
        Organization organization4 = new OrganizationLeaf("HPT3");
        Organization organization5 = new OrganizationLeaf("人事部门");
        organization.addOrganization(organization1);
        organization.addOrganization(organization5);
        organization1.addOrganization(organization2);
        organization1.addOrganization(organization3);
        organization1.addOrganization(organization4);

        System.out.println(organization.getChild("人事部门").getName());
        System.out.println(organization.getChild("HPT3").getName());
        System.out.println(organization.getChild("HPT4").getName());
    }
}
