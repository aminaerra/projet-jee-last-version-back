package ma.zs.budgetInstitut.dao.facade.core.mandat;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.mandat.Mandat;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface MandatDao extends AbstractRepository<Mandat,Long>  {

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
