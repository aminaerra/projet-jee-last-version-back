package ma.zs.budgetInstitut.dao.facade.core.achat;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.achat.AchatMaterielDetail;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AchatMaterielDetailDao extends AbstractRepository<AchatMaterielDetail,Long>  {

    List<AchatMaterielDetail> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);
    List<AchatMaterielDetail> findByAchatMaterielId(Long id);
    int deleteByAchatMaterielId(Long id);
    long countByAchatMaterielId(Long id);


}
