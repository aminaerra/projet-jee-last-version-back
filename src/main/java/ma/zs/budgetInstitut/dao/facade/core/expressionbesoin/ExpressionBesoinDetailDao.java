package ma.zs.budgetInstitut.dao.facade.core.expressionbesoin;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoinDetail;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ExpressionBesoinDetailDao extends AbstractRepository<ExpressionBesoinDetail,Long>  {

    List<ExpressionBesoinDetail> findByExpressionBesoinId(Long id);
    int deleteByExpressionBesoinId(Long id);
    long countByExpressionBesoinId(Long id);
    List<ExpressionBesoinDetail> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);


}
