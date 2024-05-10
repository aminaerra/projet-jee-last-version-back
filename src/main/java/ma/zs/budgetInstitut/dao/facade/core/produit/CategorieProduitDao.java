package ma.zs.budgetInstitut.dao.facade.core.produit;

import org.springframework.data.jpa.repository.Query;
import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.produit.CategorieProduit;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CategorieProduitDao extends AbstractRepository<CategorieProduit,Long>  {


    @Query("SELECT NEW CategorieProduit(item.id,item.libelle) FROM CategorieProduit item")
    List<CategorieProduit> findAllOptimized();

}
