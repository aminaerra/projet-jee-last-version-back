package ma.zs.budgetInstitut.zynerator.security.dao.facade.core;

import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;
import ma.zs.budgetInstitut.zynerator.security.bean.ModelPermission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ModelPermissionDao extends AbstractRepository<ModelPermission,Long>  {
    ModelPermission findByReference(String reference);
    int deleteByReference(String reference);


    @Query("SELECT NEW ModelPermission(item.id,item.reference) FROM ModelPermission item")
    List<ModelPermission> findAllOptimized();

}