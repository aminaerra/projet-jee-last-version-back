package ma.zs.budgetInstitut.service.facade.admin.achat;

import java.util.List;
import ma.zs.budgetInstitut.bean.core.achat.AchatMaterielDetail;
import ma.zs.budgetInstitut.dao.criteria.core.achat.AchatMaterielDetailCriteria;
import ma.zs.budgetInstitut.zynerator.service.IService;



public interface AchatMaterielDetailAdminService extends  IService<AchatMaterielDetail,AchatMaterielDetailCriteria>  {

    List<AchatMaterielDetail> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);
    List<AchatMaterielDetail> findByAchatMaterielId(Long id);
    int deleteByAchatMaterielId(Long id);
    long countByAchatMaterielId(Long id);




}
