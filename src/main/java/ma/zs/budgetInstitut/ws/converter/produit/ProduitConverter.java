package  ma.zs.budgetInstitut.ws.converter.produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.budgetInstitut.ws.converter.produit.CategorieProduitConverter;



import ma.zs.budgetInstitut.zynerator.util.StringUtil;
import ma.zs.budgetInstitut.zynerator.converter.AbstractConverter;
import ma.zs.budgetInstitut.zynerator.util.DateUtil;
import ma.zs.budgetInstitut.bean.core.produit.Produit;
import ma.zs.budgetInstitut.ws.dto.produit.ProduitDto;

@Component
public class ProduitConverter extends AbstractConverter<Produit, ProduitDto> {

    @Autowired
    private CategorieProduitConverter categorieProduitConverter ;
    private boolean categorieProduit;

    public  ProduitConverter() {
        super(Produit.class, ProduitDto.class);
        init(true);
    }

    @Override
    public Produit toItem(ProduitDto dto) {
        if (dto == null) {
            return null;
        } else {
        Produit item = new Produit();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(this.categorieProduit && dto.getCategorieProduit()!=null)
                item.setCategorieProduit(categorieProduitConverter.toItem(dto.getCategorieProduit())) ;




        return item;
        }
    }

    @Override
    public ProduitDto toDto(Produit item) {
        if (item == null) {
            return null;
        } else {
            ProduitDto dto = new ProduitDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(this.categorieProduit && item.getCategorieProduit()!=null) {
                dto.setCategorieProduit(categorieProduitConverter.toDto(item.getCategorieProduit())) ;

            }


        return dto;
        }
    }

    public void copy(ProduitDto dto, Produit t) {
    super.copy(dto, t);
    if (dto.getCategorieProduit() != null)
        categorieProduitConverter.copy(dto.getCategorieProduit(), t.getCategorieProduit());
    }



    public void initObject(boolean value) {
        this.categorieProduit = value;
    }


    public CategorieProduitConverter getCategorieProduitConverter(){
        return this.categorieProduitConverter;
    }
    public void setCategorieProduitConverter(CategorieProduitConverter categorieProduitConverter ){
        this.categorieProduitConverter = categorieProduitConverter;
    }
    public boolean  isCategorieProduit(){
        return this.categorieProduit;
    }
    public void  setCategorieProduit(boolean categorieProduit){
        this.categorieProduit = categorieProduit;
    }
}
