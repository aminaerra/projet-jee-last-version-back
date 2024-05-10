package ma.zs.budgetInstitut.zynerator.security.service.impl;


import ma.zs.budgetInstitut.zynerator.security.bean.ModelPermission;
import ma.zs.budgetInstitut.zynerator.security.dao.criteria.core.ModelPermissionCriteria;
import ma.zs.budgetInstitut.zynerator.security.dao.facade.core.ModelPermissionDao;
import ma.zs.budgetInstitut.zynerator.security.dao.specification.core.ModelPermissionSpecification;
import ma.zs.budgetInstitut.zynerator.security.service.facade.ModelPermissionService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelPermissionServiceImpl extends AbstractServiceImpl<ModelPermission, ModelPermissionCriteria, ModelPermissionDao> implements ModelPermissionService {



    public ModelPermission findByReferenceEntity(ModelPermission t){
        return  dao.findByReference(t.getReference());
    }


    public List<ModelPermission> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(ModelPermission.class, ModelPermissionSpecification.class);
    }



    public ModelPermissionServiceImpl(ModelPermissionDao dao) {
        super(dao);
    }

}
