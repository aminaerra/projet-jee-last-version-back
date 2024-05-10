package ma.zs.budgetInstitut.dao.facade.core.achat;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.achat.AchatMateriel;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AchatMaterielDao extends AbstractRepository<AchatMateriel,Long>  {

    List<AchatMateriel> findByBudgetId(Long id);
    int deleteByBudgetId(Long id);
    long countByBudgetId(Long id);
    List<AchatMateriel> findByTypeAchatMaterielId(Long id);
    int deleteByTypeAchatMaterielId(Long id);
    long countByTypeAchatMaterielId(Long id);


}
