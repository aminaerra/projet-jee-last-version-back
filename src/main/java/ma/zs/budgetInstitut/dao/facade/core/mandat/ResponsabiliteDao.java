package ma.zs.budgetInstitut.dao.facade.core.mandat;

import org.springframework.data.jpa.repository.Query;
import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.mandat.Responsabilite;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ResponsabiliteDao extends AbstractRepository<Responsabilite,Long>  {


    @Query("SELECT NEW Responsabilite(item.id,item.libelle) FROM Responsabilite item")
    List<Responsabilite> findAllOptimized();

}
