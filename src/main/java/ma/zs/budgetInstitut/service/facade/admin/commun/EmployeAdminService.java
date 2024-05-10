package ma.zs.budgetInstitut.service.facade.admin.commun;

import java.util.List;
import ma.zs.budgetInstitut.bean.core.commun.Employe;
import ma.zs.budgetInstitut.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface EmployeAdminService extends  IService<Employe,EmployeCriteria>  {

    List<Employe> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminId(Long id);




}
