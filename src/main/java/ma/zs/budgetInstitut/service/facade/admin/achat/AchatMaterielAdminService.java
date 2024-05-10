package ma.zs.budgetInstitut.service.facade.admin.achat;

import java.util.List;
import ma.zs.budgetInstitut.bean.core.achat.AchatMateriel;
import ma.zs.budgetInstitut.dao.criteria.core.achat.AchatMaterielCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface AchatMaterielAdminService extends  IService<AchatMateriel,AchatMaterielCriteria>  {

    List<AchatMateriel> findByBudgetId(Long id);
    int deleteByBudgetId(Long id);
    long countByBudgetId(Long id);
    List<AchatMateriel> findByTypeAchatMaterielId(Long id);
    int deleteByTypeAchatMaterielId(Long id);
    long countByTypeAchatMaterielId(Long id);




}
