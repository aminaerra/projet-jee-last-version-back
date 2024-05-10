package ma.zs.budgetInstitut.service.facade.admin.mandat;

import java.util.List;
import ma.zs.budgetInstitut.bean.core.mandat.Mandat;
import ma.zs.budgetInstitut.dao.criteria.core.mandat.MandatCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface MandatAdminService extends  IService<Mandat,MandatCriteria>  {

    List<Mandat> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    long countByEmployeId(Long id);
    List<Mandat> findByResponsabiliteId(Long id);
    int deleteByResponsabiliteId(Long id);
    long countByResponsabiliteId(Long id);
    List<Mandat> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminId(Long id);




}
