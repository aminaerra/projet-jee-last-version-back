package ma.zs.budgetInstitut.dao.facade.core.produit;

import org.springframework.data.jpa.repository.Query;
import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.produit.Produit;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProduitDao extends AbstractRepository<Produit,Long>  {

    List<Produit> findByCategorieProduitId(Long id);
    int deleteByCategorieProduitId(Long id);
    long countByCategorieProduitId(Long id);

    @Query("SELECT NEW Produit(item.id,item.libelle) FROM Produit item")
    List<Produit> findAllOptimized();

}
