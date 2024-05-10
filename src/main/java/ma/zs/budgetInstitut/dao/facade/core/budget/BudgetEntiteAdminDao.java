package ma.zs.budgetInstitut.dao.facade.core.budget;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.budget.BudgetEntiteAdmin;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BudgetEntiteAdminDao extends AbstractRepository<BudgetEntiteAdmin,Long>  {

    List<BudgetEntiteAdmin> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminId(Long id);
    List<BudgetEntiteAdmin> findByBudgetId(Long id);
    int deleteByBudgetId(Long id);
    long countByBudgetId(Long id);


}
