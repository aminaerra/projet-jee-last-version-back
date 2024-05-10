package ma.zs.budgetInstitut.service.facade.admin.commun;

import java.util.List;
import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin;
import ma.zs.budgetInstitut.dao.criteria.core.commun.EntiteAdminCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface EntiteAdminAdminService extends  IService<EntiteAdmin,EntiteAdminCriteria>  {

    List<EntiteAdmin> findByChefId(Long id);
    int deleteByChefId(Long id);
    long countByChefId(Long id);




}
