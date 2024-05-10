package ma.zs.budgetInstitut.service.impl.admin.mandat;


import ma.zs.budgetInstitut.bean.core.mandat.Mandat;
import ma.zs.budgetInstitut.dao.criteria.core.mandat.MandatCriteria;
import ma.zs.budgetInstitut.dao.facade.core.mandat.MandatDao;
import ma.zs.budgetInstitut.dao.specification.core.mandat.MandatSpecification;
import ma.zs.budgetInstitut.service.facade.admin.mandat.MandatAdminService;
import ma.zs.budgetInstitut.zynerator.service.AbstractServiceImpl;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.budgetInstitut.service.facade.admin.commun.EntiteAdminAdminService ;
import ma.zs.budgetInstitut.bean.core.commun.EntiteAdmin ;
import ma.zs.budgetInstitut.service.facade.admin.mandat.ResponsabiliteAdminService ;
import ma.zs.budgetInstitut.bean.core.mandat.Responsabilite ;
import ma.zs.budgetInstitut.service.facade.admin.commun.EmployeAdminService ;
import ma.zs.budgetInstitut.bean.core.commun.Employe ;

import java.util.List;
@Service
public class MandatAdminServiceImpl extends AbstractServiceImpl<Mandat, MandatCriteria, MandatDao> implements MandatAdminService {






    public void findOrSaveAssociatedObject(Mandat t){
        if( t != null) {
            t.setEmploye(employeService.findOrSave(t.getEmploye()));
            t.setResponsabilite(responsabiliteService.findOrSave(t.getResponsabilite()));
            t.setEntiteAdmin(entiteAdminService.findOrSave(t.getEntiteAdmin()));
        }
    }

    public List<Mandat> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public long countByEmployeId(Long id){
        return dao.countByEmployeId(id);
    }
    public List<Mandat> findByResponsabiliteId(Long id){
        return dao.findByResponsabiliteId(id);
    }
    public int deleteByResponsabiliteId(Long id){
        return dao.deleteByResponsabiliteId(id);
    }
    public long countByResponsabiliteId(Long id){
        return dao.countByResponsabiliteId(id);
    }
    public List<Mandat> findByEntiteAdminId(Long id){
        return dao.findByEntiteAdminId(id);
    }
    public int deleteByEntiteAdminId(Long id){
        return dao.deleteByEntiteAdminId(id);
    }
    public long countByEntiteAdminId(Long id){
        return dao.countByEntiteAdminId(id);
    }






    public void configure() {
        super.configure(Mandat.class, MandatSpecification.class);
    }


    @Autowired
    private EntiteAdminAdminService entiteAdminService ;
    @Autowired
    private ResponsabiliteAdminService responsabiliteService ;
    @Autowired
    private EmployeAdminService employeService ;

    public MandatAdminServiceImpl(MandatDao dao) {
        super(dao);
    }

}
