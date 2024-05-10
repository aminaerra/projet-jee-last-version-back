package  ma.zs.budgetInstitut.ws.converter.expressionbesoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.budgetInstitut.zynerator.util.ListUtil;

import ma.zs.budgetInstitut.ws.converter.commun.EntiteAdminConverter;
import ma.zs.budgetInstitut.ws.converter.expressionbesoin.ExpressionBesoinDetailConverter;
import ma.zs.budgetInstitut.ws.converter.commun.EmployeConverter;
import ma.zs.budgetInstitut.ws.converter.produit.ProduitConverter;



import ma.zs.budgetInstitut.zynerator.util.StringUtil;
import ma.zs.budgetInstitut.zynerator.converter.AbstractConverter;
import ma.zs.budgetInstitut.zynerator.util.DateUtil;
import ma.zs.budgetInstitut.bean.core.expressionbesoin.ExpressionBesoin;
import ma.zs.budgetInstitut.ws.dto.expressionbesoin.ExpressionBesoinDto;

@Component
public class ExpressionBesoinConverter extends AbstractConverter<ExpressionBesoin, ExpressionBesoinDto> {

    @Autowired
    private EntiteAdminConverter entiteAdminConverter ;
    @Autowired
    private ExpressionBesoinDetailConverter expressionBesoinDetailConverter ;
    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private ProduitConverter produitConverter ;
    private boolean employe;
    private boolean entiteAdmin;
    private boolean expressionBesoinDetails;

    public  ExpressionBesoinConverter() {
        super(ExpressionBesoin.class, ExpressionBesoinDto.class);
        init(true);
    }

    @Override
    public ExpressionBesoin toItem(ExpressionBesoinDto dto) {
        if (dto == null) {
            return null;
        } else {
        ExpressionBesoin item = new ExpressionBesoin();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getDateExpression()))
                item.setDateExpression(DateUtil.stringEnToDate(dto.getDateExpression()));
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;

            if(this.entiteAdmin && dto.getEntiteAdmin()!=null)
                item.setEntiteAdmin(entiteAdminConverter.toItem(dto.getEntiteAdmin())) ;


            if(this.expressionBesoinDetails && ListUtil.isNotEmpty(dto.getExpressionBesoinDetails()))
                item.setExpressionBesoinDetails(expressionBesoinDetailConverter.toItem(dto.getExpressionBesoinDetails()));


        return item;
        }
    }

    @Override
    public ExpressionBesoinDto toDto(ExpressionBesoin item) {
        if (item == null) {
            return null;
        } else {
            ExpressionBesoinDto dto = new ExpressionBesoinDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(item.getDateExpression()!=null)
                dto.setDateExpression(DateUtil.dateTimeToString(item.getDateExpression()));
            if(this.employe && item.getEmploye()!=null) {
                dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;

            }
            if(this.entiteAdmin && item.getEntiteAdmin()!=null) {
                dto.setEntiteAdmin(entiteAdminConverter.toDto(item.getEntiteAdmin())) ;

            }
        if(this.expressionBesoinDetails && ListUtil.isNotEmpty(item.getExpressionBesoinDetails())){
            expressionBesoinDetailConverter.init(true);
            expressionBesoinDetailConverter.setExpressionBesoin(false);
            dto.setExpressionBesoinDetails(expressionBesoinDetailConverter.toDto(item.getExpressionBesoinDetails()));
            expressionBesoinDetailConverter.setExpressionBesoin(true);

        }


        return dto;
        }
    }

    public void copy(ExpressionBesoinDto dto, ExpressionBesoin t) {
    super.copy(dto, t);
    if (dto.getEmploye() != null)
        employeConverter.copy(dto.getEmploye(), t.getEmploye());
    if (dto.getEntiteAdmin() != null)
        entiteAdminConverter.copy(dto.getEntiteAdmin(), t.getEntiteAdmin());
    if (dto.getExpressionBesoinDetails() != null)
        t.setExpressionBesoinDetails(expressionBesoinDetailConverter.copy(dto.getExpressionBesoinDetails()));
    }


    public void initList(boolean value) {
        this.expressionBesoinDetails = value;
    }

    public void initObject(boolean value) {
        this.employe = value;
        this.entiteAdmin = value;
    }


    public EntiteAdminConverter getEntiteAdminConverter(){
        return this.entiteAdminConverter;
    }
    public void setEntiteAdminConverter(EntiteAdminConverter entiteAdminConverter ){
        this.entiteAdminConverter = entiteAdminConverter;
    }
    public ExpressionBesoinDetailConverter getExpressionBesoinDetailConverter(){
        return this.expressionBesoinDetailConverter;
    }
    public void setExpressionBesoinDetailConverter(ExpressionBesoinDetailConverter expressionBesoinDetailConverter ){
        this.expressionBesoinDetailConverter = expressionBesoinDetailConverter;
    }
    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public ProduitConverter getProduitConverter(){
        return this.produitConverter;
    }
    public void setProduitConverter(ProduitConverter produitConverter ){
        this.produitConverter = produitConverter;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
    public boolean  isEntiteAdmin(){
        return this.entiteAdmin;
    }
    public void  setEntiteAdmin(boolean entiteAdmin){
        this.entiteAdmin = entiteAdmin;
    }
    public boolean  isExpressionBesoinDetails(){
        return this.expressionBesoinDetails ;
    }
    public void  setExpressionBesoinDetails(boolean expressionBesoinDetails ){
        this.expressionBesoinDetails  = expressionBesoinDetails ;
    }
}
