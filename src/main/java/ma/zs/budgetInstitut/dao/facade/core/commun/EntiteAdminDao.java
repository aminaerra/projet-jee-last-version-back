package ma.zs.budgetInstitut.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EntiteAdminDao extends AbstractRepository<EntiteAdmin,Long>  {

    List<EntiteAdmin> findByChefId(Long id);
    int deleteByChefId(Long id);
    long countByChefId(Long id);

    @Query("SELECT NEW EntiteAdmin(item.id,item.libelle) FROM EntiteAdmin item")
    List<EntiteAdmin> findAllOptimized();

}
