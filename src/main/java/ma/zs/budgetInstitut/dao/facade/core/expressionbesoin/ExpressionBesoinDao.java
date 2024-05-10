package ma.zs.budgetInstitut.dao.facade.core.expressionbesoin;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoin;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ExpressionBesoinDao extends AbstractRepository<ExpressionBesoin,Long>  {

    List<ExpressionBesoin> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    long countByEmployeId(Long id);
    List<ExpressionBesoin> findByEntiteAdminId(Long id);
    int deleteByEntiteAdminId(Long id);
    long countByEntiteAdminId(Long id);


}
