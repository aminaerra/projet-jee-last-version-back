package ma.zs.budgetInstitut.zynerator.security.service.facade;

import ma.zs.budgetInstitut.zynerator.security.bean.Role;
import ma.zs.budgetInstitut.zynerator.security.dao.criteria.core.RoleCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface RoleService extends  IService<Role,RoleCriteria>  {
    Role findByAuthority(String authority);
    int deleteByAuthority(String authority);


    



}
