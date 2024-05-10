package ma.zs.budgetInstitut.dao.facade.core.achat;

import org.springframework.data.jpa.repository.Query;
import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.achat.TypeAchatMateriel;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TypeAchatMaterielDao extends AbstractRepository<TypeAchatMateriel,Long>  {


    @Query("SELECT NEW TypeAchatMateriel(item.id,item.libelle) FROM TypeAchatMateriel item")
    List<TypeAchatMateriel> findAllOptimized();

}
