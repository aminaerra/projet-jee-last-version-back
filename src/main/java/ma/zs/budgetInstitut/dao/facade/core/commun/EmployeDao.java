package ma.zs.budgetInstitut.dao.facade.core.commun;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.commun.Employe;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmployeDao extends AbstractRepository<Employe,Long>  {

    List<Employe> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminId(Long id);


}
