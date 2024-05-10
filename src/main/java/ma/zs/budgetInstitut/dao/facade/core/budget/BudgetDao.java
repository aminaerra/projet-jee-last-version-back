package ma.zs.budgetInstitut.dao.facade.core.budget;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.budget.Budget;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BudgetDao extends AbstractRepository<Budget,Long>  {



}
