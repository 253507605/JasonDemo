package designmode.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:42
 */
public class OrganizationSite extends Organization{

    private List<Organization> organizations;


    public OrganizationSite(String name) {
        super(name);
        organizations = new ArrayList<>();
    }

    @Override
    public Organization getChild(String name) {
        for(Organization organization : organizations){
            Organization child = organization.getChild(name);
            if (child != null){
                return child;
            }
        }
        System.out.println("当前部门不存在");
        return null;
    }

    @Override
    public void addOrganization(Organization organization) {
        organizations.add(organization);
    }
}
