package ma.zs.budgetInstitut.zynerator.service;

import ma.zs.budgetInstitut.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.zs.budgetInstitut.zynerator.criteria.BaseCriteria;
import ma.zs.budgetInstitut.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, CRITERIA extends BaseCriteria, REPO extends AbstractRepository<T, Long>> extends AbstractServiceImpl<T, CRITERIA, REPO> {

    public AbstractReferentielServiceImpl(REPO dao) {
        super(dao);
    }

}
